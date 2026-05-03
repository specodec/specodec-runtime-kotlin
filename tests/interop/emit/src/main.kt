import alltypes.*

fun main() {
    val vec = System.getenv("VEC_DIR") ?: "/app/vectors"
    val out = System.getenv("OUT_DIR") ?: "/app/output_emit_kotlin"
    runEmit(vec, out)
}
