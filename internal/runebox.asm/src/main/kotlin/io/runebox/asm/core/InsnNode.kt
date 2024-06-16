package io.runebox.asm.core

import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.*


val AbstractInsnNode.isIf: Boolean get() = this is JumpInsnNode && opcode != GOTO

val AbstractInsnNode.isReturn: Boolean get() = opcode in IRETURN .. RETURN

val AbstractInsnNode.isTerminal: Boolean get() {
    return this is JumpInsnNode
            || this is TableSwitchInsnNode
            || this is LookupSwitchInsnNode
            || this.isReturn
            || opcode == ATHROW
}

val AbstractInsnNode.pushedInt: Int? get() = when(opcode) {
    in ICONST_M1..ICONST_5 -> opcode - ICONST_0
    in BIPUSH..SIPUSH -> (this as IntInsnNode).operand
    LDC -> (this as LdcInsnNode).cst as? Int
    else -> null
}