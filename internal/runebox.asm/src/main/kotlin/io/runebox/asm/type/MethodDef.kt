package io.runebox.asm.type

import io.runebox.asm.MethodInfo
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode

data class MethodDef(val name: String, val desc: String) {
    constructor(method: MethodInfo) : this(method.name, method.desc)
    constructor(method: MethodNode) : this(method.name, method.desc)
    constructor(insn: MethodInsnNode) : this(insn.name, insn.desc)

    override fun toString(): String {
        return "$name $desc"
    }
}