plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(libs.bundles.asm)
    implementation(libs.guava)
    runtimeOnly(libs.bouncycastle)
    runtimeOnly(libs.json)
}