plugins {
    alias(libs.plugins.kotlin.jvm)
    id("java-library")
}

dependencies {
    api(libs.bundles.asm)
    implementation(libs.guava)
    implementation(libs.jgrapht)
}