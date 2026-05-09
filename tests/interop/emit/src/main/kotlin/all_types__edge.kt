package emit_kotlin

import specodec.*
import all_types_edge.*
import java.io.File

fun runAllTypesEdge(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_EdgeEmpty, fm_EdgeEmpty) = testModelEdgeEmpty(); passed += pm_EdgeEmpty; failed += fm_EdgeEmpty
    val (pm_EdgeOneOpt, fm_EdgeOneOpt) = testModelEdgeOneOpt(); passed += pm_EdgeOneOpt; failed += fm_EdgeOneOpt
    val (pm_EdgeBigNums, fm_EdgeBigNums) = testModelEdgeBigNums(); passed += pm_EdgeBigNums; failed += fm_EdgeBigNums
    val (pm_EdgeZeroVals, fm_EdgeZeroVals) = testModelEdgeZeroVals(); passed += pm_EdgeZeroVals; failed += fm_EdgeZeroVals
    val (pm_EdgeNullable, fm_EdgeNullable) = testModelEdgeNullable(); passed += pm_EdgeNullable; failed += fm_EdgeNullable
    val (pm_EdgeNegZero, fm_EdgeNegZero) = testModelEdgeNegZero(); passed += pm_EdgeNegZero; failed += fm_EdgeNegZero
    val (pm_EdgeNullByte, fm_EdgeNullByte) = testModelEdgeNullByte(); passed += pm_EdgeNullByte; failed += fm_EdgeNullByte
    val (pm_EdgeBoundary, fm_EdgeBoundary) = testModelEdgeBoundary(); passed += pm_EdgeBoundary; failed += fm_EdgeBoundary
    val (pm_EdgeStrLen, fm_EdgeStrLen) = testModelEdgeStrLen(); passed += pm_EdgeStrLen; failed += fm_EdgeStrLen
    val (pm_EdgeBytesLen, fm_EdgeBytesLen) = testModelEdgeBytesLen(); passed += pm_EdgeBytesLen; failed += fm_EdgeBytesLen
    val (pm_EdgeArrEmpty, fm_EdgeArrEmpty) = testModelEdgeArrEmpty(); passed += pm_EdgeArrEmpty; failed += fm_EdgeArrEmpty
    val (pm_EdgeArrBoundary, fm_EdgeArrBoundary) = testModelEdgeArrBoundary(); passed += pm_EdgeArrBoundary; failed += fm_EdgeArrBoundary

    return Pair(passed, failed)
}

fun testModelEdgeEmpty(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EdgeEmpty.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EdgeEmptyCodec.decode(r)
        val w = MsgPackWriter()
        EdgeEmptyCodec.encode(w, obj)
        val out = File("${outDir}/EdgeEmpty.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeEmpty mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeEmpty.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeEmptyCodec.decode(r)
        val w = JsonWriter()
        EdgeEmptyCodec.encode(w, obj)
        val out = File("${outDir}/EdgeEmpty.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeEmpty json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeEmpty.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeEmptyCodec.decode(r)
        val w = JsonWriter()
        EdgeEmptyCodec.encode(w, obj)
        val out = File("${outDir}/EdgeEmpty.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeEmpty unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeEmpty.gron").readBytes()
        val r = GronReader(data)
        val obj = EdgeEmptyCodec.decode(r)
        val w = GronWriter()
        EdgeEmptyCodec.encode(w, obj)
        val out = File("${outDir}/EdgeEmpty.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeEmpty gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelEdgeOneOpt(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EdgeOneOpt.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EdgeOneOptCodec.decode(r)
        val w = MsgPackWriter()
        EdgeOneOptCodec.encode(w, obj)
        val out = File("${outDir}/EdgeOneOpt.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeOneOpt mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeOneOpt.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeOneOptCodec.decode(r)
        val w = JsonWriter()
        EdgeOneOptCodec.encode(w, obj)
        val out = File("${outDir}/EdgeOneOpt.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeOneOpt json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeOneOpt.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeOneOptCodec.decode(r)
        val w = JsonWriter()
        EdgeOneOptCodec.encode(w, obj)
        val out = File("${outDir}/EdgeOneOpt.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeOneOpt unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeOneOpt.gron").readBytes()
        val r = GronReader(data)
        val obj = EdgeOneOptCodec.decode(r)
        val w = GronWriter()
        EdgeOneOptCodec.encode(w, obj)
        val out = File("${outDir}/EdgeOneOpt.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeOneOpt gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelEdgeBigNums(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EdgeBigNums.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EdgeBigNumsCodec.decode(r)
        val w = MsgPackWriter()
        EdgeBigNumsCodec.encode(w, obj)
        val out = File("${outDir}/EdgeBigNums.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeBigNums mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeBigNums.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeBigNumsCodec.decode(r)
        val w = JsonWriter()
        EdgeBigNumsCodec.encode(w, obj)
        val out = File("${outDir}/EdgeBigNums.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeBigNums json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeBigNums.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeBigNumsCodec.decode(r)
        val w = JsonWriter()
        EdgeBigNumsCodec.encode(w, obj)
        val out = File("${outDir}/EdgeBigNums.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeBigNums unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeBigNums.gron").readBytes()
        val r = GronReader(data)
        val obj = EdgeBigNumsCodec.decode(r)
        val w = GronWriter()
        EdgeBigNumsCodec.encode(w, obj)
        val out = File("${outDir}/EdgeBigNums.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeBigNums gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelEdgeZeroVals(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EdgeZeroVals.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EdgeZeroValsCodec.decode(r)
        val w = MsgPackWriter()
        EdgeZeroValsCodec.encode(w, obj)
        val out = File("${outDir}/EdgeZeroVals.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeZeroVals mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeZeroVals.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeZeroValsCodec.decode(r)
        val w = JsonWriter()
        EdgeZeroValsCodec.encode(w, obj)
        val out = File("${outDir}/EdgeZeroVals.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeZeroVals json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeZeroVals.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeZeroValsCodec.decode(r)
        val w = JsonWriter()
        EdgeZeroValsCodec.encode(w, obj)
        val out = File("${outDir}/EdgeZeroVals.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeZeroVals unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeZeroVals.gron").readBytes()
        val r = GronReader(data)
        val obj = EdgeZeroValsCodec.decode(r)
        val w = GronWriter()
        EdgeZeroValsCodec.encode(w, obj)
        val out = File("${outDir}/EdgeZeroVals.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeZeroVals gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelEdgeNullable(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EdgeNullable.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EdgeNullableCodec.decode(r)
        val w = MsgPackWriter()
        EdgeNullableCodec.encode(w, obj)
        val out = File("${outDir}/EdgeNullable.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeNullable mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeNullable.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeNullableCodec.decode(r)
        val w = JsonWriter()
        EdgeNullableCodec.encode(w, obj)
        val out = File("${outDir}/EdgeNullable.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeNullable json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeNullable.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeNullableCodec.decode(r)
        val w = JsonWriter()
        EdgeNullableCodec.encode(w, obj)
        val out = File("${outDir}/EdgeNullable.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeNullable unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeNullable.gron").readBytes()
        val r = GronReader(data)
        val obj = EdgeNullableCodec.decode(r)
        val w = GronWriter()
        EdgeNullableCodec.encode(w, obj)
        val out = File("${outDir}/EdgeNullable.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeNullable gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelEdgeNegZero(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EdgeNegZero.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EdgeNegZeroCodec.decode(r)
        val w = MsgPackWriter()
        EdgeNegZeroCodec.encode(w, obj)
        val out = File("${outDir}/EdgeNegZero.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeNegZero mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeNegZero.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeNegZeroCodec.decode(r)
        val w = JsonWriter()
        EdgeNegZeroCodec.encode(w, obj)
        val out = File("${outDir}/EdgeNegZero.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeNegZero json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeNegZero.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeNegZeroCodec.decode(r)
        val w = JsonWriter()
        EdgeNegZeroCodec.encode(w, obj)
        val out = File("${outDir}/EdgeNegZero.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeNegZero unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeNegZero.gron").readBytes()
        val r = GronReader(data)
        val obj = EdgeNegZeroCodec.decode(r)
        val w = GronWriter()
        EdgeNegZeroCodec.encode(w, obj)
        val out = File("${outDir}/EdgeNegZero.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeNegZero gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelEdgeNullByte(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EdgeNullByte.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EdgeNullByteCodec.decode(r)
        val w = MsgPackWriter()
        EdgeNullByteCodec.encode(w, obj)
        val out = File("${outDir}/EdgeNullByte.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeNullByte mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeNullByte.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeNullByteCodec.decode(r)
        val w = JsonWriter()
        EdgeNullByteCodec.encode(w, obj)
        val out = File("${outDir}/EdgeNullByte.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeNullByte json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeNullByte.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeNullByteCodec.decode(r)
        val w = JsonWriter()
        EdgeNullByteCodec.encode(w, obj)
        val out = File("${outDir}/EdgeNullByte.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeNullByte unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeNullByte.gron").readBytes()
        val r = GronReader(data)
        val obj = EdgeNullByteCodec.decode(r)
        val w = GronWriter()
        EdgeNullByteCodec.encode(w, obj)
        val out = File("${outDir}/EdgeNullByte.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeNullByte gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelEdgeBoundary(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EdgeBoundary.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EdgeBoundaryCodec.decode(r)
        val w = MsgPackWriter()
        EdgeBoundaryCodec.encode(w, obj)
        val out = File("${outDir}/EdgeBoundary.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeBoundary mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeBoundary.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeBoundaryCodec.decode(r)
        val w = JsonWriter()
        EdgeBoundaryCodec.encode(w, obj)
        val out = File("${outDir}/EdgeBoundary.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeBoundary json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeBoundary.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeBoundaryCodec.decode(r)
        val w = JsonWriter()
        EdgeBoundaryCodec.encode(w, obj)
        val out = File("${outDir}/EdgeBoundary.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeBoundary unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeBoundary.gron").readBytes()
        val r = GronReader(data)
        val obj = EdgeBoundaryCodec.decode(r)
        val w = GronWriter()
        EdgeBoundaryCodec.encode(w, obj)
        val out = File("${outDir}/EdgeBoundary.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeBoundary gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelEdgeStrLen(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EdgeStrLen.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EdgeStrLenCodec.decode(r)
        val w = MsgPackWriter()
        EdgeStrLenCodec.encode(w, obj)
        val out = File("${outDir}/EdgeStrLen.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeStrLen mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeStrLen.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeStrLenCodec.decode(r)
        val w = JsonWriter()
        EdgeStrLenCodec.encode(w, obj)
        val out = File("${outDir}/EdgeStrLen.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeStrLen json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeStrLen.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeStrLenCodec.decode(r)
        val w = JsonWriter()
        EdgeStrLenCodec.encode(w, obj)
        val out = File("${outDir}/EdgeStrLen.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeStrLen unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeStrLen.gron").readBytes()
        val r = GronReader(data)
        val obj = EdgeStrLenCodec.decode(r)
        val w = GronWriter()
        EdgeStrLenCodec.encode(w, obj)
        val out = File("${outDir}/EdgeStrLen.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeStrLen gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelEdgeBytesLen(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EdgeBytesLen.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EdgeBytesLenCodec.decode(r)
        val w = MsgPackWriter()
        EdgeBytesLenCodec.encode(w, obj)
        val out = File("${outDir}/EdgeBytesLen.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeBytesLen mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeBytesLen.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeBytesLenCodec.decode(r)
        val w = JsonWriter()
        EdgeBytesLenCodec.encode(w, obj)
        val out = File("${outDir}/EdgeBytesLen.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeBytesLen json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeBytesLen.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeBytesLenCodec.decode(r)
        val w = JsonWriter()
        EdgeBytesLenCodec.encode(w, obj)
        val out = File("${outDir}/EdgeBytesLen.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeBytesLen unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeBytesLen.gron").readBytes()
        val r = GronReader(data)
        val obj = EdgeBytesLenCodec.decode(r)
        val w = GronWriter()
        EdgeBytesLenCodec.encode(w, obj)
        val out = File("${outDir}/EdgeBytesLen.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeBytesLen gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelEdgeArrEmpty(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EdgeArrEmpty.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EdgeArrEmptyCodec.decode(r)
        val w = MsgPackWriter()
        EdgeArrEmptyCodec.encode(w, obj)
        val out = File("${outDir}/EdgeArrEmpty.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeArrEmpty mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeArrEmpty.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeArrEmptyCodec.decode(r)
        val w = JsonWriter()
        EdgeArrEmptyCodec.encode(w, obj)
        val out = File("${outDir}/EdgeArrEmpty.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeArrEmpty json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeArrEmpty.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeArrEmptyCodec.decode(r)
        val w = JsonWriter()
        EdgeArrEmptyCodec.encode(w, obj)
        val out = File("${outDir}/EdgeArrEmpty.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeArrEmpty unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeArrEmpty.gron").readBytes()
        val r = GronReader(data)
        val obj = EdgeArrEmptyCodec.decode(r)
        val w = GronWriter()
        EdgeArrEmptyCodec.encode(w, obj)
        val out = File("${outDir}/EdgeArrEmpty.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeArrEmpty gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelEdgeArrBoundary(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/EdgeArrBoundary.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = EdgeArrBoundaryCodec.decode(r)
        val w = MsgPackWriter()
        EdgeArrBoundaryCodec.encode(w, obj)
        val out = File("${outDir}/EdgeArrBoundary.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeArrBoundary mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeArrBoundary.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeArrBoundaryCodec.decode(r)
        val w = JsonWriter()
        EdgeArrBoundaryCodec.encode(w, obj)
        val out = File("${outDir}/EdgeArrBoundary.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeArrBoundary json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeArrBoundary.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = EdgeArrBoundaryCodec.decode(r)
        val w = JsonWriter()
        EdgeArrBoundaryCodec.encode(w, obj)
        val out = File("${outDir}/EdgeArrBoundary.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeArrBoundary unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/EdgeArrBoundary.gron").readBytes()
        val r = GronReader(data)
        val obj = EdgeArrBoundaryCodec.decode(r)
        val w = GronWriter()
        EdgeArrBoundaryCodec.encode(w, obj)
        val out = File("${outDir}/EdgeArrBoundary.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL EdgeArrBoundary gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

