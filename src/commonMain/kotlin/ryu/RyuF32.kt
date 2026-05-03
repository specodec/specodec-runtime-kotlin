package ryu

fun float32ToString(f: Float): String {
    val bits = f.toRawBits()
    
    val sign = (bits shr 31) != 0
    val ieeeMantissa = bits and 0x7FFFFF
    val ieeeExponent = (bits shr 23) and 0xFF
    
    if (ieeeExponent == 255) {
        if (ieeeMantissa == 0) return if (sign) "-Infinity" else "Infinity"
        return "NaN"
    }
    if (ieeeExponent == 0 && ieeeMantissa == 0) return if (sign) "-0E0" else "0E0"
    
    var e2: Int
    var m2: ULong
    if (ieeeExponent == 0) {
        e2 = 1 - FLOAT_BIAS - FLOAT_MANTISSA_BITS - 2
        m2 = ieeeMantissa.toULong()
    } else {
        e2 = ieeeExponent - FLOAT_BIAS - FLOAT_MANTISSA_BITS - 2
        m2 = ((1 shl FLOAT_MANTISSA_BITS) or ieeeMantissa).toULong()
    }
    
    val even = (m2 and 1UL) == 0UL
    val acceptBounds = even
    
    val mv = m2 * 4UL
    val mp = mv + 2UL
    var mmShift = if (ieeeMantissa != 0 || ieeeExponent <= 1) 1 else 0
    val mm = mv - 1UL - mmShift.toULong()
    
    var vrIsTrailingZeros = false
    var vmIsTrailingZeros = false
    var lastDigit = 0UL
    var e10: Int
    var vr: ULong
    var vp: ULong
    var vm: ULong
    
    if (e2 >= 0) {
        val q = log10Pow2(e2)
        e10 = q
        val k = FLOAT_POW5_INV_BITCOUNT + pow5bits(q) - 1
        val i = -e2 + q + k
        
        vr = mulShift32(mv, q, i)
        vp = mulShift32(mp, q, i)
        vm = mulShift32(mm, q, i)
        
        if (q != 0 && (FLOAT_POW5_INV_SPLIT[q - 1] and 15UL) == 0UL) {
            vrIsTrailingZeros = multipleOfPowerOf5(mv, q)
        }
        if (acceptBounds) {
            if (multipleOfPowerOf5(mm, q)) vmIsTrailingZeros = true
        } else {
            if (multipleOfPowerOf5(mp, q)) vp = mp
        }
        
        if (q <= 9) {
            val pow10 = POW10_32[q]
            vr *= pow10.toULong()
            vp *= pow10.toULong()
            vm *= pow10.toULong()
        }
    } else {
        val q = log10Pow5(-e2)
        e10 = q + e2
        val i = -e2 - q
        val k = pow5bits(i) - FLOAT_POW5_BITCOUNT
        val j = q - k
        
        vr = mulShift32(mv, i, j)
        vp = mulShift32(mp, i, j)
        vm = mulShift32(mm, i, j)
        
        if (q != 0 && (FLOAT_POW5_SPLIT[i - 1] and 31UL) == 0UL) {
            vrIsTrailingZeros = multipleOfPowerOf2(mv, q)
        }
        if (acceptBounds) {
            if (multipleOfPowerOf2(mm, q)) vmIsTrailingZeros = true
        } else {
            if (multipleOfPowerOf2(mp, q)) vp = mp
        }
        
        if (q <= 9) {
            val pow10 = POW10_32[q]
            vr *= pow10.toULong()
            vp *= pow10.toULong()
            vm *= pow10.toULong()
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
