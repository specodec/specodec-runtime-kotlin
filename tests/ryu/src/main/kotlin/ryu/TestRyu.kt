package ryu

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

    val f32in = loadTests("test_cases_f32.txt")
    val f32exp = loadExpected("expected_f32.txt")
    for (i in f32in.indices) {
        val result = float32ToString(f32in[i].toFloat())
        if (result == f32exp[i]) passed++
        else {
            failed++
            if (failed <= 5) println("FAIL F32: in=${f32in[i]} out=$result expected=${f32exp[i]}")
        }
    }
    println("f32: ${f32in.size}/${f32in.size}")

    val f64in = loadTests("test_cases_f64.txt")
    val f64exp = loadExpected("expected_f64.txt")
    for (i in f64in.indices) {
        val result = float64ToString(f64in[i])
        if (result == f64exp[i]) passed++
        else {
            failed++
            if (failed <= 5) println("FAIL F64: in=${f64in[i]} out=$result expected=${f64exp[i]}")
        }
    }
    println("f64: ${f64in.size}/${f64in.size}")

    val c32in = loadCoverage("test_cases_table_coverage.txt")
    val c32exp = loadExpected("expected_table_coverage.txt")
    val n32 = minOf(c32in.size, c32exp.size)
    for (i in 0 until n32) {
        val result = float32ToString(c32in[i])
        if (result == c32exp[i]) passed++
        else {
            failed++
            if (failed <= 5) println("FAIL F32C: in=${c32in[i]} out=$result expected=${c32exp[i]}")
        }
    }
    println("f32c: $n32/$n32")

    val c64in = loadCoverage64("test_cases_f64_table_coverage.txt")
    val c64exp = loadExpected("expected_f64_table_coverage.txt")
    val n64 = minOf(c64in.size, c64exp.size)
    for (i in 0 until n64) {
        val result = float64ToString(c64in[i])
        if (result == c64exp[i]) passed++
        else {
            failed++
            if (failed <= 5) println("FAIL F64C: in=${c64in[i]} out=$result expected=${c64exp[i]}")
        }
    }
    println("f64c: $n64/$n64")

    val total = passed + failed
    println("$passed/$total")
    if (failed > 0) {
        System.exit(1)
    }
}
