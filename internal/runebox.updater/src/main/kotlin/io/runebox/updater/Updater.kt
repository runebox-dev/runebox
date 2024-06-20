package io.runebox.updater

import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.isIgnored
import io.runebox.updater.merge.MergeEngine
import java.io.File

object Updater {
    private lateinit var oldJar: File
    private lateinit var newJar: File
    private lateinit var outputJar: File

    fun run() {
        Logger.info("Starting Updater.")
        val oldPool = ClassPool().also {
            it.loadJar(oldJar)
            it.classes.filter { it.name.startsWith("org/") }.forEach { c -> c.isIgnored = true }
        }
        val newPool = ClassPool().also {
            it.loadJar(newJar)
            it.classes.filter { it.name.startsWith("org/") }.forEach { c -> c.isIgnored = true }
        }

        Logger.info("Initializing engine.")
        val engine = MergeEngine(oldPool, newPool)
        engine.merge()

        Logger.info("Finished Updater.")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        if(args.size != 3) error("Usage: java -jar Updater.jar <old-jar> <new-jar> <output-jar>")
        oldJar = File(args[0])
        newJar = File(args[1])
        outputJar = File(args[2])
        run()
    }
}