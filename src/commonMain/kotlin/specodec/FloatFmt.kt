package specodec

import ryu.RyuF32
import ryu.RyuF64

fun formatFloat32(value: Float): String {
    return RyuF32.float32ToString(value)
}

fun formatFloat64(value: Double): String {
    return RyuF64.float64ToString(value)
}

    val expStr = String.format("%.${n + 2}e", absVal)
    val match = Regex("^([\\d])\\.([\\d]+)e([+-])([\\d]+)$").find(expStr)
        ?: throw Exception("Unexpected exponential format: $expStr")

    val intPart = match.groupValues[1]
    val fracPart = match.groupValues[2]
    val expSign = match.groupValues[3]
    var expVal = match.groupValues[4].toInt()

    val allDigits = intPart + fracPart

    val lastKeptDigit = allDigits[n - 1].toInt() - '0'.code
    val firstDroppedDigit = allDigits[n].toInt() - '0'.code

    var roundingDigits = allDigits.substring(0, n)

    var roundUp = false
    if (firstDroppedDigit > 5) {
        roundUp = true
    } else if (firstDroppedDigit < 5) {
        roundUp = false
    } else {
        val tailAfter5 = allDigits.substring(n + 1)
        val hasNonZero = tailAfter5.any { it != '0' }
        if (hasNonZero) {
            roundUp = true
        } else {
            roundUp = lastKeptDigit % 2 == 1
        }
    }

    if (roundUp) {
        val digitsArr = roundingDigits.toCharArray()
        var carry = 1
        for (i in n - 1 downTo 0) {
            if (carry == 0) break
            val newDigit = digitsArr[i].toInt() - '0'.code + carry
            digitsArr[i] = ('0'.code + newDigit % 10).toChar()
            carry = newDigit / 10
        }
        if (carry > 0) {
            roundingDigits = "1" + String(digitsArr).dropLast(1)
            expVal += 1
        } else {
            roundingDigits = String(digitsArr)
        }
    }

    val finalExp = if (expSign == "+") expVal else -expVal
    val expSignOut = if (finalExp >= 0) "+" else "-"
    val expStrOut = abs(finalExp).toString().padStart(2, '0')

    return if (n == 1) {
        sign + roundingDigits + "E" + expSignOut + expStrOut
    } else {
        sign + roundingDigits[0] + "." + roundingDigits.substring(1) + "E" + expSignOut + expStrOut
    }
}

fun formatFloat32(value: Float): String {
    return formatSigFigs(value.toDouble(), 9)
}

fun formatFloat64(value: Double): String {
    return formatSigFigs(value, 17)
}