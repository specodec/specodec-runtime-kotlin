package specodec

interface SpecWriter {
    fun writeString(value: String)
    fun writeBool(value: Boolean)
    fun writeInt32(value: Int)
    fun writeInt64(value: Long)
    fun writeUint32(value: UInt)
    fun writeUint64(value: ULong)
    fun writeFloat32(value: Float)
    fun writeFloat64(value: Double)
    fun writeNull()
    fun writeBytes(value: ByteArray)
    fun writeEnum(value: String)
    fun beginObject(fieldCount: Int)
    fun writeField(name: String)
    fun endObject()
    fun beginArray(elementCount: Int)
    fun nextElement()
    fun endArray()
    fun toBytes(): ByteArray
}
