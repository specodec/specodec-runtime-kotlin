package specodec

class GronWriter {
    fun writeString(value: String): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun writeBool(value: Boolean): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun writeInt32(value: Int): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun writeInt64(value: Long): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun writeUint32(value: Long): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun writeUint64(value: Long): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun writeFloat32(value: Float): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun writeFloat64(value: Double): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun writeNull(): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun writeBytes(value: ByteArray): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun beginObject(fieldCount: Int): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun writeField(name: String): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun endObject(): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun beginArray(elementCount: Int): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun nextElement(): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun endArray(): Unit = throw NotImplementedError("GronWriter: not implemented")
    fun toBytes(): ByteArray = throw NotImplementedError("GronWriter: not implemented")
}
