plugins {
    alias(libs.plugins.kotlin.jvm)
    `java-library`
}

dependencies {
    implementation(project(":asm"))
    implementation(libs.treeprinter)
    implementation(libs.jgrapht)
}