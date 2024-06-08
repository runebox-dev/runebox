plugins {
    alias(libs.plugins.kotlin.jvm)
    id("java-library")
}

dependencies {
    api(libs.bundles.asm)
    api(libs.guava)
    implementation(libs.jgrapht)
    implementation(libs.treeprinter)
}