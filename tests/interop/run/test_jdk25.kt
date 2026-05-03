fun main() {
    val v = -3.14159265358979
    println("%.17f: ${\"%.17f\".format(v)}")
    println("Double.toString: ${v.toString()}")
    println("Java version: ${System.getProperty(\"java.version\")}")
}
