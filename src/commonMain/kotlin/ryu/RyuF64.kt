package ryu

fun float64ToString(d: Double): String {
    val bits = d.toRawBits()
    
    val sign = (bits shr 63) != 0
    val ieeeMantissa = bits and 0xFFFFFFFFFFFFFL
    val ieeeExponent = ((bits shr 52) and 0x7FFL).toInt()
    
    if (ieeeExponent == 2047) {
        if (ieeeMantissa == 0L) return if (sign) "-Infinity" else "Infinity"
        return "NaN"
    }
    if (ieeeExponent == 0 && ieeeMantissa == 0L) return if (sign) "-0E0" else "0E0"
    
    var e2: Int
    var m2: ULong
    if (ieeeExponent == 0) {
        e2 = 1 - DOUBLE_BIAS - DOUBLE_MANTISSA_BITS - 2
        m2 = ieeeMantissa.toULong()
    } else {
        e2 = ieeeExponent - DOUBLE_BIAS - DOUBLE_MANTISSA_BITS - 2
        m2 = ((1L shl DOUBLE_MANTISSA_BITS) or ieeeMantissa).toULong()
    }
    
    val even = (m2 and 1UL) == 0UL
    val acceptBounds = even
    
    val mv = m2 * 4UL
    val mp = mv + 2UL
    var mmShift = if (ieeeMantissa != 0L || ieeeExponent <= 1) 1 else 0
    val mm = mv - 1UL - mmShift.toULong()
    
    var vrIsTrailingZeros = false
    var vmIsTrailingZeros = false
    var lastDigit = 0UL
    var e10: Int
    var vr: ULong
    var vp: ULong
    var vm: ULong
    
    if (e2 >= 0) {
        val q = log10Pow2_64(e2)
        e10 = q
        val k = DOUBLE_POW5_INV_BITCOUNT + pow5bits_64(q) - 1
        val i = -e2 + q + k
        
        vr = mulShift64(mv, q, i)
        vp = mulShift64(mp, q, i)
        vm = mulShift64(mm, q, i)
        
        if (q != 0 && (DOUBLE_POW5_INV_SPLIT[q - 1] and 31UL) == 0UL) {
            vrIsTrailingZeros = multipleOfPowerOf5_64(mv, q)
        }
        if (acceptBounds) {
            if (multipleOfPowerOf5_64(mm, q)) vmIsTrailingZeros = true
        } else {
            if (multipleOfPowerOf5_64(mp, q)) vp = mp
        }
        
        if (q <= 21) {
            val pow10 = POW10_64[q]
            vr *= pow10
            vp *= pow10
            vm *= pow10
        }
    } else {
        val q = log10Pow5_64(-e2)
        e10 = q + e2
        val i = -e2 - q
        val k = pow5bits_64(i) - DOUBLE_POW5_BITCOUNT
        val j = q - k
        
        vr = mulShift64(mv, i, j)
        vp = mulShift64(mp, i, j)
        vm = mulShift64(mm, i, j)
        
        if (q != 0 && (DOUBLE_POW5_SPLIT[i - 1] and 63UL) == 0UL) {
            vrIsTrailingZeros = multipleOfPowerOf2_64(mv, q)
        }
        if (acceptBounds) {
            if (multipleOfPowerOf2_64(mm, q)) vmIsTrailingZeros = true
        } else {
            if (multipleOfPowerOf2_64(mp, q)) vp = mp
        }
        
        if (q <= 21) {
            val pow10 = POW10_64[q]
            vr *= pow10
            vp *= pow10
            vm *= pow10
        }
    }
    
    var removed = 0
    var lastRemovedDigit = 0UL
    
    while (vp / 10UL > vm / 10UL) {
        vmIsTrailingZeros = vm % 10UL == 0UL
        vrIsTrailingZeros = lastRemovedDigit == 0UL && vr % 10UL == 0UL
        lastRemovedDigit = vr % 10UL
        vr /= 10UL
        vp /= 10UL
        vm /= 10UL
        removed++
    }
    
    if (vmIsTrailingZeros) {
        while (vm % 10UL == 0UL) {
            vrIsTrailingZeros = lastRemovedDigit == 0UL && vr % 10UL == 0UL
            lastRemovedDigit = vr % 10UL
            vr /= 10UL
            vp /= 10UL
            vm /= 10UL
            removed++
        }
    }
    
    if (vrIsTrailingZeros && (lastRemovedDigit == 5UL) && (vr % 2UL == 0UL)) {
        vr /= 2UL
        vp /= 2UL
        vm /= 2UL
        removed++
    }
    
    val exp = e10 + removed
    
    val digits = vr.toString()
    val signStr = if (sign) "-" else ""
    
    if (exp >= 10) {
        return "$signStr$digits.E+$exp"
    } else if (exp >= 0) {
        return "$signStr$digits.E+$exp"
    } else {
        return "$signStr$digits.E$exp"
    }
}
