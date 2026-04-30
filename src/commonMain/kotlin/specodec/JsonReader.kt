package specodec

class SCodecError(val code: String, message: String) : Exception(message)

class JsonReader(data: ByteArray) : SpecReader {
    private val src: String = data.decodeToString()
    private var pos: Int = 0
    private val _firstField: MutableList<Boolean> = mutableListOf()
    private val _firstElem: MutableList<Boolean> = mutableListOf()

    fun pos(): Int = pos

    private fun ws() {
        while (pos < src.length) {
            val c = src[pos].code
            if (c == 0x20 || c == 0x09 || c == 0x0A || c == 0x0D) pos++
            else break
        }
    }

    private fun peek(): Char {
        ws()
        if (pos >= src.length) throw SCodecError("internal", "json: unexpected end of input")
        return src[pos]
    }

    private fun read(): Char {
        ws()
        if (pos >= src.length) throw SCodecError("internal", "json: unexpected end of input")
        return src[pos++]
    }

    private fun expect(ch: Char) {
        val got = read()
        if (got != ch) throw SCodecError("internal", "json: expected '$ch', got '$got' at ${pos - 1}")
    }

    private fun parseString(): String {
        expect('"')
        val parts = StringBuilder()
        while (pos < src.length) {
            val c = src[pos]
            val code = c.code
            if (code == 0x22) { pos++; return parts.toString() }
            if (code == 0x5C) {
                pos++
                if (pos >= src.length) throw SCodecError("internal", "json: unexpected end of string escape")
                val esc = src[pos]
                when (esc.code) {
                    0x22 -> { parts.append('"'); pos++ }
                    0x5C -> { parts.append('\\'); pos++ }
                    0x2F -> { parts.append('/'); pos++ }
                    0x62 -> { parts.append('\b'); pos++ }
                    0x66 -> { parts.append('\u000C'); pos++ }
                    0x6E -> { parts.append('\n'); pos++ }
                    0x72 -> { parts.append('\r'); pos++ }
                    0x74 -> { parts.append('\t'); pos++ }
                    0x75 -> {
                        pos++
                        if (pos + 4 > src.length) throw SCodecError("internal", "json: incomplete unicode escape")
                        val hex = src.substring(pos, pos + 4)
                        var cp = hex.toInt(16)
                        pos += 4
                        if (cp in 0xD800..0xDBFF) {
                            if (pos + 6 <= src.length && src[pos] == '\\' && src[pos + 1] == 'u') {
                                pos += 2
                                val hex2 = src.substring(pos, pos + 4)
                                val low = hex2.toInt(16)
                                pos += 4
                                if (low in 0xDC00..0xDFFF) {
                                    cp = 0x10000 + (cp - 0xD800) * 0x400 + (low - 0xDC00)
                                } else {
                                    throw SCodecError("internal", "json: expected low surrogate")
                                }
                            } else {
                                throw SCodecError("internal", "json: expected low surrogate")
                            }
                        }
                        parts.append(cp.toChar())
                    }
                    else -> throw SCodecError("internal", "json: invalid escape '\\$esc'")
                }
            } else if (code < 0x20) {
                throw SCodecError("internal", "json: unescaped control char U+${code.toString(16).padStart(4, '0')}")
            } else {
                parts.append(c); pos++
            }
        }
        throw SCodecError("internal", "json: unterminated string")
    }

    private fun parseNumberRaw(): String {
        ws()
        val start = pos
        if (pos < src.length && src[pos] == '-') pos++
        if (pos >= src.length) throw SCodecError("internal", "json: unexpected end of number")
        if (src[pos] == '0') { pos++ }
        else if (src[pos] in '1'..'9') {
            pos++
            while (pos < src.length && src[pos] in '0'..'9') pos++
        } else throw SCodecError("internal", "json: invalid number")
        if (pos < src.length && src[pos] == '.') {
            pos++
            if (pos >= src.length || src[pos] !in '0'..'9') throw SCodecError("internal", "json: invalid fraction")
            while (pos < src.length && src[pos] in '0'..'9') pos++
        }
        if (pos < src.length && (src[pos] == 'e' || src[pos] == 'E')) {
            pos++
            if (pos < src.length && (src[pos] == '+' || src[pos] == '-')) pos++
            if (pos >= src.length || src[pos] !in '0'..'9') throw SCodecError("internal", "json: invalid exponent")
            while (pos < src.length && src[pos] in '0'..'9') pos++
        }
        return src.substring(start, pos)
    }

    override fun readString(): String = parseString()

    override fun readBool(): Boolean {
        val ch = peek()
        if (ch == 't') { for (c in "true") if (read() != c) throw SCodecError("internal", "json: expected true"); return true }
        if (ch == 'f') { for (c in "false") if (read() != c) throw SCodecError("internal", "json: expected false"); return false }
        throw SCodecError("internal", "json: expected bool, got '$ch'")
    }

    override fun readInt32(): Int {
        val raw = parseNumberRaw()
        return raw.toIntOrNull() ?: throw SCodecError("internal", "json: invalid int32: $raw")
    }

    override fun readInt64(): Long {
        if (peek() == '"') {
            val s = parseString()
            return s.toLongOrNull() ?: throw SCodecError("internal", "json: invalid int64: $s")
        }
        val raw = parseNumberRaw()
        return raw.toLongOrNull() ?: throw SCodecError("internal", "json: invalid int64: $raw")
    }

    override fun readUint32(): UInt {
        val raw = parseNumberRaw()
        return raw.toUIntOrNull() ?: throw SCodecError("internal", "json: invalid uint32: $raw")
    }

    override fun readUint64(): ULong {
        if (peek() == '"') {
            val s = parseString()
            return s.toULongOrNull() ?: throw SCodecError("internal", "json: invalid uint64: $s")
        }
        val raw = parseNumberRaw()
        return raw.toULongOrNull() ?: throw SCodecError("internal", "json: invalid uint64: $raw")
    }

    override fun readFloat32(): Float {
        val raw = parseNumberRaw()
        return raw.toFloatOrNull() ?: throw SCodecError("internal", "json: invalid float32: $raw")
    }

    override fun readFloat64(): Double {
        val raw = parseNumberRaw()
        return raw.toDoubleOrNull() ?: throw SCodecError("internal", "json: invalid float64: $raw")
    }

    override fun readNull() {
        for (c in "null") if (read() != c) throw SCodecError("internal", "json: expected null")
    }

    override fun readBytes(): ByteArray {
        val s = parseString()
        val lookup = IntArray(128) { -1 }
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".forEachIndexed { i, c -> lookup[c.code] = i }
        val out = mutableListOf<Byte>()
        var i = 0
        while (i < s.length) {
            val a = lookup[s[i].code]; val b = lookup[s[i+1].code]
            val c = if (s[i+2] == '=') -1 else lookup[s[i+2].code]
            val d = if (s[i+3] == '=') -1 else lookup[s[i+3].code]
            if (a < 0 || b < 0) throw SCodecError("internal", "json: invalid base64")
            out.add(((a shl 2) or (b shr 4)).toByte())
            if (c >= 0) { out.add((((b and 0xF) shl 4) or (c shr 2)).toByte()); if (d >= 0) out.add((((c and 0x3) shl 6) or d).toByte()) }
            i += 4
        }
        return out.toByteArray()
    }

    override fun readEnum(): String = parseString()

    override fun beginObject() {
        expect('{')
        _firstField.add(true)
    }

    override fun hasNextField(): Boolean {
        val ch = peek()
        if (ch == '}') {
            _firstField.removeAt(_firstField.size - 1)
            return false
        }
        val top = _firstField.size - 1
        if (!_firstField[top]) {
            if (ch != ',') throw SCodecError("internal", "json: expected ',' or '}', got '$ch'")
            pos++
        } else {
            _firstField[top] = false
        }
        return true
    }

    override fun readFieldName(): String {
        val key = parseString()
        ws()
        if (pos < src.length && src[pos] == ':') {
            pos++
        } else {
            throw SCodecError("internal", "json: expected ':' after field name '$key'")
        }
        return key
    }

    override fun endObject() { expect('}') }

    override fun beginArray() {
        expect('[')
        _firstElem.add(true)
    }

    override fun hasNextElement(): Boolean {
        val ch = peek()
        if (ch == ']') {
            _firstElem.removeAt(_firstElem.size - 1)
            return false
        }
        val top = _firstElem.size - 1
        if (!_firstElem[top]) {
            if (ch != ',') throw SCodecError("internal", "json: expected ',' or ']', got '$ch'")
            pos++
        } else {
            _firstElem[top] = false
        }
        return true
    }

    override fun endArray() { expect(']') }

    override fun isNull(): Boolean = peek() == 'n'

    override fun skip() {
        ws()
        if (pos >= src.length) throw SCodecError("internal", "json: unexpected end of input")
        val ch = src[pos]
        when (ch) {
            '"' -> {
                pos++
                while (pos < src.length) {
                    if (src[pos] == '\\') pos += 2
                    else if (src[pos] == '"') { pos++; return }
                    else pos++
                }
                throw SCodecError("internal", "json: unterminated string in skip")
            }
            '{' -> {
                beginObject()
                while (hasNextField()) {
                    readFieldName()
                    skip()
                }
                endObject()
            }
            '[' -> {
                beginArray()
                while (hasNextElement()) {
                    skip()
                }
                endArray()
            }
            't' -> for (c in "true") if (read() != c) throw SCodecError("internal", "json: skip expected true")
            'f' -> for (c in "false") if (read() != c) throw SCodecError("internal", "json: skip expected false")
            'n' -> for (c in "null") if (read() != c) throw SCodecError("internal", "json: skip expected null")
            else -> {
                if (ch in '0'..'9' || ch == '-') parseNumberRaw()
                else throw SCodecError("internal", "json: unexpected '$ch' in skip")
            }
        }
    }
}
