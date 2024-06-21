package io.runebox.updater

import java.io.File

object Updater {
    private lateinit var oldJar: File
    private lateinit var newJar: File
    private lateinit var outputJar: File

    fun run() {

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