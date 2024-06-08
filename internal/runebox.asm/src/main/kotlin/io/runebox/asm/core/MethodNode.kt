package io.runebox.asm.core

import io.runebox.asm.MemberDef
import io.runebox.asm.MemberRef
import io.runebox.asm.ir.ExprTree
import io.runebox.asm.util.F
import io.runebox.asm.util.T
import io.runebox.asm.util.field
import io.runebox.asm.util.nullField
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

fun MethodNode.init(cls: ClassNode) {
    this.cls = cls
}

var MethodNode.cls: ClassNode by field()
val MethodNode.pool: ClassPool get() = cls.pool

fun MethodNode.toDef() = MemberDef(this)
fun MethodNode.toRef() = MemberRef(this)

private var MethodNode.exprTreeCached: ExprTree? by nullField()

val MethodNode.exprTree: ExprTree get() {
    val tree = (exprTreeCached == null) T ExprTree(this).also { it.build() } F exprTreeCached!!
    exprTreeCached = tree
    return tree
}