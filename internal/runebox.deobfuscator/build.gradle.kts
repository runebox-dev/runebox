plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(project(":asm"))
    implementation(libs.treeprinter)
}