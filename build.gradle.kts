import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.20"
    id("com.google.protobuf") version "0.8.15"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

allprojects {
    group = "com.example"
    version = "0.0.1"

    apply(plugin = "kotlin")

    repositories {
        mavenCentral()
    }
}


dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}