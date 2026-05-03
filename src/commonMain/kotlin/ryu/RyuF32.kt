package ryu

const val FLOAT_MANTISSA_BITS: Int = 23
const val FLOAT_BIAS: Int = 127
const val FLOAT_POW5_INV_BITCOUNT: Int = 59
const val FLOAT_POW5_BITCOUNT: Int = 61

fun float32ToString(f: Float): String {
    val bits = f.toRawBits()
    
    val sign = (bits shr 31) != 0
    val ieeeMantissa = bits and 0x7FFFFF
    val ieeeExponent = (bits shr 23) and 0xFF
    
    if (ieeeExponent == 255) {
        if (ieeeMantissa == 0) {
            return if (sign) "-Infinity" else "Infinity"
        }
        return "NaN"
    }
    if (ieeeExponent == 0 && ieeeMantissa == 0) {
        return if (sign) "-0E0" else "0E0"
    }
    
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
    var mmShift = 0
    if (ieeeMantissa != 0 || ieeeExponent <= 1) {
        mmShift = 1
    }
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
        
        vr = mulShift32(mv, FLOAT_POW5_INV_SPLIT[q] + 1UL, i)
        vp = mulShift32(mp, FLOAT_POW5_INV_SPLIT[q] + 1UL, i)
        vm = mulShift32(mm, FLOAT_POW5_INV_SPLIT[q] + 1UL, i)
        
        if (q != 0 && (vp - 1UL) / 10UL <= vm / 10UL) {
            val l = FLOAT_POW5_INV_BITCOUNT + pow5bits(q - 1) - 1
            lastDigit = mulShift32(mv, FLOAT_POW5_INV_SPLIT[q - 1] + 1UL, -e2 + q - 1 + l) % 10UL
        }
        
        if (q <= 9) {
            if (mv % 5UL == 0UL) {
vrIsTrailingZeros = multipleOfPowerOf5_32(mv.toUInt(), q)
                vmIsTrailingZeros = multipleOfPowerOf5_32(mm.toUInt(), q)
                if (multipleOfPowerOf5_32(mp.toUInt(), q)) {
                    vp--
                }
            }
        }
    } else {
        val q = log10Pow5(-e2)
        e10 = q + e2
        val i = -e2 - q
        val k = pow5bits(i) - FLOAT_POW5_BITCOUNT
        val j = q - k
        
        vr = mulShift32(mv, FLOAT_POW5_SPLIT[i], j)
        vp = mulShift32(mp, FLOAT_POW5_SPLIT[i], j)
        vm = mulShift32(mm, FLOAT_POW5_SPLIT[i], j)
        
        if (q != 0 && (vp - 1UL) / 10UL <= vm / 10UL) {
            val j2 = q - 1 - (pow5bits(i + 1) - FLOAT_POW5_BITCOUNT)
            lastDigit = mulShift32(mv, FLOAT_POW5_SPLIT[i + 1], j2) % 10UL
        }
        
        if (q <= 1) {
            vrIsTrailingZeros = true
            if (acceptBounds) {
                vmIsTrailingZeros = mmShift == 1
            } else {
                vp--
            }
        } else if (q < 31) {
            vrIsTrailingZeros = multipleOfPowerOf2_32(mv.toUInt(), q - 1)
            if (acceptBounds) {
                vmIsTrailingZeros = multipleOfPowerOf5_32(mm.toUInt(), q)
            } else {
                if (multipleOfPowerOf5_32(mp.toUInt(), q)) {
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
        val olength = decimalLength9(output.toUInt())
        
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
        val olength = decimalLength9(output.toUInt())
        
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