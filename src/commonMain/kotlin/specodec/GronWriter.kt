package specodec

class GronWriter {
    private val lines: MutableList<String> = mutableListOf()
    private val segments: MutableList<String> = mutableListOf("json")
    private val nesting: MutableList<NestInfo> = mutableListOf()

    private class NestInfo(val depth: Int, var arrayIndex: Int = -1)

    private fun buildPath(): String {
        var r = segments[0]
        for (i in 1 until segments.size) {
            if (segments[i].startsWith("[")) r += segments[i]
            else r += "." + segments[i]
        }
        return r
    }

    private fun escape(s: String): String {
        val sb = StringBuilder()
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
        return sb.toString()
    }

    private fun b64(buf: ByteArray): String {
        val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
        val sb = StringBuilder()
        var i = 0
        while (i < buf.size) {
            val b0 = buf[i].toInt() and 0xFF
            val b1 = if (i + 1 < buf.size) buf[i + 1].toInt() and 0xFF else 0
            val b2 = if (i + 2 < buf.size) buf[i + 2].toInt() and 0xFF else 0
            sb.append(chars[b0 shr 2])
            sb.append(chars[((b0 and 3) shl 4) or (b1 shr 4)])
            sb.append(if (i + 1 < buf.size) chars[((b1 and 0xF) shl 2) or (b2 shr 6)] else '=')
            sb.append(if (i + 2 < buf.size) chars[b2 and 0x3F] else '=')
            i += 3
        }
        return sb.toString()
    }

    private fun emit(raw: String) {
        lines.add("${buildPath()} = $raw;")
    }

    fun writeString(value: String) = emit("\"${escape(value)}\"")
    fun writeBool(value: Boolean) = emit(if (value) "true" else "false")
    fun writeInt32(value: Int) = emit(value.toString())
    fun writeInt64(value: Long) = emit("\"$value\"")
    fun writeUint32(value: UInt) = emit(value.toString())
    fun writeUint64(value: ULong) = emit("\"$value\"")

    fun writeFloat32(value: Double) {
        if (value.isNaN() || value.isInfinite()) throw IllegalArgumentException("NaN/Infinity")
        emit(if (value == 0.0 && value.toRawBits() == 1L shl 63) "-0" else value.toString().trimEnd('0').trimEnd('.'))
    }

    fun writeFloat64(value: Double) {
        if (value.isNaN() || value.isInfinite()) throw IllegalArgumentException("NaN/Infinity")
        emit(if (value == 0.0 && value.toRawBits() == 1L shl 63) "-0" else value.toString().trimEnd('0').trimEnd('.'))
    }

    fun writeNull() = emit("null")
    fun writeBytes(value: ByteArray) = emit("\"${b64(value)}\"")

    fun beginObject(fieldCount: Int) {
        lines.add("${buildPath()} = {};")
        nesting.add(NestInfo(segments.size))
    }

    fun writeField(name: String) {
        val top = nesting.last()
        if (segments.size > top.depth) segments[segments.size - 1] = name
        else segments.add(name)
    }

    fun endObject() {
        val info = nesting.removeAt(nesting.size - 1)
        while (segments.size > info.depth) segments.removeAt(segments.size - 1)
    }

    fun beginArray(elementCount: Int) {
        lines.add("${buildPath()} = [];")
        nesting.add(NestInfo(segments.size, -1))
    }

    fun nextElement() {
        val info = nesting.last()
        info.arrayIndex++
        val seg = "[${info.arrayIndex}]"
        if (segments.size > info.depth) segments[segments.size - 1] = seg
        else segments.add(seg)
    }

    fun endArray() {
        val info = nesting.removeAt(nesting.size - 1)
        while (segments.size > info.depth) segments.removeAt(segments.size - 1)
    }

    fun toBytes(): ByteArray = lines.joinToString("\n", postfix = "\n").encodeToByteArray()
}
