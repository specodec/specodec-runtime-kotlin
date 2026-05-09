package emit_kotlin

import specodec.*
import all_types_nests.*
import java.io.File

fun runAllTypesNests(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_NestInner, fm_NestInner) = testModelNestInner(); passed += pm_NestInner; failed += fm_NestInner
    val (pm_NestCoord, fm_NestCoord) = testModelNestCoord(); passed += pm_NestCoord; failed += fm_NestCoord
    val (pm_NestIdVal, fm_NestIdVal) = testModelNestIdVal(); passed += pm_NestIdVal; failed += fm_NestIdVal
    val (pm_NestLabel, fm_NestLabel) = testModelNestLabel(); passed += pm_NestLabel; failed += fm_NestLabel
    val (pm_NestMoney, fm_NestMoney) = testModelNestMoney(); passed += pm_NestMoney; failed += fm_NestMoney
    val (pm_NestRange32, fm_NestRange32) = testModelNestRange32(); passed += pm_NestRange32; failed += fm_NestRange32
    val (pm_NestAddr, fm_NestAddr) = testModelNestAddr(); passed += pm_NestAddr; failed += fm_NestAddr
    val (pm_NestPoint3, fm_NestPoint3) = testModelNestPoint3(); passed += pm_NestPoint3; failed += fm_NestPoint3
    val (pm_OptNestInner, fm_OptNestInner) = testModelOptNestInner(); passed += pm_OptNestInner; failed += fm_OptNestInner
    val (pm_OptNestCoord, fm_OptNestCoord) = testModelOptNestCoord(); passed += pm_OptNestCoord; failed += fm_OptNestCoord
    val (pm_OptNestIdVal, fm_OptNestIdVal) = testModelOptNestIdVal(); passed += pm_OptNestIdVal; failed += fm_OptNestIdVal
    val (pm_OptNestLabel, fm_OptNestLabel) = testModelOptNestLabel(); passed += pm_OptNestLabel; failed += fm_OptNestLabel
    val (pm_OptNestMoney, fm_OptNestMoney) = testModelOptNestMoney(); passed += pm_OptNestMoney; failed += fm_OptNestMoney
    val (pm_OptNestRange32, fm_OptNestRange32) = testModelOptNestRange32(); passed += pm_OptNestRange32; failed += fm_OptNestRange32
    val (pm_OptNestAddr, fm_OptNestAddr) = testModelOptNestAddr(); passed += pm_OptNestAddr; failed += fm_OptNestAddr
    val (pm_OptNestPoint3, fm_OptNestPoint3) = testModelOptNestPoint3(); passed += pm_OptNestPoint3; failed += fm_OptNestPoint3

    return Pair(passed, failed)
}

fun testModelNestInner(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestInner.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestInnerCodec.decode(r)
        val w = MsgPackWriter()
        NestInnerCodec.encode(w, obj)
        val out = File("${outDir}/NestInner.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestInner mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestInner.json").readBytes()
        val r = JsonReader(data)
        val obj = NestInnerCodec.decode(r)
        val w = JsonWriter()
        NestInnerCodec.encode(w, obj)
        val out = File("${outDir}/NestInner.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestInner json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestInner.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestInnerCodec.decode(r)
        val w = JsonWriter()
        NestInnerCodec.encode(w, obj)
        val out = File("${outDir}/NestInner.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestInner unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestInner.gron").readBytes()
        val r = GronReader(data)
        val obj = NestInnerCodec.decode(r)
        val w = GronWriter()
        NestInnerCodec.encode(w, obj)
        val out = File("${outDir}/NestInner.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestInner gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestCoord(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestCoord.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestCoordCodec.decode(r)
        val w = MsgPackWriter()
        NestCoordCodec.encode(w, obj)
        val out = File("${outDir}/NestCoord.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestCoord mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestCoord.json").readBytes()
        val r = JsonReader(data)
        val obj = NestCoordCodec.decode(r)
        val w = JsonWriter()
        NestCoordCodec.encode(w, obj)
        val out = File("${outDir}/NestCoord.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestCoord json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestCoord.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestCoordCodec.decode(r)
        val w = JsonWriter()
        NestCoordCodec.encode(w, obj)
        val out = File("${outDir}/NestCoord.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestCoord unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestCoord.gron").readBytes()
        val r = GronReader(data)
        val obj = NestCoordCodec.decode(r)
        val w = GronWriter()
        NestCoordCodec.encode(w, obj)
        val out = File("${outDir}/NestCoord.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestCoord gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestIdVal(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestIdVal.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestIdValCodec.decode(r)
        val w = MsgPackWriter()
        NestIdValCodec.encode(w, obj)
        val out = File("${outDir}/NestIdVal.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestIdVal mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestIdVal.json").readBytes()
        val r = JsonReader(data)
        val obj = NestIdValCodec.decode(r)
        val w = JsonWriter()
        NestIdValCodec.encode(w, obj)
        val out = File("${outDir}/NestIdVal.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestIdVal json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestIdVal.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestIdValCodec.decode(r)
        val w = JsonWriter()
        NestIdValCodec.encode(w, obj)
        val out = File("${outDir}/NestIdVal.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestIdVal unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestIdVal.gron").readBytes()
        val r = GronReader(data)
        val obj = NestIdValCodec.decode(r)
        val w = GronWriter()
        NestIdValCodec.encode(w, obj)
        val out = File("${outDir}/NestIdVal.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestIdVal gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestLabel(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestLabel.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestLabelCodec.decode(r)
        val w = MsgPackWriter()
        NestLabelCodec.encode(w, obj)
        val out = File("${outDir}/NestLabel.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestLabel mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestLabel.json").readBytes()
        val r = JsonReader(data)
        val obj = NestLabelCodec.decode(r)
        val w = JsonWriter()
        NestLabelCodec.encode(w, obj)
        val out = File("${outDir}/NestLabel.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestLabel json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestLabel.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestLabelCodec.decode(r)
        val w = JsonWriter()
        NestLabelCodec.encode(w, obj)
        val out = File("${outDir}/NestLabel.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestLabel unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestLabel.gron").readBytes()
        val r = GronReader(data)
        val obj = NestLabelCodec.decode(r)
        val w = GronWriter()
        NestLabelCodec.encode(w, obj)
        val out = File("${outDir}/NestLabel.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestLabel gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestMoney(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestMoney.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestMoneyCodec.decode(r)
        val w = MsgPackWriter()
        NestMoneyCodec.encode(w, obj)
        val out = File("${outDir}/NestMoney.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestMoney mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestMoney.json").readBytes()
        val r = JsonReader(data)
        val obj = NestMoneyCodec.decode(r)
        val w = JsonWriter()
        NestMoneyCodec.encode(w, obj)
        val out = File("${outDir}/NestMoney.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestMoney json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestMoney.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestMoneyCodec.decode(r)
        val w = JsonWriter()
        NestMoneyCodec.encode(w, obj)
        val out = File("${outDir}/NestMoney.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestMoney unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestMoney.gron").readBytes()
        val r = GronReader(data)
        val obj = NestMoneyCodec.decode(r)
        val w = GronWriter()
        NestMoneyCodec.encode(w, obj)
        val out = File("${outDir}/NestMoney.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestMoney gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestRange32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestRange32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestRange32Codec.decode(r)
        val w = MsgPackWriter()
        NestRange32Codec.encode(w, obj)
        val out = File("${outDir}/NestRange32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestRange32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestRange32.json").readBytes()
        val r = JsonReader(data)
        val obj = NestRange32Codec.decode(r)
        val w = JsonWriter()
        NestRange32Codec.encode(w, obj)
        val out = File("${outDir}/NestRange32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestRange32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestRange32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestRange32Codec.decode(r)
        val w = JsonWriter()
        NestRange32Codec.encode(w, obj)
        val out = File("${outDir}/NestRange32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestRange32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestRange32.gron").readBytes()
        val r = GronReader(data)
        val obj = NestRange32Codec.decode(r)
        val w = GronWriter()
        NestRange32Codec.encode(w, obj)
        val out = File("${outDir}/NestRange32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestRange32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestAddr(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestAddr.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestAddrCodec.decode(r)
        val w = MsgPackWriter()
        NestAddrCodec.encode(w, obj)
        val out = File("${outDir}/NestAddr.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestAddr mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestAddr.json").readBytes()
        val r = JsonReader(data)
        val obj = NestAddrCodec.decode(r)
        val w = JsonWriter()
        NestAddrCodec.encode(w, obj)
        val out = File("${outDir}/NestAddr.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestAddr json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestAddr.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestAddrCodec.decode(r)
        val w = JsonWriter()
        NestAddrCodec.encode(w, obj)
        val out = File("${outDir}/NestAddr.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestAddr unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestAddr.gron").readBytes()
        val r = GronReader(data)
        val obj = NestAddrCodec.decode(r)
        val w = GronWriter()
        NestAddrCodec.encode(w, obj)
        val out = File("${outDir}/NestAddr.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestAddr gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestPoint3(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestPoint3.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestPoint3Codec.decode(r)
        val w = MsgPackWriter()
        NestPoint3Codec.encode(w, obj)
        val out = File("${outDir}/NestPoint3.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestPoint3 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestPoint3.json").readBytes()
        val r = JsonReader(data)
        val obj = NestPoint3Codec.decode(r)
        val w = JsonWriter()
        NestPoint3Codec.encode(w, obj)
        val out = File("${outDir}/NestPoint3.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestPoint3 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestPoint3.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestPoint3Codec.decode(r)
        val w = JsonWriter()
        NestPoint3Codec.encode(w, obj)
        val out = File("${outDir}/NestPoint3.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestPoint3 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestPoint3.gron").readBytes()
        val r = GronReader(data)
        val obj = NestPoint3Codec.decode(r)
        val w = GronWriter()
        NestPoint3Codec.encode(w, obj)
        val out = File("${outDir}/NestPoint3.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestPoint3 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptNestInner(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptNestInner.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptNestInnerCodec.decode(r)
        val w = MsgPackWriter()
        OptNestInnerCodec.encode(w, obj)
        val out = File("${outDir}/OptNestInner.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestInner mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestInner.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestInnerCodec.decode(r)
        val w = JsonWriter()
        OptNestInnerCodec.encode(w, obj)
        val out = File("${outDir}/OptNestInner.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestInner json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestInner.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestInnerCodec.decode(r)
        val w = JsonWriter()
        OptNestInnerCodec.encode(w, obj)
        val out = File("${outDir}/OptNestInner.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestInner unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestInner.gron").readBytes()
        val r = GronReader(data)
        val obj = OptNestInnerCodec.decode(r)
        val w = GronWriter()
        OptNestInnerCodec.encode(w, obj)
        val out = File("${outDir}/OptNestInner.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestInner gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptNestCoord(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptNestCoord.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptNestCoordCodec.decode(r)
        val w = MsgPackWriter()
        OptNestCoordCodec.encode(w, obj)
        val out = File("${outDir}/OptNestCoord.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestCoord mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestCoord.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestCoordCodec.decode(r)
        val w = JsonWriter()
        OptNestCoordCodec.encode(w, obj)
        val out = File("${outDir}/OptNestCoord.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestCoord json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestCoord.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestCoordCodec.decode(r)
        val w = JsonWriter()
        OptNestCoordCodec.encode(w, obj)
        val out = File("${outDir}/OptNestCoord.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestCoord unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestCoord.gron").readBytes()
        val r = GronReader(data)
        val obj = OptNestCoordCodec.decode(r)
        val w = GronWriter()
        OptNestCoordCodec.encode(w, obj)
        val out = File("${outDir}/OptNestCoord.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestCoord gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptNestIdVal(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptNestIdVal.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptNestIdValCodec.decode(r)
        val w = MsgPackWriter()
        OptNestIdValCodec.encode(w, obj)
        val out = File("${outDir}/OptNestIdVal.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestIdVal mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestIdVal.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestIdValCodec.decode(r)
        val w = JsonWriter()
        OptNestIdValCodec.encode(w, obj)
        val out = File("${outDir}/OptNestIdVal.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestIdVal json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestIdVal.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestIdValCodec.decode(r)
        val w = JsonWriter()
        OptNestIdValCodec.encode(w, obj)
        val out = File("${outDir}/OptNestIdVal.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestIdVal unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestIdVal.gron").readBytes()
        val r = GronReader(data)
        val obj = OptNestIdValCodec.decode(r)
        val w = GronWriter()
        OptNestIdValCodec.encode(w, obj)
        val out = File("${outDir}/OptNestIdVal.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestIdVal gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptNestLabel(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptNestLabel.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptNestLabelCodec.decode(r)
        val w = MsgPackWriter()
        OptNestLabelCodec.encode(w, obj)
        val out = File("${outDir}/OptNestLabel.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestLabel mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestLabel.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestLabelCodec.decode(r)
        val w = JsonWriter()
        OptNestLabelCodec.encode(w, obj)
        val out = File("${outDir}/OptNestLabel.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestLabel json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestLabel.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestLabelCodec.decode(r)
        val w = JsonWriter()
        OptNestLabelCodec.encode(w, obj)
        val out = File("${outDir}/OptNestLabel.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestLabel unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestLabel.gron").readBytes()
        val r = GronReader(data)
        val obj = OptNestLabelCodec.decode(r)
        val w = GronWriter()
        OptNestLabelCodec.encode(w, obj)
        val out = File("${outDir}/OptNestLabel.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestLabel gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptNestMoney(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptNestMoney.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptNestMoneyCodec.decode(r)
        val w = MsgPackWriter()
        OptNestMoneyCodec.encode(w, obj)
        val out = File("${outDir}/OptNestMoney.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestMoney mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestMoney.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestMoneyCodec.decode(r)
        val w = JsonWriter()
        OptNestMoneyCodec.encode(w, obj)
        val out = File("${outDir}/OptNestMoney.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestMoney json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestMoney.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestMoneyCodec.decode(r)
        val w = JsonWriter()
        OptNestMoneyCodec.encode(w, obj)
        val out = File("${outDir}/OptNestMoney.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestMoney unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestMoney.gron").readBytes()
        val r = GronReader(data)
        val obj = OptNestMoneyCodec.decode(r)
        val w = GronWriter()
        OptNestMoneyCodec.encode(w, obj)
        val out = File("${outDir}/OptNestMoney.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestMoney gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptNestRange32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptNestRange32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptNestRange32Codec.decode(r)
        val w = MsgPackWriter()
        OptNestRange32Codec.encode(w, obj)
        val out = File("${outDir}/OptNestRange32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestRange32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestRange32.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestRange32Codec.decode(r)
        val w = JsonWriter()
        OptNestRange32Codec.encode(w, obj)
        val out = File("${outDir}/OptNestRange32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestRange32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestRange32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestRange32Codec.decode(r)
        val w = JsonWriter()
        OptNestRange32Codec.encode(w, obj)
        val out = File("${outDir}/OptNestRange32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestRange32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestRange32.gron").readBytes()
        val r = GronReader(data)
        val obj = OptNestRange32Codec.decode(r)
        val w = GronWriter()
        OptNestRange32Codec.encode(w, obj)
        val out = File("${outDir}/OptNestRange32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestRange32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptNestAddr(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptNestAddr.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptNestAddrCodec.decode(r)
        val w = MsgPackWriter()
        OptNestAddrCodec.encode(w, obj)
        val out = File("${outDir}/OptNestAddr.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestAddr mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestAddr.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestAddrCodec.decode(r)
        val w = JsonWriter()
        OptNestAddrCodec.encode(w, obj)
        val out = File("${outDir}/OptNestAddr.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestAddr json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestAddr.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestAddrCodec.decode(r)
        val w = JsonWriter()
        OptNestAddrCodec.encode(w, obj)
        val out = File("${outDir}/OptNestAddr.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestAddr unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestAddr.gron").readBytes()
        val r = GronReader(data)
        val obj = OptNestAddrCodec.decode(r)
        val w = GronWriter()
        OptNestAddrCodec.encode(w, obj)
        val out = File("${outDir}/OptNestAddr.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestAddr gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptNestPoint3(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptNestPoint3.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptNestPoint3Codec.decode(r)
        val w = MsgPackWriter()
        OptNestPoint3Codec.encode(w, obj)
        val out = File("${outDir}/OptNestPoint3.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestPoint3 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestPoint3.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestPoint3Codec.decode(r)
        val w = JsonWriter()
        OptNestPoint3Codec.encode(w, obj)
        val out = File("${outDir}/OptNestPoint3.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestPoint3 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestPoint3.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptNestPoint3Codec.decode(r)
        val w = JsonWriter()
        OptNestPoint3Codec.encode(w, obj)
        val out = File("${outDir}/OptNestPoint3.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestPoint3 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptNestPoint3.gron").readBytes()
        val r = GronReader(data)
        val obj = OptNestPoint3Codec.decode(r)
        val w = GronWriter()
        OptNestPoint3Codec.encode(w, obj)
        val out = File("${outDir}/OptNestPoint3.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptNestPoint3 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

