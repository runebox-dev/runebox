package io.runebox.updater

import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.findMethod
import io.runebox.asm.core.isIgnored
import io.runebox.updater.asm.execution.Execution
import io.runebox.updater.asm.execution.Frame
import java.io.File

class Updater(
    private val oldJar: File, // The old named deob jar (last version's updater output)
    private val newJar: File, // The new fresh deob jar (Has placeholder unique generated names)
    private val outJar: File,
) {

    val oldPool = ClassPool()
    val newPool = ClassPool()

    fun update() {
        Logger.info("Preparing to update old-jar's name mappings. [${oldJar.name} -> ${newJar.name}].")

        /*
         * Load classes from both old+new input jar files.
         */
        Logger.info("Loading jar files...")
        oldPool.init(oldJar)
        newPool.init(newJar)

        val execution = Execution(oldPool)
        val frame = Frame(execution, oldPool.findClass("Client").findMethod("init", "()V")!!)
        frame.initialize()
        frame.execute()
        println()
    }

    private fun ClassPool.init(file: File) {
        clear()
        loadJar(file)
        classes.filter { it.name.startsWith("org/") || it.name.startsWith("module") }.forEach { it.isIgnored = true }
        loadHierarchy()
        Logger.info("Finished loading ${classes.size} classes into pool. [Ignored ${ignoredClasses.size}]")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size != 3) error("Usage: java -jar Updater.jar <old-named jar> <new-deob jar> <new-named(output) jar>")

            val oldJar = File(args[0])
            val newJar = File(args[1])
            val outJar = File(args[2])

            val updater = Updater(oldJar, newJar, outJar)
            updater.update()
        }
    }
}