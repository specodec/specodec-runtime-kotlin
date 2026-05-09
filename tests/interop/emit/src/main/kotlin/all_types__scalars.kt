package emit_kotlin

import specodec.*
import all_types_scalars.*
import java.io.File

fun runAllTypesScalars(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_SingleString, fm_SingleString) = testModelSingleString(); passed += pm_SingleString; failed += fm_SingleString
    val (pm_SingleBoolean, fm_SingleBoolean) = testModelSingleBoolean(); passed += pm_SingleBoolean; failed += fm_SingleBoolean
    val (pm_SingleInt8, fm_SingleInt8) = testModelSingleInt8(); passed += pm_SingleInt8; failed += fm_SingleInt8
    val (pm_SingleInt16, fm_SingleInt16) = testModelSingleInt16(); passed += pm_SingleInt16; failed += fm_SingleInt16
    val (pm_SingleInt32, fm_SingleInt32) = testModelSingleInt32(); passed += pm_SingleInt32; failed += fm_SingleInt32
    val (pm_SingleInt64, fm_SingleInt64) = testModelSingleInt64(); passed += pm_SingleInt64; failed += fm_SingleInt64
    val (pm_SingleUint8, fm_SingleUint8) = testModelSingleUint8(); passed += pm_SingleUint8; failed += fm_SingleUint8
    val (pm_SingleUint16, fm_SingleUint16) = testModelSingleUint16(); passed += pm_SingleUint16; failed += fm_SingleUint16
    val (pm_SingleUint32, fm_SingleUint32) = testModelSingleUint32(); passed += pm_SingleUint32; failed += fm_SingleUint32
    val (pm_SingleUint64, fm_SingleUint64) = testModelSingleUint64(); passed += pm_SingleUint64; failed += fm_SingleUint64
    val (pm_SingleFloat32, fm_SingleFloat32) = testModelSingleFloat32(); passed += pm_SingleFloat32; failed += fm_SingleFloat32
    val (pm_SingleFloat64, fm_SingleFloat64) = testModelSingleFloat64(); passed += pm_SingleFloat64; failed += fm_SingleFloat64
    val (pm_SingleBytes, fm_SingleBytes) = testModelSingleBytes(); passed += pm_SingleBytes; failed += fm_SingleBytes

    return Pair(passed, failed)
}

fun testModelSingleString(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/SingleString.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = SingleStringCodec.decode(r)
        val w = MsgPackWriter()
        SingleStringCodec.encode(w, obj)
        val out = File("${outDir}/SingleString.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleString mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleString.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleStringCodec.decode(r)
        val w = JsonWriter()
        SingleStringCodec.encode(w, obj)
        val out = File("${outDir}/SingleString.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleString json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleString.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleStringCodec.decode(r)
        val w = JsonWriter()
        SingleStringCodec.encode(w, obj)
        val out = File("${outDir}/SingleString.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleString unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleString.gron").readBytes()
        val r = GronReader(data)
        val obj = SingleStringCodec.decode(r)
        val w = GronWriter()
        SingleStringCodec.encode(w, obj)
        val out = File("${outDir}/SingleString.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleString gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelSingleBoolean(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/SingleBoolean.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = SingleBooleanCodec.decode(r)
        val w = MsgPackWriter()
        SingleBooleanCodec.encode(w, obj)
        val out = File("${outDir}/SingleBoolean.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleBoolean mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleBoolean.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleBooleanCodec.decode(r)
        val w = JsonWriter()
        SingleBooleanCodec.encode(w, obj)
        val out = File("${outDir}/SingleBoolean.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleBoolean json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleBoolean.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleBooleanCodec.decode(r)
        val w = JsonWriter()
        SingleBooleanCodec.encode(w, obj)
        val out = File("${outDir}/SingleBoolean.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleBoolean unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleBoolean.gron").readBytes()
        val r = GronReader(data)
        val obj = SingleBooleanCodec.decode(r)
        val w = GronWriter()
        SingleBooleanCodec.encode(w, obj)
        val out = File("${outDir}/SingleBoolean.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleBoolean gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelSingleInt8(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/SingleInt8.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = SingleInt8Codec.decode(r)
        val w = MsgPackWriter()
        SingleInt8Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt8.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt8 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleInt8.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleInt8Codec.decode(r)
        val w = JsonWriter()
        SingleInt8Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt8.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt8 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleInt8.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleInt8Codec.decode(r)
        val w = JsonWriter()
        SingleInt8Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt8.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt8 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleInt8.gron").readBytes()
        val r = GronReader(data)
        val obj = SingleInt8Codec.decode(r)
        val w = GronWriter()
        SingleInt8Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt8.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt8 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelSingleInt16(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/SingleInt16.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = SingleInt16Codec.decode(r)
        val w = MsgPackWriter()
        SingleInt16Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt16.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt16 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleInt16.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleInt16Codec.decode(r)
        val w = JsonWriter()
        SingleInt16Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt16.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt16 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleInt16.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleInt16Codec.decode(r)
        val w = JsonWriter()
        SingleInt16Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt16.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt16 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleInt16.gron").readBytes()
        val r = GronReader(data)
        val obj = SingleInt16Codec.decode(r)
        val w = GronWriter()
        SingleInt16Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt16.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt16 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelSingleInt32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/SingleInt32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = SingleInt32Codec.decode(r)
        val w = MsgPackWriter()
        SingleInt32Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleInt32.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleInt32Codec.decode(r)
        val w = JsonWriter()
        SingleInt32Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleInt32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleInt32Codec.decode(r)
        val w = JsonWriter()
        SingleInt32Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleInt32.gron").readBytes()
        val r = GronReader(data)
        val obj = SingleInt32Codec.decode(r)
        val w = GronWriter()
        SingleInt32Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelSingleInt64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/SingleInt64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = SingleInt64Codec.decode(r)
        val w = MsgPackWriter()
        SingleInt64Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleInt64.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleInt64Codec.decode(r)
        val w = JsonWriter()
        SingleInt64Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleInt64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleInt64Codec.decode(r)
        val w = JsonWriter()
        SingleInt64Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleInt64.gron").readBytes()
        val r = GronReader(data)
        val obj = SingleInt64Codec.decode(r)
        val w = GronWriter()
        SingleInt64Codec.encode(w, obj)
        val out = File("${outDir}/SingleInt64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleInt64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelSingleUint8(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/SingleUint8.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = SingleUint8Codec.decode(r)
        val w = MsgPackWriter()
        SingleUint8Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint8.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint8 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleUint8.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleUint8Codec.decode(r)
        val w = JsonWriter()
        SingleUint8Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint8.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint8 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleUint8.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleUint8Codec.decode(r)
        val w = JsonWriter()
        SingleUint8Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint8.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint8 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleUint8.gron").readBytes()
        val r = GronReader(data)
        val obj = SingleUint8Codec.decode(r)
        val w = GronWriter()
        SingleUint8Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint8.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint8 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelSingleUint16(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/SingleUint16.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = SingleUint16Codec.decode(r)
        val w = MsgPackWriter()
        SingleUint16Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint16.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint16 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleUint16.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleUint16Codec.decode(r)
        val w = JsonWriter()
        SingleUint16Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint16.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint16 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleUint16.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleUint16Codec.decode(r)
        val w = JsonWriter()
        SingleUint16Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint16.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint16 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleUint16.gron").readBytes()
        val r = GronReader(data)
        val obj = SingleUint16Codec.decode(r)
        val w = GronWriter()
        SingleUint16Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint16.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint16 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelSingleUint32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/SingleUint32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = SingleUint32Codec.decode(r)
        val w = MsgPackWriter()
        SingleUint32Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleUint32.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleUint32Codec.decode(r)
        val w = JsonWriter()
        SingleUint32Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleUint32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleUint32Codec.decode(r)
        val w = JsonWriter()
        SingleUint32Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleUint32.gron").readBytes()
        val r = GronReader(data)
        val obj = SingleUint32Codec.decode(r)
        val w = GronWriter()
        SingleUint32Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelSingleUint64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/SingleUint64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = SingleUint64Codec.decode(r)
        val w = MsgPackWriter()
        SingleUint64Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleUint64.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleUint64Codec.decode(r)
        val w = JsonWriter()
        SingleUint64Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleUint64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleUint64Codec.decode(r)
        val w = JsonWriter()
        SingleUint64Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleUint64.gron").readBytes()
        val r = GronReader(data)
        val obj = SingleUint64Codec.decode(r)
        val w = GronWriter()
        SingleUint64Codec.encode(w, obj)
        val out = File("${outDir}/SingleUint64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleUint64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelSingleFloat32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/SingleFloat32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = SingleFloat32Codec.decode(r)
        val w = MsgPackWriter()
        SingleFloat32Codec.encode(w, obj)
        val out = File("${outDir}/SingleFloat32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleFloat32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleFloat32.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleFloat32Codec.decode(r)
        val w = JsonWriter()
        SingleFloat32Codec.encode(w, obj)
        val out = File("${outDir}/SingleFloat32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleFloat32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleFloat32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleFloat32Codec.decode(r)
        val w = JsonWriter()
        SingleFloat32Codec.encode(w, obj)
        val out = File("${outDir}/SingleFloat32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleFloat32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleFloat32.gron").readBytes()
        val r = GronReader(data)
        val obj = SingleFloat32Codec.decode(r)
        val w = GronWriter()
        SingleFloat32Codec.encode(w, obj)
        val out = File("${outDir}/SingleFloat32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleFloat32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelSingleFloat64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/SingleFloat64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = SingleFloat64Codec.decode(r)
        val w = MsgPackWriter()
        SingleFloat64Codec.encode(w, obj)
        val out = File("${outDir}/SingleFloat64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleFloat64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleFloat64.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleFloat64Codec.decode(r)
        val w = JsonWriter()
        SingleFloat64Codec.encode(w, obj)
        val out = File("${outDir}/SingleFloat64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleFloat64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleFloat64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleFloat64Codec.decode(r)
        val w = JsonWriter()
        SingleFloat64Codec.encode(w, obj)
        val out = File("${outDir}/SingleFloat64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleFloat64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleFloat64.gron").readBytes()
        val r = GronReader(data)
        val obj = SingleFloat64Codec.decode(r)
        val w = GronWriter()
        SingleFloat64Codec.encode(w, obj)
        val out = File("${outDir}/SingleFloat64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleFloat64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelSingleBytes(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/SingleBytes.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = SingleBytesCodec.decode(r)
        val w = MsgPackWriter()
        SingleBytesCodec.encode(w, obj)
        val out = File("${outDir}/SingleBytes.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleBytes mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleBytes.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleBytesCodec.decode(r)
        val w = JsonWriter()
        SingleBytesCodec.encode(w, obj)
        val out = File("${outDir}/SingleBytes.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleBytes json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleBytes.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = SingleBytesCodec.decode(r)
        val w = JsonWriter()
        SingleBytesCodec.encode(w, obj)
        val out = File("${outDir}/SingleBytes.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleBytes unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/SingleBytes.gron").readBytes()
        val r = GronReader(data)
        val obj = SingleBytesCodec.decode(r)
        val w = GronWriter()
        SingleBytesCodec.encode(w, obj)
        val out = File("${outDir}/SingleBytes.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL SingleBytes gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

