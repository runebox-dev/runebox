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
            exclude("META-INF/*")
        }
        with(named("jar", Jar::class).get())

    }
}