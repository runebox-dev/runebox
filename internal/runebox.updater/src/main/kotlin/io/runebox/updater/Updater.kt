package io.runebox.updater

import io.runebox.updater.asm.tree.ClassGroup
import java.io.File

class Updater(
    private val oldGroup: ClassGroup,
    private val newGroup: ClassGroup
) {

    fun update() {
        Logger.log("Starting RuneBox Updater...")

        oldGroup.build()
        newGroup.build()

        println()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size != 3) error("Usage: java -jar Updater.jar <old-named jar> <new-deob jar> <new-named(output) jar>")

            val oldJar = File(args[0])
            val newJar = File(args[1])
            val outJar = File(args[2])

            val oldGroup = ClassGroup().read(oldJar)
            val newGroup = ClassGroup().read(newJar)

            val updater = Updater(oldGroup, newGroup)
            updater.update()

        }
    }
}