package specodec

class GronReader(data: ByteArray) {
    private val lines: MutableList<Pair<String, String>> = mutableListOf()
    private var cursor: Int = 0
    private val ctx: MutableList<CtxInfo> = mutableListOf()

    private class CtxInfo(val prefix: String, val type: String, var index: Int = -1)

    init {
        for (raw in data.decodeToString().split("\n")) {
            val line = raw.trim()
            if (line.isEmpty()) continue
            val eq = line.indexOf(" = ")
            if (eq < 0) continue
            val path = line.substring(0, eq)
            var value = line.substring(eq + 3)
            if (value.endsWith(";")) value = value.substring(0, value.length - 1)
            lines.add(path to value)
        }
    }

    private fun unescape(s: String): String {
        if (s.length < 2 || s[0] != '"' || s.last() != '"')
            throw SCodecError("internal", "gron: expected quoted string")
        val sb = StringBuilder()
        var i = 1
        while (i < s.length - 1) {
            if (s[i] == '\\') {
                i++
                when (s[i]) {
                    '"' -> sb.append('"')
                    '\\' -> sb.append('\\')
                    '/' -> sb.append('/')
                    'b' -> sb.append('\b')
                    'f' -> sb.append('\u000C')
                    'n' -> sb.append('\n')
                    'r' -> sb.append('\r')
                    't' -> sb.append('\t')
                    'u' -> {
                        sb.append(Integer.parseInt(s.substring(i + 1, i + 5), 16).toChar())
                        i += 4
                    }
                }
            } else {
                sb.append(s[i])
            }
            i++
        }
        return sb.toString()
    }

    private fun b64(s: String): ByteArray {
        val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
        val padCount = s.reversed().takeWhile { it == '=' }.count()
        val result = mutableListOf<Byte>()
        var i = 0
        while (i < s.length && s[i] != '=') {
            val b0 = chars.indexOf(s[i]); i++
            val b1 = if (i < s.length && s[i] != '=') { chars.indexOf(s[i]).also { i++ } } else 0
            val b2 = if (i < s.length && s[i] != '=') { chars.indexOf(s[i]).also { i++ } } else 0
            val b3 = if (i < s.length && s[i] != '=') { chars.indexOf(s[i]).also { i++ } } else 0
            result.add(((b0 shl 2) or (b1 shr 4)).toByte())
            result.add((((b1 and 0xF) shl 4) or (b2 shr 2)).toByte())
            result.add((((b2 and 3) shl 6) or b3).toByte())
        }
        return result.dropLast(padCount).toByteArray()
    }

    fun readString(): String = unescape(lines[cursor++].second)
    fun readBool(): Boolean = lines[cursor++].second == "true"
    fun readInt32(): Int = lines[cursor++].second.toInt()
    fun readInt64(): Long = unescape(lines[cursor++].second).toLong()
    fun readUint32(): UInt = lines[cursor++].second.toUInt()
    fun readUint64(): ULong = unescape(lines[cursor++].second).toULong()
    fun readFloat32(): Float {
        val v = lines[cursor++].second
        return if (v == "-0") -0f else v.toFloat()
    }
    fun readFloat32AsDouble(): Double {
        val v = lines[cursor++].second
        return if (v == "-0") -0.0 else v.toDouble()
    }
    fun readFloat64(): Double {
        val v = lines[cursor++].second
        return if (v == "-0") -0.0 else v.toDouble()
    }
    fun readNull() { if (lines[cursor++].second != "null") throw SCodecError("internal", "gron: expected null") }
    fun readBytes(): ByteArray = b64(unescape(lines[cursor++].second))

    fun beginObject() {
        val line = lines[cursor++]
        ctx.add(CtxInfo(line.first, "object"))
    }

    fun hasNextField(): Boolean {
        if (cursor >= lines.size) return false
        val pfx = ctx.last().prefix + "."
        val p = lines[cursor].first
        if (!p.startsWith(pfx)) return false
        val rem = p.substring(pfx.length)
        return !rem.contains(".") && !rem.contains("[")
    }

    fun readFieldName(): String {
        val pfx = ctx.last().prefix + "."
        return lines[cursor].first.substring(pfx.length)
    }

    fun nextFieldSeparator() {}
    fun endObject() { ctx.removeAt(ctx.size - 1) }

    fun beginArray() {
        val line = lines[cursor++]
        ctx.add(CtxInfo(line.first, "array", -1))
    }

    fun hasNextElement(): Boolean {
        if (cursor >= lines.size) return false
        val arr = ctx.last()
        val ni = arr.index + 1
        val exp = arr.prefix + "[$ni]"
        val p = lines[cursor].first
        return p == exp || p.startsWith("$exp.") || p.startsWith("$exp[")
    }

    fun nextElementSeparator() {}
    fun nextElement() { ctx.last().index++ }
    fun endArray() { ctx.removeAt(ctx.size - 1) }

    fun isNull(): Boolean = cursor < lines.size && lines[cursor].second == "null"

    fun skip() {
        val sp = lines[cursor++].first
        while (cursor < lines.size) {
            val np = lines[cursor].first
            if (np.length > sp.length && (np.startsWith("$sp.") || np.startsWith("$sp["))) cursor++
            else break
        }
    }
}
