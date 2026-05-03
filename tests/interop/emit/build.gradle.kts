plugins {
    kotlin("jvm") version "2.3.21"
    application
}

group = "io.specodec"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(files("specodec-kotlin-jvm-0.0.1.jar"))
}

application {
    mainClass.set("emit_kotlin.MainKt")
}

kotlin {
    jvmToolchain(25)
}

sourceSets {
    main {
        kotlin {
            srcDirs("src/main/kotlin", "../emit_gen")
        }
    }
}
