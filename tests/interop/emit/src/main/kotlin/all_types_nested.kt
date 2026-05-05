package emit_kotlin

import specodec.*
import all_types_nested.*
import java.io.File

fun runAllTypesNested(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_NestedSimple, fm_NestedSimple) = testModelNestedSimple(); passed += pm_NestedSimple; failed += fm_NestedSimple

    return Pair(passed, failed)
}

fun testModelNestedSimple(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestedSimple.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestedSimpleCodec.decode(r)
        val w = MsgPackWriter()
        NestedSimpleCodec.encode(w, obj)
        val out = File("${outDir}/NestedSimple.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestedSimple mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestedSimple.json").readBytes()
        val r = JsonReader(data)
        val obj = NestedSimpleCodec.decode(r)
        val w = JsonWriter()
        NestedSimpleCodec.encode(w, obj)
        val out = File("${outDir}/NestedSimple.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestedSimple json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestedSimple.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestedSimpleCodec.decode(r)
        val w = JsonWriter()
        NestedSimpleCodec.encode(w, obj)
        val out = File("${outDir}/NestedSimple.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestedSimple unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestedSimple.gron").readBytes()
        val r = GronReader(data)
        val obj = NestedSimpleCodec.decode(r)
        val w = GronWriter()
        NestedSimpleCodec.encode(w, obj)
        val out = File("${outDir}/NestedSimple.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestedSimple gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

