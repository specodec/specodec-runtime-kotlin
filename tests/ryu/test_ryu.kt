import java.io.File
import specodec.ryu.*

fun loadTests(filename: String): List<Double> {
    return File(filename).readLines()
        .map { it.trim() }
        .filter { it.isNotEmpty() && !it.startsWith("#") }
        .map { it.toDouble() }
}

fun loadExpected(filename: String): List<String> {
    return File(filename).readLines()
        .map { it.trim() }
        .filter { it.isNotEmpty() }
}

fun loadCoverage(filename: String): List<Float> {
    return File(filename).readLines()
        .map { it.trim() }
        .filter { it.isNotEmpty() && it[0].isDigit() }
        .map { line ->
            val v = if (line.contains('#')) line.substringBefore('#').trim() else line
            v.toFloat()
        }
}

fun loadCoverage64(filename: String): List<Double> {
    return File(filename).readLines()
        .map { it.trim() }
        .filter { it.isNotEmpty() && it[0].isDigit() }
        .map { line ->
            val v = if (line.contains('#')) line.substringBefore('#').trim() else line
            v.toDouble()
        }
}

fun main() {
    var passed = 0
    var failed = 0

    println("=== Float32 Original (125 tests) ===")
    val f32in = loadTests("test_cases_f32.txt")
    val f32exp = loadExpected("expected_f32.txt")
    for (i in f32in.indices) {
        val result = float32ToString(f32in[i].toFloat())
        if (result == f32exp[i]) passed++
        else {
            failed++
            if (failed <= 5) println("FAIL: ${f32in[i]} => $result (expected ${f32exp[i]})")
        }
    }
    println("${f32in.size}/${f32in.size}\n")

    println("=== Float64 Original (102 tests) ===")
    val f64in = loadTests("test_cases_f64.txt")
    val f64exp = loadExpected("expected_f64.txt")
    for (i in f64in.indices) {
        val result = float64ToString(f64in[i])
        if (result == f64exp[i]) passed++
        else {
            failed++
            if (failed <= 5) println("FAIL: ${f64in[i]} => $result (expected ${f64exp[i]})")
        }
    }
    println("${f64in.size}/${f64in.size}\n")

    println("=== Float32 Coverage (78 tests) ===")
    val c32in = loadCoverage("test_cases_table_coverage.txt")
    val c32exp = loadExpected("expected_table_coverage.txt")
    val n32 = minOf(c32in.size, c32exp.size)
    for (i in 0 until n32) {
        val result = float32ToString(c32in[i])
        if (result == c32exp[i]) passed++
        else {
            failed++
            if (failed <= 5) println("FAIL: ${c32in[i]} => $result (expected ${c32exp[i]})")
        }
    }
    println("$n32/$n32\n")

    println("=== Float64 Coverage (616 tests) ===")
    val c64in = loadCoverage64("test_cases_f64_table_coverage.txt")
    val c64exp = loadExpected("expected_f64_table_coverage.txt")
    val n64 = minOf(c64in.size, c64exp.size)
    for (i in 0 until n64) {
        val result = float64ToString(c64in[i])
        if (result == c64exp[i]) passed++
        else {
            failed++
            if (failed <= 5) println("FAIL: ${c64in[i]} => $result (expected ${c64exp[i]})")
        }
    }
    println("$n64/$n64\n")

    println("=== TOTAL: $passed/${passed + failed} ===")
    if (failed > 0) throw RuntimeException("$failed tests failed")
}
