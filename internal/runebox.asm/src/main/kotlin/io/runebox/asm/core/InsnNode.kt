package io.runebox.asm.core

import io.runebox.asm.util.isDoubleOrLong
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.*

val AbstractInsnNode.isDoubleOrLong: Boolean get() = when(this) {
    is FieldInsnNode -> desc[0] == 'D' || desc[0] == 'J'
    is LdcInsnNode -> cst.isDoubleOrLong
    else -> false
}

val AbstractInsnNode.isReturn: Boolean get() = opcode in IRETURN .. RETURN

val AbstractInsnNode.isTerminal: Boolean get() {
    return this is JumpInsnNode
            || this is TableSwitchInsnNode
            || this is LookupSwitchInsnNode
            || this.isReturn
            || opcode == ATHROW
}