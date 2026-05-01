package specodec

import kotlin.math.abs
import kotlin.math.floor

class JsonWriter : SpecWriter {
    private val sb: StringBuilder = StringBuilder()
    private val firstItem: MutableList<Boolean> = mutableListOf()

    private fun escape(s: String) {
        for (c in s) {
            when (c.code) {
                0x22 -> sb.append("\\\"")
                0x5C -> sb.append("\\\\")
                0x08 -> sb.append("\\b")
                0x0C -> sb.append("\\f")
                0x0A -> sb.append("\\n")
                0x0D -> sb.append("\\r")
                0x09 -> sb.append("\\t")
                in 0..0x1F -> sb.append("\\u${c.code.toString(16).padStart(4, '0')}")
                else -> sb.append(c)
            }
        }
    }

    private fun b64(buf: ByteArray): String {
        val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
        val s = StringBuilder()
        var i = 0
        while (i < buf.size) {
            val b0 = buf[i].toInt() and 0xFF
            val b1 = if (i + 1 < buf.size) buf[i + 1].toInt() and 0xFF else 0
            val b2 = if (i + 2 < buf.size) buf[i + 2].toInt() and 0xFF else 0
            s.append(chars[b0 shr 2])
            s.append(chars[((b0 and 3) shl 4) or (b1 shr 4)])
            s.append(if (i + 1 < buf.size) chars[((b1 and 0xF) shl 2) or (b2 shr 6)] else '=')
            s.append(if (i + 2 < buf.size) chars[b2 and 0x3F] else '=')
            i += 3
        }
        return s.toString()
    }

    override fun writeString(value: String) {
        sb.append('"')
        escape(value)
        sb.append('"')
    }

    override fun writeBool(value: Boolean) {
        sb.append(if (value) "true" else "false")
    }

    override fun writeInt32(value: Int) {
        sb.append(value)
    }

    override fun writeInt64(value: Long) {
        sb.append('"')
        sb.append(value)
        sb.append('"')
    }

    override fun writeUint32(value: UInt) {
        sb.append(value.toLong())
    }

    override fun writeUint64(value: ULong) {
        sb.append('"')
        sb.append(value)
        sb.append('"')
    }

    private fun fmtFloat(value: Double): String {
        val s = value.toString()
        if (s.contains('.') && !s.contains('E', ignoreCase = true)) {
            return s.trimEnd('0').trimEnd('.')
        }
        return s
    }

    override fun writeFloat32(value: Float) {
        val v = value
        if (v.isNaN() || v.isInfinite()) throw IllegalArgumentException("float32: NaN/Infinity not valid JSON")
        sb.append(fmtFloat(v.toDouble()))
    }

    override fun writeFloat64(value: Double) {
        if (value.isNaN() || value.isInfinite()) throw IllegalArgumentException("float64: NaN/Infinity not valid JSON")
        sb.append(fmtFloat(value))
    }

    override fun writeNull() {
        sb.append("null")
    }

    override fun writeBytes(value: ByteArray) {
        sb.append('"')
        sb.append(b64(value))
        sb.append('"')
    }

    override fun writeEnum(value: String) {
        sb.append('"')
        escape(value)
        sb.append('"')
    }

    override fun beginObject(fieldCount: Int) {
        sb.append('{')
        firstItem.add(true)
    }

    override fun writeField(name: String) {
        val top = firstItem.size - 1
        if (!firstItem[top]) sb.append(',')
        firstItem[top] = false
        sb.append('"')
        escape(name)
        sb.append('"')
        sb.append(':')
    }

    override fun endObject() {
        firstItem.removeAt(firstItem.size - 1)
        sb.append('}')
    }

    override fun beginArray(elementCount: Int) {
        sb.append('[')
        firstItem.add(true)
    }

    override fun nextElement() {
        val top = firstItem.size - 1
        if (!firstItem[top]) sb.append(',')
        firstItem[top] = false
    }

    override fun endArray() {
        firstItem.removeAt(firstItem.size - 1)
        sb.append(']')
    }

    override fun toBytes(): ByteArray = sb.toString().encodeToByteArray()
}
