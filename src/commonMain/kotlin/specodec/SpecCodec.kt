package specodec

data class SpecCodec<T>(
    val encode: (SpecWriter, T) -> Unit,
    val decode: (SpecReader) -> T
)

// ---------------------------------------------------------------------------
// FormatEntry
// ---------------------------------------------------------------------------
data class FormatEntry(
    val contentType: String,
    val newWriter: () -> SpecWriter,
    val newReader: (ByteArray) -> SpecReader
)

// ---------------------------------------------------------------------------
// FormatRegistry
// ---------------------------------------------------------------------------
class FormatRegistry {
    private val entries = mutableListOf<FormatEntry>()

    fun register(entry: FormatEntry): FormatRegistry {
        entries.add(entry)
        return this
    }

    fun match(contentType: String): FormatEntry {
        val found = entries.firstOrNull { e ->
            val sub = e.contentType.substringAfter("/")
            contentType.contains(sub)
        }
        return found ?: entries.first()
    }
}

// ---------------------------------------------------------------------------
// Default registry
// ---------------------------------------------------------------------------
val defaultRegistry: FormatRegistry = FormatRegistry()
    .register(FormatEntry("application/json",    { JsonWriter() },    { JsonReader(it) }))
    .register(FormatEntry("application/msgpack", { MsgPackWriter() }, { MsgPackReader(it) }))
    .register(FormatEntry("application/gron",    { GronWriter() },    { GronReader(it) }))

// ---------------------------------------------------------------------------
// dispatch / respond
// ---------------------------------------------------------------------------
fun <T> dispatch(codec: SpecCodec<T>, body: ByteArray, contentType: String,
                 registry: FormatRegistry = defaultRegistry): T {
    val fmt = registry.match(contentType)
    return codec.decode(fmt.newReader(body))
}

data class RespondResult(val body: ByteArray, val contentType: String)

fun <T> respond(codec: SpecCodec<T>, obj: T, accept: String,
                registry: FormatRegistry = defaultRegistry): RespondResult {
    val fmt = registry.match(accept)
    val w = fmt.newWriter()
    codec.encode(w, obj)
    return RespondResult(body = w.toBytes(), contentType = fmt.contentType)
}
