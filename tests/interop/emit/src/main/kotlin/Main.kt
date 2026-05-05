package emit_kotlin

import specodec.*
import all_types.*
import java.io.File

val vecDir = System.getenv("VEC_DIR") ?: error("VEC_DIR not set")
val outDir = System.getenv("OUT_DIR") ?: error("OUT_DIR not set")

fun testScalarInt8_min(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/int8_min.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readInt32()
        val w = MsgPackWriter()
        w.writeInt32(value)
        val out = File("${outDir}/scalars/int8_min.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL int8_min mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarInt8_max(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/int8_max.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readInt32()
        val w = MsgPackWriter()
        w.writeInt32(value)
        val out = File("${outDir}/scalars/int8_max.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL int8_max mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarInt16_min(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/int16_min.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readInt32()
        val w = MsgPackWriter()
        w.writeInt32(value)
        val out = File("${outDir}/scalars/int16_min.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL int16_min mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarInt16_max(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/int16_max.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readInt32()
        val w = MsgPackWriter()
        w.writeInt32(value)
        val out = File("${outDir}/scalars/int16_max.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL int16_max mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarInt32_min(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/int32_min.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readInt32()
        val w = MsgPackWriter()
        w.writeInt32(value)
        val out = File("${outDir}/scalars/int32_min.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL int32_min mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarInt32_max(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/int32_max.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readInt32()
        val w = MsgPackWriter()
        w.writeInt32(value)
        val out = File("${outDir}/scalars/int32_max.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL int32_max mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarInt64_min(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/int64_min.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readInt64()
        val w = MsgPackWriter()
        w.writeInt64(value)
        val out = File("${outDir}/scalars/int64_min.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL int64_min mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarInt64_max(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/int64_max.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readInt64()
        val w = MsgPackWriter()
        w.writeInt64(value)
        val out = File("${outDir}/scalars/int64_max.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL int64_max mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarUint8_max(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/uint8_max.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readUint32()
        val w = MsgPackWriter()
        w.writeUint32(value)
        val out = File("${outDir}/scalars/uint8_max.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL uint8_max mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarUint16_max(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/uint16_max.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readUint32()
        val w = MsgPackWriter()
        w.writeUint32(value)
        val out = File("${outDir}/scalars/uint16_max.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL uint16_max mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarUint32_max(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/uint32_max.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readUint32()
        val w = MsgPackWriter()
        w.writeUint32(value)
        val out = File("${outDir}/scalars/uint32_max.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL uint32_max mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarUint64_max(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/uint64_max.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readUint64()
        val w = MsgPackWriter()
        w.writeUint64(value)
        val out = File("${outDir}/scalars/uint64_max.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL uint64_max mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarFloat32_1_5(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/float32_1.5.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readFloat32()
        val w = MsgPackWriter()
        w.writeFloat32(value)
        val out = File("${outDir}/scalars/float32_1.5.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL float32_1.5 mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarFloat32_neg_zero(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/float32_neg_zero.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readFloat32()
        val w = MsgPackWriter()
        w.writeFloat32(value)
        val out = File("${outDir}/scalars/float32_neg_zero.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL float32_neg_zero mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarFloat32_inf(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/float32_inf.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readFloat32()
        val w = MsgPackWriter()
        w.writeFloat32(value)
        val out = File("${outDir}/scalars/float32_inf.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL float32_inf mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarFloat32_neg_inf(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/float32_neg_inf.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readFloat32()
        val w = MsgPackWriter()
        w.writeFloat32(value)
        val out = File("${outDir}/scalars/float32_neg_inf.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL float32_neg_inf mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarFloat32_nan(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/float32_nan.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readFloat32()
        val w = MsgPackWriter()
        w.writeFloat32(value)
        val out = File("${outDir}/scalars/float32_nan.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL float32_nan mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarFloat64_pi(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/float64_pi.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readFloat64()
        val w = MsgPackWriter()
        w.writeFloat64(value)
        val out = File("${outDir}/scalars/float64_pi.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL float64_pi mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarFloat64_neg_zero(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/float64_neg_zero.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readFloat64()
        val w = MsgPackWriter()
        w.writeFloat64(value)
        val out = File("${outDir}/scalars/float64_neg_zero.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL float64_neg_zero mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarFloat64_inf(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/float64_inf.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readFloat64()
        val w = MsgPackWriter()
        w.writeFloat64(value)
        val out = File("${outDir}/scalars/float64_inf.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL float64_inf mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarFloat64_neg_inf(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/float64_neg_inf.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readFloat64()
        val w = MsgPackWriter()
        w.writeFloat64(value)
        val out = File("${outDir}/scalars/float64_neg_inf.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL float64_neg_inf mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarFloat64_nan(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/float64_nan.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readFloat64()
        val w = MsgPackWriter()
        w.writeFloat64(value)
        val out = File("${outDir}/scalars/float64_nan.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL float64_nan mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarStr_empty(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/str_empty.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readString()
        val w = MsgPackWriter()
        w.writeString(value)
        val out = File("${outDir}/scalars/str_empty.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL str_empty mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarStr_ascii(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/str_ascii.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readString()
        val w = MsgPackWriter()
        w.writeString(value)
        val out = File("${outDir}/scalars/str_ascii.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL str_ascii mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarStr_null_byte(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/str_null_byte.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readString()
        val w = MsgPackWriter()
        w.writeString(value)
        val out = File("${outDir}/scalars/str_null_byte.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL str_null_byte mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarStr_escape(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/str_escape.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readString()
        val w = MsgPackWriter()
        w.writeString(value)
        val out = File("${outDir}/scalars/str_escape.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL str_escape mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarStr_unicode(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/str_unicode.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readString()
        val w = MsgPackWriter()
        w.writeString(value)
        val out = File("${outDir}/scalars/str_unicode.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL str_unicode mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarStr_31(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/str_31.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readString()
        val w = MsgPackWriter()
        w.writeString(value)
        val out = File("${outDir}/scalars/str_31.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL str_31 mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarStr_32(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/str_32.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readString()
        val w = MsgPackWriter()
        w.writeString(value)
        val out = File("${outDir}/scalars/str_32.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL str_32 mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarStr_255(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/str_255.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readString()
        val w = MsgPackWriter()
        w.writeString(value)
        val out = File("${outDir}/scalars/str_255.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL str_255 mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarStr_256(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/str_256.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readString()
        val w = MsgPackWriter()
        w.writeString(value)
        val out = File("${outDir}/scalars/str_256.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL str_256 mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarBytes_empty(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/bytes_empty.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readBytes()
        val w = MsgPackWriter()
        w.writeBytes(value)
        val out = File("${outDir}/scalars/bytes_empty.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL bytes_empty mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarBytes_small(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/bytes_small.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readBytes()
        val w = MsgPackWriter()
        w.writeBytes(value)
        val out = File("${outDir}/scalars/bytes_small.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL bytes_small mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarBytes_31(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/bytes_31.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readBytes()
        val w = MsgPackWriter()
        w.writeBytes(value)
        val out = File("${outDir}/scalars/bytes_31.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL bytes_31 mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarBytes_32(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/bytes_32.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readBytes()
        val w = MsgPackWriter()
        w.writeBytes(value)
        val out = File("${outDir}/scalars/bytes_32.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL bytes_32 mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarBytes_255(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/bytes_255.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readBytes()
        val w = MsgPackWriter()
        w.writeBytes(value)
        val out = File("${outDir}/scalars/bytes_255.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL bytes_255 mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarBytes_256(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/bytes_256.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readBytes()
        val w = MsgPackWriter()
        w.writeBytes(value)
        val out = File("${outDir}/scalars/bytes_256.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL bytes_256 mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarBytes_zeros(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/bytes_zeros.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readBytes()
        val w = MsgPackWriter()
        w.writeBytes(value)
        val out = File("${outDir}/scalars/bytes_zeros.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL bytes_zeros mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarBytes_ff(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/bytes_ff.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readBytes()
        val w = MsgPackWriter()
        w.writeBytes(value)
        val out = File("${outDir}/scalars/bytes_ff.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL bytes_ff mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarBool_true(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/bool_true.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readBool()
        val w = MsgPackWriter()
        w.writeBool(value)
        val out = File("${outDir}/scalars/bool_true.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL bool_true mp: ${e.message}")
        Pair(0, 1)
    }
}

fun testScalarBool_false(): Pair<Int, Int> {
    return try {
        val data = File("${vecDir}/scalars/bool_false.mp").readBytes()
        val r = MsgPackReader(data)
        val value = r.readBool()
        val w = MsgPackWriter()
        w.writeBool(value)
        val out = File("${outDir}/scalars/bool_false.mp")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        Pair(1, 0)
    } catch (e: Exception) {
        println("FAIL bool_false mp: ${e.message}")
        Pair(0, 1)
    }
}


fun testModelOptInner(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptInner.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptInnerCodec.decode(r)
        val w = MsgPackWriter()
        OptInnerCodec.encode(w, obj)
        val out = File("${outDir}/OptInner.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptInner mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptInner.json").readBytes()
        val r = JsonReader(data)
        val obj = OptInnerCodec.decode(r)
        val w = JsonWriter()
        OptInnerCodec.encode(w, obj)
        val out = File("${outDir}/OptInner.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptInner json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptInner.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptInnerCodec.decode(r)
        val w = JsonWriter()
        OptInnerCodec.encode(w, obj)
        val out = File("${outDir}/OptInner.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptInner unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptInner.gron").readBytes()
        val r = GronReader(data)
        val obj = OptInnerCodec.decode(r)
        val w = GronWriter()
        OptInnerCodec.encode(w, obj)
        val out = File("${outDir}/OptInner.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptInner gron: ${e.message}")
        failed++
    }
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

fun testModelRecList(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/RecList.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = RecListCodec.decode(r)
        val w = MsgPackWriter()
        RecListCodec.encode(w, obj)
        val out = File("${outDir}/RecList.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecList mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecList.json").readBytes()
        val r = JsonReader(data)
        val obj = RecListCodec.decode(r)
        val w = JsonWriter()
        RecListCodec.encode(w, obj)
        val out = File("${outDir}/RecList.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecList json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecList.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = RecListCodec.decode(r)
        val w = JsonWriter()
        RecListCodec.encode(w, obj)
        val out = File("${outDir}/RecList.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecList unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecList.gron").readBytes()
        val r = GronReader(data)
        val obj = RecListCodec.decode(r)
        val w = GronWriter()
        RecListCodec.encode(w, obj)
        val out = File("${outDir}/RecList.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecList gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelRecTree(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/RecTree.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = RecTreeCodec.decode(r)
        val w = MsgPackWriter()
        RecTreeCodec.encode(w, obj)
        val out = File("${outDir}/RecTree.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecTree mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecTree.json").readBytes()
        val r = JsonReader(data)
        val obj = RecTreeCodec.decode(r)
        val w = JsonWriter()
        RecTreeCodec.encode(w, obj)
        val out = File("${outDir}/RecTree.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecTree json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecTree.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = RecTreeCodec.decode(r)
        val w = JsonWriter()
        RecTreeCodec.encode(w, obj)
        val out = File("${outDir}/RecTree.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecTree unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecTree.gron").readBytes()
        val r = GronReader(data)
        val obj = RecTreeCodec.decode(r)
        val w = GronWriter()
        RecTreeCodec.encode(w, obj)
        val out = File("${outDir}/RecTree.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecTree gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelRecChain(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/RecChain.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = RecChainCodec.decode(r)
        val w = MsgPackWriter()
        RecChainCodec.encode(w, obj)
        val out = File("${outDir}/RecChain.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecChain mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecChain.json").readBytes()
        val r = JsonReader(data)
        val obj = RecChainCodec.decode(r)
        val w = JsonWriter()
        RecChainCodec.encode(w, obj)
        val out = File("${outDir}/RecChain.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecChain json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecChain.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = RecChainCodec.decode(r)
        val w = JsonWriter()
        RecChainCodec.encode(w, obj)
        val out = File("${outDir}/RecChain.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecChain unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecChain.gron").readBytes()
        val r = GronReader(data)
        val obj = RecChainCodec.decode(r)
        val w = GronWriter()
        RecChainCodec.encode(w, obj)
        val out = File("${outDir}/RecChain.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecChain gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelRecWrap(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/RecWrap.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = RecWrapCodec.decode(r)
        val w = MsgPackWriter()
        RecWrapCodec.encode(w, obj)
        val out = File("${outDir}/RecWrap.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWrap mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecWrap.json").readBytes()
        val r = JsonReader(data)
        val obj = RecWrapCodec.decode(r)
        val w = JsonWriter()
        RecWrapCodec.encode(w, obj)
        val out = File("${outDir}/RecWrap.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWrap json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecWrap.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = RecWrapCodec.decode(r)
        val w = JsonWriter()
        RecWrapCodec.encode(w, obj)
        val out = File("${outDir}/RecWrap.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWrap unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecWrap.gron").readBytes()
        val r = GronReader(data)
        val obj = RecWrapCodec.decode(r)
        val w = GronWriter()
        RecWrapCodec.encode(w, obj)
        val out = File("${outDir}/RecWrap.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWrap gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelRecWide(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/RecWide.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = RecWideCodec.decode(r)
        val w = MsgPackWriter()
        RecWideCodec.encode(w, obj)
        val out = File("${outDir}/RecWide.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWide mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecWide.json").readBytes()
        val r = JsonReader(data)
        val obj = RecWideCodec.decode(r)
        val w = JsonWriter()
        RecWideCodec.encode(w, obj)
        val out = File("${outDir}/RecWide.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWide json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecWide.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = RecWideCodec.decode(r)
        val w = JsonWriter()
        RecWideCodec.encode(w, obj)
        val out = File("${outDir}/RecWide.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWide unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecWide.gron").readBytes()
        val r = GronReader(data)
        val obj = RecWideCodec.decode(r)
        val w = GronWriter()
        RecWideCodec.encode(w, obj)
        val out = File("${outDir}/RecWide.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWide gron: ${e.message}")
        failed++
    }
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


fun main() {
    var passed = 0
    var failed = 0

    // Scalar tests
    val (ps_int8_min, fs_int8_min) = testScalarInt8_min(); passed += ps_int8_min; failed += fs_int8_min
    val (ps_int8_max, fs_int8_max) = testScalarInt8_max(); passed += ps_int8_max; failed += fs_int8_max
    val (ps_int16_min, fs_int16_min) = testScalarInt16_min(); passed += ps_int16_min; failed += fs_int16_min
    val (ps_int16_max, fs_int16_max) = testScalarInt16_max(); passed += ps_int16_max; failed += fs_int16_max
    val (ps_int32_min, fs_int32_min) = testScalarInt32_min(); passed += ps_int32_min; failed += fs_int32_min
    val (ps_int32_max, fs_int32_max) = testScalarInt32_max(); passed += ps_int32_max; failed += fs_int32_max
    val (ps_int64_min, fs_int64_min) = testScalarInt64_min(); passed += ps_int64_min; failed += fs_int64_min
    val (ps_int64_max, fs_int64_max) = testScalarInt64_max(); passed += ps_int64_max; failed += fs_int64_max
    val (ps_uint8_max, fs_uint8_max) = testScalarUint8_max(); passed += ps_uint8_max; failed += fs_uint8_max
    val (ps_uint16_max, fs_uint16_max) = testScalarUint16_max(); passed += ps_uint16_max; failed += fs_uint16_max
    val (ps_uint32_max, fs_uint32_max) = testScalarUint32_max(); passed += ps_uint32_max; failed += fs_uint32_max
    val (ps_uint64_max, fs_uint64_max) = testScalarUint64_max(); passed += ps_uint64_max; failed += fs_uint64_max
    val (ps_float32_1_5, fs_float32_1_5) = testScalarFloat32_1_5(); passed += ps_float32_1_5; failed += fs_float32_1_5
    val (ps_float32_neg_zero, fs_float32_neg_zero) = testScalarFloat32_neg_zero(); passed += ps_float32_neg_zero; failed += fs_float32_neg_zero
    val (ps_float32_inf, fs_float32_inf) = testScalarFloat32_inf(); passed += ps_float32_inf; failed += fs_float32_inf
    val (ps_float32_neg_inf, fs_float32_neg_inf) = testScalarFloat32_neg_inf(); passed += ps_float32_neg_inf; failed += fs_float32_neg_inf
    val (ps_float32_nan, fs_float32_nan) = testScalarFloat32_nan(); passed += ps_float32_nan; failed += fs_float32_nan
    val (ps_float64_pi, fs_float64_pi) = testScalarFloat64_pi(); passed += ps_float64_pi; failed += fs_float64_pi
    val (ps_float64_neg_zero, fs_float64_neg_zero) = testScalarFloat64_neg_zero(); passed += ps_float64_neg_zero; failed += fs_float64_neg_zero
    val (ps_float64_inf, fs_float64_inf) = testScalarFloat64_inf(); passed += ps_float64_inf; failed += fs_float64_inf
    val (ps_float64_neg_inf, fs_float64_neg_inf) = testScalarFloat64_neg_inf(); passed += ps_float64_neg_inf; failed += fs_float64_neg_inf
    val (ps_float64_nan, fs_float64_nan) = testScalarFloat64_nan(); passed += ps_float64_nan; failed += fs_float64_nan
    val (ps_str_empty, fs_str_empty) = testScalarStr_empty(); passed += ps_str_empty; failed += fs_str_empty
    val (ps_str_ascii, fs_str_ascii) = testScalarStr_ascii(); passed += ps_str_ascii; failed += fs_str_ascii
    val (ps_str_null_byte, fs_str_null_byte) = testScalarStr_null_byte(); passed += ps_str_null_byte; failed += fs_str_null_byte
    val (ps_str_escape, fs_str_escape) = testScalarStr_escape(); passed += ps_str_escape; failed += fs_str_escape
    val (ps_str_unicode, fs_str_unicode) = testScalarStr_unicode(); passed += ps_str_unicode; failed += fs_str_unicode
    val (ps_str_31, fs_str_31) = testScalarStr_31(); passed += ps_str_31; failed += fs_str_31
    val (ps_str_32, fs_str_32) = testScalarStr_32(); passed += ps_str_32; failed += fs_str_32
    val (ps_str_255, fs_str_255) = testScalarStr_255(); passed += ps_str_255; failed += fs_str_255
    val (ps_str_256, fs_str_256) = testScalarStr_256(); passed += ps_str_256; failed += fs_str_256
    val (ps_bytes_empty, fs_bytes_empty) = testScalarBytes_empty(); passed += ps_bytes_empty; failed += fs_bytes_empty
    val (ps_bytes_small, fs_bytes_small) = testScalarBytes_small(); passed += ps_bytes_small; failed += fs_bytes_small
    val (ps_bytes_31, fs_bytes_31) = testScalarBytes_31(); passed += ps_bytes_31; failed += fs_bytes_31
    val (ps_bytes_32, fs_bytes_32) = testScalarBytes_32(); passed += ps_bytes_32; failed += fs_bytes_32
    val (ps_bytes_255, fs_bytes_255) = testScalarBytes_255(); passed += ps_bytes_255; failed += fs_bytes_255
    val (ps_bytes_256, fs_bytes_256) = testScalarBytes_256(); passed += ps_bytes_256; failed += fs_bytes_256
    val (ps_bytes_zeros, fs_bytes_zeros) = testScalarBytes_zeros(); passed += ps_bytes_zeros; failed += fs_bytes_zeros
    val (ps_bytes_ff, fs_bytes_ff) = testScalarBytes_ff(); passed += ps_bytes_ff; failed += fs_bytes_ff
    val (ps_bool_true, fs_bool_true) = testScalarBool_true(); passed += ps_bool_true; failed += fs_bool_true
    val (ps_bool_false, fs_bool_false) = testScalarBool_false(); passed += ps_bool_false; failed += fs_bool_false

    // Model tests
    val (pm_OptInner, fm_OptInner) = testModelOptInner(); passed += pm_OptInner; failed += fm_OptInner
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
    val (pm_RecList, fm_RecList) = testModelRecList(); passed += pm_RecList; failed += fm_RecList
    val (pm_RecTree, fm_RecTree) = testModelRecTree(); passed += pm_RecTree; failed += fm_RecTree
    val (pm_RecChain, fm_RecChain) = testModelRecChain(); passed += pm_RecChain; failed += fm_RecChain
    val (pm_RecWrap, fm_RecWrap) = testModelRecWrap(); passed += pm_RecWrap; failed += fm_RecWrap
    val (pm_RecWide, fm_RecWide) = testModelRecWide(); passed += pm_RecWide; failed += fm_RecWide
    val (pm_Wide20, fm_Wide20) = testModelWide20(); passed += pm_Wide20; failed += fm_Wide20
    val (pm_Wide25, fm_Wide25) = testModelWide25(); passed += pm_Wide25; failed += fm_Wide25
    val (pm_Wide30, fm_Wide30) = testModelWide30(); passed += pm_Wide30; failed += fm_Wide30
    val (pm_Wide35, fm_Wide35) = testModelWide35(); passed += pm_Wide35; failed += fm_Wide35
    val (pm_Wide40, fm_Wide40) = testModelWide40(); passed += pm_Wide40; failed += fm_Wide40
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


    println("emit-kotlin: $passed passed, $failed failed")
    if (failed > 0) throw RuntimeException("$failed tests failed")
}
