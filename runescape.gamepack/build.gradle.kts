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

    named("jar", Jar::class) {
        archiveBaseName.set("gamepack.named")
        archiveClassifier.set("")
        archiveVersion.set("")
    }
}