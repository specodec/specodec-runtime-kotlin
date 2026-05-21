plugins {
    kotlin("multiplatform") version "2.3.21"
    `maven-publish`
}

group = "io.specodec"
version = "1.0.0"
base.archivesName = "specodec-runtime-kotlin"

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    js { browser(); nodejs() }
    linuxX64()
    
    sourceSets {
        commonMain.dependencies {}
    }
}

publishing {
    repositories {
        maven {
            name = "forgejo"
            url = uri(
                providers.environmentVariable("FORGEJO_URL")
                    .getOrElse("http://10.199.64.20:30000")
                    + "/api/packages/specodec/maven"
            )
            isAllowInsecureProtocol = true
            credentials {
                username = "ytr"
                password = providers.environmentVariable("FORGEJO_TOKEN").getOrElse("")
            }
        }
    }
}
