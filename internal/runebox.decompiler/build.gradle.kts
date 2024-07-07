plugins {
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    implementation(libs.fernflower)
}

tasks {
    val copyDecompiledSources by register("copyDecompSources", Copy::class) {
        group = "revision"
        doFirst {
            println("Copying decompiled gamepack java files into the 'runescape.gamepack' module... [NOTE! THIS WILL OVERWRITE EVERYTHING]")
            rootProject.projectDir.resolve("runescape.gamepack/src/main/java/").deleteRecursively()
        }
        doLast {
            rootProject.projectDir.resolve("runescape.gamepack/src/main/java/org/").deleteRecursively()
        }
        from(rootProject.projectDir.resolve("build/runebox/decomp/"))
        into(rootProject.projectDir.resolve("runescape.gamepack/src/main/java/"))
        exclude { it.name.startsWith("org/") }
    }

    val decompileDeobTask by register("decompileDeob", JavaExec::class) {
        dependsOn(named("jar"))
        group = "revision"
        mainClass.set("io.runebox.decompiler.JarDecompiler")
        workingDir = rootProject.projectDir
        classpath = sourceSets["main"].runtimeClasspath
        args = listOf("build/runebox/gamepack.deob.jar", "build/runebox/decomp/")
    }

    val decompileUpdatedTask by register("decompileUpdated", JavaExec::class) {
        dependsOn(named("jar"))
        group = "revision"
        mainClass.set("io.runebox.decompiler.JarDecompiler")
        workingDir = rootProject.projectDir
        classpath = sourceSets["main"].runtimeClasspath
        args = listOf("build/runebox/gamepack.updated.jar", "build/runebox/decomp/")
    }

}