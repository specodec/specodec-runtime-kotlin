package emit_kotlin

import specodec.*
import all_types_extra.*
import java.io.File

fun runAllTypesExtra(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_OptArr1, fm_OptArr1) = testModelOptArr1(); passed += pm_OptArr1; failed += fm_OptArr1
    val (pm_OptArr2, fm_OptArr2) = testModelOptArr2(); passed += pm_OptArr2; failed += fm_OptArr2
    val (pm_OptArr3, fm_OptArr3) = testModelOptArr3(); passed += pm_OptArr3; failed += fm_OptArr3
    val (pm_OptArr4, fm_OptArr4) = testModelOptArr4(); passed += pm_OptArr4; failed += fm_OptArr4
    val (pm_OptArr5, fm_OptArr5) = testModelOptArr5(); passed += pm_OptArr5; failed += fm_OptArr5
    val (pm_NestOpt1, fm_NestOpt1) = testModelNestOpt1(); passed += pm_NestOpt1; failed += fm_NestOpt1
    val (pm_NestOpt2, fm_NestOpt2) = testModelNestOpt2(); passed += pm_NestOpt2; failed += fm_NestOpt2
    val (pm_NestOpt3, fm_NestOpt3) = testModelNestOpt3(); passed += pm_NestOpt3; failed += fm_NestOpt3
    val (pm_NestOpt4, fm_NestOpt4) = testModelNestOpt4(); passed += pm_NestOpt4; failed += fm_NestOpt4
    val (pm_NestOpt5, fm_NestOpt5) = testModelNestOpt5(); passed += pm_NestOpt5; failed += fm_NestOpt5
    val (pm_NestOptInner1, fm_NestOptInner1) = testModelNestOptInner1(); passed += pm_NestOptInner1; failed += fm_NestOptInner1
    val (pm_NestOptInner2, fm_NestOptInner2) = testModelNestOptInner2(); passed += pm_NestOptInner2; failed += fm_NestOptInner2
    val (pm_NestOptInner3, fm_NestOptInner3) = testModelNestOptInner3(); passed += pm_NestOptInner3; failed += fm_NestOptInner3
    val (pm_DeepNest1, fm_DeepNest1) = testModelDeepNest1(); passed += pm_DeepNest1; failed += fm_DeepNest1
    val (pm_DeepNest2, fm_DeepNest2) = testModelDeepNest2(); passed += pm_DeepNest2; failed += fm_DeepNest2
    val (pm_DeepNest3, fm_DeepNest3) = testModelDeepNest3(); passed += pm_DeepNest3; failed += fm_DeepNest3
    val (pm_DeepNest4, fm_DeepNest4) = testModelDeepNest4(); passed += pm_DeepNest4; failed += fm_DeepNest4
    val (pm_DeepNest5, fm_DeepNest5) = testModelDeepNest5(); passed += pm_DeepNest5; failed += fm_DeepNest5
    val (pm_DeepNest6, fm_DeepNest6) = testModelDeepNest6(); passed += pm_DeepNest6; failed += fm_DeepNest6
    val (pm_DeepNest7, fm_DeepNest7) = testModelDeepNest7(); passed += pm_DeepNest7; failed += fm_DeepNest7
    val (pm_TimestampEntry, fm_TimestampEntry) = testModelTimestampEntry(); passed += pm_TimestampEntry; failed += fm_TimestampEntry
    val (pm_ConfigEntry, fm_ConfigEntry) = testModelConfigEntry(); passed += pm_ConfigEntry; failed += fm_ConfigEntry

    return Pair(passed, failed)
}

fun testModelOptArr1(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptArr1.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptArr1Codec.decode(r)
        val w = MsgPackWriter()
        OptArr1Codec.encode(w, obj)
        val out = File("${outDir}/OptArr1.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr1 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr1.json").readBytes()
        val r = JsonReader(data)
        val obj = OptArr1Codec.decode(r)
        val w = JsonWriter()
        OptArr1Codec.encode(w, obj)
        val out = File("${outDir}/OptArr1.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr1 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr1.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptArr1Codec.decode(r)
        val w = JsonWriter()
        OptArr1Codec.encode(w, obj)
        val out = File("${outDir}/OptArr1.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr1 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr1.gron").readBytes()
        val r = GronReader(data)
        val obj = OptArr1Codec.decode(r)
        val w = GronWriter()
        OptArr1Codec.encode(w, obj)
        val out = File("${outDir}/OptArr1.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr1 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptArr2(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptArr2.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptArr2Codec.decode(r)
        val w = MsgPackWriter()
        OptArr2Codec.encode(w, obj)
        val out = File("${outDir}/OptArr2.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr2 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr2.json").readBytes()
        val r = JsonReader(data)
        val obj = OptArr2Codec.decode(r)
        val w = JsonWriter()
        OptArr2Codec.encode(w, obj)
        val out = File("${outDir}/OptArr2.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr2 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr2.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptArr2Codec.decode(r)
        val w = JsonWriter()
        OptArr2Codec.encode(w, obj)
        val out = File("${outDir}/OptArr2.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr2 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr2.gron").readBytes()
        val r = GronReader(data)
        val obj = OptArr2Codec.decode(r)
        val w = GronWriter()
        OptArr2Codec.encode(w, obj)
        val out = File("${outDir}/OptArr2.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr2 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptArr3(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptArr3.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptArr3Codec.decode(r)
        val w = MsgPackWriter()
        OptArr3Codec.encode(w, obj)
        val out = File("${outDir}/OptArr3.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr3 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr3.json").readBytes()
        val r = JsonReader(data)
        val obj = OptArr3Codec.decode(r)
        val w = JsonWriter()
        OptArr3Codec.encode(w, obj)
        val out = File("${outDir}/OptArr3.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr3 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr3.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptArr3Codec.decode(r)
        val w = JsonWriter()
        OptArr3Codec.encode(w, obj)
        val out = File("${outDir}/OptArr3.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr3 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr3.gron").readBytes()
        val r = GronReader(data)
        val obj = OptArr3Codec.decode(r)
        val w = GronWriter()
        OptArr3Codec.encode(w, obj)
        val out = File("${outDir}/OptArr3.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr3 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptArr4(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptArr4.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptArr4Codec.decode(r)
        val w = MsgPackWriter()
        OptArr4Codec.encode(w, obj)
        val out = File("${outDir}/OptArr4.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr4 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr4.json").readBytes()
        val r = JsonReader(data)
        val obj = OptArr4Codec.decode(r)
        val w = JsonWriter()
        OptArr4Codec.encode(w, obj)
        val out = File("${outDir}/OptArr4.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr4 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr4.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptArr4Codec.decode(r)
        val w = JsonWriter()
        OptArr4Codec.encode(w, obj)
        val out = File("${outDir}/OptArr4.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr4 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr4.gron").readBytes()
        val r = GronReader(data)
        val obj = OptArr4Codec.decode(r)
        val w = GronWriter()
        OptArr4Codec.encode(w, obj)
        val out = File("${outDir}/OptArr4.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr4 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptArr5(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptArr5.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptArr5Codec.decode(r)
        val w = MsgPackWriter()
        OptArr5Codec.encode(w, obj)
        val out = File("${outDir}/OptArr5.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr5 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr5.json").readBytes()
        val r = JsonReader(data)
        val obj = OptArr5Codec.decode(r)
        val w = JsonWriter()
        OptArr5Codec.encode(w, obj)
        val out = File("${outDir}/OptArr5.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr5 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr5.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptArr5Codec.decode(r)
        val w = JsonWriter()
        OptArr5Codec.encode(w, obj)
        val out = File("${outDir}/OptArr5.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr5 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptArr5.gron").readBytes()
        val r = GronReader(data)
        val obj = OptArr5Codec.decode(r)
        val w = GronWriter()
        OptArr5Codec.encode(w, obj)
        val out = File("${outDir}/OptArr5.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptArr5 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestOpt1(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestOpt1.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestOpt1Codec.decode(r)
        val w = MsgPackWriter()
        NestOpt1Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt1.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt1 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt1.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOpt1Codec.decode(r)
        val w = JsonWriter()
        NestOpt1Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt1.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt1 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt1.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOpt1Codec.decode(r)
        val w = JsonWriter()
        NestOpt1Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt1.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt1 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt1.gron").readBytes()
        val r = GronReader(data)
        val obj = NestOpt1Codec.decode(r)
        val w = GronWriter()
        NestOpt1Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt1.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt1 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestOpt2(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestOpt2.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestOpt2Codec.decode(r)
        val w = MsgPackWriter()
        NestOpt2Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt2.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt2 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt2.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOpt2Codec.decode(r)
        val w = JsonWriter()
        NestOpt2Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt2.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt2 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt2.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOpt2Codec.decode(r)
        val w = JsonWriter()
        NestOpt2Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt2.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt2 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt2.gron").readBytes()
        val r = GronReader(data)
        val obj = NestOpt2Codec.decode(r)
        val w = GronWriter()
        NestOpt2Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt2.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt2 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestOpt3(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestOpt3.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestOpt3Codec.decode(r)
        val w = MsgPackWriter()
        NestOpt3Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt3.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt3 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt3.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOpt3Codec.decode(r)
        val w = JsonWriter()
        NestOpt3Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt3.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt3 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt3.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOpt3Codec.decode(r)
        val w = JsonWriter()
        NestOpt3Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt3.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt3 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt3.gron").readBytes()
        val r = GronReader(data)
        val obj = NestOpt3Codec.decode(r)
        val w = GronWriter()
        NestOpt3Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt3.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt3 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestOpt4(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestOpt4.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestOpt4Codec.decode(r)
        val w = MsgPackWriter()
        NestOpt4Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt4.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt4 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt4.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOpt4Codec.decode(r)
        val w = JsonWriter()
        NestOpt4Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt4.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt4 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt4.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOpt4Codec.decode(r)
        val w = JsonWriter()
        NestOpt4Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt4.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt4 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt4.gron").readBytes()
        val r = GronReader(data)
        val obj = NestOpt4Codec.decode(r)
        val w = GronWriter()
        NestOpt4Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt4.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt4 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestOpt5(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestOpt5.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestOpt5Codec.decode(r)
        val w = MsgPackWriter()
        NestOpt5Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt5.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt5 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt5.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOpt5Codec.decode(r)
        val w = JsonWriter()
        NestOpt5Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt5.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt5 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt5.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOpt5Codec.decode(r)
        val w = JsonWriter()
        NestOpt5Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt5.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt5 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOpt5.gron").readBytes()
        val r = GronReader(data)
        val obj = NestOpt5Codec.decode(r)
        val w = GronWriter()
        NestOpt5Codec.encode(w, obj)
        val out = File("${outDir}/NestOpt5.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOpt5 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestOptInner1(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestOptInner1.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestOptInner1Codec.decode(r)
        val w = MsgPackWriter()
        NestOptInner1Codec.encode(w, obj)
        val out = File("${outDir}/NestOptInner1.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOptInner1 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOptInner1.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOptInner1Codec.decode(r)
        val w = JsonWriter()
        NestOptInner1Codec.encode(w, obj)
        val out = File("${outDir}/NestOptInner1.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOptInner1 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOptInner1.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOptInner1Codec.decode(r)
        val w = JsonWriter()
        NestOptInner1Codec.encode(w, obj)
        val out = File("${outDir}/NestOptInner1.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOptInner1 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOptInner1.gron").readBytes()
        val r = GronReader(data)
        val obj = NestOptInner1Codec.decode(r)
        val w = GronWriter()
        NestOptInner1Codec.encode(w, obj)
        val out = File("${outDir}/NestOptInner1.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOptInner1 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestOptInner2(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestOptInner2.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestOptInner2Codec.decode(r)
        val w = MsgPackWriter()
        NestOptInner2Codec.encode(w, obj)
        val out = File("${outDir}/NestOptInner2.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOptInner2 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOptInner2.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOptInner2Codec.decode(r)
        val w = JsonWriter()
        NestOptInner2Codec.encode(w, obj)
        val out = File("${outDir}/NestOptInner2.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOptInner2 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOptInner2.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOptInner2Codec.decode(r)
        val w = JsonWriter()
        NestOptInner2Codec.encode(w, obj)
        val out = File("${outDir}/NestOptInner2.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOptInner2 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOptInner2.gron").readBytes()
        val r = GronReader(data)
        val obj = NestOptInner2Codec.decode(r)
        val w = GronWriter()
        NestOptInner2Codec.encode(w, obj)
        val out = File("${outDir}/NestOptInner2.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOptInner2 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestOptInner3(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestOptInner3.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestOptInner3Codec.decode(r)
        val w = MsgPackWriter()
        NestOptInner3Codec.encode(w, obj)
        val out = File("${outDir}/NestOptInner3.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOptInner3 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOptInner3.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOptInner3Codec.decode(r)
        val w = JsonWriter()
        NestOptInner3Codec.encode(w, obj)
        val out = File("${outDir}/NestOptInner3.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOptInner3 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOptInner3.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestOptInner3Codec.decode(r)
        val w = JsonWriter()
        NestOptInner3Codec.encode(w, obj)
        val out = File("${outDir}/NestOptInner3.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOptInner3 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestOptInner3.gron").readBytes()
        val r = GronReader(data)
        val obj = NestOptInner3Codec.decode(r)
        val w = GronWriter()
        NestOptInner3Codec.encode(w, obj)
        val out = File("${outDir}/NestOptInner3.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestOptInner3 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDeepNest1(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DeepNest1.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DeepNest1Codec.decode(r)
        val w = MsgPackWriter()
        DeepNest1Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest1.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest1 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest1.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepNest1Codec.decode(r)
        val w = JsonWriter()
        DeepNest1Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest1.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest1 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest1.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepNest1Codec.decode(r)
        val w = JsonWriter()
        DeepNest1Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest1.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest1 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest1.gron").readBytes()
        val r = GronReader(data)
        val obj = DeepNest1Codec.decode(r)
        val w = GronWriter()
        DeepNest1Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest1.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest1 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDeepNest2(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DeepNest2.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DeepNest2Codec.decode(r)
        val w = MsgPackWriter()
        DeepNest2Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest2.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest2 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest2.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepNest2Codec.decode(r)
        val w = JsonWriter()
        DeepNest2Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest2.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest2 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest2.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepNest2Codec.decode(r)
        val w = JsonWriter()
        DeepNest2Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest2.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest2 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest2.gron").readBytes()
        val r = GronReader(data)
        val obj = DeepNest2Codec.decode(r)
        val w = GronWriter()
        DeepNest2Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest2.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest2 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDeepNest3(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DeepNest3.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DeepNest3Codec.decode(r)
        val w = MsgPackWriter()
        DeepNest3Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest3.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest3 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest3.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepNest3Codec.decode(r)
        val w = JsonWriter()
        DeepNest3Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest3.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest3 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest3.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepNest3Codec.decode(r)
        val w = JsonWriter()
        DeepNest3Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest3.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest3 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest3.gron").readBytes()
        val r = GronReader(data)
        val obj = DeepNest3Codec.decode(r)
        val w = GronWriter()
        DeepNest3Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest3.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest3 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDeepNest4(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DeepNest4.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DeepNest4Codec.decode(r)
        val w = MsgPackWriter()
        DeepNest4Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest4.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest4 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest4.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepNest4Codec.decode(r)
        val w = JsonWriter()
        DeepNest4Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest4.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest4 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest4.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepNest4Codec.decode(r)
        val w = JsonWriter()
        DeepNest4Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest4.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest4 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest4.gron").readBytes()
        val r = GronReader(data)
        val obj = DeepNest4Codec.decode(r)
        val w = GronWriter()
        DeepNest4Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest4.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest4 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDeepNest5(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DeepNest5.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DeepNest5Codec.decode(r)
        val w = MsgPackWriter()
        DeepNest5Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest5.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest5 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest5.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepNest5Codec.decode(r)
        val w = JsonWriter()
        DeepNest5Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest5.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest5 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest5.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepNest5Codec.decode(r)
        val w = JsonWriter()
        DeepNest5Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest5.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest5 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest5.gron").readBytes()
        val r = GronReader(data)
        val obj = DeepNest5Codec.decode(r)
        val w = GronWriter()
        DeepNest5Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest5.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest5 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDeepNest6(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DeepNest6.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DeepNest6Codec.decode(r)
        val w = MsgPackWriter()
        DeepNest6Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest6.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest6 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest6.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepNest6Codec.decode(r)
        val w = JsonWriter()
        DeepNest6Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest6.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest6 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest6.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepNest6Codec.decode(r)
        val w = JsonWriter()
        DeepNest6Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest6.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest6 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest6.gron").readBytes()
        val r = GronReader(data)
        val obj = DeepNest6Codec.decode(r)
        val w = GronWriter()
        DeepNest6Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest6.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest6 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDeepNest7(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DeepNest7.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DeepNest7Codec.decode(r)
        val w = MsgPackWriter()
        DeepNest7Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest7.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest7 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest7.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepNest7Codec.decode(r)
        val w = JsonWriter()
        DeepNest7Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest7.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest7 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest7.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DeepNest7Codec.decode(r)
        val w = JsonWriter()
        DeepNest7Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest7.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest7 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DeepNest7.gron").readBytes()
        val r = GronReader(data)
        val obj = DeepNest7Codec.decode(r)
        val w = GronWriter()
        DeepNest7Codec.encode(w, obj)
        val out = File("${outDir}/DeepNest7.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DeepNest7 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTimestampEntry(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/TimestampEntry.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = TimestampEntryCodec.decode(r)
        val w = MsgPackWriter()
        TimestampEntryCodec.encode(w, obj)
        val out = File("${outDir}/TimestampEntry.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL TimestampEntry mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/TimestampEntry.json").readBytes()
        val r = JsonReader(data)
        val obj = TimestampEntryCodec.decode(r)
        val w = JsonWriter()
        TimestampEntryCodec.encode(w, obj)
        val out = File("${outDir}/TimestampEntry.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL TimestampEntry json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/TimestampEntry.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = TimestampEntryCodec.decode(r)
        val w = JsonWriter()
        TimestampEntryCodec.encode(w, obj)
        val out = File("${outDir}/TimestampEntry.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL TimestampEntry unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/TimestampEntry.gron").readBytes()
        val r = GronReader(data)
        val obj = TimestampEntryCodec.decode(r)
        val w = GronWriter()
        TimestampEntryCodec.encode(w, obj)
        val out = File("${outDir}/TimestampEntry.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL TimestampEntry gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelConfigEntry(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ConfigEntry.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ConfigEntryCodec.decode(r)
        val w = MsgPackWriter()
        ConfigEntryCodec.encode(w, obj)
        val out = File("${outDir}/ConfigEntry.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ConfigEntry mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ConfigEntry.json").readBytes()
        val r = JsonReader(data)
        val obj = ConfigEntryCodec.decode(r)
        val w = JsonWriter()
        ConfigEntryCodec.encode(w, obj)
        val out = File("${outDir}/ConfigEntry.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ConfigEntry json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ConfigEntry.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ConfigEntryCodec.decode(r)
        val w = JsonWriter()
        ConfigEntryCodec.encode(w, obj)
        val out = File("${outDir}/ConfigEntry.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ConfigEntry unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ConfigEntry.gron").readBytes()
        val r = GronReader(data)
        val obj = ConfigEntryCodec.decode(r)
        val w = GronWriter()
        ConfigEntryCodec.encode(w, obj)
        val out = File("${outDir}/ConfigEntry.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ConfigEntry gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

