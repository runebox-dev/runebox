plugins {
    alias(libs.plugins.kotlin.jvm)
    id("java-library")
    `maven-publish`
}

val sourcesJar by tasks.register("sourcesJar", Jar::class) {
    group = "build"
    archiveClassifier.set("sources")
    from(sourceSets["main"].allJava)
}

dependencies {
    api(libs.bundles.asm)
    api(libs.guava)
    implementation(libs.treeprinter)
    implementation(libs.jgrapht)
}

publishing {
    repositories {
        mavenLocal()
    }

    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            afterEvaluate {
                artifact(sourcesJar)
            }
        }
    }
}

tasks.withType<PublishToMavenLocal>().configureEach {
    finalizedBy(tasks.build.get())
}