package io.runebox.asm.type

import io.runebox.asm.ClassInfo
import io.runebox.asm.MethodInfo
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode

data class MethodRef(val owner: String, val name: String, val desc: String) {
    constructor(method: MethodInfo) : this(method.cls.name, method.name, method.desc)
    constructor(owner: String, method: MethodInfo) : this(owner, method.name, method.desc)
    constructor(owner: ClassInfo, method: MethodInfo) : this(owner.name, method)
    constructor(owner: String, method: MethodNode) : this(owner, method.name, method.desc)
    constructor(insn: MethodInsnNode) : this(insn.owner, insn.name, insn.desc)
    constructor(owner: String, def: MethodDef) : this(owner, def.name, def.desc)
    constructor(owner: ClassInfo, def: MethodDef) : this(owner.name, def)

    val def get() = MethodDef(name, desc)

    override fun toString(): String {
        return "$owner.$name $desc"
    }
}