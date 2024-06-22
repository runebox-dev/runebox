plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(libs.bundles.asm)
    implementation(libs.guava)
    implementation(libs.ajavabeans)
    runtimeOnly(libs.bouncycastle)
    runtimeOnly(libs.json)
}

tasks {
    register("updateGamepack", JavaExec::class) {
        group = "revision"
        mainClass.set("io.runebox.updater.Updater")
        workingDir = rootProject.projectDir
        classpath = sourceSets["main"].runtimeClasspath
        args = listOf(
            "runescape.gamepack/build/libs/gamepack.named.jar",
            "build/runebox/gamepack221.deob.jar",
            "build/runebox/gamepack.updated.jar"
        )
    }
}