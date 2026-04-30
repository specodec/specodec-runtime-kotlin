package specodec

class MsgPackReader(private val data: ByteArray) : SpecReader {
    private var pos: Int = 0
    var containerCount: MutableList<Int> = mutableListOf()

    fun pos(): Int = pos

    private fun readByte(): Byte {
        if (pos >= data.size) throw SCodecError("internal", "msgpack: unexpected end of data")
        return data[pos++]
    }

    private fun readU16(): Int {
        val v = ((data[pos].toInt() and 0xFF) shl 8) or (data[pos + 1].toInt() and 0xFF)
        pos += 2
        return v
    }

    private fun readU32(): Int {
        val v = ((data[pos].toInt() and 0xFF) shl 24) or
                ((data[pos + 1].toInt() and 0xFF) shl 16) or
                ((data[pos + 2].toInt() and 0xFF) shl 8) or
                (data[pos + 3].toInt() and 0xFF)
        pos += 4
        return v
    }

    private fun readI16(): Int {
        val v = readU16()
        return if (v > 0x7FFF) v - 0x10000 else v
    }

    private fun readI32(): Int {
        val v = readU32().toLong()
        return (if (v > 0x7FFFFFFF) v - 0x100000000 else v).toInt()
    }

    private fun readF32(): Float {
        val bits = readU32()
        return Float.fromBits(bits)
    }

    private fun readF64(): Double {
        val bits = ((readU32().toLong() and 0xFFFFFFFFL) shl 32) or (readU32().toLong() and 0xFFFFFFFFL)
        return Double.fromBits(bits)
    }

    fun readMapHeader(): Int {
        val b = readByte().toInt() and 0xFF
        if (b and 0xF0 == 0x80) return b and 0x0F
        if (b == 0xDE) return readU16()
        if (b == 0xDF) return readU32()
        throw SCodecError("internal", "msgpack: expected map, got 0x${b.toString(16)}")
    }

    fun readArrayHeader(): Int {
        val b = readByte().toInt() and 0xFF
        if (b and 0xF0 == 0x90) return b and 0x0F
        if (b == 0xDC) return readU16()
        if (b == 0xDD) return readU32()
        throw SCodecError("internal", "msgpack: expected array, got 0x${b.toString(16)}")
    }

    override fun readString(): String {
        val b = readByte().toInt() and 0xFF
        val len: Int = when {
            b and 0xE0 == 0xA0 -> b and 0x1F
            b == 0xD9 -> readByte().toInt() and 0xFF
            b == 0xDA -> readU16()
            b == 0xDB -> readU32()
            else -> throw SCodecError("internal", "msgpack: expected string, got 0x${b.toString(16)}")
        }
        val s = data.sliceArray(pos until pos + len).decodeToString()
        pos += len
        return s
    }

    fun readInt(): Long {
        val b = readByte().toInt() and 0xFF
        when {
            b <= 0x7F -> return b.toLong()
            b >= 0xE0 -> return (b - 0x100).toLong()
            b == 0xCC -> return (readByte().toInt() and 0xFF).toLong()
            b == 0xCD -> return readU16().toLong()
            b == 0xCE -> return (readU32().toLong() and 0xFFFFFFFFL)
            b == 0xD0 -> return readByte().toLong()
            b == 0xD1 -> return readI16().toLong()
            b == 0xD2 -> return readI32().toLong()
            b == 0xD3 -> return ((readU32().toLong() and 0xFFFFFFFFL) shl 32) or (readU32().toLong() and 0xFFFFFFFFL)
            b == 0xCF -> return ((readU32().toLong() and 0xFFFFFFFFL) shl 32) or (readU32().toLong() and 0xFFFFFFFFL)
        }
        throw SCodecError("internal", "msgpack: expected int, got 0x${b.toString(16)}")
    }

    fun readFloat(): Double {
        val b = readByte().toInt() and 0xFF
        if (b == 0xCA) return readF32().toDouble()
        if (b == 0xCB) return readF64()
        if (b <= 0x7F) return b.toDouble()
        if (b >= 0xE0) return (b - 0x100).toDouble()
        if (b == 0xCC) return (readByte().toInt() and 0xFF).toDouble()
        if (b == 0xCD) return readU16().toDouble()
        if (b == 0xCE) return (readU32().toLong() and 0xFFFFFFFFL).toDouble()
        if (b == 0xCF) {
            val hi = readU32().toLong() and 0xFFFFFFFFL
            val lo = readU32().toLong() and 0xFFFFFFFFL
            return Double.fromBits((hi shl 32) or lo)
        }
        if (b == 0xD0) return readByte().toDouble()
        if (b == 0xD1) return readI16().toDouble()
        if (b == 0xD2) return readI32().toDouble()
        if (b == 0xD3) {
            val hi = readU32().toLong() and 0xFFFFFFFFL
            val lo = readU32().toLong() and 0xFFFFFFFFL
            return Double.fromBits((hi shl 32) or lo)
        }
        throw SCodecError("internal", "msgpack: expected float, got 0x${b.toString(16)}")
    }

    override fun readBool(): Boolean {
        val b = readByte().toInt() and 0xFF
        if (b == 0xC3) return true
        if (b == 0xC2) return false
        throw SCodecError("internal", "msgpack: expected bool, got 0x${b.toString(16)}")
    }

    override fun readNull() {
        val b = readByte().toInt() and 0xFF
        if (b != 0xC0) throw SCodecError("internal", "msgpack: expected null, got 0x${b.toString(16)}")
    }

    override fun readInt32(): Int = readInt().toInt()

    override fun readUint32(): UInt = readInt().let { v -> (v and 0xFFFFFFFFL).toUInt() }

    override fun readUint64(): ULong = readInt().let { it.toULong() }

    override fun readInt64(): Long = readInt()

    override fun readFloat32(): Float = readFloat().toFloat()

    override fun readFloat64(): Double = readFloat()

    override fun readBytes(): ByteArray {
        val b = readByte().toInt() and 0xFF
        val len = when (b) {
            0xC4 -> readByte().toInt() and 0xFF
            0xC5 -> readU16()
            0xC6 -> readU32()
            else -> throw SCodecError("internal", "msgpack: expected bin, got 0x${b.toString(16)}")
        }
        val v = data.sliceArray(pos until pos + len)
        pos += len
        return v
    }

    override fun readEnum(): String = readString()

    override fun isNull(): Boolean = pos < data.size && data[pos] == (0xC0).toByte()

    override fun skip() {
        val b = readByte().toInt() and 0xFF
        if (b <= 0x7F || b >= 0xE0) return
        if (b and 0xF0 == 0x80) {
            repeat(b and 0x0F) { skip(); skip() }
            return
        }
        if (b and 0xF0 == 0x90) {
            repeat(b and 0x0F) { skip() }
            return
        }
        if (b and 0xE0 == 0xA0) { pos += b and 0x1F; return }
        when (b) {
            0xC0, 0xC2, 0xC3 -> {}
            0xCC, 0xD0 -> pos += 1
            0xCD, 0xD1 -> pos += 2
            0xCE, 0xD2, 0xCA -> pos += 4
            0xCF, 0xD3, 0xCB -> pos += 8
            0xD9 -> pos += readByte().toInt() and 0xFF
            0xDA -> pos += readU16()
            0xDB -> pos += readU32()
            0xC4 -> pos += readByte().toInt() and 0xFF
            0xC5 -> pos += readU16()
            0xC6 -> pos += readU32()
            0xD4 -> pos += 2
            0xD5 -> pos += 3
            0xD6 -> pos += 5
            0xD7 -> pos += 9
            0xD8 -> pos += 17
            0xC7 -> pos += 1 + (readByte().toInt() and 0xFF)
            0xC8 -> pos += 1 + readU16()
            0xC9 -> pos += 1 + readU32()
            0xDC -> repeat(readU16()) { skip() }
            0xDD -> repeat(readU32()) { skip() }
            0xDE -> repeat(readU16()) { skip(); skip() }
            0xDF -> repeat(readU32()) { skip(); skip() }
            else -> throw SCodecError("internal", "msgpack: unknown format 0x${b.toString(16)}")
        }
    }

    override fun beginObject() {
        val n = readMapHeader()
        containerCount.add(n)
    }

    override fun hasNextField(): Boolean {
        val top = containerCount.size - 1
        if (containerCount[top] > 0) {
            containerCount[top] = containerCount[top] - 1
            return true
        }
        containerCount.removeAt(top)
        return false
    }

    override fun readFieldName(): String = readString()

    override fun endObject() {
    }

    override fun beginArray() {
        val n = readArrayHeader()
        containerCount.add(n)
    }

    override fun hasNextElement(): Boolean {
        val top = containerCount.size - 1
        if (containerCount[top] > 0) {
            containerCount[top] = containerCount[top] - 1
            return true
        }
        containerCount.removeAt(top)
        return false
    }

    override fun endArray() {
    }
}
