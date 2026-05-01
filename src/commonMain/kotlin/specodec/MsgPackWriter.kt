package specodec

class MsgPackWriter : SpecWriter {
    private val buf: MutableList<Byte> = mutableListOf()

    private fun writeByte(b: Byte) { buf.add(b) }
    private fun writeU16(v: Int) { buf.add((v shr 8).toByte()); buf.add(v.toByte()) }
    private fun writeU32(v: Int) { buf.add((v shr 24).toByte()); buf.add((v shr 16).toByte()); buf.add((v shr 8).toByte()); buf.add(v.toByte()) }
    private fun writeU64(v: Long) { writeU32((v shr 32).toInt()); writeU32(v.toInt()) }

    override fun writeString(value: String) {
        val bytes = value.encodeToByteArray()
        val len = bytes.size
        when {
            len <= 0x1F -> writeByte((0xA0 or len).toByte())
            len <= 0xFF -> { writeByte(0xD9.toByte()); writeByte(len.toByte()) }
            len <= 0xFFFF -> { writeByte(0xDA.toByte()); writeU16(len) }
            else -> { writeByte(0xDB.toByte()); writeU32(len) }
        }
        buf.addAll(bytes.toList())
    }

    override fun writeBool(value: Boolean) { writeByte(if (value) 0xC3.toByte() else 0xC2.toByte()) }

    override fun writeInt32(value: Int) {
        when {
            value in 0..0x7F -> writeByte(value.toByte())
            value in -0x20..-1 -> writeByte(value.toByte())
            value in 0..0xFF -> { writeByte(0xCC.toByte()); writeByte(value.toByte()) }
            value in 0..0xFFFF -> { writeByte(0xCD.toByte()); writeU16(value) }
            value >= 0 -> { writeByte(0xCE.toByte()); writeU32(value) }
            value >= -0x80 -> { writeByte(0xD0.toByte()); writeByte(value.toByte()) }
            value >= -0x8000 -> { writeByte(0xD1.toByte()); writeU16(value and 0xFFFF) }
            else -> { writeByte(0xD2.toByte()); writeU32(value) }
        }
    }

    override fun writeInt64(value: Long) {
        when {
            value in 0..0x7F -> writeByte(value.toByte())
            value in -0x20L..-1L -> writeByte(value.toByte())
            value in 0..0xFF -> { writeByte(0xCC.toByte()); writeByte(value.toByte()) }
            value in 0..0xFFFF -> { writeByte(0xCD.toByte()); writeU16(value.toInt()) }
            value in 0..0xFFFFFFFFL -> { writeByte(0xCE.toByte()); writeU32(value.toInt()) }
            value >= 0 -> { writeByte(0xCF.toByte()); writeU64(value) }
            value >= -0x80L -> { writeByte(0xD0.toByte()); writeByte(value.toByte()) }
            value >= -0x8000L -> { writeByte(0xD1.toByte()); writeU16(value.toInt() and 0xFFFF) }
            value >= -0x80000000L -> { writeByte(0xD2.toByte()); writeU32(value.toInt()) }
            else -> { writeByte(0xD3.toByte()); writeU64(value) }
        }
    }

    override fun writeUint32(value: UInt) {
        val v = value.toLong()
        when {
            v <= 0x7F -> writeByte(v.toByte())
            v <= 0xFF -> { writeByte(0xCC.toByte()); writeByte(v.toByte()) }
            v <= 0xFFFF -> { writeByte(0xCD.toByte()); writeU16(v.toInt()) }
            else -> { writeByte(0xCE.toByte()); writeU32(v.toInt()) }
        }
    }

    override fun writeUint64(value: ULong) {
        val v = value.toLong()
        val vu = value
        when {
            vu <= 0x7FuL -> writeByte(v.toByte())
            vu <= 0xFFuL -> { writeByte(0xCC.toByte()); writeByte(v.toByte()) }
            vu <= 0xFFFFuL -> { writeByte(0xCD.toByte()); writeU16(v.toInt()) }
            vu <= 0xFFFFFFFFuL -> { writeByte(0xCE.toByte()); writeU32(v.toInt()) }
            else -> { writeByte(0xCF.toByte()); writeU64(v) }
        }
    }

    override fun writeFloat32(value: Float) {
        writeByte(0xCA.toByte())
        val bits = value.toRawBits()
        writeU32(bits)
    }

    override fun writeFloat64(value: Double) {
        writeByte(0xCB.toByte())
        val bits = value.toRawBits()
        writeU32((bits shr 32).toInt())
        writeU32(bits.toInt())
    }

    override fun writeNull() { writeByte(0xC0.toByte()) }

    override fun writeBytes(value: ByteArray) {
        val len = value.size
        when {
            len <= 0xFF -> { writeByte(0xC4.toByte()); writeByte(len.toByte()) }
            len <= 0xFFFF -> { writeByte(0xC5.toByte()); writeU16(len) }
            else -> { writeByte(0xC6.toByte()); writeU32(len) }
        }
        buf.addAll(value.toList())
    }

    override fun beginObject(fieldCount: Int) {
        when {
            fieldCount <= 0x0F -> writeByte((0x80 or fieldCount).toByte())
            fieldCount <= 0xFFFF -> { writeByte(0xDE.toByte()); writeU16(fieldCount) }
            else -> { writeByte(0xDF.toByte()); writeU32(fieldCount) }
        }
    }

    override fun writeField(name: String) { writeString(name) }
    override fun endObject() {}

    override fun beginArray(elementCount: Int) {
        when {
            elementCount <= 0x0F -> writeByte((0x90 or elementCount).toByte())
            elementCount <= 0xFFFF -> { writeByte(0xDC.toByte()); writeU16(elementCount) }
            else -> { writeByte(0xDD.toByte()); writeU32(elementCount) }
        }
    }

    override fun nextElement() {}
    override fun endArray() {}

    override fun writeEnum(value: String) { writeString(value) }

    override fun toBytes(): ByteArray = buf.toByteArray()
}
