package io.runebox.updater.asm.core

import io.runebox.updater.asm.core.insn.resolve
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.MethodInsnNode

fun InsnList.resolveInstructions(group: ClassGroup) {
    this.forEach { insn ->
        when (insn) {
            is MethodInsnNode -> insn.resolve(group)
        }
    }
}