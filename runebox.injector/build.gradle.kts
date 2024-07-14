plugins {
    alias(libs.plugins.gradle.plugin.publish)
    `java-library`
    `java-gradle-plugin`
    `kotlin-dsl`
    `maven-publish`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
    mavenLocal()
}

dependencies {
    implementation(gradleApi())
    implementation(gradleKotlinDsl())
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
    implementation("io.runebox:asm:0.0.1")
}

