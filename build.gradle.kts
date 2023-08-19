plugins {
    kotlin("jvm") version "1.8.20"
    id("com.google.protobuf") version "0.8.15"
}

allprojects {
    group = "com.example"
    version = "0.0.1"

    apply(plugin = "kotlin")

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")
    }
}