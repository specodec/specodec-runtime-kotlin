package emit_kotlin

import specodec.*
import all_types_opt.*
import java.io.File

fun runAllTypesOpt(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_OptSingleString, fm_OptSingleString) = testModelOptSingleString(); passed += pm_OptSingleString; failed += fm_OptSingleString
    val (pm_OptSingleBoolean, fm_OptSingleBoolean) = testModelOptSingleBoolean(); passed += pm_OptSingleBoolean; failed += fm_OptSingleBoolean
    val (pm_OptSingleInt8, fm_OptSingleInt8) = testModelOptSingleInt8(); passed += pm_OptSingleInt8; failed += fm_OptSingleInt8
    val (pm_OptSingleInt16, fm_OptSingleInt16) = testModelOptSingleInt16(); passed += pm_OptSingleInt16; failed += fm_OptSingleInt16
    val (pm_OptSingleInt32, fm_OptSingleInt32) = testModelOptSingleInt32(); passed += pm_OptSingleInt32; failed += fm_OptSingleInt32
    val (pm_OptSingleInt64, fm_OptSingleInt64) = testModelOptSingleInt64(); passed += pm_OptSingleInt64; failed += fm_OptSingleInt64
    val (pm_OptSingleUint8, fm_OptSingleUint8) = testModelOptSingleUint8(); passed += pm_OptSingleUint8; failed += fm_OptSingleUint8
    val (pm_OptSingleUint16, fm_OptSingleUint16) = testModelOptSingleUint16(); passed += pm_OptSingleUint16; failed += fm_OptSingleUint16
    val (pm_OptSingleUint32, fm_OptSingleUint32) = testModelOptSingleUint32(); passed += pm_OptSingleUint32; failed += fm_OptSingleUint32
    val (pm_OptSingleUint64, fm_OptSingleUint64) = testModelOptSingleUint64(); passed += pm_OptSingleUint64; failed += fm_OptSingleUint64
    val (pm_OptSingleFloat32, fm_OptSingleFloat32) = testModelOptSingleFloat32(); passed += pm_OptSingleFloat32; failed += fm_OptSingleFloat32
    val (pm_OptSingleFloat64, fm_OptSingleFloat64) = testModelOptSingleFloat64(); passed += pm_OptSingleFloat64; failed += fm_OptSingleFloat64
    val (pm_OptSingleBytes, fm_OptSingleBytes) = testModelOptSingleBytes(); passed += pm_OptSingleBytes; failed += fm_OptSingleBytes

    return Pair(passed, failed)
}

fun testModelOptSingleString(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptSingleString.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptSingleStringCodec.decode(r)
        val w = MsgPackWriter()
        OptSingleStringCodec.encode(w, obj)
        val out = File("${outDir}/OptSingleString.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleString mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleString.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleStringCodec.decode(r)
        val w = JsonWriter()
        OptSingleStringCodec.encode(w, obj)
        val out = File("${outDir}/OptSingleString.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleString json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleString.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleStringCodec.decode(r)
        val w = JsonWriter()
        OptSingleStringCodec.encode(w, obj)
        val out = File("${outDir}/OptSingleString.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleString unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleString.gron").readBytes()
        val r = GronReader(data)
        val obj = OptSingleStringCodec.decode(r)
        val w = GronWriter()
        OptSingleStringCodec.encode(w, obj)
        val out = File("${outDir}/OptSingleString.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleString gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptSingleBoolean(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptSingleBoolean.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptSingleBooleanCodec.decode(r)
        val w = MsgPackWriter()
        OptSingleBooleanCodec.encode(w, obj)
        val out = File("${outDir}/OptSingleBoolean.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleBoolean mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleBoolean.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleBooleanCodec.decode(r)
        val w = JsonWriter()
        OptSingleBooleanCodec.encode(w, obj)
        val out = File("${outDir}/OptSingleBoolean.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleBoolean json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleBoolean.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleBooleanCodec.decode(r)
        val w = JsonWriter()
        OptSingleBooleanCodec.encode(w, obj)
        val out = File("${outDir}/OptSingleBoolean.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleBoolean unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleBoolean.gron").readBytes()
        val r = GronReader(data)
        val obj = OptSingleBooleanCodec.decode(r)
        val w = GronWriter()
        OptSingleBooleanCodec.encode(w, obj)
        val out = File("${outDir}/OptSingleBoolean.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleBoolean gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptSingleInt8(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptSingleInt8.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptSingleInt8Codec.decode(r)
        val w = MsgPackWriter()
        OptSingleInt8Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt8.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt8 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleInt8.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleInt8Codec.decode(r)
        val w = JsonWriter()
        OptSingleInt8Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt8.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt8 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleInt8.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleInt8Codec.decode(r)
        val w = JsonWriter()
        OptSingleInt8Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt8.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt8 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleInt8.gron").readBytes()
        val r = GronReader(data)
        val obj = OptSingleInt8Codec.decode(r)
        val w = GronWriter()
        OptSingleInt8Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt8.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt8 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptSingleInt16(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptSingleInt16.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptSingleInt16Codec.decode(r)
        val w = MsgPackWriter()
        OptSingleInt16Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt16.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt16 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleInt16.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleInt16Codec.decode(r)
        val w = JsonWriter()
        OptSingleInt16Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt16.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt16 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleInt16.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleInt16Codec.decode(r)
        val w = JsonWriter()
        OptSingleInt16Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt16.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt16 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleInt16.gron").readBytes()
        val r = GronReader(data)
        val obj = OptSingleInt16Codec.decode(r)
        val w = GronWriter()
        OptSingleInt16Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt16.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt16 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptSingleInt32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptSingleInt32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptSingleInt32Codec.decode(r)
        val w = MsgPackWriter()
        OptSingleInt32Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleInt32.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleInt32Codec.decode(r)
        val w = JsonWriter()
        OptSingleInt32Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleInt32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleInt32Codec.decode(r)
        val w = JsonWriter()
        OptSingleInt32Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleInt32.gron").readBytes()
        val r = GronReader(data)
        val obj = OptSingleInt32Codec.decode(r)
        val w = GronWriter()
        OptSingleInt32Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptSingleInt64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptSingleInt64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptSingleInt64Codec.decode(r)
        val w = MsgPackWriter()
        OptSingleInt64Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleInt64.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleInt64Codec.decode(r)
        val w = JsonWriter()
        OptSingleInt64Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleInt64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleInt64Codec.decode(r)
        val w = JsonWriter()
        OptSingleInt64Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleInt64.gron").readBytes()
        val r = GronReader(data)
        val obj = OptSingleInt64Codec.decode(r)
        val w = GronWriter()
        OptSingleInt64Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleInt64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleInt64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptSingleUint8(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptSingleUint8.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptSingleUint8Codec.decode(r)
        val w = MsgPackWriter()
        OptSingleUint8Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint8.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint8 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleUint8.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleUint8Codec.decode(r)
        val w = JsonWriter()
        OptSingleUint8Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint8.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint8 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleUint8.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleUint8Codec.decode(r)
        val w = JsonWriter()
        OptSingleUint8Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint8.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint8 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleUint8.gron").readBytes()
        val r = GronReader(data)
        val obj = OptSingleUint8Codec.decode(r)
        val w = GronWriter()
        OptSingleUint8Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint8.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint8 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptSingleUint16(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptSingleUint16.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptSingleUint16Codec.decode(r)
        val w = MsgPackWriter()
        OptSingleUint16Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint16.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint16 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleUint16.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleUint16Codec.decode(r)
        val w = JsonWriter()
        OptSingleUint16Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint16.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint16 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleUint16.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleUint16Codec.decode(r)
        val w = JsonWriter()
        OptSingleUint16Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint16.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint16 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleUint16.gron").readBytes()
        val r = GronReader(data)
        val obj = OptSingleUint16Codec.decode(r)
        val w = GronWriter()
        OptSingleUint16Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint16.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint16 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptSingleUint32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptSingleUint32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptSingleUint32Codec.decode(r)
        val w = MsgPackWriter()
        OptSingleUint32Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleUint32.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleUint32Codec.decode(r)
        val w = JsonWriter()
        OptSingleUint32Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleUint32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleUint32Codec.decode(r)
        val w = JsonWriter()
        OptSingleUint32Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleUint32.gron").readBytes()
        val r = GronReader(data)
        val obj = OptSingleUint32Codec.decode(r)
        val w = GronWriter()
        OptSingleUint32Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptSingleUint64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptSingleUint64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptSingleUint64Codec.decode(r)
        val w = MsgPackWriter()
        OptSingleUint64Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleUint64.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleUint64Codec.decode(r)
        val w = JsonWriter()
        OptSingleUint64Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleUint64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleUint64Codec.decode(r)
        val w = JsonWriter()
        OptSingleUint64Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleUint64.gron").readBytes()
        val r = GronReader(data)
        val obj = OptSingleUint64Codec.decode(r)
        val w = GronWriter()
        OptSingleUint64Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleUint64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleUint64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptSingleFloat32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptSingleFloat32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptSingleFloat32Codec.decode(r)
        val w = MsgPackWriter()
        OptSingleFloat32Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleFloat32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleFloat32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleFloat32.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleFloat32Codec.decode(r)
        val w = JsonWriter()
        OptSingleFloat32Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleFloat32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleFloat32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleFloat32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleFloat32Codec.decode(r)
        val w = JsonWriter()
        OptSingleFloat32Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleFloat32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleFloat32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleFloat32.gron").readBytes()
        val r = GronReader(data)
        val obj = OptSingleFloat32Codec.decode(r)
        val w = GronWriter()
        OptSingleFloat32Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleFloat32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleFloat32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptSingleFloat64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptSingleFloat64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptSingleFloat64Codec.decode(r)
        val w = MsgPackWriter()
        OptSingleFloat64Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleFloat64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleFloat64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleFloat64.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleFloat64Codec.decode(r)
        val w = JsonWriter()
        OptSingleFloat64Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleFloat64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleFloat64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleFloat64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleFloat64Codec.decode(r)
        val w = JsonWriter()
        OptSingleFloat64Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleFloat64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleFloat64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleFloat64.gron").readBytes()
        val r = GronReader(data)
        val obj = OptSingleFloat64Codec.decode(r)
        val w = GronWriter()
        OptSingleFloat64Codec.encode(w, obj)
        val out = File("${outDir}/OptSingleFloat64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleFloat64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptSingleBytes(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptSingleBytes.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptSingleBytesCodec.decode(r)
        val w = MsgPackWriter()
        OptSingleBytesCodec.encode(w, obj)
        val out = File("${outDir}/OptSingleBytes.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleBytes mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleBytes.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleBytesCodec.decode(r)
        val w = JsonWriter()
        OptSingleBytesCodec.encode(w, obj)
        val out = File("${outDir}/OptSingleBytes.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleBytes json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleBytes.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptSingleBytesCodec.decode(r)
        val w = JsonWriter()
        OptSingleBytesCodec.encode(w, obj)
        val out = File("${outDir}/OptSingleBytes.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleBytes unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptSingleBytes.gron").readBytes()
        val r = GronReader(data)
        val obj = OptSingleBytesCodec.decode(r)
        val w = GronWriter()
        OptSingleBytesCodec.encode(w, obj)
        val out = File("${outDir}/OptSingleBytes.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptSingleBytes gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

