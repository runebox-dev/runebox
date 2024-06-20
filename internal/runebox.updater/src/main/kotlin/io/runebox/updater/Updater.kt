package io.runebox.updater

import io.runebox.updater.asm.ClassEnv
import java.io.File

object Updater {
    private lateinit var oldJar: File
    private lateinit var newJar: File
    private lateinit var outputJar: File

    private lateinit var env: ClassEnv

    private fun init() {
        Logger.info("Initializing Updater.")

        env = ClassEnv()
        env.init(oldJar, newJar)
    }

    fun run() {
        init()

        Logger.info("Running Updater.")

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