package io.runebox.asm.core

import io.runebox.asm.LabelMap
import io.runebox.asm.MemberDef
import io.runebox.asm.MemberRef
import io.runebox.asm.expr.ExprTree
import io.runebox.asm.util.field
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.MethodNode

fun MethodNode.init(cls: ClassNode) {
    this.cls = cls
}

var MethodNode.cls: ClassNode by field()
val MethodNode.pool: ClassPool get() = cls.pool

fun MethodNode.toDef() = MemberDef(this)
fun MethodNode.toRef() = MemberRef(this)

val MethodNode.isConstructor: Boolean get() = name == "<init>"
val MethodNode.isInitializer: Boolean get() = name == "<clinit>"

var MethodNode.exprTree: ExprTree
    get() = ExprTree(this)
    set(v) {
        val insns = InsnList()
        val labelMap = LabelMap()
        v.instructions.forEach { insns.add(it.clone(labelMap)) }
        instructions = insns
    }