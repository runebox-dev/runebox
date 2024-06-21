package io.runebox.updater

import io.runebox.updater.asm.tree.ClassGroup
import io.runebox.updater.asm.tree.cls
import io.runebox.updater.asm.tree.findMethod
import io.runebox.updater.ir.conversion.Asm2Stack
import io.runebox.updater.ir.conversion.Stack2Ref
import io.runebox.updater.ir.textify.core.MethodTextifier
import io.runebox.updater.ir.textify.ref.RefBodyTextifier
import java.io.File

class Updater(
    private val oldGroup: ClassGroup,
    private val newGroup: ClassGroup
) {

    fun update() {
        Logger.log("Starting RuneBox Updater...")

        oldGroup.build()
        newGroup.build()

        val init = oldGroup.getClass("Class521")!!.findMethod("method9556", "(I)V")!!
        val irCls = Asm2Stack.convert(init.cls)
        val irMethod = irCls.also { Stack2Ref.convert(it) }.let { it.methods.first { it.name == "method9556" } }
        val str = MethodTextifier(RefBodyTextifier(), irCls).toString(irMethod)
        println(str)

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