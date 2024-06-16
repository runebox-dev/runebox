
import org.gradle.accessors.dm.LibrariesForLibs
import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper
import org.jetbrains.kotlin.gradle.plugin.mpp.pm20.util.archivesName

plugins {
    alias(libs.plugins.kotlin.jvm) apply(false)
}

tasks.wrapper {
    gradleVersion = "8.6"
}

allprojects {
    group = "io.runebox"
    version = "0.0.1"

    repositories {
        mavenCentral()
        mavenLocal()
        maven(url = "https://jitpack.io/")
    }

    plugins.withType<JavaPlugin> {
        archivesName.set("${rootProject.name}-$name")
    }
}

apply(plugin = libs.plugins.kotlin.jvm.get().pluginId)

subprojects {
    val libs = rootProject.the<LibrariesForLibs>()

    plugins.withType<KotlinPluginWrapper>().configureEach {
        dependencies {
            "implementation"(libs.bundles.kotlin)
            "testImplementation"(libs.bundles.kotest)
        }

        tasks.withType<Test>().configureEach {
            useJUnitPlatform()
        }
    }
}