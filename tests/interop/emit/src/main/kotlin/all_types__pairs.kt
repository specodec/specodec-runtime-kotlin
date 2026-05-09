package emit_kotlin

import specodec.*
import all_types_pairs.*
import java.io.File

fun runAllTypesPairs(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_PairString, fm_PairString) = testModelPairString(); passed += pm_PairString; failed += fm_PairString
    val (pm_PairBoolean, fm_PairBoolean) = testModelPairBoolean(); passed += pm_PairBoolean; failed += fm_PairBoolean
    val (pm_PairInt8, fm_PairInt8) = testModelPairInt8(); passed += pm_PairInt8; failed += fm_PairInt8
    val (pm_PairInt16, fm_PairInt16) = testModelPairInt16(); passed += pm_PairInt16; failed += fm_PairInt16
    val (pm_PairInt32, fm_PairInt32) = testModelPairInt32(); passed += pm_PairInt32; failed += fm_PairInt32
    val (pm_PairInt64, fm_PairInt64) = testModelPairInt64(); passed += pm_PairInt64; failed += fm_PairInt64
    val (pm_PairUint8, fm_PairUint8) = testModelPairUint8(); passed += pm_PairUint8; failed += fm_PairUint8
    val (pm_PairUint16, fm_PairUint16) = testModelPairUint16(); passed += pm_PairUint16; failed += fm_PairUint16
    val (pm_PairUint32, fm_PairUint32) = testModelPairUint32(); passed += pm_PairUint32; failed += fm_PairUint32
    val (pm_PairUint64, fm_PairUint64) = testModelPairUint64(); passed += pm_PairUint64; failed += fm_PairUint64
    val (pm_PairFloat32, fm_PairFloat32) = testModelPairFloat32(); passed += pm_PairFloat32; failed += fm_PairFloat32
    val (pm_PairFloat64, fm_PairFloat64) = testModelPairFloat64(); passed += pm_PairFloat64; failed += fm_PairFloat64
    val (pm_PairBytes, fm_PairBytes) = testModelPairBytes(); passed += pm_PairBytes; failed += fm_PairBytes
    val (pm_DualStringInt32, fm_DualStringInt32) = testModelDualStringInt32(); passed += pm_DualStringInt32; failed += fm_DualStringInt32
    val (pm_DualStringBoolean, fm_DualStringBoolean) = testModelDualStringBoolean(); passed += pm_DualStringBoolean; failed += fm_DualStringBoolean
    val (pm_DualStringFloat64, fm_DualStringFloat64) = testModelDualStringFloat64(); passed += pm_DualStringFloat64; failed += fm_DualStringFloat64
    val (pm_DualStringBytes, fm_DualStringBytes) = testModelDualStringBytes(); passed += pm_DualStringBytes; failed += fm_DualStringBytes
    val (pm_DualInt32Boolean, fm_DualInt32Boolean) = testModelDualInt32Boolean(); passed += pm_DualInt32Boolean; failed += fm_DualInt32Boolean
    val (pm_DualInt32Float64, fm_DualInt32Float64) = testModelDualInt32Float64(); passed += pm_DualInt32Float64; failed += fm_DualInt32Float64
    val (pm_DualInt32Int64, fm_DualInt32Int64) = testModelDualInt32Int64(); passed += pm_DualInt32Int64; failed += fm_DualInt32Int64
    val (pm_DualInt32Uint32, fm_DualInt32Uint32) = testModelDualInt32Uint32(); passed += pm_DualInt32Uint32; failed += fm_DualInt32Uint32
    val (pm_DualInt64Uint64, fm_DualInt64Uint64) = testModelDualInt64Uint64(); passed += pm_DualInt64Uint64; failed += fm_DualInt64Uint64
    val (pm_DualFloat32Float64, fm_DualFloat32Float64) = testModelDualFloat32Float64(); passed += pm_DualFloat32Float64; failed += fm_DualFloat32Float64
    val (pm_DualFloat64Boolean, fm_DualFloat64Boolean) = testModelDualFloat64Boolean(); passed += pm_DualFloat64Boolean; failed += fm_DualFloat64Boolean
    val (pm_DualFloat64Bytes, fm_DualFloat64Bytes) = testModelDualFloat64Bytes(); passed += pm_DualFloat64Bytes; failed += fm_DualFloat64Bytes
    val (pm_DualUint32Uint64, fm_DualUint32Uint64) = testModelDualUint32Uint64(); passed += pm_DualUint32Uint64; failed += fm_DualUint32Uint64
    val (pm_DualBooleanBytes, fm_DualBooleanBytes) = testModelDualBooleanBytes(); passed += pm_DualBooleanBytes; failed += fm_DualBooleanBytes
    val (pm_DualInt8Uint8, fm_DualInt8Uint8) = testModelDualInt8Uint8(); passed += pm_DualInt8Uint8; failed += fm_DualInt8Uint8
    val (pm_DualInt16Uint16, fm_DualInt16Uint16) = testModelDualInt16Uint16(); passed += pm_DualInt16Uint16; failed += fm_DualInt16Uint16
    val (pm_DualStringInt64, fm_DualStringInt64) = testModelDualStringInt64(); passed += pm_DualStringInt64; failed += fm_DualStringInt64
    val (pm_DualStringUint64, fm_DualStringUint64) = testModelDualStringUint64(); passed += pm_DualStringUint64; failed += fm_DualStringUint64
    val (pm_DualInt32Bytes, fm_DualInt32Bytes) = testModelDualInt32Bytes(); passed += pm_DualInt32Bytes; failed += fm_DualInt32Bytes
    val (pm_DualFloat64Int32, fm_DualFloat64Int32) = testModelDualFloat64Int32(); passed += pm_DualFloat64Int32; failed += fm_DualFloat64Int32
    val (pm_DualBooleanInt32, fm_DualBooleanInt32) = testModelDualBooleanInt32(); passed += pm_DualBooleanInt32; failed += fm_DualBooleanInt32
    val (pm_DualBytesInt64, fm_DualBytesInt64) = testModelDualBytesInt64(); passed += pm_DualBytesInt64; failed += fm_DualBytesInt64
    val (pm_DualInt8Float32, fm_DualInt8Float32) = testModelDualInt8Float32(); passed += pm_DualInt8Float32; failed += fm_DualInt8Float32
    val (pm_DualUint8Int16, fm_DualUint8Int16) = testModelDualUint8Int16(); passed += pm_DualUint8Int16; failed += fm_DualUint8Int16
    val (pm_DualInt64Float64, fm_DualInt64Float64) = testModelDualInt64Float64(); passed += pm_DualInt64Float64; failed += fm_DualInt64Float64
    val (pm_DualUint64String, fm_DualUint64String) = testModelDualUint64String(); passed += pm_DualUint64String; failed += fm_DualUint64String
    val (pm_Triple01, fm_Triple01) = testModelTriple01(); passed += pm_Triple01; failed += fm_Triple01
    val (pm_Triple02, fm_Triple02) = testModelTriple02(); passed += pm_Triple02; failed += fm_Triple02
    val (pm_Triple03, fm_Triple03) = testModelTriple03(); passed += pm_Triple03; failed += fm_Triple03
    val (pm_Triple04, fm_Triple04) = testModelTriple04(); passed += pm_Triple04; failed += fm_Triple04
    val (pm_Triple05, fm_Triple05) = testModelTriple05(); passed += pm_Triple05; failed += fm_Triple05
    val (pm_Triple06, fm_Triple06) = testModelTriple06(); passed += pm_Triple06; failed += fm_Triple06
    val (pm_Triple07, fm_Triple07) = testModelTriple07(); passed += pm_Triple07; failed += fm_Triple07
    val (pm_Triple08, fm_Triple08) = testModelTriple08(); passed += pm_Triple08; failed += fm_Triple08
    val (pm_Triple09, fm_Triple09) = testModelTriple09(); passed += pm_Triple09; failed += fm_Triple09
    val (pm_Triple10, fm_Triple10) = testModelTriple10(); passed += pm_Triple10; failed += fm_Triple10
    val (pm_Triple11, fm_Triple11) = testModelTriple11(); passed += pm_Triple11; failed += fm_Triple11
    val (pm_Triple12, fm_Triple12) = testModelTriple12(); passed += pm_Triple12; failed += fm_Triple12
    val (pm_Triple13, fm_Triple13) = testModelTriple13(); passed += pm_Triple13; failed += fm_Triple13
    val (pm_Triple14, fm_Triple14) = testModelTriple14(); passed += pm_Triple14; failed += fm_Triple14
    val (pm_Triple15, fm_Triple15) = testModelTriple15(); passed += pm_Triple15; failed += fm_Triple15

    return Pair(passed, failed)
}

fun testModelPairString(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/PairString.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = PairStringCodec.decode(r)
        val w = MsgPackWriter()
        PairStringCodec.encode(w, obj)
        val out = File("${outDir}/PairString.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairString mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairString.json").readBytes()
        val r = JsonReader(data)
        val obj = PairStringCodec.decode(r)
        val w = JsonWriter()
        PairStringCodec.encode(w, obj)
        val out = File("${outDir}/PairString.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairString json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairString.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = PairStringCodec.decode(r)
        val w = JsonWriter()
        PairStringCodec.encode(w, obj)
        val out = File("${outDir}/PairString.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairString unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairString.gron").readBytes()
        val r = GronReader(data)
        val obj = PairStringCodec.decode(r)
        val w = GronWriter()
        PairStringCodec.encode(w, obj)
        val out = File("${outDir}/PairString.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairString gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelPairBoolean(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/PairBoolean.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = PairBooleanCodec.decode(r)
        val w = MsgPackWriter()
        PairBooleanCodec.encode(w, obj)
        val out = File("${outDir}/PairBoolean.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairBoolean mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairBoolean.json").readBytes()
        val r = JsonReader(data)
        val obj = PairBooleanCodec.decode(r)
        val w = JsonWriter()
        PairBooleanCodec.encode(w, obj)
        val out = File("${outDir}/PairBoolean.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairBoolean json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairBoolean.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = PairBooleanCodec.decode(r)
        val w = JsonWriter()
        PairBooleanCodec.encode(w, obj)
        val out = File("${outDir}/PairBoolean.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairBoolean unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairBoolean.gron").readBytes()
        val r = GronReader(data)
        val obj = PairBooleanCodec.decode(r)
        val w = GronWriter()
        PairBooleanCodec.encode(w, obj)
        val out = File("${outDir}/PairBoolean.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairBoolean gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelPairInt8(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/PairInt8.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = PairInt8Codec.decode(r)
        val w = MsgPackWriter()
        PairInt8Codec.encode(w, obj)
        val out = File("${outDir}/PairInt8.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt8 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairInt8.json").readBytes()
        val r = JsonReader(data)
        val obj = PairInt8Codec.decode(r)
        val w = JsonWriter()
        PairInt8Codec.encode(w, obj)
        val out = File("${outDir}/PairInt8.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt8 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairInt8.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = PairInt8Codec.decode(r)
        val w = JsonWriter()
        PairInt8Codec.encode(w, obj)
        val out = File("${outDir}/PairInt8.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt8 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairInt8.gron").readBytes()
        val r = GronReader(data)
        val obj = PairInt8Codec.decode(r)
        val w = GronWriter()
        PairInt8Codec.encode(w, obj)
        val out = File("${outDir}/PairInt8.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt8 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelPairInt16(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/PairInt16.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = PairInt16Codec.decode(r)
        val w = MsgPackWriter()
        PairInt16Codec.encode(w, obj)
        val out = File("${outDir}/PairInt16.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt16 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairInt16.json").readBytes()
        val r = JsonReader(data)
        val obj = PairInt16Codec.decode(r)
        val w = JsonWriter()
        PairInt16Codec.encode(w, obj)
        val out = File("${outDir}/PairInt16.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt16 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairInt16.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = PairInt16Codec.decode(r)
        val w = JsonWriter()
        PairInt16Codec.encode(w, obj)
        val out = File("${outDir}/PairInt16.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt16 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairInt16.gron").readBytes()
        val r = GronReader(data)
        val obj = PairInt16Codec.decode(r)
        val w = GronWriter()
        PairInt16Codec.encode(w, obj)
        val out = File("${outDir}/PairInt16.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt16 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelPairInt32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/PairInt32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = PairInt32Codec.decode(r)
        val w = MsgPackWriter()
        PairInt32Codec.encode(w, obj)
        val out = File("${outDir}/PairInt32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairInt32.json").readBytes()
        val r = JsonReader(data)
        val obj = PairInt32Codec.decode(r)
        val w = JsonWriter()
        PairInt32Codec.encode(w, obj)
        val out = File("${outDir}/PairInt32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairInt32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = PairInt32Codec.decode(r)
        val w = JsonWriter()
        PairInt32Codec.encode(w, obj)
        val out = File("${outDir}/PairInt32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairInt32.gron").readBytes()
        val r = GronReader(data)
        val obj = PairInt32Codec.decode(r)
        val w = GronWriter()
        PairInt32Codec.encode(w, obj)
        val out = File("${outDir}/PairInt32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelPairInt64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/PairInt64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = PairInt64Codec.decode(r)
        val w = MsgPackWriter()
        PairInt64Codec.encode(w, obj)
        val out = File("${outDir}/PairInt64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairInt64.json").readBytes()
        val r = JsonReader(data)
        val obj = PairInt64Codec.decode(r)
        val w = JsonWriter()
        PairInt64Codec.encode(w, obj)
        val out = File("${outDir}/PairInt64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairInt64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = PairInt64Codec.decode(r)
        val w = JsonWriter()
        PairInt64Codec.encode(w, obj)
        val out = File("${outDir}/PairInt64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairInt64.gron").readBytes()
        val r = GronReader(data)
        val obj = PairInt64Codec.decode(r)
        val w = GronWriter()
        PairInt64Codec.encode(w, obj)
        val out = File("${outDir}/PairInt64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairInt64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelPairUint8(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/PairUint8.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = PairUint8Codec.decode(r)
        val w = MsgPackWriter()
        PairUint8Codec.encode(w, obj)
        val out = File("${outDir}/PairUint8.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint8 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairUint8.json").readBytes()
        val r = JsonReader(data)
        val obj = PairUint8Codec.decode(r)
        val w = JsonWriter()
        PairUint8Codec.encode(w, obj)
        val out = File("${outDir}/PairUint8.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint8 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairUint8.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = PairUint8Codec.decode(r)
        val w = JsonWriter()
        PairUint8Codec.encode(w, obj)
        val out = File("${outDir}/PairUint8.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint8 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairUint8.gron").readBytes()
        val r = GronReader(data)
        val obj = PairUint8Codec.decode(r)
        val w = GronWriter()
        PairUint8Codec.encode(w, obj)
        val out = File("${outDir}/PairUint8.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint8 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelPairUint16(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/PairUint16.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = PairUint16Codec.decode(r)
        val w = MsgPackWriter()
        PairUint16Codec.encode(w, obj)
        val out = File("${outDir}/PairUint16.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint16 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairUint16.json").readBytes()
        val r = JsonReader(data)
        val obj = PairUint16Codec.decode(r)
        val w = JsonWriter()
        PairUint16Codec.encode(w, obj)
        val out = File("${outDir}/PairUint16.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint16 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairUint16.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = PairUint16Codec.decode(r)
        val w = JsonWriter()
        PairUint16Codec.encode(w, obj)
        val out = File("${outDir}/PairUint16.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint16 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairUint16.gron").readBytes()
        val r = GronReader(data)
        val obj = PairUint16Codec.decode(r)
        val w = GronWriter()
        PairUint16Codec.encode(w, obj)
        val out = File("${outDir}/PairUint16.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint16 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelPairUint32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/PairUint32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = PairUint32Codec.decode(r)
        val w = MsgPackWriter()
        PairUint32Codec.encode(w, obj)
        val out = File("${outDir}/PairUint32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairUint32.json").readBytes()
        val r = JsonReader(data)
        val obj = PairUint32Codec.decode(r)
        val w = JsonWriter()
        PairUint32Codec.encode(w, obj)
        val out = File("${outDir}/PairUint32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairUint32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = PairUint32Codec.decode(r)
        val w = JsonWriter()
        PairUint32Codec.encode(w, obj)
        val out = File("${outDir}/PairUint32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairUint32.gron").readBytes()
        val r = GronReader(data)
        val obj = PairUint32Codec.decode(r)
        val w = GronWriter()
        PairUint32Codec.encode(w, obj)
        val out = File("${outDir}/PairUint32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelPairUint64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/PairUint64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = PairUint64Codec.decode(r)
        val w = MsgPackWriter()
        PairUint64Codec.encode(w, obj)
        val out = File("${outDir}/PairUint64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairUint64.json").readBytes()
        val r = JsonReader(data)
        val obj = PairUint64Codec.decode(r)
        val w = JsonWriter()
        PairUint64Codec.encode(w, obj)
        val out = File("${outDir}/PairUint64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairUint64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = PairUint64Codec.decode(r)
        val w = JsonWriter()
        PairUint64Codec.encode(w, obj)
        val out = File("${outDir}/PairUint64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairUint64.gron").readBytes()
        val r = GronReader(data)
        val obj = PairUint64Codec.decode(r)
        val w = GronWriter()
        PairUint64Codec.encode(w, obj)
        val out = File("${outDir}/PairUint64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairUint64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelPairFloat32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/PairFloat32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = PairFloat32Codec.decode(r)
        val w = MsgPackWriter()
        PairFloat32Codec.encode(w, obj)
        val out = File("${outDir}/PairFloat32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairFloat32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairFloat32.json").readBytes()
        val r = JsonReader(data)
        val obj = PairFloat32Codec.decode(r)
        val w = JsonWriter()
        PairFloat32Codec.encode(w, obj)
        val out = File("${outDir}/PairFloat32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairFloat32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairFloat32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = PairFloat32Codec.decode(r)
        val w = JsonWriter()
        PairFloat32Codec.encode(w, obj)
        val out = File("${outDir}/PairFloat32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairFloat32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairFloat32.gron").readBytes()
        val r = GronReader(data)
        val obj = PairFloat32Codec.decode(r)
        val w = GronWriter()
        PairFloat32Codec.encode(w, obj)
        val out = File("${outDir}/PairFloat32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairFloat32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelPairFloat64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/PairFloat64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = PairFloat64Codec.decode(r)
        val w = MsgPackWriter()
        PairFloat64Codec.encode(w, obj)
        val out = File("${outDir}/PairFloat64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairFloat64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairFloat64.json").readBytes()
        val r = JsonReader(data)
        val obj = PairFloat64Codec.decode(r)
        val w = JsonWriter()
        PairFloat64Codec.encode(w, obj)
        val out = File("${outDir}/PairFloat64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairFloat64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairFloat64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = PairFloat64Codec.decode(r)
        val w = JsonWriter()
        PairFloat64Codec.encode(w, obj)
        val out = File("${outDir}/PairFloat64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairFloat64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairFloat64.gron").readBytes()
        val r = GronReader(data)
        val obj = PairFloat64Codec.decode(r)
        val w = GronWriter()
        PairFloat64Codec.encode(w, obj)
        val out = File("${outDir}/PairFloat64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairFloat64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelPairBytes(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/PairBytes.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = PairBytesCodec.decode(r)
        val w = MsgPackWriter()
        PairBytesCodec.encode(w, obj)
        val out = File("${outDir}/PairBytes.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairBytes mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairBytes.json").readBytes()
        val r = JsonReader(data)
        val obj = PairBytesCodec.decode(r)
        val w = JsonWriter()
        PairBytesCodec.encode(w, obj)
        val out = File("${outDir}/PairBytes.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairBytes json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairBytes.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = PairBytesCodec.decode(r)
        val w = JsonWriter()
        PairBytesCodec.encode(w, obj)
        val out = File("${outDir}/PairBytes.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairBytes unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/PairBytes.gron").readBytes()
        val r = GronReader(data)
        val obj = PairBytesCodec.decode(r)
        val w = GronWriter()
        PairBytesCodec.encode(w, obj)
        val out = File("${outDir}/PairBytes.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL PairBytes gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualStringInt32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualStringInt32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualStringInt32Codec.decode(r)
        val w = MsgPackWriter()
        DualStringInt32Codec.encode(w, obj)
        val out = File("${outDir}/DualStringInt32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringInt32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringInt32.json").readBytes()
        val r = JsonReader(data)
        val obj = DualStringInt32Codec.decode(r)
        val w = JsonWriter()
        DualStringInt32Codec.encode(w, obj)
        val out = File("${outDir}/DualStringInt32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringInt32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringInt32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualStringInt32Codec.decode(r)
        val w = JsonWriter()
        DualStringInt32Codec.encode(w, obj)
        val out = File("${outDir}/DualStringInt32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringInt32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringInt32.gron").readBytes()
        val r = GronReader(data)
        val obj = DualStringInt32Codec.decode(r)
        val w = GronWriter()
        DualStringInt32Codec.encode(w, obj)
        val out = File("${outDir}/DualStringInt32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringInt32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualStringBoolean(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualStringBoolean.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualStringBooleanCodec.decode(r)
        val w = MsgPackWriter()
        DualStringBooleanCodec.encode(w, obj)
        val out = File("${outDir}/DualStringBoolean.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringBoolean mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringBoolean.json").readBytes()
        val r = JsonReader(data)
        val obj = DualStringBooleanCodec.decode(r)
        val w = JsonWriter()
        DualStringBooleanCodec.encode(w, obj)
        val out = File("${outDir}/DualStringBoolean.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringBoolean json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringBoolean.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualStringBooleanCodec.decode(r)
        val w = JsonWriter()
        DualStringBooleanCodec.encode(w, obj)
        val out = File("${outDir}/DualStringBoolean.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringBoolean unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringBoolean.gron").readBytes()
        val r = GronReader(data)
        val obj = DualStringBooleanCodec.decode(r)
        val w = GronWriter()
        DualStringBooleanCodec.encode(w, obj)
        val out = File("${outDir}/DualStringBoolean.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringBoolean gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualStringFloat64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualStringFloat64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualStringFloat64Codec.decode(r)
        val w = MsgPackWriter()
        DualStringFloat64Codec.encode(w, obj)
        val out = File("${outDir}/DualStringFloat64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringFloat64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringFloat64.json").readBytes()
        val r = JsonReader(data)
        val obj = DualStringFloat64Codec.decode(r)
        val w = JsonWriter()
        DualStringFloat64Codec.encode(w, obj)
        val out = File("${outDir}/DualStringFloat64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringFloat64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringFloat64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualStringFloat64Codec.decode(r)
        val w = JsonWriter()
        DualStringFloat64Codec.encode(w, obj)
        val out = File("${outDir}/DualStringFloat64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringFloat64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringFloat64.gron").readBytes()
        val r = GronReader(data)
        val obj = DualStringFloat64Codec.decode(r)
        val w = GronWriter()
        DualStringFloat64Codec.encode(w, obj)
        val out = File("${outDir}/DualStringFloat64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringFloat64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualStringBytes(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualStringBytes.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualStringBytesCodec.decode(r)
        val w = MsgPackWriter()
        DualStringBytesCodec.encode(w, obj)
        val out = File("${outDir}/DualStringBytes.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringBytes mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringBytes.json").readBytes()
        val r = JsonReader(data)
        val obj = DualStringBytesCodec.decode(r)
        val w = JsonWriter()
        DualStringBytesCodec.encode(w, obj)
        val out = File("${outDir}/DualStringBytes.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringBytes json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringBytes.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualStringBytesCodec.decode(r)
        val w = JsonWriter()
        DualStringBytesCodec.encode(w, obj)
        val out = File("${outDir}/DualStringBytes.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringBytes unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringBytes.gron").readBytes()
        val r = GronReader(data)
        val obj = DualStringBytesCodec.decode(r)
        val w = GronWriter()
        DualStringBytesCodec.encode(w, obj)
        val out = File("${outDir}/DualStringBytes.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringBytes gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualInt32Boolean(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualInt32Boolean.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualInt32BooleanCodec.decode(r)
        val w = MsgPackWriter()
        DualInt32BooleanCodec.encode(w, obj)
        val out = File("${outDir}/DualInt32Boolean.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Boolean mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Boolean.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt32BooleanCodec.decode(r)
        val w = JsonWriter()
        DualInt32BooleanCodec.encode(w, obj)
        val out = File("${outDir}/DualInt32Boolean.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Boolean json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Boolean.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt32BooleanCodec.decode(r)
        val w = JsonWriter()
        DualInt32BooleanCodec.encode(w, obj)
        val out = File("${outDir}/DualInt32Boolean.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Boolean unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Boolean.gron").readBytes()
        val r = GronReader(data)
        val obj = DualInt32BooleanCodec.decode(r)
        val w = GronWriter()
        DualInt32BooleanCodec.encode(w, obj)
        val out = File("${outDir}/DualInt32Boolean.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Boolean gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualInt32Float64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualInt32Float64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualInt32Float64Codec.decode(r)
        val w = MsgPackWriter()
        DualInt32Float64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt32Float64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Float64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Float64.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt32Float64Codec.decode(r)
        val w = JsonWriter()
        DualInt32Float64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt32Float64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Float64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Float64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt32Float64Codec.decode(r)
        val w = JsonWriter()
        DualInt32Float64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt32Float64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Float64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Float64.gron").readBytes()
        val r = GronReader(data)
        val obj = DualInt32Float64Codec.decode(r)
        val w = GronWriter()
        DualInt32Float64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt32Float64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Float64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualInt32Int64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualInt32Int64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualInt32Int64Codec.decode(r)
        val w = MsgPackWriter()
        DualInt32Int64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt32Int64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Int64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Int64.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt32Int64Codec.decode(r)
        val w = JsonWriter()
        DualInt32Int64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt32Int64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Int64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Int64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt32Int64Codec.decode(r)
        val w = JsonWriter()
        DualInt32Int64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt32Int64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Int64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Int64.gron").readBytes()
        val r = GronReader(data)
        val obj = DualInt32Int64Codec.decode(r)
        val w = GronWriter()
        DualInt32Int64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt32Int64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Int64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualInt32Uint32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualInt32Uint32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualInt32Uint32Codec.decode(r)
        val w = MsgPackWriter()
        DualInt32Uint32Codec.encode(w, obj)
        val out = File("${outDir}/DualInt32Uint32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Uint32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Uint32.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt32Uint32Codec.decode(r)
        val w = JsonWriter()
        DualInt32Uint32Codec.encode(w, obj)
        val out = File("${outDir}/DualInt32Uint32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Uint32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Uint32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt32Uint32Codec.decode(r)
        val w = JsonWriter()
        DualInt32Uint32Codec.encode(w, obj)
        val out = File("${outDir}/DualInt32Uint32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Uint32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Uint32.gron").readBytes()
        val r = GronReader(data)
        val obj = DualInt32Uint32Codec.decode(r)
        val w = GronWriter()
        DualInt32Uint32Codec.encode(w, obj)
        val out = File("${outDir}/DualInt32Uint32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Uint32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualInt64Uint64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualInt64Uint64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualInt64Uint64Codec.decode(r)
        val w = MsgPackWriter()
        DualInt64Uint64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt64Uint64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt64Uint64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt64Uint64.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt64Uint64Codec.decode(r)
        val w = JsonWriter()
        DualInt64Uint64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt64Uint64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt64Uint64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt64Uint64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt64Uint64Codec.decode(r)
        val w = JsonWriter()
        DualInt64Uint64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt64Uint64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt64Uint64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt64Uint64.gron").readBytes()
        val r = GronReader(data)
        val obj = DualInt64Uint64Codec.decode(r)
        val w = GronWriter()
        DualInt64Uint64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt64Uint64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt64Uint64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualFloat32Float64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualFloat32Float64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualFloat32Float64Codec.decode(r)
        val w = MsgPackWriter()
        DualFloat32Float64Codec.encode(w, obj)
        val out = File("${outDir}/DualFloat32Float64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat32Float64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualFloat32Float64.json").readBytes()
        val r = JsonReader(data)
        val obj = DualFloat32Float64Codec.decode(r)
        val w = JsonWriter()
        DualFloat32Float64Codec.encode(w, obj)
        val out = File("${outDir}/DualFloat32Float64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat32Float64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualFloat32Float64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualFloat32Float64Codec.decode(r)
        val w = JsonWriter()
        DualFloat32Float64Codec.encode(w, obj)
        val out = File("${outDir}/DualFloat32Float64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat32Float64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualFloat32Float64.gron").readBytes()
        val r = GronReader(data)
        val obj = DualFloat32Float64Codec.decode(r)
        val w = GronWriter()
        DualFloat32Float64Codec.encode(w, obj)
        val out = File("${outDir}/DualFloat32Float64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat32Float64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualFloat64Boolean(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualFloat64Boolean.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualFloat64BooleanCodec.decode(r)
        val w = MsgPackWriter()
        DualFloat64BooleanCodec.encode(w, obj)
        val out = File("${outDir}/DualFloat64Boolean.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat64Boolean mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualFloat64Boolean.json").readBytes()
        val r = JsonReader(data)
        val obj = DualFloat64BooleanCodec.decode(r)
        val w = JsonWriter()
        DualFloat64BooleanCodec.encode(w, obj)
        val out = File("${outDir}/DualFloat64Boolean.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat64Boolean json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualFloat64Boolean.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualFloat64BooleanCodec.decode(r)
        val w = JsonWriter()
        DualFloat64BooleanCodec.encode(w, obj)
        val out = File("${outDir}/DualFloat64Boolean.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat64Boolean unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualFloat64Boolean.gron").readBytes()
        val r = GronReader(data)
        val obj = DualFloat64BooleanCodec.decode(r)
        val w = GronWriter()
        DualFloat64BooleanCodec.encode(w, obj)
        val out = File("${outDir}/DualFloat64Boolean.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat64Boolean gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualFloat64Bytes(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualFloat64Bytes.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualFloat64BytesCodec.decode(r)
        val w = MsgPackWriter()
        DualFloat64BytesCodec.encode(w, obj)
        val out = File("${outDir}/DualFloat64Bytes.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat64Bytes mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualFloat64Bytes.json").readBytes()
        val r = JsonReader(data)
        val obj = DualFloat64BytesCodec.decode(r)
        val w = JsonWriter()
        DualFloat64BytesCodec.encode(w, obj)
        val out = File("${outDir}/DualFloat64Bytes.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat64Bytes json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualFloat64Bytes.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualFloat64BytesCodec.decode(r)
        val w = JsonWriter()
        DualFloat64BytesCodec.encode(w, obj)
        val out = File("${outDir}/DualFloat64Bytes.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat64Bytes unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualFloat64Bytes.gron").readBytes()
        val r = GronReader(data)
        val obj = DualFloat64BytesCodec.decode(r)
        val w = GronWriter()
        DualFloat64BytesCodec.encode(w, obj)
        val out = File("${outDir}/DualFloat64Bytes.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat64Bytes gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualUint32Uint64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualUint32Uint64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualUint32Uint64Codec.decode(r)
        val w = MsgPackWriter()
        DualUint32Uint64Codec.encode(w, obj)
        val out = File("${outDir}/DualUint32Uint64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualUint32Uint64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualUint32Uint64.json").readBytes()
        val r = JsonReader(data)
        val obj = DualUint32Uint64Codec.decode(r)
        val w = JsonWriter()
        DualUint32Uint64Codec.encode(w, obj)
        val out = File("${outDir}/DualUint32Uint64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualUint32Uint64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualUint32Uint64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualUint32Uint64Codec.decode(r)
        val w = JsonWriter()
        DualUint32Uint64Codec.encode(w, obj)
        val out = File("${outDir}/DualUint32Uint64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualUint32Uint64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualUint32Uint64.gron").readBytes()
        val r = GronReader(data)
        val obj = DualUint32Uint64Codec.decode(r)
        val w = GronWriter()
        DualUint32Uint64Codec.encode(w, obj)
        val out = File("${outDir}/DualUint32Uint64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualUint32Uint64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualBooleanBytes(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualBooleanBytes.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualBooleanBytesCodec.decode(r)
        val w = MsgPackWriter()
        DualBooleanBytesCodec.encode(w, obj)
        val out = File("${outDir}/DualBooleanBytes.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualBooleanBytes mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualBooleanBytes.json").readBytes()
        val r = JsonReader(data)
        val obj = DualBooleanBytesCodec.decode(r)
        val w = JsonWriter()
        DualBooleanBytesCodec.encode(w, obj)
        val out = File("${outDir}/DualBooleanBytes.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualBooleanBytes json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualBooleanBytes.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualBooleanBytesCodec.decode(r)
        val w = JsonWriter()
        DualBooleanBytesCodec.encode(w, obj)
        val out = File("${outDir}/DualBooleanBytes.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualBooleanBytes unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualBooleanBytes.gron").readBytes()
        val r = GronReader(data)
        val obj = DualBooleanBytesCodec.decode(r)
        val w = GronWriter()
        DualBooleanBytesCodec.encode(w, obj)
        val out = File("${outDir}/DualBooleanBytes.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualBooleanBytes gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualInt8Uint8(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualInt8Uint8.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualInt8Uint8Codec.decode(r)
        val w = MsgPackWriter()
        DualInt8Uint8Codec.encode(w, obj)
        val out = File("${outDir}/DualInt8Uint8.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt8Uint8 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt8Uint8.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt8Uint8Codec.decode(r)
        val w = JsonWriter()
        DualInt8Uint8Codec.encode(w, obj)
        val out = File("${outDir}/DualInt8Uint8.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt8Uint8 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt8Uint8.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt8Uint8Codec.decode(r)
        val w = JsonWriter()
        DualInt8Uint8Codec.encode(w, obj)
        val out = File("${outDir}/DualInt8Uint8.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt8Uint8 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt8Uint8.gron").readBytes()
        val r = GronReader(data)
        val obj = DualInt8Uint8Codec.decode(r)
        val w = GronWriter()
        DualInt8Uint8Codec.encode(w, obj)
        val out = File("${outDir}/DualInt8Uint8.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt8Uint8 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualInt16Uint16(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualInt16Uint16.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualInt16Uint16Codec.decode(r)
        val w = MsgPackWriter()
        DualInt16Uint16Codec.encode(w, obj)
        val out = File("${outDir}/DualInt16Uint16.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt16Uint16 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt16Uint16.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt16Uint16Codec.decode(r)
        val w = JsonWriter()
        DualInt16Uint16Codec.encode(w, obj)
        val out = File("${outDir}/DualInt16Uint16.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt16Uint16 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt16Uint16.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt16Uint16Codec.decode(r)
        val w = JsonWriter()
        DualInt16Uint16Codec.encode(w, obj)
        val out = File("${outDir}/DualInt16Uint16.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt16Uint16 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt16Uint16.gron").readBytes()
        val r = GronReader(data)
        val obj = DualInt16Uint16Codec.decode(r)
        val w = GronWriter()
        DualInt16Uint16Codec.encode(w, obj)
        val out = File("${outDir}/DualInt16Uint16.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt16Uint16 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualStringInt64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualStringInt64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualStringInt64Codec.decode(r)
        val w = MsgPackWriter()
        DualStringInt64Codec.encode(w, obj)
        val out = File("${outDir}/DualStringInt64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringInt64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringInt64.json").readBytes()
        val r = JsonReader(data)
        val obj = DualStringInt64Codec.decode(r)
        val w = JsonWriter()
        DualStringInt64Codec.encode(w, obj)
        val out = File("${outDir}/DualStringInt64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringInt64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringInt64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualStringInt64Codec.decode(r)
        val w = JsonWriter()
        DualStringInt64Codec.encode(w, obj)
        val out = File("${outDir}/DualStringInt64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringInt64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringInt64.gron").readBytes()
        val r = GronReader(data)
        val obj = DualStringInt64Codec.decode(r)
        val w = GronWriter()
        DualStringInt64Codec.encode(w, obj)
        val out = File("${outDir}/DualStringInt64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringInt64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualStringUint64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualStringUint64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualStringUint64Codec.decode(r)
        val w = MsgPackWriter()
        DualStringUint64Codec.encode(w, obj)
        val out = File("${outDir}/DualStringUint64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringUint64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringUint64.json").readBytes()
        val r = JsonReader(data)
        val obj = DualStringUint64Codec.decode(r)
        val w = JsonWriter()
        DualStringUint64Codec.encode(w, obj)
        val out = File("${outDir}/DualStringUint64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringUint64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringUint64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualStringUint64Codec.decode(r)
        val w = JsonWriter()
        DualStringUint64Codec.encode(w, obj)
        val out = File("${outDir}/DualStringUint64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringUint64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualStringUint64.gron").readBytes()
        val r = GronReader(data)
        val obj = DualStringUint64Codec.decode(r)
        val w = GronWriter()
        DualStringUint64Codec.encode(w, obj)
        val out = File("${outDir}/DualStringUint64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualStringUint64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualInt32Bytes(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualInt32Bytes.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualInt32BytesCodec.decode(r)
        val w = MsgPackWriter()
        DualInt32BytesCodec.encode(w, obj)
        val out = File("${outDir}/DualInt32Bytes.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Bytes mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Bytes.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt32BytesCodec.decode(r)
        val w = JsonWriter()
        DualInt32BytesCodec.encode(w, obj)
        val out = File("${outDir}/DualInt32Bytes.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Bytes json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Bytes.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt32BytesCodec.decode(r)
        val w = JsonWriter()
        DualInt32BytesCodec.encode(w, obj)
        val out = File("${outDir}/DualInt32Bytes.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Bytes unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt32Bytes.gron").readBytes()
        val r = GronReader(data)
        val obj = DualInt32BytesCodec.decode(r)
        val w = GronWriter()
        DualInt32BytesCodec.encode(w, obj)
        val out = File("${outDir}/DualInt32Bytes.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt32Bytes gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualFloat64Int32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualFloat64Int32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualFloat64Int32Codec.decode(r)
        val w = MsgPackWriter()
        DualFloat64Int32Codec.encode(w, obj)
        val out = File("${outDir}/DualFloat64Int32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat64Int32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualFloat64Int32.json").readBytes()
        val r = JsonReader(data)
        val obj = DualFloat64Int32Codec.decode(r)
        val w = JsonWriter()
        DualFloat64Int32Codec.encode(w, obj)
        val out = File("${outDir}/DualFloat64Int32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat64Int32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualFloat64Int32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualFloat64Int32Codec.decode(r)
        val w = JsonWriter()
        DualFloat64Int32Codec.encode(w, obj)
        val out = File("${outDir}/DualFloat64Int32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat64Int32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualFloat64Int32.gron").readBytes()
        val r = GronReader(data)
        val obj = DualFloat64Int32Codec.decode(r)
        val w = GronWriter()
        DualFloat64Int32Codec.encode(w, obj)
        val out = File("${outDir}/DualFloat64Int32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualFloat64Int32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualBooleanInt32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualBooleanInt32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualBooleanInt32Codec.decode(r)
        val w = MsgPackWriter()
        DualBooleanInt32Codec.encode(w, obj)
        val out = File("${outDir}/DualBooleanInt32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualBooleanInt32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualBooleanInt32.json").readBytes()
        val r = JsonReader(data)
        val obj = DualBooleanInt32Codec.decode(r)
        val w = JsonWriter()
        DualBooleanInt32Codec.encode(w, obj)
        val out = File("${outDir}/DualBooleanInt32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualBooleanInt32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualBooleanInt32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualBooleanInt32Codec.decode(r)
        val w = JsonWriter()
        DualBooleanInt32Codec.encode(w, obj)
        val out = File("${outDir}/DualBooleanInt32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualBooleanInt32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualBooleanInt32.gron").readBytes()
        val r = GronReader(data)
        val obj = DualBooleanInt32Codec.decode(r)
        val w = GronWriter()
        DualBooleanInt32Codec.encode(w, obj)
        val out = File("${outDir}/DualBooleanInt32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualBooleanInt32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualBytesInt64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualBytesInt64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualBytesInt64Codec.decode(r)
        val w = MsgPackWriter()
        DualBytesInt64Codec.encode(w, obj)
        val out = File("${outDir}/DualBytesInt64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualBytesInt64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualBytesInt64.json").readBytes()
        val r = JsonReader(data)
        val obj = DualBytesInt64Codec.decode(r)
        val w = JsonWriter()
        DualBytesInt64Codec.encode(w, obj)
        val out = File("${outDir}/DualBytesInt64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualBytesInt64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualBytesInt64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualBytesInt64Codec.decode(r)
        val w = JsonWriter()
        DualBytesInt64Codec.encode(w, obj)
        val out = File("${outDir}/DualBytesInt64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualBytesInt64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualBytesInt64.gron").readBytes()
        val r = GronReader(data)
        val obj = DualBytesInt64Codec.decode(r)
        val w = GronWriter()
        DualBytesInt64Codec.encode(w, obj)
        val out = File("${outDir}/DualBytesInt64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualBytesInt64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualInt8Float32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualInt8Float32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualInt8Float32Codec.decode(r)
        val w = MsgPackWriter()
        DualInt8Float32Codec.encode(w, obj)
        val out = File("${outDir}/DualInt8Float32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt8Float32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt8Float32.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt8Float32Codec.decode(r)
        val w = JsonWriter()
        DualInt8Float32Codec.encode(w, obj)
        val out = File("${outDir}/DualInt8Float32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt8Float32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt8Float32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt8Float32Codec.decode(r)
        val w = JsonWriter()
        DualInt8Float32Codec.encode(w, obj)
        val out = File("${outDir}/DualInt8Float32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt8Float32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt8Float32.gron").readBytes()
        val r = GronReader(data)
        val obj = DualInt8Float32Codec.decode(r)
        val w = GronWriter()
        DualInt8Float32Codec.encode(w, obj)
        val out = File("${outDir}/DualInt8Float32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt8Float32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualUint8Int16(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualUint8Int16.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualUint8Int16Codec.decode(r)
        val w = MsgPackWriter()
        DualUint8Int16Codec.encode(w, obj)
        val out = File("${outDir}/DualUint8Int16.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualUint8Int16 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualUint8Int16.json").readBytes()
        val r = JsonReader(data)
        val obj = DualUint8Int16Codec.decode(r)
        val w = JsonWriter()
        DualUint8Int16Codec.encode(w, obj)
        val out = File("${outDir}/DualUint8Int16.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualUint8Int16 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualUint8Int16.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualUint8Int16Codec.decode(r)
        val w = JsonWriter()
        DualUint8Int16Codec.encode(w, obj)
        val out = File("${outDir}/DualUint8Int16.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualUint8Int16 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualUint8Int16.gron").readBytes()
        val r = GronReader(data)
        val obj = DualUint8Int16Codec.decode(r)
        val w = GronWriter()
        DualUint8Int16Codec.encode(w, obj)
        val out = File("${outDir}/DualUint8Int16.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualUint8Int16 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualInt64Float64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualInt64Float64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualInt64Float64Codec.decode(r)
        val w = MsgPackWriter()
        DualInt64Float64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt64Float64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt64Float64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt64Float64.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt64Float64Codec.decode(r)
        val w = JsonWriter()
        DualInt64Float64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt64Float64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt64Float64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt64Float64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualInt64Float64Codec.decode(r)
        val w = JsonWriter()
        DualInt64Float64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt64Float64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt64Float64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualInt64Float64.gron").readBytes()
        val r = GronReader(data)
        val obj = DualInt64Float64Codec.decode(r)
        val w = GronWriter()
        DualInt64Float64Codec.encode(w, obj)
        val out = File("${outDir}/DualInt64Float64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualInt64Float64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelDualUint64String(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/DualUint64String.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = DualUint64StringCodec.decode(r)
        val w = MsgPackWriter()
        DualUint64StringCodec.encode(w, obj)
        val out = File("${outDir}/DualUint64String.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualUint64String mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualUint64String.json").readBytes()
        val r = JsonReader(data)
        val obj = DualUint64StringCodec.decode(r)
        val w = JsonWriter()
        DualUint64StringCodec.encode(w, obj)
        val out = File("${outDir}/DualUint64String.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualUint64String json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualUint64String.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = DualUint64StringCodec.decode(r)
        val w = JsonWriter()
        DualUint64StringCodec.encode(w, obj)
        val out = File("${outDir}/DualUint64String.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualUint64String unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/DualUint64String.gron").readBytes()
        val r = GronReader(data)
        val obj = DualUint64StringCodec.decode(r)
        val w = GronWriter()
        DualUint64StringCodec.encode(w, obj)
        val out = File("${outDir}/DualUint64String.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL DualUint64String gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple01(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple01.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple01Codec.decode(r)
        val w = MsgPackWriter()
        Triple01Codec.encode(w, obj)
        val out = File("${outDir}/Triple01.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple01 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple01.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple01Codec.decode(r)
        val w = JsonWriter()
        Triple01Codec.encode(w, obj)
        val out = File("${outDir}/Triple01.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple01 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple01.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple01Codec.decode(r)
        val w = JsonWriter()
        Triple01Codec.encode(w, obj)
        val out = File("${outDir}/Triple01.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple01 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple01.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple01Codec.decode(r)
        val w = GronWriter()
        Triple01Codec.encode(w, obj)
        val out = File("${outDir}/Triple01.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple01 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple02(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple02.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple02Codec.decode(r)
        val w = MsgPackWriter()
        Triple02Codec.encode(w, obj)
        val out = File("${outDir}/Triple02.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple02 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple02.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple02Codec.decode(r)
        val w = JsonWriter()
        Triple02Codec.encode(w, obj)
        val out = File("${outDir}/Triple02.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple02 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple02.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple02Codec.decode(r)
        val w = JsonWriter()
        Triple02Codec.encode(w, obj)
        val out = File("${outDir}/Triple02.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple02 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple02.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple02Codec.decode(r)
        val w = GronWriter()
        Triple02Codec.encode(w, obj)
        val out = File("${outDir}/Triple02.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple02 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple03(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple03.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple03Codec.decode(r)
        val w = MsgPackWriter()
        Triple03Codec.encode(w, obj)
        val out = File("${outDir}/Triple03.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple03 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple03.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple03Codec.decode(r)
        val w = JsonWriter()
        Triple03Codec.encode(w, obj)
        val out = File("${outDir}/Triple03.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple03 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple03.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple03Codec.decode(r)
        val w = JsonWriter()
        Triple03Codec.encode(w, obj)
        val out = File("${outDir}/Triple03.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple03 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple03.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple03Codec.decode(r)
        val w = GronWriter()
        Triple03Codec.encode(w, obj)
        val out = File("${outDir}/Triple03.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple03 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple04(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple04.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple04Codec.decode(r)
        val w = MsgPackWriter()
        Triple04Codec.encode(w, obj)
        val out = File("${outDir}/Triple04.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple04 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple04.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple04Codec.decode(r)
        val w = JsonWriter()
        Triple04Codec.encode(w, obj)
        val out = File("${outDir}/Triple04.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple04 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple04.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple04Codec.decode(r)
        val w = JsonWriter()
        Triple04Codec.encode(w, obj)
        val out = File("${outDir}/Triple04.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple04 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple04.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple04Codec.decode(r)
        val w = GronWriter()
        Triple04Codec.encode(w, obj)
        val out = File("${outDir}/Triple04.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple04 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple05(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple05.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple05Codec.decode(r)
        val w = MsgPackWriter()
        Triple05Codec.encode(w, obj)
        val out = File("${outDir}/Triple05.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple05 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple05.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple05Codec.decode(r)
        val w = JsonWriter()
        Triple05Codec.encode(w, obj)
        val out = File("${outDir}/Triple05.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple05 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple05.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple05Codec.decode(r)
        val w = JsonWriter()
        Triple05Codec.encode(w, obj)
        val out = File("${outDir}/Triple05.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple05 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple05.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple05Codec.decode(r)
        val w = GronWriter()
        Triple05Codec.encode(w, obj)
        val out = File("${outDir}/Triple05.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple05 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple06(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple06.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple06Codec.decode(r)
        val w = MsgPackWriter()
        Triple06Codec.encode(w, obj)
        val out = File("${outDir}/Triple06.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple06 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple06.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple06Codec.decode(r)
        val w = JsonWriter()
        Triple06Codec.encode(w, obj)
        val out = File("${outDir}/Triple06.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple06 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple06.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple06Codec.decode(r)
        val w = JsonWriter()
        Triple06Codec.encode(w, obj)
        val out = File("${outDir}/Triple06.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple06 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple06.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple06Codec.decode(r)
        val w = GronWriter()
        Triple06Codec.encode(w, obj)
        val out = File("${outDir}/Triple06.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple06 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple07(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple07.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple07Codec.decode(r)
        val w = MsgPackWriter()
        Triple07Codec.encode(w, obj)
        val out = File("${outDir}/Triple07.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple07 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple07.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple07Codec.decode(r)
        val w = JsonWriter()
        Triple07Codec.encode(w, obj)
        val out = File("${outDir}/Triple07.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple07 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple07.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple07Codec.decode(r)
        val w = JsonWriter()
        Triple07Codec.encode(w, obj)
        val out = File("${outDir}/Triple07.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple07 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple07.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple07Codec.decode(r)
        val w = GronWriter()
        Triple07Codec.encode(w, obj)
        val out = File("${outDir}/Triple07.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple07 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple08(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple08.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple08Codec.decode(r)
        val w = MsgPackWriter()
        Triple08Codec.encode(w, obj)
        val out = File("${outDir}/Triple08.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple08 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple08.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple08Codec.decode(r)
        val w = JsonWriter()
        Triple08Codec.encode(w, obj)
        val out = File("${outDir}/Triple08.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple08 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple08.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple08Codec.decode(r)
        val w = JsonWriter()
        Triple08Codec.encode(w, obj)
        val out = File("${outDir}/Triple08.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple08 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple08.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple08Codec.decode(r)
        val w = GronWriter()
        Triple08Codec.encode(w, obj)
        val out = File("${outDir}/Triple08.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple08 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple09(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple09.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple09Codec.decode(r)
        val w = MsgPackWriter()
        Triple09Codec.encode(w, obj)
        val out = File("${outDir}/Triple09.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple09 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple09.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple09Codec.decode(r)
        val w = JsonWriter()
        Triple09Codec.encode(w, obj)
        val out = File("${outDir}/Triple09.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple09 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple09.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple09Codec.decode(r)
        val w = JsonWriter()
        Triple09Codec.encode(w, obj)
        val out = File("${outDir}/Triple09.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple09 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple09.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple09Codec.decode(r)
        val w = GronWriter()
        Triple09Codec.encode(w, obj)
        val out = File("${outDir}/Triple09.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple09 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple10(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple10.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple10Codec.decode(r)
        val w = MsgPackWriter()
        Triple10Codec.encode(w, obj)
        val out = File("${outDir}/Triple10.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple10 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple10.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple10Codec.decode(r)
        val w = JsonWriter()
        Triple10Codec.encode(w, obj)
        val out = File("${outDir}/Triple10.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple10 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple10.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple10Codec.decode(r)
        val w = JsonWriter()
        Triple10Codec.encode(w, obj)
        val out = File("${outDir}/Triple10.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple10 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple10.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple10Codec.decode(r)
        val w = GronWriter()
        Triple10Codec.encode(w, obj)
        val out = File("${outDir}/Triple10.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple10 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple11(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple11.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple11Codec.decode(r)
        val w = MsgPackWriter()
        Triple11Codec.encode(w, obj)
        val out = File("${outDir}/Triple11.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple11 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple11.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple11Codec.decode(r)
        val w = JsonWriter()
        Triple11Codec.encode(w, obj)
        val out = File("${outDir}/Triple11.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple11 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple11.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple11Codec.decode(r)
        val w = JsonWriter()
        Triple11Codec.encode(w, obj)
        val out = File("${outDir}/Triple11.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple11 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple11.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple11Codec.decode(r)
        val w = GronWriter()
        Triple11Codec.encode(w, obj)
        val out = File("${outDir}/Triple11.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple11 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple12(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple12.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple12Codec.decode(r)
        val w = MsgPackWriter()
        Triple12Codec.encode(w, obj)
        val out = File("${outDir}/Triple12.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple12 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple12.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple12Codec.decode(r)
        val w = JsonWriter()
        Triple12Codec.encode(w, obj)
        val out = File("${outDir}/Triple12.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple12 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple12.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple12Codec.decode(r)
        val w = JsonWriter()
        Triple12Codec.encode(w, obj)
        val out = File("${outDir}/Triple12.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple12 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple12.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple12Codec.decode(r)
        val w = GronWriter()
        Triple12Codec.encode(w, obj)
        val out = File("${outDir}/Triple12.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple12 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple13(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple13.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple13Codec.decode(r)
        val w = MsgPackWriter()
        Triple13Codec.encode(w, obj)
        val out = File("${outDir}/Triple13.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple13 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple13.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple13Codec.decode(r)
        val w = JsonWriter()
        Triple13Codec.encode(w, obj)
        val out = File("${outDir}/Triple13.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple13 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple13.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple13Codec.decode(r)
        val w = JsonWriter()
        Triple13Codec.encode(w, obj)
        val out = File("${outDir}/Triple13.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple13 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple13.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple13Codec.decode(r)
        val w = GronWriter()
        Triple13Codec.encode(w, obj)
        val out = File("${outDir}/Triple13.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple13 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple14(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple14.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple14Codec.decode(r)
        val w = MsgPackWriter()
        Triple14Codec.encode(w, obj)
        val out = File("${outDir}/Triple14.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple14 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple14.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple14Codec.decode(r)
        val w = JsonWriter()
        Triple14Codec.encode(w, obj)
        val out = File("${outDir}/Triple14.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple14 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple14.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple14Codec.decode(r)
        val w = JsonWriter()
        Triple14Codec.encode(w, obj)
        val out = File("${outDir}/Triple14.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple14 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple14.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple14Codec.decode(r)
        val w = GronWriter()
        Triple14Codec.encode(w, obj)
        val out = File("${outDir}/Triple14.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple14 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTriple15(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Triple15.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = Triple15Codec.decode(r)
        val w = MsgPackWriter()
        Triple15Codec.encode(w, obj)
        val out = File("${outDir}/Triple15.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple15 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple15.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple15Codec.decode(r)
        val w = JsonWriter()
        Triple15Codec.encode(w, obj)
        val out = File("${outDir}/Triple15.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple15 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple15.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = Triple15Codec.decode(r)
        val w = JsonWriter()
        Triple15Codec.encode(w, obj)
        val out = File("${outDir}/Triple15.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple15 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Triple15.gron").readBytes()
        val r = GronReader(data)
        val obj = Triple15Codec.decode(r)
        val w = GronWriter()
        Triple15Codec.encode(w, obj)
        val out = File("${outDir}/Triple15.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Triple15 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

