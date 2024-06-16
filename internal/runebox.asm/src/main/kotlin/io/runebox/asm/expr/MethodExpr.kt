package io.runebox.asm.expr

import io.runebox.asm.MemberRef
import org.objectweb.asm.Opcodes.INVOKESTATIC
import org.objectweb.asm.tree.MethodInsnNode

class MethodExpr(
    override val insn: MethodInsnNode,
    pops: Int,
    pushes: Int
) : Expr(insn, pops, pushes) {

    val ref get() = MemberRef(insn)
    val owner get() = ref.owner
    val name get() = ref.name
    val desc get() = ref.desc

    val isStatic get() = opcode == INVOKESTATIC

    override fun toString(): String {
        return "METHOD${if(isStatic)"-STATIC" else ""}[${ref}]"
    }
}