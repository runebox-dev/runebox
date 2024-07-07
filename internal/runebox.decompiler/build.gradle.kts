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
            val backupDir = rootProject.projectDir.resolve("build/runebox/backup/")
            if(backupDir.exists()) backupDir.deleteRecursively()
            backupDir.mkdirs()
            rootProject.projectDir.resolve("runescape.gamepack/src/main/java/").copyRecursively(backupDir)
            rootProject.projectDir.resolve("runescape.gamepack/src/main/java/").deleteRecursively()
        }
        doLast {
            rootProject.projectDir.resolve("runescape.gamepack/src/main/java/org/").deleteRecursively()
            println("Previous overwritten classes have back backed up to 'build/runebox/backup/'.")
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