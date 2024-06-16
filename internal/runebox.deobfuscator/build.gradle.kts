plugins {
    alias(libs.plugins.kotlin.jvm)
    `java-library`
}

repositories {
    maven(url = "https://jitpack.io/")
}

dependencies {
    implementation(project(":asm"))
    implementation(libs.treeprinter)
    implementation(libs.jgrapht)
}

tasks {
    register("downloadLatestGamepack", JavaExec::class) {
        dependsOn(named("jar"))
        group = "revision"
        mainClass.set("io.runebox.deobfuscator.GamepackDownloader")
        workingDir = rootProject.projectDir
        classpath = sourceSets["main"].runtimeClasspath
        args = listOf("build/runebox/gamepack.jar", "--revision", "latest")
    }

    register("deobfuscate", JavaExec::class) {
        dependsOn(named("jar"))
        group = "revision"
        mainClass.set("io.runebox.deobfuscator.Deobfuscator")
        workingDir = rootProject.projectDir
        classpath = sourceSets["main"].runtimeClasspath
        args = listOf("build/runebox/gamepack.jar", "build/runebox/gamepack.deob.jar")
    }
}