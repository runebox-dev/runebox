plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(libs.bundles.asm)
    implementation(libs.guava)
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
            project(":gamepack").tasks.named("jar.named", Jar::class).get().archiveFile.get().asFile.relativeTo(rootProject.projectDir).path,
            "build/runebox/gamepack.deob.jar",
            "build/runebox/gamepack.updated.jar"
        )
    }
}