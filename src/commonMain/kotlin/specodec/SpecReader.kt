package specodec

interface SpecReader {
    fun beginObject()
    fun hasNextField(): Boolean
    fun readFieldName(): String
    fun endObject()
    fun beginArray()
    fun hasNextElement(): Boolean
    fun endArray()
    fun readString(): String
    fun readBool(): Boolean
    fun readInt32(): Int
    fun readInt64(): Long
    fun readUint32(): Int
    fun readUint64(): Long
    fun readFloat32(): Float
    fun readFloat64(): Double
    fun readNull()
    fun readBytes(): ByteArray
    fun readEnum(): String
    fun isNull(): Boolean
    fun skip()
}
