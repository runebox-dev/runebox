package io.runebox.asm.expr

import io.runebox.asm.MemberRef
import io.runebox.asm.core.pool
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.FieldInsnNode

class FieldExpr(
    override val insn: FieldInsnNode,
    pops: Int,
    pushes: Int
) : Expr(insn, pops, pushes) {

    val ref get() = MemberRef(insn)

    val owner get() = ref.owner
    val name get() = ref.name
    val desc get() = ref.desc

    val isStatic get() = opcode == GETSTATIC || opcode == PUTSTATIC
    val isGetter get() = opcode == GETSTATIC || opcode == GETFIELD
    val isSetter get() = !isGetter

    fun resolve() = ref.resolveField(method.pool)

    override fun toString(): String {
        return "FIELD[${MemberRef(insn)}]"
    }
}