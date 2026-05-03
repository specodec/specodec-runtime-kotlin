plugins {
    kotlin("jvm") version "2.3.21"
}
tasks.register("testPrintf", JavaExec::class) {
    mainClass.set("TestJdk25Kt")
    classpath = files("build/classes/kotlin/main")
}
