package emit_kotlin

import specodec.*
import all_types_arrays.*
import all_types_edge.*
import all_types_enums.*
import all_types_extra.*
import all_types_many.*
import all_types_mixed.*
import all_types_nested_deep.*
import all_types_nested.*
import all_types_nests.*
import all_types_opt.*
import all_types_pairs.*
import all_types_recursive.*
import all_types_scalars.*
import all_types.*
import all_types_unions.*
import all_types_wide.*
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

    // Model tests (by namespace)
    val (r_all_types_p, r_all_types_f) = runAllTypes(vecDir, outDir); passed += r_all_types_p; failed += r_all_types_f
    val (r_all_types__scalars_p, r_all_types__scalars_f) = runAllTypesScalars(vecDir, outDir); passed += r_all_types__scalars_p; failed += r_all_types__scalars_f
    val (r_all_types__opt_p, r_all_types__opt_f) = runAllTypesOpt(vecDir, outDir); passed += r_all_types__opt_p; failed += r_all_types__opt_f
    val (r_all_types__pairs_p, r_all_types__pairs_f) = runAllTypesPairs(vecDir, outDir); passed += r_all_types__pairs_p; failed += r_all_types__pairs_f
    val (r_all_types__many_p, r_all_types__many_f) = runAllTypesMany(vecDir, outDir); passed += r_all_types__many_p; failed += r_all_types__many_f
    val (r_all_types__arrays_p, r_all_types__arrays_f) = runAllTypesArrays(vecDir, outDir); passed += r_all_types__arrays_p; failed += r_all_types__arrays_f
    val (r_all_types__nests_p, r_all_types__nests_f) = runAllTypesNests(vecDir, outDir); passed += r_all_types__nests_p; failed += r_all_types__nests_f
    val (r_all_types__mixed_p, r_all_types__mixed_f) = runAllTypesMixed(vecDir, outDir); passed += r_all_types__mixed_p; failed += r_all_types__mixed_f
    val (r_all_types__recursive_p, r_all_types__recursive_f) = runAllTypesRecursive(vecDir, outDir); passed += r_all_types__recursive_p; failed += r_all_types__recursive_f
    val (r_all_types__wide_p, r_all_types__wide_f) = runAllTypesWide(vecDir, outDir); passed += r_all_types__wide_p; failed += r_all_types__wide_f
    val (r_all_types__edge_p, r_all_types__edge_f) = runAllTypesEdge(vecDir, outDir); passed += r_all_types__edge_p; failed += r_all_types__edge_f
    val (r_all_types__extra_p, r_all_types__extra_f) = runAllTypesExtra(vecDir, outDir); passed += r_all_types__extra_p; failed += r_all_types__extra_f
    val (r_all_types_nested_p, r_all_types_nested_f) = runAllTypesNested(vecDir, outDir); passed += r_all_types_nested_p; failed += r_all_types_nested_f
    val (r_all_types_nested_deep_p, r_all_types_nested_deep_f) = runAllTypesNestedDeep(vecDir, outDir); passed += r_all_types_nested_deep_p; failed += r_all_types_nested_deep_f
    val (r_all_types__enums_p, r_all_types__enums_f) = runAllTypesEnums(vecDir, outDir); passed += r_all_types__enums_p; failed += r_all_types__enums_f
    val (r_all_types__unions_p, r_all_types__unions_f) = runAllTypesUnions(vecDir, outDir); passed += r_all_types__unions_p; failed += r_all_types__unions_f


    println("emit-kotlin: $passed passed, $failed failed")
    if (failed > 0) throw RuntimeException("$failed tests failed")
}
