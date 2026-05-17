# Developer Guide — Kotlin Runtime

## Type Mapping Table

| TypeSpec Type        | Kotlin Type      | Notes                                              |
|----------------------|------------------|----------------------------------------------------|
| `boolean`            | `Boolean`        |                                                    |
| `int8`               | `Byte`           | `readInt32().toByte()`                             |
| `int16`              | `Short`          | `readInt32().toShort()`                            |
| `int32`              | `Int`            | Direct                                             |
| `int64`              | `Long`           | Direct                                             |
| `uint8`              | `UByte`          | **Native unsigned support**                        |
| `uint16`             | `UShort`         | **Native unsigned support**                        |
| `uint32`             | `UInt`           | **Native unsigned support**                        |
| `uint64`             | `ULong`          | **Native unsigned support**                        |
| `float32`            | `Float`          | Single precision                                   |
| `float64`            | `Double`         | Double precision                                   |
| `string`             | `String`         |                                                    |
| `bytes`              | `ByteArray`      |                                                    |

Kotlin is one of the few languages in the Specodec ecosystem with **native unsigned integer types** (`UByte`, `UShort`, `UInt`, `ULong`). This eliminates the need for manual masking or boxed types for unsigned values.

## Model Representation

**Models** are emitted as Kotlin `data class` types:

```kotlin
data class Person(
    val name: String,
    val age: Int,
    val nickname: String? = null
)
```

Fields appear in declaration order. Optional fields have default values.

## Optional / Nullable

- **Optional fields** use Kotlin's **nullable type syntax**: `T? = null`
- Default value `= null` means the field is omitted from constructor calls when absent.
- `null` represents absence for all types (reference and boxed primitives).
- Generated encode: `if (v.nickname != null) { w.writeField("nickname"); w.writeString(v.nickname) }`
- Generated decode: `var __nickname: String? = null`
- `SpecUndefined` is an object: `object SpecUndefined`

## Union Representation

Discriminated unions use **`sealed class`** with per-variant **`data class`** children:

```kotlin
sealed class Shape {
    object Undefined : Shape()
    data class Circle(val radius: Double) : Shape()
    data class Rectangle(val width: Double, val height: Double) : Shape()
}
```

The `Undefined` object captures unrecognized variants.

## Enum Representation

Enums are represented as **`String`** — not Kotlin `enum class`. This maintains extensibility.

## Ryu Implementation

Package `specodec.ryu`:

| File          | Purpose                                           |
|---------------|---------------------------------------------------|
| `RyuF32.kt`   | `float32` → shortest decimal string               |
| `RyuF64.kt`   | `float64` → shortest decimal string               |
| `RyuMath.kt`  | Shared integer math                               |
| `TablesF32.kt`| F32 lookup tables                                 |
| `TablesF64.kt`| F64 lookup tables                                 |

**Bit extraction:**
- F32: `Float.fromBits(bits)` / `Float.toRawBits(value)`
- F64: `Double.fromBits(bits)` / `Double.toRawBits(value)`

Kotlin/Multiplatform uses `Float.fromBits()` and `Double.fromBits()` instead of JVM-specific methods. They map to `java.lang.Float.floatToRawIntBits` on JVM and equivalent on native/JS.

**Table sizes:** Same as Java:
- `FLOAT_POW5_INV_SPLIT`: 27 × `Long` (indices 0..26)
- `FLOAT_POW5_SPLIT`: 48 × `Long` (indices 0..47)
- `DOUBLE_POW5_INV_SPLIT`: ~342 × `LongArray` (two-element arrays)
- `DOUBLE_POW5_SPLIT`: ~309 × `LongArray`

**Key functions:** Same structure as Java — `mulShift32`, `mulShift64`, `decimalLength9`, `decimalLength17`, `log10Pow2`, `log10Pow5`, `pow5bits`, divisibility checks.

## MsgPack Reader / Writer

**Reader** (`MsgPackReader.kt`):
- Accumulation: counter-based. `containerCount: MutableList<Int>` stack.
- `data: ByteArray`, `var pos: Int` mutable index.
- Byte reads use `readByte().toInt() and 0xFF` for unsigned interpretation.
- **int8/int16 decoding**: `readInt32().toByte()` / `readInt32().toShort()` — reads as 32-bit then narrows.
- Float: `Float.fromBits(bits)`, `Double.fromBits(bits)`.
- String: `data.sliceArray(pos until pos + len).decodeToString()` for UTF-8 decoding.
- int64: `((readU32().toLong() and 0xFFFFFFFFL) shl 32) or (readU32().toLong() and 0xFFFFFFFFL)`.
- NaN/Inf: raw bits stored, no special handling.

**Writer** (`MsgPackWriter.kt`):
- Accumulation: `MutableList<Byte>`.
- **Unsigned types**: `writeUint8(UByte)`, `writeUint16(UShort)`, `writeUint32(UInt)`, `writeUint64(ULong)` — direct unsigned write paths.
- Float: `Float.toRawBits(value)`, `Double.toRawBits(value)`.
- int16 masking: `writeU16(value and 0xFFFF)` for signed paths.

## JSON Reader / Writer

**Reader** (`JsonReader.kt`):
- Converts `ByteArray` to `String` via `data.decodeToString()`.
- **Unicode escape**: `\uXXXX` parsed via `hex.toInt(16)`. Surrogate pairs supported.
- Number parsing: validates chars, then `.toInt()`, `.toLong()`, etc.
- NaN/Inf: `"NaN"`, `"Infinity"`, `"-Infinity"`.

**Writer** (`JsonWriter.kt`):
- Accumulation: `StringBuilder` via `buildString { ... }`.
- Escape: standard set.
- int64/uint64: quoted strings.
- NaN/Inf: quoted strings.

## Gron Reader / Writer

**Reader** (`GronReader.kt`):
- Parses to lines, extracts `path` and `value`.
- Context stack with inner data class.
- Path-based nesting checks.

**Writer** (`GronWriter.kt`):
- Segment stack starting with `"json"`.
- Nesting info with index tracking.
- `String.join` → `encodeToByteArray()`.

## State Management

Kotlin uses **mutable** state throughout. All reader/writer buffers use mutable lists. Models are `data class` (immutable). Decode accumulators use `var` with nullable defaults.

## SpecReader / SpecWriter Interfaces

**SpecReader** (`SpecReader.kt:1-24`):
```kotlin
interface SpecReader {
    fun beginObject(); fun hasNextField(): Boolean; fun readFieldName(): String; fun endObject()
    fun beginArray(); fun hasNextElement(): Boolean; fun endArray()
    fun readString(): String; fun readBool(): Boolean
    fun readInt32(): Int; fun readInt64(): Long
    fun readUint32(): UInt; fun readUint64(): ULong
    fun readFloat32(): Float; fun readFloat64(): Double
    fun readNull(); fun readBytes(): ByteArray; fun readEnum(): String
    fun isNull(): Boolean; fun skip()
}
```

**SpecWriter** (`SpecWriter.kt:1-22`):
```kotlin
interface SpecWriter {
    fun writeString(value: String); fun writeBool(value: Boolean)
    fun writeInt32(value: Int); fun writeInt64(value: Long)
    fun writeUint32(value: UInt); fun writeUint64(value: ULong)
    fun writeFloat32(value: Float); fun writeFloat64(value: Double)
    fun writeNull(); fun writeBytes(value: ByteArray); fun writeEnum(value: String)
    fun beginObject(fieldCount: Int); fun writeField(name: String); fun endObject()
    fun beginArray(elementCount: Int); fun nextElement(); fun endArray()
    fun toBytes(): ByteArray
}
```

Note: Unlike Java where `writeUint32` takes `int` due to lack of unsigned types, Kotlin natively uses `UInt`/`ULong`.

## Emitter Generation Pattern

```kotlin
// Generated:
data class Person(
    val name: String,
    val age: Int,
    val nickname: String? = null
) {
    companion object {
        val CODEC = SpecCodec<Person>(
            encode = { w, v ->
                w.beginObject(if (v.nickname != null) 3 else 2)
                w.writeField("name")
                w.writeString(v.name)
                w.writeField("age")
                w.writeInt32(v.age)
                if (v.nickname != null) {
                    w.writeField("nickname")
                    w.writeString(v.nickname)
                }
                w.endObject()
            },
            decode = { r ->
                var __name = ""
                var __age = 0
                var __nickname: String? = null
                r.beginObject()
                while (r.hasNextField()) {
                    when (r.readFieldName()) {
                        "name" -> __name = r.readString()
                        "age" -> __age = r.readInt32()
                        "nickname" -> __nickname = r.readString()
                        else -> r.skip()
                    }
                }
                r.endObject()
                Person(__name, __age, __nickname)
            }
        )
    }
}
```

## Known Quirks / Bugs

1. **Kotlin multiplatform**: The runtime is structured for multiplatform (`commonMain`). Float bit operations use `Float.fromBits`/`Double.fromBits` (Kotlin API) rather than Java-specific `floatToRawIntBits`.

2. **Byte is signed**: Despite `UByte` being available in the type system, `readByte()` returns the JVM's signed `Byte`. All byte reads cast via `.toInt() and 0xFF` for unsigned interpretation.

3. **Unsigned type advantage**: Kotlin is the only language in the Specodec ecosystem with native unsigned types. The `SpecReader.readUint32()` returns `UInt` and `SpecWriter.writeUint32()` takes `UInt` — no manual masking needed at the interface level.

4. **Build dual output**: The `Containerfile.build` attempts both `jvmJar` and `jsBrowserProductionLibraryPrepareKotlinGradlePluginWarnings`, falling back to `jvmJar` only on failure. Multiplatform support is work-in-progress.

## DevContainer

- Base image: `dev:kotlin` (extends `dev:java`)
- Build: `gradle jvmJar --no-daemon -q`
- Config: `build.gradle.kts` + `settings.gradle.kts` (Kotlin DSL)
- Containerfile: `Containerfile.build` — copies Gradle configs + `src/`, uses BuildKit cache mounts for `~/.gradle`, attempts multi-target build with fallback
- Output: `/out/` from `build/libs/`
