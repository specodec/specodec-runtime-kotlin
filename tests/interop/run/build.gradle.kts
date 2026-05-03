plugins {
    kotlin("jvm") version "2.3.21"
    application
}

group = "io.specodec"
version = "0.0.1"

repositories {
    mavenCentral()
}

application {
    mainClass.set("RunKt")
}

kotlin {
    jvmToolchain(25)
}

dependencies {
}
