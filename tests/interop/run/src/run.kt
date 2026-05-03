import specodec.*
import java.io.File
import java.nio.file.Files

fun envOr(key: String, def: String): String = System.getenv(key) ?: def

val vecDir = File(envOr("VEC_DIR", "../vectors"))
val outDir = File(envOr("OUT_DIR", "../output_kotlin"))

lateinit var schema: Map<String, ModelSchema>

class FieldSchema(
    val name: String, val type: String,
    val optional: Boolean = false, val isArray: Boolean = false, val isModel: Boolean = false
)

class ModelSchema(val fields: List<FieldSchema>, val recursive: Boolean = false)

fun loadSchema(): Map<String, ModelSchema> {
    val text = File(vecDir, "typeschema.json").readText()
    val raw = parseJson(text) as Map<String, Any?>
    val result = mutableMapOf<String, ModelSchema>()
    for ((name, v) in raw) {
        val m = v as Map<String, Any?>
        val fields = (m["fields"] as List<Any?>).map { f ->
            val fm = f as Map<String, Any?>
            FieldSchema(
                fm["name"] as String, fm["type"] as String,
                fm["optional"] as? Boolean ?: false,
                fm["isArray"] as? Boolean ?: false,
                fm["isModel"] as? Boolean ?: false
            )
        }
        result[name] = ModelSchema(fields, m["recursive"] as? Boolean ?: false)
    }
    return result
}

fun main() {
    schema = loadSchema()
    outDir.resolve("scalars").mkdirs()

    val manifestText = File(vecDir, "manifest.json").readText()
    val manifest = parseJson(manifestText) as Map<String, Any?>
    val scalarsSpec = manifest["scalars"] as Map<String, Any?>
    val testModels = (manifest["testModels"] as List<Any?>).map { it as String }

    val scalarResults = mutableMapOf<String, Boolean>()
    val objectResults = mutableMapOf<String, Triple<Boolean, Boolean, Boolean>>()

    println("Kotlin: processing scalars...")
    for ((name, specVal) in scalarsSpec) {
        val spec = specVal as Map<String, Any?>
        val stype = spec["type"] as String
        val refBuf = File(vecDir, "scalars/$name.mp").readBytes()
        val r = MsgPackReader(refBuf)
        val w = MsgPackWriter()

        try {
            when (stype) {
                "int32" -> w.writeInt32(r.readInt32())
                "int64" -> w.writeInt64(r.readInt64())
                "uint32" -> w.writeUint32(r.readUint32())
                "uint64" -> w.writeUint64(r.readUint64())
                "float32" -> w.writeFloat32(r.readFloat32())
                "float64" -> w.writeFloat64(r.readFloat64())
                "string" -> w.writeString(r.readString())
                "bytes" -> w.writeBytes(r.readBytes())
                "bool" -> w.writeBool(r.readBool())
                else -> throw Exception("unknown type: $stype")
            }
            File(outDir, "scalars/$name.mp").writeBytes(w.toBytes())
            scalarResults[name] = true
        } catch (e: Exception) {
            println("  FAIL $name: ${e.message}")
            scalarResults[name] = false
        }
    }

    println("Kotlin: processing objects...")
    for (name in testModels) {
        objectResults[name] = processObject(name)
    }

    writeResults(scalarResults, objectResults)
    val fail = scalarResults.values.count { !it } + objectResults.values.count { !it.first || !it.second || !it.third }
    val pass = scalarResults.size + objectResults.size - fail
    println("Kotlin done: $pass passed, $fail failed")
    if (fail > 0) kotlin.system.exitProcess(1)
}

// ═══════════════════════════════════
// Generic schema-driven decode/encode
// ═══════════════════════════════════

typealias GenObj = MutableMap<String, Any?>

fun readScalar(r: SpecReader, typ: String): Any? {
    return when (typ) {
        "string" -> r.readString()
        "boolean" -> r.readBool()
        "int8", "int16", "int32" -> r.readInt32()
        "int64" -> r.readInt64()
        "uint8", "uint16", "uint32" -> r.readUint32()
        "uint64" -> r.readUint64()
        "float32" -> r.readFloat32()
        "float64" -> r.readFloat64()
        "bytes" -> r.readBytes()
        else -> throw Exception("unknown scalar: $typ")
    }
}

fun writeScalarMP(w: MsgPackWriter, v: Any?, typ: String) {
    when (typ) {
        "string" -> w.writeString(v as String)
        "boolean" -> w.writeBool(v as Boolean)
        "int8", "int16", "int32" -> w.writeInt32(v as Int)
        "int64" -> w.writeInt64(v as Long)
        "uint8", "uint16", "uint32" -> w.writeUint32(v as UInt)
        "uint64" -> w.writeUint64(v as ULong)
        "float32" -> w.writeFloat32(v as Float)
        "float64" -> w.writeFloat64(v as Double)
        "bytes" -> w.writeBytes(v as ByteArray)
    }
}

fun writeScalarJSON(w: JsonWriter, v: Any?, typ: String) {
    when (typ) {
        "string" -> w.writeString(v as String)
        "boolean" -> w.writeBool(v as Boolean)
        "int8", "int16", "int32" -> w.writeInt32(v as Int)
        "int64" -> w.writeInt64(v as Long)
        "uint8", "uint16", "uint32" -> w.writeUint32(v as UInt)
        "uint64" -> w.writeUint64(v as ULong)
        "float32" -> w.writeFloat32(v as Float)
        "float64" -> w.writeFloat64(v as Double)
        "bytes" -> w.writeBytes(v as ByteArray)
    }
}

fun writeScalarGRON(w: GronWriter, v: Any?, typ: String) {
    when (typ) {
        "string" -> w.writeString(v as String)
        "boolean" -> w.writeBool(v as Boolean)
        "int8", "int16", "int32" -> w.writeInt32(v as Int)
        "int64" -> w.writeInt64(v as Long)
        "uint8", "uint16", "uint32" -> w.writeUint32(v as UInt)
        "uint64" -> w.writeUint64(v as ULong)
        "float32" -> w.writeFloat32(v as Float)
        "float64" -> w.writeFloat64(v as Double)
        "bytes" -> w.writeBytes(v as ByteArray)
    }
}

fun decodeField(r: SpecReader, field: FieldSchema): Any? {
    if (field.isArray) {
        val arr = mutableListOf<Any?>()
        r.beginArray()
        while (r.hasNextElement()) {
            if (field.isModel) arr.add(decodeModel(r, field.type))
            else arr.add(readScalar(r, field.type))
        }
        r.endArray()
        return arr
    }
    if (field.isModel) return decodeModel(r, field.type)
    return readScalar(r, field.type)
}

fun decodeModel(r: SpecReader, modelName: String): GenObj {
    val ms = schema[modelName]!!
    val o: GenObj = mutableMapOf()
    r.beginObject()
    while (r.hasNextField()) {
        val k = r.readFieldName()
        val field = ms.fields.find { it.name == k }
        if (field != null) o[k] = decodeField(r, field)
        else r.skip()
    }
    r.endObject()
    return o
}

fun readScalarGron(r: GronReader, typ: String): Any? {
    return when (typ) {
        "string" -> r.readString()
        "boolean" -> r.readBool()
        "int8", "int16", "int32" -> r.readInt32()
        "int64" -> r.readInt64()
        "uint8", "uint16", "uint32" -> r.readUint32()
        "uint64" -> r.readUint64()
        "float32" -> r.readFloat32()
        "float64" -> r.readFloat64()
        "bytes" -> r.readBytes()
        else -> throw Exception("unknown scalar: $typ")
    }
}

fun decodeFieldGron(r: GronReader, field: FieldSchema): Any? {
    if (field.isArray) {
        val arr = mutableListOf<Any?>()
        r.beginArray()
        while (r.hasNextElement()) {
            r.nextElement()
            if (field.isModel) arr.add(decodeModelGron(r, field.type))
            else arr.add(readScalarGron(r, field.type))
        }
        r.endArray()
        return arr
    }
    if (field.isModel) return decodeModelGron(r, field.type)
    return readScalarGron(r, field.type)
}

fun decodeModelGron(r: GronReader, modelName: String): GenObj {
    val ms = schema[modelName]!!
    val o: GenObj = mutableMapOf()
    r.beginObject()
    while (r.hasNextField()) {
        val k = r.readFieldName()
        val field = ms.fields.find { it.name == k }
        if (field != null) o[k] = decodeFieldGron(r, field)
        else r.skip()
    }
    r.endObject()
    return o
}

fun encodeModelMP(o: GenObj, modelName: String): ByteArray {
    val w = MsgPackWriter()
    encodeModelInlineMP(w, o, modelName)
    return w.toBytes()
}

fun encodeModelInlineMP(w: MsgPackWriter, o: GenObj, modelName: String) {
    val ms = schema[modelName]!!
    var count = 0
    for (f in ms.fields) {
        if (f.optional && !o.containsKey(f.name)) continue
        count++
    }
    w.beginObject(count)
    for (f in ms.fields) {
        if (f.optional && !o.containsKey(f.name)) continue
        w.writeField(f.name)
        encodeFieldMP(w, o[f.name], f)
    }
    w.endObject()
}

fun encodeFieldMP(w: MsgPackWriter, v: Any?, field: FieldSchema) {
    if (field.isArray) {
        val arr = v as List<Any?>
        w.beginArray(arr.size)
        for (item in arr) {
            if (field.isModel) encodeModelInlineMP(w, item as GenObj, field.type)
            else writeScalarMP(w, item, field.type)
        }
        w.endArray()
        return
    }
    if (field.isModel) {
        encodeModelInlineMP(w, v as GenObj, field.type)
        return
    }
    writeScalarMP(w, v, field.type)
}

fun encodeModelJSON(o: GenObj, modelName: String): ByteArray {
    val w = JsonWriter()
    encodeModelInlineJSON(w, o, modelName)
    return w.toBytes()
}

fun encodeModelInlineJSON(w: JsonWriter, o: GenObj, modelName: String) {
    val ms = schema[modelName]!!
    val fieldCount = ms.fields.count { !it.optional || o.containsKey(it.name) }
    w.beginObject(fieldCount)
    for (f in ms.fields) {
        if (f.optional && !o.containsKey(f.name)) continue
        w.writeField(f.name)
        encodeFieldJSON(w, o[f.name], f)
    }
    w.endObject()
}

fun encodeFieldJSON(w: JsonWriter, v: Any?, field: FieldSchema) {
    if (field.isArray) {
        val arr = v as List<Any?>
        w.beginArray(arr.size)
        for (item in arr) {
            w.nextElement()
            if (field.isModel) encodeModelInlineJSON(w, item as GenObj, field.type)
            else writeScalarJSON(w, item, field.type)
        }
        w.endArray()
        return
    }
    if (field.isModel) {
        encodeModelInlineJSON(w, v as GenObj, field.type)
        return
    }
    writeScalarJSON(w, v, field.type)
}

fun encodeModelGRON(o: GenObj, modelName: String): ByteArray {
    val w = GronWriter()
    encodeModelInlineGRON(w, o, modelName)
    return w.toBytes()
}

fun encodeModelInlineGRON(w: GronWriter, o: GenObj, modelName: String) {
    val ms = schema[modelName]!!
    var count = 0
    for (f in ms.fields) {
        if (f.optional && !o.containsKey(f.name)) continue
        count++
    }
    w.beginObject(count)
    for (f in ms.fields) {
        if (f.optional && !o.containsKey(f.name)) continue
        w.writeField(f.name)
        encodeFieldGRON(w, o[f.name], f)
    }
    w.endObject()
}

fun encodeFieldGRON(w: GronWriter, v: Any?, field: FieldSchema) {
    if (field.isArray) {
        val arr = v as List<Any?>
        w.beginArray(arr.size)
        for (item in arr) {
            w.nextElement()
            if (field.isModel) encodeModelInlineGRON(w, item as GenObj, field.type)
            else writeScalarGRON(w, item, field.type)
        }
        w.endArray()
        return
    }
    if (field.isModel) {
        encodeModelInlineGRON(w, v as GenObj, field.type)
        return
    }
    writeScalarGRON(w, v, field.type)
}

fun processObject(name: String): Triple<Boolean, Boolean, Boolean> {
    var mpOk = false
    var jsonOk = false
    var gronOk = false

    try {
        val mpBuf = File(vecDir, "$name.msgpack").readBytes()
        val o1 = decodeModel(MsgPackReader(mpBuf), name)
        File(outDir, "$name.msgpack").writeBytes(encodeModelMP(o1, name))
        mpOk = true
    } catch (e: Exception) {
        println("  FAIL $name.msgpack: ${e.message}")
    }

    var compactOut: ByteArray? = null
    try {
        val jsonBuf = File(vecDir, "$name.json").readBytes()
        val o2 = decodeModel(JsonReader(jsonBuf), name)
        compactOut = encodeModelJSON(o2, name)
        File(outDir, "$name.json").writeBytes(compactOut)
        jsonOk = true
    } catch (e: Exception) {
        println("  FAIL $name.json: ${e.message}")
    }

    if (compactOut != null) {
        val prettyFile = File(vecDir, "$name.pretty.json")
        if (prettyFile.exists()) {
            try {
                val o3 = decodeModel(JsonReader(prettyFile.readBytes()), name)
                val prettyOut = encodeModelJSON(o3, name)
                if (!prettyOut.contentEquals(compactOut)) {
                    println("  FAIL $name.pretty.json: re-encoded bytes differ")
                    jsonOk = false
                }
            } catch (e: Exception) {
                println("  FAIL $name.pretty.json: ${e.message}")
                jsonOk = false
            }
        }
    }

    try {
        val gronBuf = File(vecDir, "$name.gron").readBytes()
        val o4 = decodeModelGron(GronReader(gronBuf), name)
        File(outDir, "$name.gron").writeBytes(encodeModelGRON(o4, name))
        gronOk = true
    } catch (e: Exception) {
        println("  FAIL $name.gron: ${e.message}")
    }

    return Triple(mpOk, jsonOk, gronOk)
}

// ─── Results ───

fun writeResults(
    scalarResults: Map<String, Boolean>,
    objectResults: Map<String, Triple<Boolean, Boolean, Boolean>>
) {
    val sb = StringBuilder()
    sb.append("{\"scalars\":{")
    scalarResults.entries.forEachIndexed { i, (name, pass) ->
        if (i > 0) sb.append(',')
        sb.append("\"$name\":{\"pass\":$pass}")
    }
    sb.append("},\"objects\":{")
    objectResults.entries.forEachIndexed { i, (name, triple) ->
        if (i > 0) sb.append(',')
        sb.append("\"$name\":{\"mp\":${triple.first},\"json\":${triple.second},\"gron\":${triple.third}}")
    }
    sb.append("}}")
    File(outDir, "results.json").writeText(sb.toString())
}

// ─── Minimal JSON parser (no external deps) ───

fun parseJson(text: String): Any? {
    val p = JsonParser(text)
    return p.parseValue()
}

private class JsonParser(private val src: String) {
    private var pos = 0

    fun parseValue(): Any? {
        skipWs()
        if (pos >= src.length) throw Exception("json: unexpected end")
        return when (src[pos]) {
            '{' -> parseObject()
            '[' -> parseArray()
            '"' -> parseString()
            't', 'f' -> parseBool()
            'n' -> parseNull()
            else -> parseNumber()
        }
    }

    private fun parseObject(): Map<String, Any?> {
        pos++
        val m = linkedMapOf<String, Any?>()
        skipWs()
        if (pos < src.length && src[pos] == '}') { pos++; return m }
        while (true) {
            skipWs()
            val key = parseString() as String
            skipWs(); expect(':')
            m[key] = parseValue()
            skipWs()
            if (pos < src.length && src[pos] == ',') { pos++; continue }
            break
        }
        expect('}')
        return m
    }

    private fun parseArray(): List<Any?> {
        pos++
        val list = mutableListOf<Any?>()
        skipWs()
        if (pos < src.length && src[pos] == ']') { pos++; return list }
        while (true) {
            list.add(parseValue())
            skipWs()
            if (pos < src.length && src[pos] == ',') { pos++; continue }
            break
        }
        expect(']')
        return list
    }

    private fun parseString(): String {
        expect('"')
        val sb = StringBuilder()
        while (pos < src.length) {
            val c = src[pos++]
            if (c == '"') return sb.toString()
            if (c == '\\') {
                val e = src[pos++]
                when (e) {
                    '"' -> sb.append('"')
                    '\\' -> sb.append('\\')
                    '/' -> sb.append('/')
                    'b' -> sb.append('\b')
                    'f' -> sb.append('\u000C')
                    'n' -> sb.append('\n')
                    'r' -> sb.append('\r')
                    't' -> sb.append('\t')
                    'u' -> {
                        val hex = src.substring(pos, pos + 4); pos += 4
                        var cp = hex.toInt(16)
                        if (cp in 0xD800..0xDBFF && pos + 6 <= src.length && src[pos] == '\\' && src[pos + 1] == 'u') {
                            pos += 2
                            val hex2 = src.substring(pos, pos + 4); pos += 4
                            val low = hex2.toInt(16)
                            if (low in 0xDC00..0xDFFF) cp = 0x10000 + (cp - 0xD800) * 0x400 + (low - 0xDC00)
                        }
                        sb.append(cp.toChar())
                    }
                    else -> throw Exception("json: invalid escape \\$e")
                }
            } else sb.append(c)
        }
        throw Exception("json: unterminated string")
    }

    private fun parseBool(): Boolean {
        if (src.startsWith("true", pos)) { pos += 4; return true }
        if (src.startsWith("false", pos)) { pos += 5; return false }
        throw Exception("json: expected bool")
    }

    private fun parseNull(): Nothing? {
        if (src.startsWith("null", pos)) { pos += 4; return null }
        throw Exception("json: expected null")
    }

    private fun parseNumber(): Number {
        val start = pos
        if (pos < src.length && src[pos] == '-') pos++
        if (pos < src.length && src[pos] == '0') pos++
        else while (pos < src.length && src[pos] in '0'..'9') pos++
        if (pos < src.length && src[pos] == '.') { pos++; while (pos < src.length && src[pos] in '0'..'9') pos++ }
        if (pos < src.length && (src[pos] == 'e' || src[pos] == 'E')) { pos++; if (pos < src.length && (src[pos] == '+' || src[pos] == '-')) pos++; while (pos < src.length && src[pos] in '0'..'9') pos++ }
        val raw = src.substring(start, pos)
        return if ('.' in raw || 'e' in raw || 'E' in raw) raw.toDouble() else raw.toLong()
    }

    private fun skipWs() { while (pos < src.length) { val c = src[pos]; if (c == ' ' || c == '\t' || c == '\n' || c == '\r') pos++ else break } }
    private fun expect(ch: Char) { skipWs(); if (pos >= src.length || src[pos] != ch) throw Exception("json: expected '$ch'"); pos++ }
}
