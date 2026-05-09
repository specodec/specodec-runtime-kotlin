package emit_kotlin

import specodec.*
import all_types_recursive.*
import java.io.File

fun runAllTypesRecursive(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_RecList, fm_RecList) = testModelRecList(); passed += pm_RecList; failed += fm_RecList
    val (pm_RecTree, fm_RecTree) = testModelRecTree(); passed += pm_RecTree; failed += fm_RecTree
    val (pm_RecChain, fm_RecChain) = testModelRecChain(); passed += pm_RecChain; failed += fm_RecChain
    val (pm_RecWrap, fm_RecWrap) = testModelRecWrap(); passed += pm_RecWrap; failed += fm_RecWrap
    val (pm_RecWide, fm_RecWide) = testModelRecWide(); passed += pm_RecWide; failed += fm_RecWide

    return Pair(passed, failed)
}

fun testModelRecList(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/RecList.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = RecListCodec.decode(r)
        val w = MsgPackWriter()
        RecListCodec.encode(w, obj)
        val out = File("${outDir}/RecList.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecList mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecList.json").readBytes()
        val r = JsonReader(data)
        val obj = RecListCodec.decode(r)
        val w = JsonWriter()
        RecListCodec.encode(w, obj)
        val out = File("${outDir}/RecList.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecList json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecList.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = RecListCodec.decode(r)
        val w = JsonWriter()
        RecListCodec.encode(w, obj)
        val out = File("${outDir}/RecList.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecList unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecList.gron").readBytes()
        val r = GronReader(data)
        val obj = RecListCodec.decode(r)
        val w = GronWriter()
        RecListCodec.encode(w, obj)
        val out = File("${outDir}/RecList.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecList gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelRecTree(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/RecTree.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = RecTreeCodec.decode(r)
        val w = MsgPackWriter()
        RecTreeCodec.encode(w, obj)
        val out = File("${outDir}/RecTree.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecTree mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecTree.json").readBytes()
        val r = JsonReader(data)
        val obj = RecTreeCodec.decode(r)
        val w = JsonWriter()
        RecTreeCodec.encode(w, obj)
        val out = File("${outDir}/RecTree.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecTree json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecTree.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = RecTreeCodec.decode(r)
        val w = JsonWriter()
        RecTreeCodec.encode(w, obj)
        val out = File("${outDir}/RecTree.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecTree unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecTree.gron").readBytes()
        val r = GronReader(data)
        val obj = RecTreeCodec.decode(r)
        val w = GronWriter()
        RecTreeCodec.encode(w, obj)
        val out = File("${outDir}/RecTree.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecTree gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelRecChain(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/RecChain.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = RecChainCodec.decode(r)
        val w = MsgPackWriter()
        RecChainCodec.encode(w, obj)
        val out = File("${outDir}/RecChain.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecChain mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecChain.json").readBytes()
        val r = JsonReader(data)
        val obj = RecChainCodec.decode(r)
        val w = JsonWriter()
        RecChainCodec.encode(w, obj)
        val out = File("${outDir}/RecChain.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecChain json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecChain.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = RecChainCodec.decode(r)
        val w = JsonWriter()
        RecChainCodec.encode(w, obj)
        val out = File("${outDir}/RecChain.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecChain unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecChain.gron").readBytes()
        val r = GronReader(data)
        val obj = RecChainCodec.decode(r)
        val w = GronWriter()
        RecChainCodec.encode(w, obj)
        val out = File("${outDir}/RecChain.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecChain gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelRecWrap(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/RecWrap.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = RecWrapCodec.decode(r)
        val w = MsgPackWriter()
        RecWrapCodec.encode(w, obj)
        val out = File("${outDir}/RecWrap.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWrap mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecWrap.json").readBytes()
        val r = JsonReader(data)
        val obj = RecWrapCodec.decode(r)
        val w = JsonWriter()
        RecWrapCodec.encode(w, obj)
        val out = File("${outDir}/RecWrap.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWrap json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecWrap.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = RecWrapCodec.decode(r)
        val w = JsonWriter()
        RecWrapCodec.encode(w, obj)
        val out = File("${outDir}/RecWrap.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWrap unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecWrap.gron").readBytes()
        val r = GronReader(data)
        val obj = RecWrapCodec.decode(r)
        val w = GronWriter()
        RecWrapCodec.encode(w, obj)
        val out = File("${outDir}/RecWrap.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWrap gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelRecWide(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/RecWide.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = RecWideCodec.decode(r)
        val w = MsgPackWriter()
        RecWideCodec.encode(w, obj)
        val out = File("${outDir}/RecWide.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWide mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecWide.json").readBytes()
        val r = JsonReader(data)
        val obj = RecWideCodec.decode(r)
        val w = JsonWriter()
        RecWideCodec.encode(w, obj)
        val out = File("${outDir}/RecWide.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWide json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecWide.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = RecWideCodec.decode(r)
        val w = JsonWriter()
        RecWideCodec.encode(w, obj)
        val out = File("${outDir}/RecWide.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWide unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/RecWide.gron").readBytes()
        val r = GronReader(data)
        val obj = RecWideCodec.decode(r)
        val w = GronWriter()
        RecWideCodec.encode(w, obj)
        val out = File("${outDir}/RecWide.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL RecWide gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

