plugins {
    kotlin("jvm") version "2.3.21"
    application
}

group = "io.specodec"
version = "0.0.1"

repositories {
    maven { url = uri("http://10.199.64.20:3000/api/packages/specodec/maven"); isAllowInsecureProtocol = true }
    mavenCentral()
}

dependencies {
    implementation("io.specodec:specodec-runtime-kotlin-jvm:1.0.0")
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
