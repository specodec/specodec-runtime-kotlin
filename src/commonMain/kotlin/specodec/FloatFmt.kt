package specodec

import specodec.ryu.*

fun formatFloat32(value: Float): String {
    return float32ToString(value)
}

fun formatFloat64(value: Double): String {
    return float64ToString(value)
}