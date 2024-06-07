package io.runebox.asm.tree

import io.runebox.asm.MemberDef
import io.runebox.asm.MemberRef
import io.runebox.asm.util.field
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode

fun FieldNode.init(cls: ClassNode) {
    this.cls = cls
}

var FieldNode.cls: ClassNode by field()
val FieldNode.pool: ClassPool get() = cls.pool

fun FieldNode.toDef() = MemberDef(this)
fun FieldNode.toRef() = MemberRef(this)