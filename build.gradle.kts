import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}

group = "com.rtarita"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    api("com.warrenstrange:googleauth:1.5.0")
}

kotlin {
    explicitApi()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}