package io.runebox.asm.core

import io.runebox.asm.util.T
import io.runebox.asm.util.isDoubleOrLong
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.LdcInsnNode

val AbstractInsnNode.isDoubleOrLong: Boolean get() = when(this) {
    is FieldInsnNode -> desc[0] == 'D' || desc[0] == 'J'
    is LdcInsnNode -> cst.isDoubleOrLong
    else -> false
}

fun AbstractInsnNode.seek(next: Boolean, real: Boolean): AbstractInsnNode? {
    var instruction: AbstractInsnNode? = this
    while(!(instruction == null || real T (instruction.opcode == -1) ?: (instruction.opcode != -1))) {
        instruction = next T instruction.next ?: instruction.previous
    }
    return instruction
}

val AbstractInsnNode.nextReal: AbstractInsnNode? get() = seek(next = true, real = true)
val AbstractInsnNode.previousReal: AbstractInsnNode? get() = seek(next = false, real = true)
val AbstractInsnNode.nextVirtual: AbstractInsnNode? get() = seek(next = true, real = false)
val AbstractInsnNode.previousVirtual: AbstractInsnNode? get() = seek(next = false, real = false)