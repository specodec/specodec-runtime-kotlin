package emit_kotlin

import specodec.*
import all_types.*
import all_types_unions.*
import java.io.File

fun runAllTypes(vecDir: String, outDir: String): Pair<Int, Int> {
    var passed = 0
    var failed = 0

    val (pm_OptInner, fm_OptInner) = testModelOptInner(); passed += pm_OptInner; failed += fm_OptInner
    val (pm_Shape_circle, fm_Shape_circle) = testModelShape_circle(); passed += pm_Shape_circle; failed += fm_Shape_circle
    val (pm_Shape_rect, fm_Shape_rect) = testModelShape_rect(); passed += pm_Shape_rect; failed += fm_Shape_rect
    val (pm_Ident_name, fm_Ident_name) = testModelIdent_name(); passed += pm_Ident_name; failed += fm_Ident_name
    val (pm_Ident_number, fm_Ident_number) = testModelIdent_number(); passed += pm_Ident_number; failed += fm_Ident_number
    val (pm_ResultMsg_ok, fm_ResultMsg_ok) = testModelResultMsg_ok(); passed += pm_ResultMsg_ok; failed += fm_ResultMsg_ok
    val (pm_ResultMsg_err, fm_ResultMsg_err) = testModelResultMsg_err(); passed += pm_ResultMsg_err; failed += fm_ResultMsg_err
    val (pm_Tagged_tag, fm_Tagged_tag) = testModelTagged_tag(); passed += pm_Tagged_tag; failed += fm_Tagged_tag
    val (pm_Tagged_score, fm_Tagged_score) = testModelTagged_score(); passed += pm_Tagged_score; failed += fm_Tagged_score
    val (pm_Tagged_active, fm_Tagged_active) = testModelTagged_active(); passed += pm_Tagged_active; failed += fm_Tagged_active
    val (pm_OptUnionHolder_shape, fm_OptUnionHolder_shape) = testModelOptUnionHolder_shape(); passed += pm_OptUnionHolder_shape; failed += fm_OptUnionHolder_shape
    val (pm_OptUnionHolder_id, fm_OptUnionHolder_id) = testModelOptUnionHolder_id(); passed += pm_OptUnionHolder_id; failed += fm_OptUnionHolder_id
    val (pm_MixedUnion_point, fm_MixedUnion_point) = testModelMixedUnion_point(); passed += pm_MixedUnion_point; failed += fm_MixedUnion_point
    val (pm_MixedUnion_label, fm_MixedUnion_label) = testModelMixedUnion_label(); passed += pm_MixedUnion_label; failed += fm_MixedUnion_label
    val (pm_MixedUnion_count, fm_MixedUnion_count) = testModelMixedUnion_count(); passed += pm_MixedUnion_count; failed += fm_MixedUnion_count
    val (pm_NestedUnion_result, fm_NestedUnion_result) = testModelNestedUnion_result(); passed += pm_NestedUnion_result; failed += fm_NestedUnion_result
    val (pm_NestedUnion_shape, fm_NestedUnion_shape) = testModelNestedUnion_shape(); passed += pm_NestedUnion_shape; failed += fm_NestedUnion_shape
    val (pm_ScalarUnion_s, fm_ScalarUnion_s) = testModelScalarUnion_s(); passed += pm_ScalarUnion_s; failed += fm_ScalarUnion_s
    val (pm_ScalarUnion_i, fm_ScalarUnion_i) = testModelScalarUnion_i(); passed += pm_ScalarUnion_i; failed += fm_ScalarUnion_i
    val (pm_ScalarUnion_f, fm_ScalarUnion_f) = testModelScalarUnion_f(); passed += pm_ScalarUnion_f; failed += fm_ScalarUnion_f
    val (pm_ScalarUnion_b, fm_ScalarUnion_b) = testModelScalarUnion_b(); passed += pm_ScalarUnion_b; failed += fm_ScalarUnion_b

    return Pair(passed, failed)
}

fun testModelOptInner(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptInner.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptInnerCodec.decode(r)
        val w = MsgPackWriter()
        OptInnerCodec.encode(w, obj)
        val out = File("${outDir}/OptInner.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptInner mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptInner.json").readBytes()
        val r = JsonReader(data)
        val obj = OptInnerCodec.decode(r)
        val w = JsonWriter()
        OptInnerCodec.encode(w, obj)
        val out = File("${outDir}/OptInner.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptInner json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptInner.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptInnerCodec.decode(r)
        val w = JsonWriter()
        OptInnerCodec.encode(w, obj)
        val out = File("${outDir}/OptInner.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptInner unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptInner.gron").readBytes()
        val r = GronReader(data)
        val obj = OptInnerCodec.decode(r)
        val w = GronWriter()
        OptInnerCodec.encode(w, obj)
        val out = File("${outDir}/OptInner.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptInner gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelShape_circle(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Shape_circle.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ShapeCodec.decode(r)
        val w = MsgPackWriter()
        ShapeCodec.encode(w, obj)
        val out = File("${outDir}/Shape_circle.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Shape_circle mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Shape_circle.json").readBytes()
        val r = JsonReader(data)
        val obj = ShapeCodec.decode(r)
        val w = JsonWriter()
        ShapeCodec.encode(w, obj)
        val out = File("${outDir}/Shape_circle.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Shape_circle json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Shape_circle.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ShapeCodec.decode(r)
        val w = JsonWriter()
        ShapeCodec.encode(w, obj)
        val out = File("${outDir}/Shape_circle.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Shape_circle unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Shape_circle.gron").readBytes()
        val r = GronReader(data)
        val obj = ShapeCodec.decode(r)
        val w = GronWriter()
        ShapeCodec.encode(w, obj)
        val out = File("${outDir}/Shape_circle.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Shape_circle gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelShape_rect(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Shape_rect.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ShapeCodec.decode(r)
        val w = MsgPackWriter()
        ShapeCodec.encode(w, obj)
        val out = File("${outDir}/Shape_rect.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Shape_rect mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Shape_rect.json").readBytes()
        val r = JsonReader(data)
        val obj = ShapeCodec.decode(r)
        val w = JsonWriter()
        ShapeCodec.encode(w, obj)
        val out = File("${outDir}/Shape_rect.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Shape_rect json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Shape_rect.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ShapeCodec.decode(r)
        val w = JsonWriter()
        ShapeCodec.encode(w, obj)
        val out = File("${outDir}/Shape_rect.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Shape_rect unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Shape_rect.gron").readBytes()
        val r = GronReader(data)
        val obj = ShapeCodec.decode(r)
        val w = GronWriter()
        ShapeCodec.encode(w, obj)
        val out = File("${outDir}/Shape_rect.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Shape_rect gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelIdent_name(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Ident_name.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = IdentCodec.decode(r)
        val w = MsgPackWriter()
        IdentCodec.encode(w, obj)
        val out = File("${outDir}/Ident_name.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ident_name mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ident_name.json").readBytes()
        val r = JsonReader(data)
        val obj = IdentCodec.decode(r)
        val w = JsonWriter()
        IdentCodec.encode(w, obj)
        val out = File("${outDir}/Ident_name.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ident_name json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ident_name.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = IdentCodec.decode(r)
        val w = JsonWriter()
        IdentCodec.encode(w, obj)
        val out = File("${outDir}/Ident_name.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ident_name unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ident_name.gron").readBytes()
        val r = GronReader(data)
        val obj = IdentCodec.decode(r)
        val w = GronWriter()
        IdentCodec.encode(w, obj)
        val out = File("${outDir}/Ident_name.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ident_name gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelIdent_number(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Ident_number.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = IdentCodec.decode(r)
        val w = MsgPackWriter()
        IdentCodec.encode(w, obj)
        val out = File("${outDir}/Ident_number.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ident_number mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ident_number.json").readBytes()
        val r = JsonReader(data)
        val obj = IdentCodec.decode(r)
        val w = JsonWriter()
        IdentCodec.encode(w, obj)
        val out = File("${outDir}/Ident_number.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ident_number json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ident_number.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = IdentCodec.decode(r)
        val w = JsonWriter()
        IdentCodec.encode(w, obj)
        val out = File("${outDir}/Ident_number.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ident_number unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Ident_number.gron").readBytes()
        val r = GronReader(data)
        val obj = IdentCodec.decode(r)
        val w = GronWriter()
        IdentCodec.encode(w, obj)
        val out = File("${outDir}/Ident_number.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Ident_number gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelResultMsg_ok(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ResultMsg_ok.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ResultMsgCodec.decode(r)
        val w = MsgPackWriter()
        ResultMsgCodec.encode(w, obj)
        val out = File("${outDir}/ResultMsg_ok.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ResultMsg_ok mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ResultMsg_ok.json").readBytes()
        val r = JsonReader(data)
        val obj = ResultMsgCodec.decode(r)
        val w = JsonWriter()
        ResultMsgCodec.encode(w, obj)
        val out = File("${outDir}/ResultMsg_ok.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ResultMsg_ok json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ResultMsg_ok.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ResultMsgCodec.decode(r)
        val w = JsonWriter()
        ResultMsgCodec.encode(w, obj)
        val out = File("${outDir}/ResultMsg_ok.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ResultMsg_ok unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ResultMsg_ok.gron").readBytes()
        val r = GronReader(data)
        val obj = ResultMsgCodec.decode(r)
        val w = GronWriter()
        ResultMsgCodec.encode(w, obj)
        val out = File("${outDir}/ResultMsg_ok.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ResultMsg_ok gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelResultMsg_err(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ResultMsg_err.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ResultMsgCodec.decode(r)
        val w = MsgPackWriter()
        ResultMsgCodec.encode(w, obj)
        val out = File("${outDir}/ResultMsg_err.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ResultMsg_err mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ResultMsg_err.json").readBytes()
        val r = JsonReader(data)
        val obj = ResultMsgCodec.decode(r)
        val w = JsonWriter()
        ResultMsgCodec.encode(w, obj)
        val out = File("${outDir}/ResultMsg_err.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ResultMsg_err json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ResultMsg_err.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ResultMsgCodec.decode(r)
        val w = JsonWriter()
        ResultMsgCodec.encode(w, obj)
        val out = File("${outDir}/ResultMsg_err.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ResultMsg_err unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ResultMsg_err.gron").readBytes()
        val r = GronReader(data)
        val obj = ResultMsgCodec.decode(r)
        val w = GronWriter()
        ResultMsgCodec.encode(w, obj)
        val out = File("${outDir}/ResultMsg_err.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ResultMsg_err gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTagged_tag(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Tagged_tag.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = TaggedCodec.decode(r)
        val w = MsgPackWriter()
        TaggedCodec.encode(w, obj)
        val out = File("${outDir}/Tagged_tag.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Tagged_tag mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Tagged_tag.json").readBytes()
        val r = JsonReader(data)
        val obj = TaggedCodec.decode(r)
        val w = JsonWriter()
        TaggedCodec.encode(w, obj)
        val out = File("${outDir}/Tagged_tag.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Tagged_tag json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Tagged_tag.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = TaggedCodec.decode(r)
        val w = JsonWriter()
        TaggedCodec.encode(w, obj)
        val out = File("${outDir}/Tagged_tag.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Tagged_tag unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Tagged_tag.gron").readBytes()
        val r = GronReader(data)
        val obj = TaggedCodec.decode(r)
        val w = GronWriter()
        TaggedCodec.encode(w, obj)
        val out = File("${outDir}/Tagged_tag.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Tagged_tag gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTagged_score(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Tagged_score.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = TaggedCodec.decode(r)
        val w = MsgPackWriter()
        TaggedCodec.encode(w, obj)
        val out = File("${outDir}/Tagged_score.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Tagged_score mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Tagged_score.json").readBytes()
        val r = JsonReader(data)
        val obj = TaggedCodec.decode(r)
        val w = JsonWriter()
        TaggedCodec.encode(w, obj)
        val out = File("${outDir}/Tagged_score.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Tagged_score json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Tagged_score.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = TaggedCodec.decode(r)
        val w = JsonWriter()
        TaggedCodec.encode(w, obj)
        val out = File("${outDir}/Tagged_score.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Tagged_score unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Tagged_score.gron").readBytes()
        val r = GronReader(data)
        val obj = TaggedCodec.decode(r)
        val w = GronWriter()
        TaggedCodec.encode(w, obj)
        val out = File("${outDir}/Tagged_score.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Tagged_score gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelTagged_active(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/Tagged_active.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = TaggedCodec.decode(r)
        val w = MsgPackWriter()
        TaggedCodec.encode(w, obj)
        val out = File("${outDir}/Tagged_active.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Tagged_active mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Tagged_active.json").readBytes()
        val r = JsonReader(data)
        val obj = TaggedCodec.decode(r)
        val w = JsonWriter()
        TaggedCodec.encode(w, obj)
        val out = File("${outDir}/Tagged_active.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Tagged_active json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Tagged_active.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = TaggedCodec.decode(r)
        val w = JsonWriter()
        TaggedCodec.encode(w, obj)
        val out = File("${outDir}/Tagged_active.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Tagged_active unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/Tagged_active.gron").readBytes()
        val r = GronReader(data)
        val obj = TaggedCodec.decode(r)
        val w = GronWriter()
        TaggedCodec.encode(w, obj)
        val out = File("${outDir}/Tagged_active.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL Tagged_active gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptUnionHolder_shape(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptUnionHolder_shape.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptUnionHolderCodec.decode(r)
        val w = MsgPackWriter()
        OptUnionHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptUnionHolder_shape.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptUnionHolder_shape mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptUnionHolder_shape.json").readBytes()
        val r = JsonReader(data)
        val obj = OptUnionHolderCodec.decode(r)
        val w = JsonWriter()
        OptUnionHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptUnionHolder_shape.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptUnionHolder_shape json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptUnionHolder_shape.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptUnionHolderCodec.decode(r)
        val w = JsonWriter()
        OptUnionHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptUnionHolder_shape.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptUnionHolder_shape unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptUnionHolder_shape.gron").readBytes()
        val r = GronReader(data)
        val obj = OptUnionHolderCodec.decode(r)
        val w = GronWriter()
        OptUnionHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptUnionHolder_shape.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptUnionHolder_shape gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelOptUnionHolder_id(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/OptUnionHolder_id.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = OptUnionHolderCodec.decode(r)
        val w = MsgPackWriter()
        OptUnionHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptUnionHolder_id.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptUnionHolder_id mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptUnionHolder_id.json").readBytes()
        val r = JsonReader(data)
        val obj = OptUnionHolderCodec.decode(r)
        val w = JsonWriter()
        OptUnionHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptUnionHolder_id.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptUnionHolder_id json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptUnionHolder_id.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = OptUnionHolderCodec.decode(r)
        val w = JsonWriter()
        OptUnionHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptUnionHolder_id.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptUnionHolder_id unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/OptUnionHolder_id.gron").readBytes()
        val r = GronReader(data)
        val obj = OptUnionHolderCodec.decode(r)
        val w = GronWriter()
        OptUnionHolderCodec.encode(w, obj)
        val out = File("${outDir}/OptUnionHolder_id.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL OptUnionHolder_id gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMixedUnion_point(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/MixedUnion_point.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = MixedUnionCodec.decode(r)
        val w = MsgPackWriter()
        MixedUnionCodec.encode(w, obj)
        val out = File("${outDir}/MixedUnion_point.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MixedUnion_point mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MixedUnion_point.json").readBytes()
        val r = JsonReader(data)
        val obj = MixedUnionCodec.decode(r)
        val w = JsonWriter()
        MixedUnionCodec.encode(w, obj)
        val out = File("${outDir}/MixedUnion_point.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MixedUnion_point json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MixedUnion_point.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = MixedUnionCodec.decode(r)
        val w = JsonWriter()
        MixedUnionCodec.encode(w, obj)
        val out = File("${outDir}/MixedUnion_point.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MixedUnion_point unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MixedUnion_point.gron").readBytes()
        val r = GronReader(data)
        val obj = MixedUnionCodec.decode(r)
        val w = GronWriter()
        MixedUnionCodec.encode(w, obj)
        val out = File("${outDir}/MixedUnion_point.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MixedUnion_point gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMixedUnion_label(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/MixedUnion_label.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = MixedUnionCodec.decode(r)
        val w = MsgPackWriter()
        MixedUnionCodec.encode(w, obj)
        val out = File("${outDir}/MixedUnion_label.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MixedUnion_label mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MixedUnion_label.json").readBytes()
        val r = JsonReader(data)
        val obj = MixedUnionCodec.decode(r)
        val w = JsonWriter()
        MixedUnionCodec.encode(w, obj)
        val out = File("${outDir}/MixedUnion_label.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MixedUnion_label json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MixedUnion_label.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = MixedUnionCodec.decode(r)
        val w = JsonWriter()
        MixedUnionCodec.encode(w, obj)
        val out = File("${outDir}/MixedUnion_label.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MixedUnion_label unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MixedUnion_label.gron").readBytes()
        val r = GronReader(data)
        val obj = MixedUnionCodec.decode(r)
        val w = GronWriter()
        MixedUnionCodec.encode(w, obj)
        val out = File("${outDir}/MixedUnion_label.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MixedUnion_label gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelMixedUnion_count(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/MixedUnion_count.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = MixedUnionCodec.decode(r)
        val w = MsgPackWriter()
        MixedUnionCodec.encode(w, obj)
        val out = File("${outDir}/MixedUnion_count.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MixedUnion_count mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MixedUnion_count.json").readBytes()
        val r = JsonReader(data)
        val obj = MixedUnionCodec.decode(r)
        val w = JsonWriter()
        MixedUnionCodec.encode(w, obj)
        val out = File("${outDir}/MixedUnion_count.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MixedUnion_count json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MixedUnion_count.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = MixedUnionCodec.decode(r)
        val w = JsonWriter()
        MixedUnionCodec.encode(w, obj)
        val out = File("${outDir}/MixedUnion_count.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MixedUnion_count unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/MixedUnion_count.gron").readBytes()
        val r = GronReader(data)
        val obj = MixedUnionCodec.decode(r)
        val w = GronWriter()
        MixedUnionCodec.encode(w, obj)
        val out = File("${outDir}/MixedUnion_count.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL MixedUnion_count gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestedUnion_result(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestedUnion_result.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestedUnionCodec.decode(r)
        val w = MsgPackWriter()
        NestedUnionCodec.encode(w, obj)
        val out = File("${outDir}/NestedUnion_result.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestedUnion_result mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestedUnion_result.json").readBytes()
        val r = JsonReader(data)
        val obj = NestedUnionCodec.decode(r)
        val w = JsonWriter()
        NestedUnionCodec.encode(w, obj)
        val out = File("${outDir}/NestedUnion_result.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestedUnion_result json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestedUnion_result.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestedUnionCodec.decode(r)
        val w = JsonWriter()
        NestedUnionCodec.encode(w, obj)
        val out = File("${outDir}/NestedUnion_result.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestedUnion_result unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestedUnion_result.gron").readBytes()
        val r = GronReader(data)
        val obj = NestedUnionCodec.decode(r)
        val w = GronWriter()
        NestedUnionCodec.encode(w, obj)
        val out = File("${outDir}/NestedUnion_result.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestedUnion_result gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelNestedUnion_shape(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/NestedUnion_shape.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = NestedUnionCodec.decode(r)
        val w = MsgPackWriter()
        NestedUnionCodec.encode(w, obj)
        val out = File("${outDir}/NestedUnion_shape.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestedUnion_shape mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestedUnion_shape.json").readBytes()
        val r = JsonReader(data)
        val obj = NestedUnionCodec.decode(r)
        val w = JsonWriter()
        NestedUnionCodec.encode(w, obj)
        val out = File("${outDir}/NestedUnion_shape.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestedUnion_shape json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestedUnion_shape.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = NestedUnionCodec.decode(r)
        val w = JsonWriter()
        NestedUnionCodec.encode(w, obj)
        val out = File("${outDir}/NestedUnion_shape.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestedUnion_shape unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/NestedUnion_shape.gron").readBytes()
        val r = GronReader(data)
        val obj = NestedUnionCodec.decode(r)
        val w = GronWriter()
        NestedUnionCodec.encode(w, obj)
        val out = File("${outDir}/NestedUnion_shape.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL NestedUnion_shape gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelScalarUnion_s(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ScalarUnion_s.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = MsgPackWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_s.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_s mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ScalarUnion_s.json").readBytes()
        val r = JsonReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = JsonWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_s.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_s json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ScalarUnion_s.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = JsonWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_s.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_s unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ScalarUnion_s.gron").readBytes()
        val r = GronReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = GronWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_s.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_s gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelScalarUnion_i(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ScalarUnion_i.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = MsgPackWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_i.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_i mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ScalarUnion_i.json").readBytes()
        val r = JsonReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = JsonWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_i.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_i json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ScalarUnion_i.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = JsonWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_i.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_i unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ScalarUnion_i.gron").readBytes()
        val r = GronReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = GronWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_i.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_i gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelScalarUnion_f(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ScalarUnion_f.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = MsgPackWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_f.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_f mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ScalarUnion_f.json").readBytes()
        val r = JsonReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = JsonWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_f.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_f json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ScalarUnion_f.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = JsonWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_f.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_f unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ScalarUnion_f.gron").readBytes()
        val r = GronReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = GronWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_f.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_f gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

fun testModelScalarUnion_b(): Pair<Int, Int> {
    var passed = 0
    var failed = 0
    try {
        val data = File("${vecDir}/ScalarUnion_b.msgpack").readBytes()
        val r = MsgPackReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = MsgPackWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_b.msgpack")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_b mp: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ScalarUnion_b.json").readBytes()
        val r = JsonReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = JsonWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_b.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_b json: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ScalarUnion_b.unformatted.json").readBytes()
        val r = JsonReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = JsonWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_b.unformatted.json")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_b unformatted: ${e.message}")
        failed++
    }
    try {
        val data = File("${vecDir}/ScalarUnion_b.gron").readBytes()
        val r = GronReader(data)
        val obj = ScalarUnionCodec.decode(r)
        val w = GronWriter()
        ScalarUnionCodec.encode(w, obj)
        val out = File("${outDir}/ScalarUnion_b.gron")
        out.parentFile?.mkdirs()
        out.writeBytes(w.toBytes())
        passed++
    } catch (e: Exception) {
        println("FAIL ScalarUnion_b gron: ${e.message}")
        failed++
    }
    return Pair(passed, failed)
}

