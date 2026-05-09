package emit_kotlin

import specodec.*
import all_types_many.*
import java.io.File

fun runAllTypesMany(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_Five01, fm_Five01) = testModelFive01(); passed += pm_Five01; failed += fm_Five01
    val (pm_Five02, fm_Five02) = testModelFive02(); passed += pm_Five02; failed += fm_Five02
    val (pm_Five03, fm_Five03) = testModelFive03(); passed += pm_Five03; failed += fm_Five03
    val (pm_Five04, fm_Five04) = testModelFive04(); passed += pm_Five04; failed += fm_Five04
    val (pm_Five05, fm_Five05) = testModelFive05(); passed += pm_Five05; failed += fm_Five05
    val (pm_Five06, fm_Five06) = testModelFive06(); passed += pm_Five06; failed += fm_Five06
    val (pm_Five07, fm_Five07) = testModelFive07(); passed += pm_Five07; failed += fm_Five07
    val (pm_Five08, fm_Five08) = testModelFive08(); passed += pm_Five08; failed += fm_Five08
    val (pm_Five09, fm_Five09) = testModelFive09(); passed += pm_Five09; failed += fm_Five09
    val (pm_Five10, fm_Five10) = testModelFive10(); passed += pm_Five10; failed += fm_Five10
    val (pm_Ten01, fm_Ten01) = testModelTen01(); passed += pm_Ten01; failed += fm_Ten01
    val (pm_Ten02, fm_Ten02) = testModelTen02(); passed += pm_Ten02; failed += fm_Ten02
    val (pm_Ten03, fm_Ten03) = testModelTen03(); passed += pm_Ten03; failed += fm_Ten03
    val (pm_Ten04, fm_Ten04) = testModelTen04(); passed += pm_Ten04; failed += fm_Ten04
    val (pm_Ten05, fm_Ten05) = testModelTen05(); passed += pm_Ten05; failed += fm_Ten05

    return Pair(passed, failed)
}

fun testModelFive01(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Five01.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Five01Codec.decode(r)
        val w = MsgPackWriter()
        Five01Codec.encode(w, obj)
        val out = File("${outDir}/Five01.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five01 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five01.json").readBytes()
        val r = JsonReader(data)
        val obj = Five01Codec.decode(r)
        val w = JsonWriter()
        Five01Codec.encode(w, obj)
        val out = File("${outDir}/Five01.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five01 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five01.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Five01Codec.decode(r)
        val w = JsonWriter()
        Five01Codec.encode(w, obj)
        val out = File("${outDir}/Five01.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five01 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five01.gron").readBytes()
        val r = GronReader(data)
        val obj = Five01Codec.decode(r)
        val w = GronWriter()
        Five01Codec.encode(w, obj)
        val out = File("${outDir}/Five01.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five01 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelFive02(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Five02.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Five02Codec.decode(r)
        val w = MsgPackWriter()
        Five02Codec.encode(w, obj)
        val out = File("${outDir}/Five02.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five02 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five02.json").readBytes()
        val r = JsonReader(data)
        val obj = Five02Codec.decode(r)
        val w = JsonWriter()
        Five02Codec.encode(w, obj)
        val out = File("${outDir}/Five02.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five02 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five02.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Five02Codec.decode(r)
        val w = JsonWriter()
        Five02Codec.encode(w, obj)
        val out = File("${outDir}/Five02.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five02 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five02.gron").readBytes()
        val r = GronReader(data)
        val obj = Five02Codec.decode(r)
        val w = GronWriter()
        Five02Codec.encode(w, obj)
        val out = File("${outDir}/Five02.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five02 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelFive03(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Five03.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Five03Codec.decode(r)
        val w = MsgPackWriter()
        Five03Codec.encode(w, obj)
        val out = File("${outDir}/Five03.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five03 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five03.json").readBytes()
        val r = JsonReader(data)
        val obj = Five03Codec.decode(r)
        val w = JsonWriter()
        Five03Codec.encode(w, obj)
        val out = File("${outDir}/Five03.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five03 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five03.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Five03Codec.decode(r)
        val w = JsonWriter()
        Five03Codec.encode(w, obj)
        val out = File("${outDir}/Five03.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five03 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five03.gron").readBytes()
        val r = GronReader(data)
        val obj = Five03Codec.decode(r)
        val w = GronWriter()
        Five03Codec.encode(w, obj)
        val out = File("${outDir}/Five03.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five03 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelFive04(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Five04.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Five04Codec.decode(r)
        val w = MsgPackWriter()
        Five04Codec.encode(w, obj)
        val out = File("${outDir}/Five04.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five04 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five04.json").readBytes()
        val r = JsonReader(data)
        val obj = Five04Codec.decode(r)
        val w = JsonWriter()
        Five04Codec.encode(w, obj)
        val out = File("${outDir}/Five04.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five04 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five04.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Five04Codec.decode(r)
        val w = JsonWriter()
        Five04Codec.encode(w, obj)
        val out = File("${outDir}/Five04.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five04 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five04.gron").readBytes()
        val r = GronReader(data)
        val obj = Five04Codec.decode(r)
        val w = GronWriter()
        Five04Codec.encode(w, obj)
        val out = File("${outDir}/Five04.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five04 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelFive05(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Five05.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Five05Codec.decode(r)
        val w = MsgPackWriter()
        Five05Codec.encode(w, obj)
        val out = File("${outDir}/Five05.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five05 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five05.json").readBytes()
        val r = JsonReader(data)
        val obj = Five05Codec.decode(r)
        val w = JsonWriter()
        Five05Codec.encode(w, obj)
        val out = File("${outDir}/Five05.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five05 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five05.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Five05Codec.decode(r)
        val w = JsonWriter()
        Five05Codec.encode(w, obj)
        val out = File("${outDir}/Five05.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five05 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five05.gron").readBytes()
        val r = GronReader(data)
        val obj = Five05Codec.decode(r)
        val w = GronWriter()
        Five05Codec.encode(w, obj)
        val out = File("${outDir}/Five05.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five05 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelFive06(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Five06.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Five06Codec.decode(r)
        val w = MsgPackWriter()
        Five06Codec.encode(w, obj)
        val out = File("${outDir}/Five06.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five06 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five06.json").readBytes()
        val r = JsonReader(data)
        val obj = Five06Codec.decode(r)
        val w = JsonWriter()
        Five06Codec.encode(w, obj)
        val out = File("${outDir}/Five06.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five06 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five06.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Five06Codec.decode(r)
        val w = JsonWriter()
        Five06Codec.encode(w, obj)
        val out = File("${outDir}/Five06.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five06 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five06.gron").readBytes()
        val r = GronReader(data)
        val obj = Five06Codec.decode(r)
        val w = GronWriter()
        Five06Codec.encode(w, obj)
        val out = File("${outDir}/Five06.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five06 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelFive07(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Five07.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Five07Codec.decode(r)
        val w = MsgPackWriter()
        Five07Codec.encode(w, obj)
        val out = File("${outDir}/Five07.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five07 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five07.json").readBytes()
        val r = JsonReader(data)
        val obj = Five07Codec.decode(r)
        val w = JsonWriter()
        Five07Codec.encode(w, obj)
        val out = File("${outDir}/Five07.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five07 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five07.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Five07Codec.decode(r)
        val w = JsonWriter()
        Five07Codec.encode(w, obj)
        val out = File("${outDir}/Five07.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five07 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five07.gron").readBytes()
        val r = GronReader(data)
        val obj = Five07Codec.decode(r)
        val w = GronWriter()
        Five07Codec.encode(w, obj)
        val out = File("${outDir}/Five07.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five07 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelFive08(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Five08.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Five08Codec.decode(r)
        val w = MsgPackWriter()
        Five08Codec.encode(w, obj)
        val out = File("${outDir}/Five08.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five08 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five08.json").readBytes()
        val r = JsonReader(data)
        val obj = Five08Codec.decode(r)
        val w = JsonWriter()
        Five08Codec.encode(w, obj)
        val out = File("${outDir}/Five08.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five08 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five08.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Five08Codec.decode(r)
        val w = JsonWriter()
        Five08Codec.encode(w, obj)
        val out = File("${outDir}/Five08.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five08 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five08.gron").readBytes()
        val r = GronReader(data)
        val obj = Five08Codec.decode(r)
        val w = GronWriter()
        Five08Codec.encode(w, obj)
        val out = File("${outDir}/Five08.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five08 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelFive09(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Five09.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Five09Codec.decode(r)
        val w = MsgPackWriter()
        Five09Codec.encode(w, obj)
        val out = File("${outDir}/Five09.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five09 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five09.json").readBytes()
        val r = JsonReader(data)
        val obj = Five09Codec.decode(r)
        val w = JsonWriter()
        Five09Codec.encode(w, obj)
        val out = File("${outDir}/Five09.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five09 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five09.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Five09Codec.decode(r)
        val w = JsonWriter()
        Five09Codec.encode(w, obj)
        val out = File("${outDir}/Five09.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five09 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five09.gron").readBytes()
        val r = GronReader(data)
        val obj = Five09Codec.decode(r)
        val w = GronWriter()
        Five09Codec.encode(w, obj)
        val out = File("${outDir}/Five09.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five09 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelFive10(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Five10.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Five10Codec.decode(r)
        val w = MsgPackWriter()
        Five10Codec.encode(w, obj)
        val out = File("${outDir}/Five10.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five10 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five10.json").readBytes()
        val r = JsonReader(data)
        val obj = Five10Codec.decode(r)
        val w = JsonWriter()
        Five10Codec.encode(w, obj)
        val out = File("${outDir}/Five10.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five10 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five10.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Five10Codec.decode(r)
        val w = JsonWriter()
        Five10Codec.encode(w, obj)
        val out = File("${outDir}/Five10.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five10 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Five10.gron").readBytes()
        val r = GronReader(data)
        val obj = Five10Codec.decode(r)
        val w = GronWriter()
        Five10Codec.encode(w, obj)
        val out = File("${outDir}/Five10.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Five10 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTen01(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Ten01.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Ten01Codec.decode(r)
        val w = MsgPackWriter()
        Ten01Codec.encode(w, obj)
        val out = File("${outDir}/Ten01.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten01 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten01.json").readBytes()
        val r = JsonReader(data)
        val obj = Ten01Codec.decode(r)
        val w = JsonWriter()
        Ten01Codec.encode(w, obj)
        val out = File("${outDir}/Ten01.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten01 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten01.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Ten01Codec.decode(r)
        val w = JsonWriter()
        Ten01Codec.encode(w, obj)
        val out = File("${outDir}/Ten01.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten01 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten01.gron").readBytes()
        val r = GronReader(data)
        val obj = Ten01Codec.decode(r)
        val w = GronWriter()
        Ten01Codec.encode(w, obj)
        val out = File("${outDir}/Ten01.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten01 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTen02(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Ten02.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Ten02Codec.decode(r)
        val w = MsgPackWriter()
        Ten02Codec.encode(w, obj)
        val out = File("${outDir}/Ten02.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten02 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten02.json").readBytes()
        val r = JsonReader(data)
        val obj = Ten02Codec.decode(r)
        val w = JsonWriter()
        Ten02Codec.encode(w, obj)
        val out = File("${outDir}/Ten02.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten02 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten02.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Ten02Codec.decode(r)
        val w = JsonWriter()
        Ten02Codec.encode(w, obj)
        val out = File("${outDir}/Ten02.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten02 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten02.gron").readBytes()
        val r = GronReader(data)
        val obj = Ten02Codec.decode(r)
        val w = GronWriter()
        Ten02Codec.encode(w, obj)
        val out = File("${outDir}/Ten02.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten02 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTen03(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Ten03.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Ten03Codec.decode(r)
        val w = MsgPackWriter()
        Ten03Codec.encode(w, obj)
        val out = File("${outDir}/Ten03.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten03 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten03.json").readBytes()
        val r = JsonReader(data)
        val obj = Ten03Codec.decode(r)
        val w = JsonWriter()
        Ten03Codec.encode(w, obj)
        val out = File("${outDir}/Ten03.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten03 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten03.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Ten03Codec.decode(r)
        val w = JsonWriter()
        Ten03Codec.encode(w, obj)
        val out = File("${outDir}/Ten03.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten03 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten03.gron").readBytes()
        val r = GronReader(data)
        val obj = Ten03Codec.decode(r)
        val w = GronWriter()
        Ten03Codec.encode(w, obj)
        val out = File("${outDir}/Ten03.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten03 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTen04(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Ten04.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Ten04Codec.decode(r)
        val w = MsgPackWriter()
        Ten04Codec.encode(w, obj)
        val out = File("${outDir}/Ten04.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten04 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten04.json").readBytes()
        val r = JsonReader(data)
        val obj = Ten04Codec.decode(r)
        val w = JsonWriter()
        Ten04Codec.encode(w, obj)
        val out = File("${outDir}/Ten04.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten04 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten04.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Ten04Codec.decode(r)
        val w = JsonWriter()
        Ten04Codec.encode(w, obj)
        val out = File("${outDir}/Ten04.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten04 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten04.gron").readBytes()
        val r = GronReader(data)
        val obj = Ten04Codec.decode(r)
        val w = GronWriter()
        Ten04Codec.encode(w, obj)
        val out = File("${outDir}/Ten04.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten04 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTen05(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Ten05.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Ten05Codec.decode(r)
        val w = MsgPackWriter()
        Ten05Codec.encode(w, obj)
        val out = File("${outDir}/Ten05.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten05 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten05.json").readBytes()
        val r = JsonReader(data)
        val obj = Ten05Codec.decode(r)
        val w = JsonWriter()
        Ten05Codec.encode(w, obj)
        val out = File("${outDir}/Ten05.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten05 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten05.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Ten05Codec.decode(r)
        val w = JsonWriter()
        Ten05Codec.encode(w, obj)
        val out = File("${outDir}/Ten05.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten05 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ten05.gron").readBytes()
        val r = GronReader(data)
        val obj = Ten05Codec.decode(r)
        val w = GronWriter()
        Ten05Codec.encode(w, obj)
        val out = File("${outDir}/Ten05.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ten05 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

