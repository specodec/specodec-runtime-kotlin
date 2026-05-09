package emit_kotlin

import specodec.*
import all_types_wide.*
import java.io.File

fun runAllTypesWide(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_Wide20, fm_Wide20) = testModelWide20(); passed += pm_Wide20; failed += fm_Wide20
    val (pm_Wide25, fm_Wide25) = testModelWide25(); passed += pm_Wide25; failed += fm_Wide25
    val (pm_Wide30, fm_Wide30) = testModelWide30(); passed += pm_Wide30; failed += fm_Wide30
    val (pm_Wide35, fm_Wide35) = testModelWide35(); passed += pm_Wide35; failed += fm_Wide35
    val (pm_Wide40, fm_Wide40) = testModelWide40(); passed += pm_Wide40; failed += fm_Wide40

    return Pair(passed, failed)
}

fun testModelWide20(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Wide20.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Wide20Codec.decode(r)
        val w = MsgPackWriter()
        Wide20Codec.encode(w, obj)
        val out = File("${outDir}/Wide20.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide20 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide20.json").readBytes()
        val r = JsonReader(data)
        val obj = Wide20Codec.decode(r)
        val w = JsonWriter()
        Wide20Codec.encode(w, obj)
        val out = File("${outDir}/Wide20.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide20 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide20.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Wide20Codec.decode(r)
        val w = JsonWriter()
        Wide20Codec.encode(w, obj)
        val out = File("${outDir}/Wide20.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide20 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide20.gron").readBytes()
        val r = GronReader(data)
        val obj = Wide20Codec.decode(r)
        val w = GronWriter()
        Wide20Codec.encode(w, obj)
        val out = File("${outDir}/Wide20.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide20 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelWide25(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Wide25.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Wide25Codec.decode(r)
        val w = MsgPackWriter()
        Wide25Codec.encode(w, obj)
        val out = File("${outDir}/Wide25.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide25 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide25.json").readBytes()
        val r = JsonReader(data)
        val obj = Wide25Codec.decode(r)
        val w = JsonWriter()
        Wide25Codec.encode(w, obj)
        val out = File("${outDir}/Wide25.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide25 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide25.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Wide25Codec.decode(r)
        val w = JsonWriter()
        Wide25Codec.encode(w, obj)
        val out = File("${outDir}/Wide25.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide25 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide25.gron").readBytes()
        val r = GronReader(data)
        val obj = Wide25Codec.decode(r)
        val w = GronWriter()
        Wide25Codec.encode(w, obj)
        val out = File("${outDir}/Wide25.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide25 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelWide30(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Wide30.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Wide30Codec.decode(r)
        val w = MsgPackWriter()
        Wide30Codec.encode(w, obj)
        val out = File("${outDir}/Wide30.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide30 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide30.json").readBytes()
        val r = JsonReader(data)
        val obj = Wide30Codec.decode(r)
        val w = JsonWriter()
        Wide30Codec.encode(w, obj)
        val out = File("${outDir}/Wide30.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide30 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide30.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Wide30Codec.decode(r)
        val w = JsonWriter()
        Wide30Codec.encode(w, obj)
        val out = File("${outDir}/Wide30.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide30 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide30.gron").readBytes()
        val r = GronReader(data)
        val obj = Wide30Codec.decode(r)
        val w = GronWriter()
        Wide30Codec.encode(w, obj)
        val out = File("${outDir}/Wide30.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide30 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelWide35(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Wide35.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Wide35Codec.decode(r)
        val w = MsgPackWriter()
        Wide35Codec.encode(w, obj)
        val out = File("${outDir}/Wide35.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide35 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide35.json").readBytes()
        val r = JsonReader(data)
        val obj = Wide35Codec.decode(r)
        val w = JsonWriter()
        Wide35Codec.encode(w, obj)
        val out = File("${outDir}/Wide35.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide35 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide35.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Wide35Codec.decode(r)
        val w = JsonWriter()
        Wide35Codec.encode(w, obj)
        val out = File("${outDir}/Wide35.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide35 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide35.gron").readBytes()
        val r = GronReader(data)
        val obj = Wide35Codec.decode(r)
        val w = GronWriter()
        Wide35Codec.encode(w, obj)
        val out = File("${outDir}/Wide35.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide35 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelWide40(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Wide40.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Wide40Codec.decode(r)
        val w = MsgPackWriter()
        Wide40Codec.encode(w, obj)
        val out = File("${outDir}/Wide40.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide40 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide40.json").readBytes()
        val r = JsonReader(data)
        val obj = Wide40Codec.decode(r)
        val w = JsonWriter()
        Wide40Codec.encode(w, obj)
        val out = File("${outDir}/Wide40.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide40 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide40.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Wide40Codec.decode(r)
        val w = JsonWriter()
        Wide40Codec.encode(w, obj)
        val out = File("${outDir}/Wide40.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide40 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Wide40.gron").readBytes()
        val r = GronReader(data)
        val obj = Wide40Codec.decode(r)
        val w = GronWriter()
        Wide40Codec.encode(w, obj)
        val out = File("${outDir}/Wide40.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Wide40 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

