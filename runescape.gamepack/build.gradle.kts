plugins {
    alias(libs.plugins.kotlin.jvm)
    java
}

dependencies {
    implementation(libs.bouncycastle)
    implementation(libs.json)
}

tasks {
    register("run [runescape.gamepack]", JavaExec::class) {
        dependsOn(named("jar"))
        group = "runebox"
        mainClass.set("GamepackTestKt")
        workingDir = rootProject.projectDir
        classpath = sourceSets["test"].runtimeClasspath
    }
}