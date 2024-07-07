plugins {
    alias(libs.plugins.kotlin.jvm)
    java
}

val gamepack by configurations.creating
configurations.implementation.get().extendsFrom(gamepack)

dependencies {
    gamepack(libs.bouncycastle)
    gamepack(libs.json)
}

tasks {
    register("run [runescape.gamepack]", JavaExec::class) {
        dependsOn(named("jar"))
        group = "runebox"
        mainClass.set("GamepackTestKt")
        workingDir = rootProject.projectDir
        classpath = sourceSets["test"].runtimeClasspath
    }

    register("jar.named", Jar::class) {
        group = "build"
        archiveBaseName.set("gamepack.named")
        archiveClassifier.set("")
        archiveVersion.set("")
        from(gamepack.map { if(it.isDirectory) it else zipTree(it) }) {
            exclude("META-INF/**")
        }
        with(named("jar", Jar::class).get())
    }

    register("rev-update [runebox]") {
        group = "runebox"
        listOf(
            ":deobfuscator",
            ":updater",
            ":decompiler",
            ":gamepack"
        ).map { project(it).tasks.build.get() }.forEach {
            dependsOn(it)
        }
        doFirst {
            project(":deobfuscator").tasks.named("downloadGamepack", JavaExec::class).get().exec()
            project(":deobfuscator").tasks.named("deobfuscate", JavaExec::class).get().exec()
            project(":updater").tasks.named("updateGamepack", JavaExec::class).get().exec()
            project(":decompiler").tasks.named("decompileUpdated", JavaExec::class).get().exec()
        }
        finalizedBy(project(":decompiler").tasks.named("copyDecompSources", Copy::class).get())
        finalizedBy(project(":gamepack").tasks.named("jar.named", Jar::class).get())
    }
}