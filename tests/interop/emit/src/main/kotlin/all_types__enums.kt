package emit_kotlin

import specodec.*
import all_types_enums.*
import java.io.File

fun runAllTypesEnums(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_EnumHolder, fm_EnumHolder) = testModelEnumHolder(); passed += pm_EnumHolder; failed += fm_EnumHolder
    val (pm_OptEnumHolder, fm_OptEnumHolder) = testModelOptEnumHolder(); passed += pm_OptEnumHolder; failed += fm_OptEnumHolder
    val (pm_EnumArrayHolder, fm_EnumArrayHolder) = testModelEnumArrayHolder(); passed += pm_EnumArrayHolder; failed += fm_EnumArrayHolder
    val (pm_EnumMixedHolder, fm_EnumMixedHolder) = testModelEnumMixedHolder(); passed += pm_EnumMixedHolder; failed += fm_EnumMixedHolder

    return Pair(passed, failed)
}

fun testModelEnumHolder(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EnumHolder.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EnumHolderCodec.decode(r)
        val w = MsgPackWriter()
        EnumHolderCodec.encode(w, obj)
        val out = File("${outDir}/EnumHolder.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EnumHolder mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EnumHolder.json").readBytes()
        val r = JsonReader(data)
        val obj = EnumHolderCodec.decode(r)
        val w = JsonWriter()
        EnumHolderCodec.encode(w, obj)
        val out = File("${outDir}/EnumHolder.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EnumHolder json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EnumHolder.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EnumHolderCodec.decode(r)
        val w = JsonWriter()
        EnumHolderCodec.encode(w, obj)
        val out = File("${outDir}/EnumHolder.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EnumHolder unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EnumHolder.gron").readBytes()
        val r = GronReader(data)
        val obj = EnumHolderCodec.decode(r)
        val w = GronWriter()
        EnumHolderCodec.encode(w, obj)
        val out = File("${outDir}/EnumHolder.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EnumHolder gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptEnumHolder(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptEnumHolder.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptEnumHolderCodec.decode(r)
        val w = MsgPackWriter()
        OptEnumHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptEnumHolder.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptEnumHolder mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptEnumHolder.json").readBytes()
        val r = JsonReader(data)
        val obj = OptEnumHolderCodec.decode(r)
        val w = JsonWriter()
        OptEnumHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptEnumHolder.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptEnumHolder json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptEnumHolder.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptEnumHolderCodec.decode(r)
        val w = JsonWriter()
        OptEnumHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptEnumHolder.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptEnumHolder unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptEnumHolder.gron").readBytes()
        val r = GronReader(data)
        val obj = OptEnumHolderCodec.decode(r)
        val w = GronWriter()
        OptEnumHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptEnumHolder.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptEnumHolder gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelEnumArrayHolder(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EnumArrayHolder.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EnumArrayHolderCodec.decode(r)
        val w = MsgPackWriter()
        EnumArrayHolderCodec.encode(w, obj)
        val out = File("${outDir}/EnumArrayHolder.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EnumArrayHolder mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EnumArrayHolder.json").readBytes()
        val r = JsonReader(data)
        val obj = EnumArrayHolderCodec.decode(r)
        val w = JsonWriter()
        EnumArrayHolderCodec.encode(w, obj)
        val out = File("${outDir}/EnumArrayHolder.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EnumArrayHolder json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EnumArrayHolder.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EnumArrayHolderCodec.decode(r)
        val w = JsonWriter()
        EnumArrayHolderCodec.encode(w, obj)
        val out = File("${outDir}/EnumArrayHolder.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EnumArrayHolder unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EnumArrayHolder.gron").readBytes()
        val r = GronReader(data)
        val obj = EnumArrayHolderCodec.decode(r)
        val w = GronWriter()
        EnumArrayHolderCodec.encode(w, obj)
        val out = File("${outDir}/EnumArrayHolder.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EnumArrayHolder gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelEnumMixedHolder(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EnumMixedHolder.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EnumMixedHolderCodec.decode(r)
        val w = MsgPackWriter()
        EnumMixedHolderCodec.encode(w, obj)
        val out = File("${outDir}/EnumMixedHolder.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EnumMixedHolder mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EnumMixedHolder.json").readBytes()
        val r = JsonReader(data)
        val obj = EnumMixedHolderCodec.decode(r)
        val w = JsonWriter()
        EnumMixedHolderCodec.encode(w, obj)
        val out = File("${outDir}/EnumMixedHolder.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EnumMixedHolder json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EnumMixedHolder.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EnumMixedHolderCodec.decode(r)
        val w = JsonWriter()
        EnumMixedHolderCodec.encode(w, obj)
        val out = File("${outDir}/EnumMixedHolder.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EnumMixedHolder unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EnumMixedHolder.gron").readBytes()
        val r = GronReader(data)
        val obj = EnumMixedHolderCodec.decode(r)
        val w = GronWriter()
        EnumMixedHolderCodec.encode(w, obj)
        val out = File("${outDir}/EnumMixedHolder.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EnumMixedHolder gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

