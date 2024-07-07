plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(project(":asm"))
    implementation(files("lib/asm.jar"))
    implementation("org.slf4j:slf4j-api:1.7.32")
    runtimeOnly(libs.bouncycastle)
    runtimeOnly(libs.json)
}

tasks {
    register("updateGamepack", JavaExec::class) {
        dependsOn(project(":gamepack").tasks.named("jar.named", Jar::class).get())
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