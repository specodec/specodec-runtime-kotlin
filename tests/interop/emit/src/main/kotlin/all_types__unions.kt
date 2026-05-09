package emit_kotlin

import specodec.*
import all_types_unions.*
import java.io.File

fun runAllTypesUnions(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_UnionFieldHolder, fm_UnionFieldHolder) = testModelUnionFieldHolder(); passed += pm_UnionFieldHolder; failed += fm_UnionFieldHolder
    val (pm_OptUnionFieldHolder, fm_OptUnionFieldHolder) = testModelOptUnionFieldHolder(); passed += pm_OptUnionFieldHolder; failed += fm_OptUnionFieldHolder
    val (pm_UnionArrayHolder, fm_UnionArrayHolder) = testModelUnionArrayHolder(); passed += pm_UnionArrayHolder; failed += fm_UnionArrayHolder
    val (pm_UnionMixedHolder, fm_UnionMixedHolder) = testModelUnionMixedHolder(); passed += pm_UnionMixedHolder; failed += fm_UnionMixedHolder
    val (pm_UnionScalarHolder, fm_UnionScalarHolder) = testModelUnionScalarHolder(); passed += pm_UnionScalarHolder; failed += fm_UnionScalarHolder

    return Pair(passed, failed)
}

fun testModelUnionFieldHolder(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/UnionFieldHolder.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = UnionFieldHolderCodec.decode(r)
        val w = MsgPackWriter()
        UnionFieldHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionFieldHolder.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionFieldHolder mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/UnionFieldHolder.json").readBytes()
        val r = JsonReader(data)
        val obj = UnionFieldHolderCodec.decode(r)
        val w = JsonWriter()
        UnionFieldHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionFieldHolder.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionFieldHolder json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/UnionFieldHolder.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = UnionFieldHolderCodec.decode(r)
        val w = JsonWriter()
        UnionFieldHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionFieldHolder.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionFieldHolder unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/UnionFieldHolder.gron").readBytes()
        val r = GronReader(data)
        val obj = UnionFieldHolderCodec.decode(r)
        val w = GronWriter()
        UnionFieldHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionFieldHolder.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionFieldHolder gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptUnionFieldHolder(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptUnionFieldHolder.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptUnionFieldHolderCodec.decode(r)
        val w = MsgPackWriter()
        OptUnionFieldHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptUnionFieldHolder.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptUnionFieldHolder mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptUnionFieldHolder.json").readBytes()
        val r = JsonReader(data)
        val obj = OptUnionFieldHolderCodec.decode(r)
        val w = JsonWriter()
        OptUnionFieldHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptUnionFieldHolder.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptUnionFieldHolder json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptUnionFieldHolder.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptUnionFieldHolderCodec.decode(r)
        val w = JsonWriter()
        OptUnionFieldHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptUnionFieldHolder.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptUnionFieldHolder unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptUnionFieldHolder.gron").readBytes()
        val r = GronReader(data)
        val obj = OptUnionFieldHolderCodec.decode(r)
        val w = GronWriter()
        OptUnionFieldHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptUnionFieldHolder.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptUnionFieldHolder gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelUnionArrayHolder(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/UnionArrayHolder.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = UnionArrayHolderCodec.decode(r)
        val w = MsgPackWriter()
        UnionArrayHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionArrayHolder.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionArrayHolder mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/UnionArrayHolder.json").readBytes()
        val r = JsonReader(data)
        val obj = UnionArrayHolderCodec.decode(r)
        val w = JsonWriter()
        UnionArrayHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionArrayHolder.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionArrayHolder json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/UnionArrayHolder.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = UnionArrayHolderCodec.decode(r)
        val w = JsonWriter()
        UnionArrayHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionArrayHolder.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionArrayHolder unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/UnionArrayHolder.gron").readBytes()
        val r = GronReader(data)
        val obj = UnionArrayHolderCodec.decode(r)
        val w = GronWriter()
        UnionArrayHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionArrayHolder.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionArrayHolder gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelUnionMixedHolder(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/UnionMixedHolder.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = UnionMixedHolderCodec.decode(r)
        val w = MsgPackWriter()
        UnionMixedHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionMixedHolder.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionMixedHolder mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/UnionMixedHolder.json").readBytes()
        val r = JsonReader(data)
        val obj = UnionMixedHolderCodec.decode(r)
        val w = JsonWriter()
        UnionMixedHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionMixedHolder.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionMixedHolder json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/UnionMixedHolder.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = UnionMixedHolderCodec.decode(r)
        val w = JsonWriter()
        UnionMixedHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionMixedHolder.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionMixedHolder unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/UnionMixedHolder.gron").readBytes()
        val r = GronReader(data)
        val obj = UnionMixedHolderCodec.decode(r)
        val w = GronWriter()
        UnionMixedHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionMixedHolder.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionMixedHolder gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelUnionScalarHolder(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/UnionScalarHolder.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = UnionScalarHolderCodec.decode(r)
        val w = MsgPackWriter()
        UnionScalarHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionScalarHolder.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionScalarHolder mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/UnionScalarHolder.json").readBytes()
        val r = JsonReader(data)
        val obj = UnionScalarHolderCodec.decode(r)
        val w = JsonWriter()
        UnionScalarHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionScalarHolder.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionScalarHolder json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/UnionScalarHolder.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = UnionScalarHolderCodec.decode(r)
        val w = JsonWriter()
        UnionScalarHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionScalarHolder.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionScalarHolder unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/UnionScalarHolder.gron").readBytes()
        val r = GronReader(data)
        val obj = UnionScalarHolderCodec.decode(r)
        val w = GronWriter()
        UnionScalarHolderCodec.encode(w, obj)
        val out = File("${outDir}/UnionScalarHolder.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL UnionScalarHolder gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

