package specodec

data class SpecCodec<T>(
    val encode: (SpecWriter, T) -> Unit,
    val decode: (SpecReader) -> T
)

// ---------------------------------------------------------------------------
// FormatEntry: a reader/writer factory pair for one format
// ---------------------------------------------------------------------------
data class FormatEntry(
    val name: String,                       // e.g. "json", "msgpack", "gron"
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

    fun match(format: String): FormatEntry {
        return entries.firstOrNull { e -> format.contains(e.name) } ?: entries.first()
    }
}

// ---------------------------------------------------------------------------
// Default registry
// ---------------------------------------------------------------------------
val defaultRegistry: FormatRegistry = FormatRegistry()
    .register(FormatEntry("json",    { JsonWriter() },    { JsonReader(it) }))
    .register(FormatEntry("msgpack", { MsgPackWriter() }, { MsgPackReader(it) }))
    .register(FormatEntry("gron",    { GronWriter() },    { GronReader(it) }))

// ---------------------------------------------------------------------------
// dispatch / respond
// ---------------------------------------------------------------------------
fun <T> dispatch(codec: SpecCodec<T>, body: ByteArray, format: String,
                 registry: FormatRegistry = defaultRegistry): T {
    val fmt = registry.match(format)
    return codec.decode(fmt.newReader(body))
}

data class RespondResult(
    val body: ByteArray,
    val name: String    // format name: "json" | "msgpack" | "gron"
)

fun <T> respond(codec: SpecCodec<T>, obj: T, format: String,
                registry: FormatRegistry = defaultRegistry): RespondResult {
    val fmt = registry.match(format)
    val w = fmt.newWriter()
    codec.encode(w, obj)
    return RespondResult(body = w.toBytes(), name = fmt.name)
}
