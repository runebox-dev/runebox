package io.runebox.deobfuscator

import java.io.File

fun main(args: Array<String>) {
    val inputJar = File("build/deob/gamepack.jar")
    val outputJar = File("build/deob/gamepack.deob.jar")

    val deobfuscator = Deobfuscator(inputJar, outputJar)
    deobfuscator.run()

    TestClient(outputJar).start()
}