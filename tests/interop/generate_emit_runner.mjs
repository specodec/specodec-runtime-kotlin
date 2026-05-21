import fs from "fs";
import path from "path";
import { fileURLToPath } from "url";

const __dir = path.dirname(fileURLToPath(import.meta.url));
const EMIT_GEN = path.join(__dir, 'emit_gen');
const VEC_DIR = process.env.VEC_DIR || path.join(__dir, "vectors");

const manifestPath = path.join(VEC_DIR, "manifest.json");
const manifest = JSON.parse(fs.readFileSync(manifestPath, "utf-8"));

const models = [...(manifest.testModels || []), ...(manifest.testUnions || [])];
const scalars = manifest.scalars || {};
const testUnions = new Set(manifest.testUnions || []);
function isUnionTest(name) { return testUnions.has(name); }
function unionNameOf(testName) { return testName.replace(/_[^_]+$/, ''); }

function toPascalCase(name) {
  let result = name.replace(/\./g, '_').replace(/-/g, '_');
  return result.charAt(0).toUpperCase() + result.slice(1);
}

function toPascalCaseSnake(sn) {
  return sn.split('_').map(w => w.charAt(0).toUpperCase() + w.slice(1)).join('');
}

function readMethod(type) {
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

function writeMethod(type) {
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

function nsSnake(ns) {
  return ns.replace(/\./g, '_').replace(/([A-Z])/g, (m,c,off)=>(off>0?'_':'')+c.toLowerCase());
}

// --- Discover packages from emit_gen for imports ---
const ktFiles = fs.readdirSync(EMIT_GEN).filter(f => f.endsWith('.kt'));
const ktPackages = ktFiles.map(f => {
  const content = fs.readFileSync(path.join(EMIT_GEN, f), 'utf-8');
  const m = content.match(/package ([\w.]+)\n/);
  return m ? m[1] : null;
}).filter(Boolean);

// Build model → package mapping from emit_gen
const modelPackage = {};
for (const f of ktFiles) {
  const content = fs.readFileSync(path.join(EMIT_GEN, f), 'utf-8');
  const pkgMatch = content.match(/package ([\w.]+)\n/);
  if (!pkgMatch) continue;
  const pkg = pkgMatch[1];
  const codecRe = /val (\w+Codec)/g;
  let m;
  while ((m = codecRe.exec(content)) !== null) {
    const modelName = m[1].replace(/Codec$/, '');
    modelPackage[modelName] = pkg;
  }
  for (const model of models) {
    if (isUnionTest(model)) {
      const uname = unionNameOf(model);
      if (content.includes(uname + 'Codec')) {
        modelPackage[uname] = pkg;
        modelPackage[model] = pkg;
      }
    }
  }
}

// --- Scalar test functions ---
let scalarFuncs = '';
let scalarCalls = '';
for (const [name, info] of Object.entries(scalars)) {
  const pascal = toPascalCase(name);
  const rm = readMethod(info.type);
  const wm = writeMethod(info.type);

  scalarFuncs += `
fun testScalar${pascal}(): Pair<Int, Int> {
    return try {
        val data = File("\${vecDir}/scalars/${name}.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.${rm}()
        val w = MsgPackWriter()
        w.${wm}(value)
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

// --- Group models by namespace ---
const modelNamespaces = manifest.modelNamespaces || {};
const nsGroups = {};
for (const model of models) {
  const ns = modelNamespaces[model] || "AllTypes";
  if (!nsGroups[ns]) nsGroups[ns] = [];
  nsGroups[ns].push(model);
}

// --- Generate test file per namespace ---
const outDirPath = path.join(__dir, "emit", "src", "main", "kotlin");
fs.mkdirSync(outDirPath, { recursive: true });

const nsOrder = Object.keys(nsGroups);

for (const [ns, nsModels] of Object.entries(nsGroups)) {
  const sn = nsSnake(ns);
  const runFuncName = "run" + toPascalCaseSnake(sn);

  // Collect packages needed for this namespace's models
  const nsPackages = new Set();
  for (const model of nsModels) {
    const pkg = modelPackage[model];
    if (pkg) nsPackages.add(pkg);
  }
  const importStmts = ['specodec', ...nsPackages].map(p => `import ${p}.*`).join('\n');

  let modelFuncs = '';
  let modelCalls = '';

  for (const model of nsModels) {
    const codecName = isUnionTest(model) ? unionNameOf(model) : model;
    modelFuncs += `
fun testModel${model}(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("\${vecDir}/${model}.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ${codecName}Codec.decode(r)
        val w = MsgPackWriter()
        ${codecName}Codec.encode(w, obj)
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
        val obj = ${codecName}Codec.decode(r)
        val w = JsonWriter()
        ${codecName}Codec.encode(w, obj)
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
        val obj = ${codecName}Codec.decode(r)
        val w = JsonWriter()
        ${codecName}Codec.encode(w, obj)
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
        val obj = ${codecName}Codec.decode(r)
        val w = GronWriter()
        ${codecName}Codec.encode(w, obj)
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

  const testCode = `package emit_kotlin

${importStmts}
import java.io.File

fun ${runFuncName}(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

${modelCalls}
    return Pair(passed, failed)
}
${modelFuncs}
`;
  const fileName = sn + ".kt";
  fs.writeFileSync(path.join(outDirPath, fileName), testCode);
  console.log(`  ${fileName}: ${nsModels.length} models`);
}

// --- Generate main Main.kt ---
const allKtImports = [...new Set(['specodec', ...ktPackages])].map(pkg => `import ${pkg}.*`).join('\n');

let mainCalls = '';
for (const ns of nsOrder) {
  const sn = nsSnake(ns);
  const runFuncName = "run" + toPascalCaseSnake(sn);
  mainCalls += `    val (r_${sn}_p, r_${sn}_f) = ${runFuncName}(vecDir, outDir); passed += r_${sn}_p; failed += r_${sn}_f\n`;
}

const mainCode = `package emit_kotlin

${allKtImports}
import java.io.File

val vecDir = System.getenv("VEC_DIR") ?: error("VEC_DIR not set")
val outDir = System.getenv("OUT_DIR") ?: error("OUT_DIR not set")
${scalarFuncs}

fun main() {
    var passed = 0
    var failed = 0

    // Scalar tests
${scalarCalls}
    // Model tests (by namespace)
${mainCalls}

    println("emit-kotlin: \$passed passed, \$failed failed")
    if (failed > 0) throw RuntimeException("\$failed tests failed")
}
`;

fs.writeFileSync(path.join(outDirPath, "Main.kt"), mainCode);
console.log(`Generated emit/src/main/kotlin/Main.kt + ${nsOrder.length} namespace test files (${models.length} models + ${Object.keys(scalars).length} scalars)`);
