package specodec

data class SpecCodec<T>(
    val encodeJson: (T) -> ByteArray,
    val encodeMsgPack: (T) -> ByteArray,
    val decode: (SpecReader) -> T
)

fun <T> dispatch(codec: SpecCodec<T>, body: ByteArray, contentType: String): T {
    return if (contentType.contains("msgpack")) {
        codec.decode(MsgPackReader(body))
    } else {
        codec.decode(JsonReader(body))
    }
}

fun <T> respond(codec: SpecCodec<T>, obj: T, accept: String): ByteArray {
    return if (accept.contains("msgpack")) {
        codec.encodeMsgPack(obj)
    } else {
        codec.encodeJson(obj)
    }
}
