package specodec

// fmtFloat32: returns the shortest decimal string that uniquely identifies
// the given Float value and round-trips back to the same Float bits.
//
// Kotlin/JVM's Float.toString() uses the Ryu algorithm internally
// (via java.lang.Float.toString, which uses FormattedFloatingDecimal / Ryu
// in modern JVMs).
//
// TODO: if a standalone Ryu implementation is needed (e.g. for Kotlin/Native
// or exact cross-language parity), replace this body with an explicit Ryu f32 port.
internal fun fmtFloat32(value: Float): String {
    val s = value.toString()
    return if (s.contains('.') && !s.contains('E', ignoreCase = true))
        s.trimEnd('0').trimEnd('.')
    else s
}
