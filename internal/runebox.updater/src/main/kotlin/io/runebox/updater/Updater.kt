package io.runebox.updater

import io.runebox.updater.asm.core.ClassGroup
import java.io.File

class Updater(
    private val oldJar: File, // The old named deob jar (last version's updater output)
    private val newJar: File // The new fresh deob jar (Has placeholder unique generated names)
) {

    private lateinit var oldGroup: ClassGroup
    private lateinit var newGroup: ClassGroup

    fun update() {
        Logger.info("Initializing RuneBox updater.")

        oldGroup = createGroup(oldJar)
        newGroup = createGroup(newJar)

        Logger.info("Starting RuneBox updater.")

    }

    fun save(outputJar: File) {
        Logger.info("Saving updated jar: ${outputJar.name}.")


    }

    private fun createGroup(jar: File): ClassGroup {
        Logger.info("Loading classes from jar: ${jar.name}...")

        val group = ClassGroup()
        group.read(jar)

        /*
         * Ignore gamepack dependency classes
         */
        group.ignoreBouncyCastle()
        group.ignoreJson()

        /*
         * Build the class inheritance and resolve instruction targets.
         */
        group.buildInheritance()
        group.resolveInstructions()

        Logger.info("Loaded ${group.classes.size} classes. (${group.ignoredClasses.size} ignored)")

        return group
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size != 3) error("Usage: java -jar Updater.jar <old-named jar> <new-deob jar> <new-named(output) jar>")

            val oldJar = File(args[0])
            val newJar = File(args[1])
            val outJar = File(args[2])

            val update = Updater(oldJar, newJar)
            update.update()
            update.save(outJar)
        }
    }
}