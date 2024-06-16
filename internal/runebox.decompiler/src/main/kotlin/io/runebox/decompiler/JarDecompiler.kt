package io.runebox.decompiler

import org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler
import java.io.File
import java.nio.file.Files
import java.util.jar.JarFile

object JarDecompiler {

    @JvmStatic
    fun main(args: Array<String>) {
        if(args.size != 2) error("Usage: decompiler.jar <input-jar> <output-dir>")
        val inputJar = File(args[0])
        val outputDir = File(args[1])

        if(outputDir.exists()) outputDir.deleteRecursively()
        outputDir.mkdirs()

        val tmpOutputDir = Files.createTempDirectory("tmp-decomp-out").toFile().also { it.deleteOnExit() }
        val decompilerArgs = listOf(
            "-dgs=1",
            "-asc=1",
            inputJar.absolutePath,
            tmpOutputDir.absolutePath,
        )

        println("Decompiling jar file: ${inputJar.name} to directory ${outputDir.name}.")

        ConsoleDecompiler.main(decompilerArgs.toTypedArray())

        val tmpOutputJar = File(tmpOutputDir.absolutePath+"/"+inputJar.name)
        JarFile(tmpOutputJar).use { jar ->
            jar.entries().asSequence().forEach { entry ->
                if(entry.isDirectory) {
                    if(entry.name.startsWith("org/")) return@forEach
                    val dir = outputDir.resolve(entry.name)
                    dir.mkdirs()
                } else {
                    val file = outputDir.resolve(entry.name)
                    if(file.exists()) file.delete()
                    if(file.parentFile?.exists() != true) file.parentFile?.mkdirs()
                    jar.getInputStream(entry).use { input ->
                        file.outputStream().use { output ->
                            input.copyTo(output)
                        }
                    }
                }
            }
        }
    }
}