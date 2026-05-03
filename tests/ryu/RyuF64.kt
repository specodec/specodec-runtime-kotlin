package specodec.ryu

const val DOUBLE_MANTISSA_BITS: Int = 52
const val DOUBLE_BIAS: Int = 1023
const val DOUBLE_POW5_INV_BITCOUNT: Int = 125
const val DOUBLE_POW5_BITCOUNT: Int = 125
fun float64ToString(d: Double): String {
    val bits = d.toRawBits()
    
    val sign = (bits shr 63) != 0L
    val ieeeMantissa = bits and 0xFFFFFFFFFFFFFL
    val ieeeExponent = ((bits shr 52) and 0x7FFL).toInt()
    
    if (ieeeExponent == 2047) {
        if (ieeeMantissa == 0L) {
            return if (sign) "-Infinity" else "Infinity"
        }
        return "NaN"
    }
    if (ieeeExponent == 0 && ieeeMantissa == 0L) {
        return if (sign) "-0E0" else "0E0"
    }
    
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
    var mmShift = 0UL
    if (ieeeMantissa != 0L || ieeeExponent <= 1) {
        mmShift = 1UL
    }
    val mm = mv - 1UL - mmShift
    
    var vrIsTrailingZeros = false
    var vmIsTrailingZeros = false
    var lastDigit = 0UL
    var e10: Int
    var vr: ULong
    var vp: ULong
    var vm: ULong
    
    // Tables are now direct literals, no init needed
    
    if (e2 >= 0) {
        val q = log10Pow2(e2)
        e10 = q
        val k = DOUBLE_POW5_INV_BITCOUNT + pow5bits(q) - 1
        val i = -e2 + q + k
        
        vr = mulShift64(mv, DOUBLE_POW5_INV_SPLIT[q], i)
        vp = mulShift64(mp, DOUBLE_POW5_INV_SPLIT[q], i)
        vm = mulShift64(mm, DOUBLE_POW5_INV_SPLIT[q], i)
        
        if (q != 0 && (vp - 1UL) / 10UL <= vm / 10UL) {
            val l = DOUBLE_POW5_INV_BITCOUNT + pow5bits(q - 1) - 1
            lastDigit = mulShift64(mv, DOUBLE_POW5_INV_SPLIT[q - 1], -e2 + q - 1 + l) % 10UL
        }
        
        if (q <= 21) {
            if (mv % 5UL == 0UL) {
                vrIsTrailingZeros = multipleOfPowerOf5_64(mv, q)
            } else if (acceptBounds) {
                vmIsTrailingZeros = multipleOfPowerOf5_64(mm, q)
            } else {
                if (multipleOfPowerOf5_64(mp, q)) {
                    vp--
                }
            }
        }
    } else {
        val q = log10Pow5(-e2)
        e10 = q + e2
        val i = -e2 - q
        val k = pow5bits(i) - DOUBLE_POW5_BITCOUNT
        val j = q - k
        
        vr = mulShift64(mv, DOUBLE_POW5_SPLIT[i], j)
        vp = mulShift64(mp, DOUBLE_POW5_SPLIT[i], j)
        vm = mulShift64(mm, DOUBLE_POW5_SPLIT[i], j)
        
        if (q != 0 && (vp - 1UL) / 10UL <= vm / 10UL) {
            val j2 = q - 1 - (pow5bits(i + 1) - DOUBLE_POW5_BITCOUNT)
            lastDigit = mulShift64(mv, DOUBLE_POW5_SPLIT[i + 1], j2) % 10UL
        }
        
        if (q <= 1) {
            vrIsTrailingZeros = true
            if (acceptBounds) {
                vmIsTrailingZeros = mmShift == 1UL
            } else {
                vp--
            }
        } else if (q < 63) {
            vrIsTrailingZeros = multipleOfPowerOf2_64(mv, q - 1)
            if (acceptBounds) {
                vmIsTrailingZeros = multipleOfPowerOf5_64(mm, q)
            } else {
                if (multipleOfPowerOf5_64(mp, q)) {
                    vp--
                }
            }
        }
    }
    
    var removed = 0
    var vr2 = vr
    var vp2 = vp
    var vm2 = vm
    
    if (vmIsTrailingZeros || vrIsTrailingZeros) {
        while (vp2 / 10UL > vm2 / 10UL) {
            vmIsTrailingZeros = vmIsTrailingZeros && (vm2 % 10UL == 0UL)
            vrIsTrailingZeros = vrIsTrailingZeros && (lastDigit == 0UL)
            lastDigit = vr2 % 10UL
            vr2 /= 10UL
            vp2 /= 10UL
            vm2 /= 10UL
            removed++
        }
        
        if (vmIsTrailingZeros) {
            while (vm2 % 10UL == 0UL) {
                vrIsTrailingZeros = vrIsTrailingZeros && (lastDigit == 0UL)
                lastDigit = vr2 % 10UL
                vr2 /= 10UL
                vp2 /= 10UL
                vm2 /= 10UL
                removed++
            }
        }
        
        if (vrIsTrailingZeros && lastDigit == 5UL && (vr2 and 1UL) == 0UL) {
            lastDigit = 4UL
        }
        
        val roundUp = (vr2 == vm2 && (!acceptBounds || !vmIsTrailingZeros)) || lastDigit >= 5UL
        var output = vr2
        if (roundUp) {
            output++
        }
        val exp = e10 + removed
        val olength = decimalLength17(output)
        
        var result = ""
        if (sign) result = "-"
        val digits = output.toString()
        if (olength == 1) {
            result += digits
        } else {
            result += digits.substring(0, 1) + "." + digits.substring(1)
        }
        result += "E" + (exp + olength - 1).toString()
        return result
    } else {
        while (vp2 / 10UL > vm2 / 10UL) {
            lastDigit = vr2 % 10UL
            vr2 /= 10UL
            vp2 /= 10UL
            vm2 /= 10UL
            removed++
        }
        
        var output = vr2
        if (vr2 == vm2 || lastDigit >= 5UL) {
            output++
        }
        val exp = e10 + removed
        val olength = decimalLength17(output)
        
        var result = ""
        if (sign) result = "-"
        val digits = output.toString()
        if (olength == 1) {
            result += digits
        } else {
            result += digits.substring(0, 1) + "." + digits.substring(1)
        }
        result += "E" + (exp + olength - 1).toString()
        return result
    }
}