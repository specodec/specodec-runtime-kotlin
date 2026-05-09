package emit_kotlin

import specodec.*
import all_types_mixed.*
import java.io.File

fun runAllTypesMixed(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_ModelArr1, fm_ModelArr1) = testModelModelArr1(); passed += pm_ModelArr1; failed += fm_ModelArr1
    val (pm_ModelArr2, fm_ModelArr2) = testModelModelArr2(); passed += pm_ModelArr2; failed += fm_ModelArr2
    val (pm_ModelArr3, fm_ModelArr3) = testModelModelArr3(); passed += pm_ModelArr3; failed += fm_ModelArr3
    val (pm_ModelArr4, fm_ModelArr4) = testModelModelArr4(); passed += pm_ModelArr4; failed += fm_ModelArr4
    val (pm_ModelArr5, fm_ModelArr5) = testModelModelArr5(); passed += pm_ModelArr5; failed += fm_ModelArr5
    val (pm_Mix01, fm_Mix01) = testModelMix01(); passed += pm_Mix01; failed += fm_Mix01
    val (pm_Mix02, fm_Mix02) = testModelMix02(); passed += pm_Mix02; failed += fm_Mix02
    val (pm_Mix03, fm_Mix03) = testModelMix03(); passed += pm_Mix03; failed += fm_Mix03
    val (pm_Mix04, fm_Mix04) = testModelMix04(); passed += pm_Mix04; failed += fm_Mix04
    val (pm_Mix05, fm_Mix05) = testModelMix05(); passed += pm_Mix05; failed += fm_Mix05
    val (pm_Mix06, fm_Mix06) = testModelMix06(); passed += pm_Mix06; failed += fm_Mix06
    val (pm_Mix07, fm_Mix07) = testModelMix07(); passed += pm_Mix07; failed += fm_Mix07
    val (pm_Mix08, fm_Mix08) = testModelMix08(); passed += pm_Mix08; failed += fm_Mix08
    val (pm_Mix09, fm_Mix09) = testModelMix09(); passed += pm_Mix09; failed += fm_Mix09
    val (pm_Mix10, fm_Mix10) = testModelMix10(); passed += pm_Mix10; failed += fm_Mix10
    val (pm_Mix11, fm_Mix11) = testModelMix11(); passed += pm_Mix11; failed += fm_Mix11
    val (pm_Mix12, fm_Mix12) = testModelMix12(); passed += pm_Mix12; failed += fm_Mix12
    val (pm_Mix13, fm_Mix13) = testModelMix13(); passed += pm_Mix13; failed += fm_Mix13
    val (pm_Mix14, fm_Mix14) = testModelMix14(); passed += pm_Mix14; failed += fm_Mix14
    val (pm_Mix15, fm_Mix15) = testModelMix15(); passed += pm_Mix15; failed += fm_Mix15
    val (pm_AllOpt1, fm_AllOpt1) = testModelAllOpt1(); passed += pm_AllOpt1; failed += fm_AllOpt1
    val (pm_AllOpt2, fm_AllOpt2) = testModelAllOpt2(); passed += pm_AllOpt2; failed += fm_AllOpt2
    val (pm_AllOpt3, fm_AllOpt3) = testModelAllOpt3(); passed += pm_AllOpt3; failed += fm_AllOpt3
    val (pm_AllOpt4, fm_AllOpt4) = testModelAllOpt4(); passed += pm_AllOpt4; failed += fm_AllOpt4
    val (pm_AllOpt5, fm_AllOpt5) = testModelAllOpt5(); passed += pm_AllOpt5; failed += fm_AllOpt5

    return Pair(passed, failed)
}

fun testModelModelArr1(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ModelArr1.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ModelArr1Codec.decode(r)
        val w = MsgPackWriter()
        ModelArr1Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr1.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr1 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr1.json").readBytes()
        val r = JsonReader(data)
        val obj = ModelArr1Codec.decode(r)
        val w = JsonWriter()
        ModelArr1Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr1.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr1 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr1.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ModelArr1Codec.decode(r)
        val w = JsonWriter()
        ModelArr1Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr1.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr1 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr1.gron").readBytes()
        val r = GronReader(data)
        val obj = ModelArr1Codec.decode(r)
        val w = GronWriter()
        ModelArr1Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr1.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr1 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelModelArr2(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ModelArr2.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ModelArr2Codec.decode(r)
        val w = MsgPackWriter()
        ModelArr2Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr2.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr2 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr2.json").readBytes()
        val r = JsonReader(data)
        val obj = ModelArr2Codec.decode(r)
        val w = JsonWriter()
        ModelArr2Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr2.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr2 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr2.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ModelArr2Codec.decode(r)
        val w = JsonWriter()
        ModelArr2Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr2.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr2 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr2.gron").readBytes()
        val r = GronReader(data)
        val obj = ModelArr2Codec.decode(r)
        val w = GronWriter()
        ModelArr2Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr2.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr2 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelModelArr3(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ModelArr3.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ModelArr3Codec.decode(r)
        val w = MsgPackWriter()
        ModelArr3Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr3.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr3 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr3.json").readBytes()
        val r = JsonReader(data)
        val obj = ModelArr3Codec.decode(r)
        val w = JsonWriter()
        ModelArr3Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr3.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr3 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr3.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ModelArr3Codec.decode(r)
        val w = JsonWriter()
        ModelArr3Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr3.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr3 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr3.gron").readBytes()
        val r = GronReader(data)
        val obj = ModelArr3Codec.decode(r)
        val w = GronWriter()
        ModelArr3Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr3.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr3 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelModelArr4(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ModelArr4.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ModelArr4Codec.decode(r)
        val w = MsgPackWriter()
        ModelArr4Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr4.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr4 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr4.json").readBytes()
        val r = JsonReader(data)
        val obj = ModelArr4Codec.decode(r)
        val w = JsonWriter()
        ModelArr4Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr4.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr4 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr4.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ModelArr4Codec.decode(r)
        val w = JsonWriter()
        ModelArr4Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr4.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr4 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr4.gron").readBytes()
        val r = GronReader(data)
        val obj = ModelArr4Codec.decode(r)
        val w = GronWriter()
        ModelArr4Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr4.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr4 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelModelArr5(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ModelArr5.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ModelArr5Codec.decode(r)
        val w = MsgPackWriter()
        ModelArr5Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr5.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr5 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr5.json").readBytes()
        val r = JsonReader(data)
        val obj = ModelArr5Codec.decode(r)
        val w = JsonWriter()
        ModelArr5Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr5.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr5 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr5.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ModelArr5Codec.decode(r)
        val w = JsonWriter()
        ModelArr5Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr5.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr5 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ModelArr5.gron").readBytes()
        val r = GronReader(data)
        val obj = ModelArr5Codec.decode(r)
        val w = GronWriter()
        ModelArr5Codec.encode(w, obj)
        val out = File("${outDir}/ModelArr5.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ModelArr5 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix01(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix01.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix01Codec.decode(r)
        val w = MsgPackWriter()
        Mix01Codec.encode(w, obj)
        val out = File("${outDir}/Mix01.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix01 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix01.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix01Codec.decode(r)
        val w = JsonWriter()
        Mix01Codec.encode(w, obj)
        val out = File("${outDir}/Mix01.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix01 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix01.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix01Codec.decode(r)
        val w = JsonWriter()
        Mix01Codec.encode(w, obj)
        val out = File("${outDir}/Mix01.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix01 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix01.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix01Codec.decode(r)
        val w = GronWriter()
        Mix01Codec.encode(w, obj)
        val out = File("${outDir}/Mix01.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix01 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix02(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix02.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix02Codec.decode(r)
        val w = MsgPackWriter()
        Mix02Codec.encode(w, obj)
        val out = File("${outDir}/Mix02.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix02 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix02.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix02Codec.decode(r)
        val w = JsonWriter()
        Mix02Codec.encode(w, obj)
        val out = File("${outDir}/Mix02.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix02 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix02.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix02Codec.decode(r)
        val w = JsonWriter()
        Mix02Codec.encode(w, obj)
        val out = File("${outDir}/Mix02.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix02 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix02.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix02Codec.decode(r)
        val w = GronWriter()
        Mix02Codec.encode(w, obj)
        val out = File("${outDir}/Mix02.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix02 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix03(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix03.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix03Codec.decode(r)
        val w = MsgPackWriter()
        Mix03Codec.encode(w, obj)
        val out = File("${outDir}/Mix03.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix03 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix03.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix03Codec.decode(r)
        val w = JsonWriter()
        Mix03Codec.encode(w, obj)
        val out = File("${outDir}/Mix03.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix03 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix03.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix03Codec.decode(r)
        val w = JsonWriter()
        Mix03Codec.encode(w, obj)
        val out = File("${outDir}/Mix03.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix03 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix03.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix03Codec.decode(r)
        val w = GronWriter()
        Mix03Codec.encode(w, obj)
        val out = File("${outDir}/Mix03.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix03 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix04(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix04.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix04Codec.decode(r)
        val w = MsgPackWriter()
        Mix04Codec.encode(w, obj)
        val out = File("${outDir}/Mix04.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix04 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix04.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix04Codec.decode(r)
        val w = JsonWriter()
        Mix04Codec.encode(w, obj)
        val out = File("${outDir}/Mix04.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix04 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix04.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix04Codec.decode(r)
        val w = JsonWriter()
        Mix04Codec.encode(w, obj)
        val out = File("${outDir}/Mix04.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix04 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix04.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix04Codec.decode(r)
        val w = GronWriter()
        Mix04Codec.encode(w, obj)
        val out = File("${outDir}/Mix04.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix04 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix05(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix05.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix05Codec.decode(r)
        val w = MsgPackWriter()
        Mix05Codec.encode(w, obj)
        val out = File("${outDir}/Mix05.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix05 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix05.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix05Codec.decode(r)
        val w = JsonWriter()
        Mix05Codec.encode(w, obj)
        val out = File("${outDir}/Mix05.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix05 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix05.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix05Codec.decode(r)
        val w = JsonWriter()
        Mix05Codec.encode(w, obj)
        val out = File("${outDir}/Mix05.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix05 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix05.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix05Codec.decode(r)
        val w = GronWriter()
        Mix05Codec.encode(w, obj)
        val out = File("${outDir}/Mix05.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix05 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix06(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix06.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix06Codec.decode(r)
        val w = MsgPackWriter()
        Mix06Codec.encode(w, obj)
        val out = File("${outDir}/Mix06.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix06 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix06.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix06Codec.decode(r)
        val w = JsonWriter()
        Mix06Codec.encode(w, obj)
        val out = File("${outDir}/Mix06.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix06 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix06.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix06Codec.decode(r)
        val w = JsonWriter()
        Mix06Codec.encode(w, obj)
        val out = File("${outDir}/Mix06.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix06 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix06.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix06Codec.decode(r)
        val w = GronWriter()
        Mix06Codec.encode(w, obj)
        val out = File("${outDir}/Mix06.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix06 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix07(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix07.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix07Codec.decode(r)
        val w = MsgPackWriter()
        Mix07Codec.encode(w, obj)
        val out = File("${outDir}/Mix07.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix07 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix07.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix07Codec.decode(r)
        val w = JsonWriter()
        Mix07Codec.encode(w, obj)
        val out = File("${outDir}/Mix07.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix07 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix07.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix07Codec.decode(r)
        val w = JsonWriter()
        Mix07Codec.encode(w, obj)
        val out = File("${outDir}/Mix07.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix07 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix07.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix07Codec.decode(r)
        val w = GronWriter()
        Mix07Codec.encode(w, obj)
        val out = File("${outDir}/Mix07.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix07 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix08(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix08.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix08Codec.decode(r)
        val w = MsgPackWriter()
        Mix08Codec.encode(w, obj)
        val out = File("${outDir}/Mix08.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix08 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix08.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix08Codec.decode(r)
        val w = JsonWriter()
        Mix08Codec.encode(w, obj)
        val out = File("${outDir}/Mix08.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix08 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix08.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix08Codec.decode(r)
        val w = JsonWriter()
        Mix08Codec.encode(w, obj)
        val out = File("${outDir}/Mix08.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix08 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix08.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix08Codec.decode(r)
        val w = GronWriter()
        Mix08Codec.encode(w, obj)
        val out = File("${outDir}/Mix08.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix08 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix09(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix09.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix09Codec.decode(r)
        val w = MsgPackWriter()
        Mix09Codec.encode(w, obj)
        val out = File("${outDir}/Mix09.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix09 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix09.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix09Codec.decode(r)
        val w = JsonWriter()
        Mix09Codec.encode(w, obj)
        val out = File("${outDir}/Mix09.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix09 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix09.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix09Codec.decode(r)
        val w = JsonWriter()
        Mix09Codec.encode(w, obj)
        val out = File("${outDir}/Mix09.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix09 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix09.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix09Codec.decode(r)
        val w = GronWriter()
        Mix09Codec.encode(w, obj)
        val out = File("${outDir}/Mix09.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix09 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix10(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix10.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix10Codec.decode(r)
        val w = MsgPackWriter()
        Mix10Codec.encode(w, obj)
        val out = File("${outDir}/Mix10.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix10 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix10.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix10Codec.decode(r)
        val w = JsonWriter()
        Mix10Codec.encode(w, obj)
        val out = File("${outDir}/Mix10.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix10 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix10.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix10Codec.decode(r)
        val w = JsonWriter()
        Mix10Codec.encode(w, obj)
        val out = File("${outDir}/Mix10.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix10 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix10.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix10Codec.decode(r)
        val w = GronWriter()
        Mix10Codec.encode(w, obj)
        val out = File("${outDir}/Mix10.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix10 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix11(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix11.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix11Codec.decode(r)
        val w = MsgPackWriter()
        Mix11Codec.encode(w, obj)
        val out = File("${outDir}/Mix11.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix11 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix11.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix11Codec.decode(r)
        val w = JsonWriter()
        Mix11Codec.encode(w, obj)
        val out = File("${outDir}/Mix11.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix11 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix11.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix11Codec.decode(r)
        val w = JsonWriter()
        Mix11Codec.encode(w, obj)
        val out = File("${outDir}/Mix11.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix11 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix11.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix11Codec.decode(r)
        val w = GronWriter()
        Mix11Codec.encode(w, obj)
        val out = File("${outDir}/Mix11.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix11 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix12(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix12.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix12Codec.decode(r)
        val w = MsgPackWriter()
        Mix12Codec.encode(w, obj)
        val out = File("${outDir}/Mix12.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix12 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix12.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix12Codec.decode(r)
        val w = JsonWriter()
        Mix12Codec.encode(w, obj)
        val out = File("${outDir}/Mix12.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix12 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix12.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix12Codec.decode(r)
        val w = JsonWriter()
        Mix12Codec.encode(w, obj)
        val out = File("${outDir}/Mix12.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix12 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix12.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix12Codec.decode(r)
        val w = GronWriter()
        Mix12Codec.encode(w, obj)
        val out = File("${outDir}/Mix12.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix12 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix13(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix13.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix13Codec.decode(r)
        val w = MsgPackWriter()
        Mix13Codec.encode(w, obj)
        val out = File("${outDir}/Mix13.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix13 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix13.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix13Codec.decode(r)
        val w = JsonWriter()
        Mix13Codec.encode(w, obj)
        val out = File("${outDir}/Mix13.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix13 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix13.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix13Codec.decode(r)
        val w = JsonWriter()
        Mix13Codec.encode(w, obj)
        val out = File("${outDir}/Mix13.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix13 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix13.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix13Codec.decode(r)
        val w = GronWriter()
        Mix13Codec.encode(w, obj)
        val out = File("${outDir}/Mix13.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix13 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix14(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix14.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix14Codec.decode(r)
        val w = MsgPackWriter()
        Mix14Codec.encode(w, obj)
        val out = File("${outDir}/Mix14.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix14 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix14.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix14Codec.decode(r)
        val w = JsonWriter()
        Mix14Codec.encode(w, obj)
        val out = File("${outDir}/Mix14.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix14 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix14.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix14Codec.decode(r)
        val w = JsonWriter()
        Mix14Codec.encode(w, obj)
        val out = File("${outDir}/Mix14.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix14 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix14.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix14Codec.decode(r)
        val w = GronWriter()
        Mix14Codec.encode(w, obj)
        val out = File("${outDir}/Mix14.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix14 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMix15(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Mix15.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Mix15Codec.decode(r)
        val w = MsgPackWriter()
        Mix15Codec.encode(w, obj)
        val out = File("${outDir}/Mix15.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix15 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix15.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix15Codec.decode(r)
        val w = JsonWriter()
        Mix15Codec.encode(w, obj)
        val out = File("${outDir}/Mix15.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix15 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix15.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Mix15Codec.decode(r)
        val w = JsonWriter()
        Mix15Codec.encode(w, obj)
        val out = File("${outDir}/Mix15.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix15 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Mix15.gron").readBytes()
        val r = GronReader(data)
        val obj = Mix15Codec.decode(r)
        val w = GronWriter()
        Mix15Codec.encode(w, obj)
        val out = File("${outDir}/Mix15.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Mix15 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelAllOpt1(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/AllOpt1.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = AllOpt1Codec.decode(r)
        val w = MsgPackWriter()
        AllOpt1Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt1.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt1 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt1.json").readBytes()
        val r = JsonReader(data)
        val obj = AllOpt1Codec.decode(r)
        val w = JsonWriter()
        AllOpt1Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt1.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt1 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt1.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = AllOpt1Codec.decode(r)
        val w = JsonWriter()
        AllOpt1Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt1.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt1 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt1.gron").readBytes()
        val r = GronReader(data)
        val obj = AllOpt1Codec.decode(r)
        val w = GronWriter()
        AllOpt1Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt1.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt1 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelAllOpt2(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/AllOpt2.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = AllOpt2Codec.decode(r)
        val w = MsgPackWriter()
        AllOpt2Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt2.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt2 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt2.json").readBytes()
        val r = JsonReader(data)
        val obj = AllOpt2Codec.decode(r)
        val w = JsonWriter()
        AllOpt2Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt2.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt2 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt2.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = AllOpt2Codec.decode(r)
        val w = JsonWriter()
        AllOpt2Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt2.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt2 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt2.gron").readBytes()
        val r = GronReader(data)
        val obj = AllOpt2Codec.decode(r)
        val w = GronWriter()
        AllOpt2Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt2.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt2 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelAllOpt3(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/AllOpt3.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = AllOpt3Codec.decode(r)
        val w = MsgPackWriter()
        AllOpt3Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt3.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt3 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt3.json").readBytes()
        val r = JsonReader(data)
        val obj = AllOpt3Codec.decode(r)
        val w = JsonWriter()
        AllOpt3Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt3.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt3 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt3.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = AllOpt3Codec.decode(r)
        val w = JsonWriter()
        AllOpt3Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt3.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt3 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt3.gron").readBytes()
        val r = GronReader(data)
        val obj = AllOpt3Codec.decode(r)
        val w = GronWriter()
        AllOpt3Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt3.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt3 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelAllOpt4(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/AllOpt4.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = AllOpt4Codec.decode(r)
        val w = MsgPackWriter()
        AllOpt4Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt4.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt4 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt4.json").readBytes()
        val r = JsonReader(data)
        val obj = AllOpt4Codec.decode(r)
        val w = JsonWriter()
        AllOpt4Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt4.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt4 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt4.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = AllOpt4Codec.decode(r)
        val w = JsonWriter()
        AllOpt4Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt4.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt4 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt4.gron").readBytes()
        val r = GronReader(data)
        val obj = AllOpt4Codec.decode(r)
        val w = GronWriter()
        AllOpt4Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt4.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt4 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelAllOpt5(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/AllOpt5.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = AllOpt5Codec.decode(r)
        val w = MsgPackWriter()
        AllOpt5Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt5.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt5 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt5.json").readBytes()
        val r = JsonReader(data)
        val obj = AllOpt5Codec.decode(r)
        val w = JsonWriter()
        AllOpt5Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt5.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt5 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt5.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = AllOpt5Codec.decode(r)
        val w = JsonWriter()
        AllOpt5Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt5.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt5 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/AllOpt5.gron").readBytes()
        val r = GronReader(data)
        val obj = AllOpt5Codec.decode(r)
        val w = GronWriter()
        AllOpt5Codec.encode(w, obj)
        val out = File("${outDir}/AllOpt5.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL AllOpt5 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

