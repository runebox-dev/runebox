plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(project(":asm"))
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
            "build/runebox/gamepack.deob.jar",
            "build/runebox/gamepack.updated.jar"
        )
    }
}