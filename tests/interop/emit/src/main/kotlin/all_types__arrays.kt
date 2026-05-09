package emit_kotlin

import specodec.*
import all_types_arrays.*
import java.io.File

fun runAllTypesArrays(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_ArrString, fm_ArrString) = testModelArrString(); passed += pm_ArrString; failed += fm_ArrString
    val (pm_ArrInt32, fm_ArrInt32) = testModelArrInt32(); passed += pm_ArrInt32; failed += fm_ArrInt32
    val (pm_ArrBoolean, fm_ArrBoolean) = testModelArrBoolean(); passed += pm_ArrBoolean; failed += fm_ArrBoolean
    val (pm_ArrFloat64, fm_ArrFloat64) = testModelArrFloat64(); passed += pm_ArrFloat64; failed += fm_ArrFloat64
    val (pm_ArrBytes, fm_ArrBytes) = testModelArrBytes(); passed += pm_ArrBytes; failed += fm_ArrBytes
    val (pm_ArrInt64, fm_ArrInt64) = testModelArrInt64(); passed += pm_ArrInt64; failed += fm_ArrInt64
    val (pm_ArrUint64, fm_ArrUint64) = testModelArrUint64(); passed += pm_ArrUint64; failed += fm_ArrUint64
    val (pm_MultiArr1, fm_MultiArr1) = testModelMultiArr1(); passed += pm_MultiArr1; failed += fm_MultiArr1
    val (pm_MultiArr2, fm_MultiArr2) = testModelMultiArr2(); passed += pm_MultiArr2; failed += fm_MultiArr2
    val (pm_MultiArr3, fm_MultiArr3) = testModelMultiArr3(); passed += pm_MultiArr3; failed += fm_MultiArr3
    val (pm_MultiArr4, fm_MultiArr4) = testModelMultiArr4(); passed += pm_MultiArr4; failed += fm_MultiArr4
    val (pm_MultiArr5, fm_MultiArr5) = testModelMultiArr5(); passed += pm_MultiArr5; failed += fm_MultiArr5
    val (pm_OptCombo1, fm_OptCombo1) = testModelOptCombo1(); passed += pm_OptCombo1; failed += fm_OptCombo1
    val (pm_OptCombo2, fm_OptCombo2) = testModelOptCombo2(); passed += pm_OptCombo2; failed += fm_OptCombo2
    val (pm_OptCombo3, fm_OptCombo3) = testModelOptCombo3(); passed += pm_OptCombo3; failed += fm_OptCombo3
    val (pm_OptCombo4, fm_OptCombo4) = testModelOptCombo4(); passed += pm_OptCombo4; failed += fm_OptCombo4
    val (pm_OptCombo5, fm_OptCombo5) = testModelOptCombo5(); passed += pm_OptCombo5; failed += fm_OptCombo5
    val (pm_OptCombo6, fm_OptCombo6) = testModelOptCombo6(); passed += pm_OptCombo6; failed += fm_OptCombo6
    val (pm_OptCombo7, fm_OptCombo7) = testModelOptCombo7(); passed += pm_OptCombo7; failed += fm_OptCombo7
    val (pm_OptCombo8, fm_OptCombo8) = testModelOptCombo8(); passed += pm_OptCombo8; failed += fm_OptCombo8
    val (pm_OptCombo9, fm_OptCombo9) = testModelOptCombo9(); passed += pm_OptCombo9; failed += fm_OptCombo9
    val (pm_OptCombo10, fm_OptCombo10) = testModelOptCombo10(); passed += pm_OptCombo10; failed += fm_OptCombo10

    return Pair(passed, failed)
}

fun testModelArrString(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ArrString.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ArrStringCodec.decode(r)
        val w = MsgPackWriter()
        ArrStringCodec.encode(w, obj)
        val out = File("${outDir}/ArrString.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrString mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrString.json").readBytes()
        val r = JsonReader(data)
        val obj = ArrStringCodec.decode(r)
        val w = JsonWriter()
        ArrStringCodec.encode(w, obj)
        val out = File("${outDir}/ArrString.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrString json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrString.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ArrStringCodec.decode(r)
        val w = JsonWriter()
        ArrStringCodec.encode(w, obj)
        val out = File("${outDir}/ArrString.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrString unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrString.gron").readBytes()
        val r = GronReader(data)
        val obj = ArrStringCodec.decode(r)
        val w = GronWriter()
        ArrStringCodec.encode(w, obj)
        val out = File("${outDir}/ArrString.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrString gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelArrInt32(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ArrInt32.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ArrInt32Codec.decode(r)
        val w = MsgPackWriter()
        ArrInt32Codec.encode(w, obj)
        val out = File("${outDir}/ArrInt32.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrInt32 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrInt32.json").readBytes()
        val r = JsonReader(data)
        val obj = ArrInt32Codec.decode(r)
        val w = JsonWriter()
        ArrInt32Codec.encode(w, obj)
        val out = File("${outDir}/ArrInt32.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrInt32 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrInt32.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ArrInt32Codec.decode(r)
        val w = JsonWriter()
        ArrInt32Codec.encode(w, obj)
        val out = File("${outDir}/ArrInt32.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrInt32 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrInt32.gron").readBytes()
        val r = GronReader(data)
        val obj = ArrInt32Codec.decode(r)
        val w = GronWriter()
        ArrInt32Codec.encode(w, obj)
        val out = File("${outDir}/ArrInt32.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrInt32 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelArrBoolean(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ArrBoolean.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ArrBooleanCodec.decode(r)
        val w = MsgPackWriter()
        ArrBooleanCodec.encode(w, obj)
        val out = File("${outDir}/ArrBoolean.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrBoolean mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrBoolean.json").readBytes()
        val r = JsonReader(data)
        val obj = ArrBooleanCodec.decode(r)
        val w = JsonWriter()
        ArrBooleanCodec.encode(w, obj)
        val out = File("${outDir}/ArrBoolean.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrBoolean json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrBoolean.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ArrBooleanCodec.decode(r)
        val w = JsonWriter()
        ArrBooleanCodec.encode(w, obj)
        val out = File("${outDir}/ArrBoolean.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrBoolean unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrBoolean.gron").readBytes()
        val r = GronReader(data)
        val obj = ArrBooleanCodec.decode(r)
        val w = GronWriter()
        ArrBooleanCodec.encode(w, obj)
        val out = File("${outDir}/ArrBoolean.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrBoolean gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelArrFloat64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ArrFloat64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ArrFloat64Codec.decode(r)
        val w = MsgPackWriter()
        ArrFloat64Codec.encode(w, obj)
        val out = File("${outDir}/ArrFloat64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrFloat64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrFloat64.json").readBytes()
        val r = JsonReader(data)
        val obj = ArrFloat64Codec.decode(r)
        val w = JsonWriter()
        ArrFloat64Codec.encode(w, obj)
        val out = File("${outDir}/ArrFloat64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrFloat64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrFloat64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ArrFloat64Codec.decode(r)
        val w = JsonWriter()
        ArrFloat64Codec.encode(w, obj)
        val out = File("${outDir}/ArrFloat64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrFloat64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrFloat64.gron").readBytes()
        val r = GronReader(data)
        val obj = ArrFloat64Codec.decode(r)
        val w = GronWriter()
        ArrFloat64Codec.encode(w, obj)
        val out = File("${outDir}/ArrFloat64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrFloat64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelArrBytes(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ArrBytes.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ArrBytesCodec.decode(r)
        val w = MsgPackWriter()
        ArrBytesCodec.encode(w, obj)
        val out = File("${outDir}/ArrBytes.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrBytes mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrBytes.json").readBytes()
        val r = JsonReader(data)
        val obj = ArrBytesCodec.decode(r)
        val w = JsonWriter()
        ArrBytesCodec.encode(w, obj)
        val out = File("${outDir}/ArrBytes.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrBytes json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrBytes.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ArrBytesCodec.decode(r)
        val w = JsonWriter()
        ArrBytesCodec.encode(w, obj)
        val out = File("${outDir}/ArrBytes.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrBytes unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrBytes.gron").readBytes()
        val r = GronReader(data)
        val obj = ArrBytesCodec.decode(r)
        val w = GronWriter()
        ArrBytesCodec.encode(w, obj)
        val out = File("${outDir}/ArrBytes.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrBytes gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelArrInt64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ArrInt64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ArrInt64Codec.decode(r)
        val w = MsgPackWriter()
        ArrInt64Codec.encode(w, obj)
        val out = File("${outDir}/ArrInt64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrInt64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrInt64.json").readBytes()
        val r = JsonReader(data)
        val obj = ArrInt64Codec.decode(r)
        val w = JsonWriter()
        ArrInt64Codec.encode(w, obj)
        val out = File("${outDir}/ArrInt64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrInt64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrInt64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ArrInt64Codec.decode(r)
        val w = JsonWriter()
        ArrInt64Codec.encode(w, obj)
        val out = File("${outDir}/ArrInt64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrInt64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrInt64.gron").readBytes()
        val r = GronReader(data)
        val obj = ArrInt64Codec.decode(r)
        val w = GronWriter()
        ArrInt64Codec.encode(w, obj)
        val out = File("${outDir}/ArrInt64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrInt64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelArrUint64(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ArrUint64.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ArrUint64Codec.decode(r)
        val w = MsgPackWriter()
        ArrUint64Codec.encode(w, obj)
        val out = File("${outDir}/ArrUint64.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrUint64 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrUint64.json").readBytes()
        val r = JsonReader(data)
        val obj = ArrUint64Codec.decode(r)
        val w = JsonWriter()
        ArrUint64Codec.encode(w, obj)
        val out = File("${outDir}/ArrUint64.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrUint64 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrUint64.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ArrUint64Codec.decode(r)
        val w = JsonWriter()
        ArrUint64Codec.encode(w, obj)
        val out = File("${outDir}/ArrUint64.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrUint64 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ArrUint64.gron").readBytes()
        val r = GronReader(data)
        val obj = ArrUint64Codec.decode(r)
        val w = GronWriter()
        ArrUint64Codec.encode(w, obj)
        val out = File("${outDir}/ArrUint64.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ArrUint64 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMultiArr1(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/MultiArr1.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = MultiArr1Codec.decode(r)
        val w = MsgPackWriter()
        MultiArr1Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr1.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr1 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr1.json").readBytes()
        val r = JsonReader(data)
        val obj = MultiArr1Codec.decode(r)
        val w = JsonWriter()
        MultiArr1Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr1.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr1 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr1.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = MultiArr1Codec.decode(r)
        val w = JsonWriter()
        MultiArr1Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr1.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr1 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr1.gron").readBytes()
        val r = GronReader(data)
        val obj = MultiArr1Codec.decode(r)
        val w = GronWriter()
        MultiArr1Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr1.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr1 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMultiArr2(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/MultiArr2.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = MultiArr2Codec.decode(r)
        val w = MsgPackWriter()
        MultiArr2Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr2.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr2 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr2.json").readBytes()
        val r = JsonReader(data)
        val obj = MultiArr2Codec.decode(r)
        val w = JsonWriter()
        MultiArr2Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr2.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr2 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr2.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = MultiArr2Codec.decode(r)
        val w = JsonWriter()
        MultiArr2Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr2.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr2 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr2.gron").readBytes()
        val r = GronReader(data)
        val obj = MultiArr2Codec.decode(r)
        val w = GronWriter()
        MultiArr2Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr2.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr2 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMultiArr3(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/MultiArr3.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = MultiArr3Codec.decode(r)
        val w = MsgPackWriter()
        MultiArr3Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr3.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr3 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr3.json").readBytes()
        val r = JsonReader(data)
        val obj = MultiArr3Codec.decode(r)
        val w = JsonWriter()
        MultiArr3Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr3.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr3 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr3.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = MultiArr3Codec.decode(r)
        val w = JsonWriter()
        MultiArr3Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr3.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr3 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr3.gron").readBytes()
        val r = GronReader(data)
        val obj = MultiArr3Codec.decode(r)
        val w = GronWriter()
        MultiArr3Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr3.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr3 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMultiArr4(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/MultiArr4.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = MultiArr4Codec.decode(r)
        val w = MsgPackWriter()
        MultiArr4Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr4.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr4 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr4.json").readBytes()
        val r = JsonReader(data)
        val obj = MultiArr4Codec.decode(r)
        val w = JsonWriter()
        MultiArr4Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr4.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr4 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr4.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = MultiArr4Codec.decode(r)
        val w = JsonWriter()
        MultiArr4Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr4.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr4 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr4.gron").readBytes()
        val r = GronReader(data)
        val obj = MultiArr4Codec.decode(r)
        val w = GronWriter()
        MultiArr4Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr4.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr4 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMultiArr5(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/MultiArr5.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = MultiArr5Codec.decode(r)
        val w = MsgPackWriter()
        MultiArr5Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr5.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr5 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr5.json").readBytes()
        val r = JsonReader(data)
        val obj = MultiArr5Codec.decode(r)
        val w = JsonWriter()
        MultiArr5Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr5.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr5 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr5.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = MultiArr5Codec.decode(r)
        val w = JsonWriter()
        MultiArr5Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr5.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr5 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MultiArr5.gron").readBytes()
        val r = GronReader(data)
        val obj = MultiArr5Codec.decode(r)
        val w = GronWriter()
        MultiArr5Codec.encode(w, obj)
        val out = File("${outDir}/MultiArr5.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MultiArr5 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptCombo1(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptCombo1.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptCombo1Codec.decode(r)
        val w = MsgPackWriter()
        OptCombo1Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo1.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo1 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo1.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo1Codec.decode(r)
        val w = JsonWriter()
        OptCombo1Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo1.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo1 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo1.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo1Codec.decode(r)
        val w = JsonWriter()
        OptCombo1Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo1.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo1 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo1.gron").readBytes()
        val r = GronReader(data)
        val obj = OptCombo1Codec.decode(r)
        val w = GronWriter()
        OptCombo1Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo1.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo1 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptCombo2(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptCombo2.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptCombo2Codec.decode(r)
        val w = MsgPackWriter()
        OptCombo2Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo2.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo2 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo2.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo2Codec.decode(r)
        val w = JsonWriter()
        OptCombo2Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo2.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo2 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo2.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo2Codec.decode(r)
        val w = JsonWriter()
        OptCombo2Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo2.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo2 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo2.gron").readBytes()
        val r = GronReader(data)
        val obj = OptCombo2Codec.decode(r)
        val w = GronWriter()
        OptCombo2Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo2.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo2 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptCombo3(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptCombo3.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptCombo3Codec.decode(r)
        val w = MsgPackWriter()
        OptCombo3Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo3.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo3 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo3.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo3Codec.decode(r)
        val w = JsonWriter()
        OptCombo3Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo3.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo3 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo3.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo3Codec.decode(r)
        val w = JsonWriter()
        OptCombo3Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo3.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo3 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo3.gron").readBytes()
        val r = GronReader(data)
        val obj = OptCombo3Codec.decode(r)
        val w = GronWriter()
        OptCombo3Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo3.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo3 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptCombo4(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptCombo4.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptCombo4Codec.decode(r)
        val w = MsgPackWriter()
        OptCombo4Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo4.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo4 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo4.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo4Codec.decode(r)
        val w = JsonWriter()
        OptCombo4Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo4.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo4 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo4.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo4Codec.decode(r)
        val w = JsonWriter()
        OptCombo4Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo4.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo4 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo4.gron").readBytes()
        val r = GronReader(data)
        val obj = OptCombo4Codec.decode(r)
        val w = GronWriter()
        OptCombo4Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo4.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo4 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptCombo5(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptCombo5.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptCombo5Codec.decode(r)
        val w = MsgPackWriter()
        OptCombo5Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo5.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo5 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo5.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo5Codec.decode(r)
        val w = JsonWriter()
        OptCombo5Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo5.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo5 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo5.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo5Codec.decode(r)
        val w = JsonWriter()
        OptCombo5Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo5.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo5 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo5.gron").readBytes()
        val r = GronReader(data)
        val obj = OptCombo5Codec.decode(r)
        val w = GronWriter()
        OptCombo5Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo5.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo5 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptCombo6(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptCombo6.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptCombo6Codec.decode(r)
        val w = MsgPackWriter()
        OptCombo6Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo6.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo6 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo6.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo6Codec.decode(r)
        val w = JsonWriter()
        OptCombo6Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo6.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo6 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo6.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo6Codec.decode(r)
        val w = JsonWriter()
        OptCombo6Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo6.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo6 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo6.gron").readBytes()
        val r = GronReader(data)
        val obj = OptCombo6Codec.decode(r)
        val w = GronWriter()
        OptCombo6Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo6.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo6 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptCombo7(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptCombo7.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptCombo7Codec.decode(r)
        val w = MsgPackWriter()
        OptCombo7Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo7.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo7 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo7.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo7Codec.decode(r)
        val w = JsonWriter()
        OptCombo7Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo7.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo7 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo7.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo7Codec.decode(r)
        val w = JsonWriter()
        OptCombo7Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo7.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo7 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo7.gron").readBytes()
        val r = GronReader(data)
        val obj = OptCombo7Codec.decode(r)
        val w = GronWriter()
        OptCombo7Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo7.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo7 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptCombo8(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptCombo8.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptCombo8Codec.decode(r)
        val w = MsgPackWriter()
        OptCombo8Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo8.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo8 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo8.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo8Codec.decode(r)
        val w = JsonWriter()
        OptCombo8Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo8.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo8 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo8.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo8Codec.decode(r)
        val w = JsonWriter()
        OptCombo8Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo8.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo8 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo8.gron").readBytes()
        val r = GronReader(data)
        val obj = OptCombo8Codec.decode(r)
        val w = GronWriter()
        OptCombo8Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo8.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo8 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptCombo9(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptCombo9.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptCombo9Codec.decode(r)
        val w = MsgPackWriter()
        OptCombo9Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo9.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo9 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo9.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo9Codec.decode(r)
        val w = JsonWriter()
        OptCombo9Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo9.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo9 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo9.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo9Codec.decode(r)
        val w = JsonWriter()
        OptCombo9Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo9.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo9 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo9.gron").readBytes()
        val r = GronReader(data)
        val obj = OptCombo9Codec.decode(r)
        val w = GronWriter()
        OptCombo9Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo9.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo9 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptCombo10(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptCombo10.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptCombo10Codec.decode(r)
        val w = MsgPackWriter()
        OptCombo10Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo10.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo10 mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo10.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo10Codec.decode(r)
        val w = JsonWriter()
        OptCombo10Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo10.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo10 json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo10.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptCombo10Codec.decode(r)
        val w = JsonWriter()
        OptCombo10Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo10.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo10 unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptCombo10.gron").readBytes()
        val r = GronReader(data)
        val obj = OptCombo10Codec.decode(r)
        val w = GronWriter()
        OptCombo10Codec.encode(w, obj)
        val out = File("${outDir}/OptCombo10.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptCombo10 gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

