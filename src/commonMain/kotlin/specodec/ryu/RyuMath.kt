package specodec.ryu

fun pow5Bits(e: Int): Int = e * 1217359 / 524288 + 1
fun log10Pow2(e: Int): Int = e * 78913 / 262144
fun log10Pow5(e: Int): Int = e * 732923 / 1048576

fun decimalLength17(v: ULong): Int {
    if (v >= 10000000000000000UL) return 17
    if (v >= 1000000000000000UL) return 16
    if (v >= 100000000000000UL) return 15
    if (v >= 10000000000000UL) return 14
    if (v >= 1000000000000UL) return 13
    if (v >= 100000000000UL) return 12
    if (v >= 10000000000UL) return 11
    if (v >= 1000000000UL) return 10
    if (v >= 100000000UL) return 9
    if (v >= 10000000UL) return 8
    if (v >= 1000000UL) return 7
    if (v >= 100000UL) return 6
    if (v >= 10000UL) return 5
    if (v >= 1000UL) return 4
    if (v >= 100UL) return 3
    if (v >= 10UL) return 2
    return 1
}

fun decimalLength9(v: UInt): Int {
    if (v >= 100000000U) return 9
    if (v >= 10000000U) return 8
    if (v >= 1000000U) return 7
    if (v >= 100000U) return 6
    if (v >= 10000U) return 5
    if (v >= 1000U) return 4
    if (v >= 100U) return 3
    if (v >= 10U) return 2
    return 1
}

fun mulShift32(m: ULong, factor: ULong, shift: Int): ULong {
    val factorLo = factor and 0xFFFFFFFFUL
    val factorHi = factor shr 32
    val bits0 = m * factorLo
    val bits1 = m * factorHi
    val sumVal = (bits0 shr 32) + bits1
    return (sumVal shr (shift - 32)) and 0xFFFFFFFFUL
}

fun mulShift64(m: ULong, mul: ULongArray, shift: Int): ULong {
    val (hi0, _) = umul128(m, mul[0])
    val (hi2, lo2) = umul128(m, mul[1])
    
    val sumLo = lo2 + hi0
    var carry = 0UL
    if (sumLo < lo2) carry = 1UL
    val sumHi = hi2 + carry
    
    val shiftAmount = shift - 64
    if (shiftAmount >= 128) return 0UL
    if (shiftAmount >= 64) return sumHi shr (shiftAmount - 64)
    if (shiftAmount == 0) return sumLo
    return (sumHi shl (64 - shiftAmount)) or (sumLo shr shiftAmount)
}

fun umul128(a: ULong, b: ULong): Pair<ULong, ULong> {
    val aLo = a and 0xFFFFFFFFUL
    val aHi = a shr 32
    val bLo = b and 0xFFFFFFFFUL
    val bHi = b shr 32
    
    val ll = aLo * bLo
    val lh = aLo * bHi
    val hl = aHi * bLo
    val hh = aHi * bHi
    
    val mid = lh + hl
    var overflow = 0UL
    if (mid < lh) overflow = 1UL
    
    var hi = hh + (mid shr 32) + overflow
    var lo = ll + ((mid and 0xFFFFFFFFUL) shl 32)
    if (lo < ll) hi++
    
    return Pair(hi, lo)
}

fun multipleOfPowerOf5_64(value: ULong, q: Int): Boolean {
    if (q == 0) return true
    if (q >= 64) return value == 0UL
    var pow5 = 5UL
    for (i in 1 until q) pow5 *= 5UL
    return (value % pow5) == 0UL
}

fun multipleOfPowerOf2_64(value: ULong, q: Int): Boolean {
    if (q == 0) return true
    if (q >= 64) return value == 0UL
    return (value and ((1UL shl q) - 1UL)) == 0UL
}

fun multipleOfPowerOf5_32(value: UInt, q: Int): Boolean {
    if (q == 0) return true
    if (q >= 32) return value == 0U
    var pow5: UInt = 5U
    for (i in 1 until q) {
        pow5 *= 5U
    }
    return (value % pow5) == 0U
}

fun multipleOfPowerOf2_32(value: UInt, q: Int): Boolean {
    if (q == 0) return true
    if (q >= 32) return value == 0U
    return (value and ((1U shl q) - 1U)) == 0U
}