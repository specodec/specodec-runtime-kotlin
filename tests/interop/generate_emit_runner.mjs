import fs from "fs";
import path from "path";
import { fileURLToPath } from "url";

const __dir = path.dirname(fileURLToPath(import.meta.url));
const VEC_DIR = process.env.VEC_DIR || path.join(__dir, ".tests-cache", "vectors");

const manifestPath = path.join(VEC_DIR, "manifest.json");
const manifest = JSON.parse(fs.readFileSync(manifestPath, "utf-8"));

const models = manifest.testModels || [];
const scalars = manifest.scalars || {};

function toPascalCase(name) {
  let result = name.replace(/\./g, '_').replace(/-/g, '_');
  return result.charAt(0).toUpperCase() + result.slice(1);
}

function getReadMethod(type) {
  const map = {
    "int32": "readInt32",
    "int64": "readInt64",
    "uint32": "readUint32",
    "uint64": "readUint64",
    "float32": "readFloat32",
    "float64": "readFloat64",
    "string": "readString",
    "bytes": "readBytes",
    "bool": "readBool",
  };
  return map[type] || "readInt32";
}

function getWriteMethod(type) {
  const map = {
    "int32": "writeInt32",
    "int64": "writeInt64",
    "uint32": "writeUint32",
    "uint64": "writeUint64",
    "float32": "writeFloat32",
    "float64": "writeFloat64",
    "string": "writeString",
    "bytes": "writeBytes",
    "bool": "writeBool",
  };
  return map[type] || "writeInt32";
}

let scalarFuncs = '';
let scalarCalls = '';
for (const [name, info] of Object.entries(scalars)) {
  const pascal = toPascalCase(name);
  const readMethod = getReadMethod(info.type);
  const writeMethod = getWriteMethod(info.type);

  scalarFuncs += `
fun testScalar${pascal}(): Pair<Int, Int> {
    return try {
        val data = File("\${vecDir}/scalars/${name}.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.${readMethod}()
        val w = MsgPackWriter()
        w.${writeMethod}(value)
        val out = File("\${outDir}/scalars/${name}.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL ${name} mp: \${e.message}")
        Pair(0, 1)
    }
}
`;
  const sname = name.replace(/\./g, '_').replace(/-/g, '_');
  scalarCalls += `    val (ps_${sname}, fs_${sname}) = testScalar${pascal}(); passed += ps_${sname}; failed += fs_${sname}\n`;
}

let modelFuncs = '';
let modelCalls = '';
for (const model of models) {
  modelFuncs += `
fun testModel${model}(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("\${vecDir}/${model}.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ${model}Codec.decode(r)
        val w = MsgPackWriter()
        ${model}Codec.encode(w, obj)
        val out = File("\${outDir}/${model}.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ${model} mp: \${e.message}")
        failed++
    }
    try {
        val data = File("\${vecDir}/${model}.json").readBytes()
        val r = JsonReader(data)
        val obj = ${model}Codec.decode(r)
        val w = JsonWriter()
        ${model}Codec.encode(w, obj)
        val out = File("\${outDir}/${model}.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ${model} json: \${e.message}")
        failed++
    }
    try {
        val data = File("\${vecDir}/${model}.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ${model}Codec.decode(r)
        val w = JsonWriter()
        ${model}Codec.encode(w, obj)
        val out = File("\${outDir}/${model}.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ${model} unformatted: \${e.message}")
        failed++
    }
    try {
        val data = File("\${vecDir}/${model}.gron").readBytes()
        val r = GronReader(data)
        val obj = ${model}Codec.decode(r)
        val w = GronWriter()
        ${model}Codec.encode(w, obj)
        val out = File("\${outDir}/${model}.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ${model} gron: \${e.message}")
        failed++
    }
    return Pair(passed, failed)
}
`;
  const mname = model.replace(/\./g, '_').replace(/-/g, '_');
  modelCalls += `    val (pm_${mname}, fm_${mname}) = testModel${model}(); passed += pm_${mname}; failed += fm_${mname}\n`;
}

const code = `package emit_kotlin

import specodec.*
import all_types.*
import java.io.File

val vecDir = System.getenv("VEC_DIR") ?: error("VEC_DIR not set")
val outDir = System.getenv("OUT_DIR") ?: error("OUT_DIR not set")
${scalarFuncs}
${modelFuncs}

fun main() {
    var passed = 0
    var failed = 0

    // Scalar tests
${scalarCalls}
    // Model tests
${modelCalls}

    println("emit-kotlin: \$passed passed, \$failed failed")
    if (failed > 0) throw RuntimeException("\$failed tests failed")
}
`;

const outDirPath = path.join(__dir, "emit", "src", "main", "kotlin");
fs.mkdirSync(outDirPath, { recursive: true });
const outFile = path.join(outDirPath, "Main.kt");
fs.writeFileSync(outFile, code);
console.log(`Generated emit/src/main/kotlin/Main.kt with ${models.length} models + ${Object.keys(scalars).length} scalars`);
