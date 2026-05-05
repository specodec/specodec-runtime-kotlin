package emit_kotlin

import specodec.*
import all_types_nested_deep.*
import java.io.File

fun runAllTypesNestedDeep(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_DeepModel, fm_DeepModel) = testModelDeepModel(); passed += pm_DeepModel; failed += fm_DeepModel

    return Pair(passed, failed)
}

fun testModelDeepModel(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DeepModel.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DeepModelCodec.decode(r)
        val w = MsgPackWriter()
        DeepModelCodec.encode(w, obj)
        val out = File("${outDir}/DeepModel.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepModel mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepModel.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepModelCodec.decode(r)
        val w = JsonWriter()
        DeepModelCodec.encode(w, obj)
        val out = File("${outDir}/DeepModel.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepModel json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepModel.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepModelCodec.decode(r)
        val w = JsonWriter()
        DeepModelCodec.encode(w, obj)
        val out = File("${outDir}/DeepModel.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepModel unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepModel.gron").readBytes()
        val r = GronReader(data)
        val obj = DeepModelCodec.decode(r)
        val w = GronWriter()
        DeepModelCodec.encode(w, obj)
        val out = File("${outDir}/DeepModel.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepModel gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

