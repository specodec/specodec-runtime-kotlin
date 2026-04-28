plugins {
    kotlin("multiplatform") version "1.9.22"
}

group = "io.specodec"
version = "0.0.1"

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    js { browser(); nodejs() }
    
    sourceSets {
        commonMain.dependencies {}
    }
}
