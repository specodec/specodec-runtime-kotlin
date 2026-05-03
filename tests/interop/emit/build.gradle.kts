plugins {
    kotlin("jvm") version "2.3.21"
    application
}

group = "io.specodec"
version = "0.0.1"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("com.github.specodec:specodec-runtime-kotlin:main-SNAPSHOT")
}

application {
    mainClass.set("emit_kotlin.MainKt")
}

kotlin {
    jvmToolchain(21)
}

sourceSets {
    main {
        kotlin {
            srcDirs("src/main/kotlin", "../emit_gen")
        }
    }
}
