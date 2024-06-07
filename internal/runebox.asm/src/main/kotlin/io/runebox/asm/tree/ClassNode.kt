package io.runebox.asm.tree

import io.runebox.asm.util.field
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

fun ClassNode.init(pool: ClassPool) {
    this.pool = pool
    methods.forEach { it.init(this) }
    fields.forEach { it.init(this) }
}

var ClassNode.pool: ClassPool by field()
var ClassNode.isIgnored: Boolean by field { false }
var ClassNode.isJvm: Boolean by field { false }
var ClassNode.jarIndex: Int by field { -1 }

val ClassNode.superClass get() = superName?.let { pool.findClass(it) }
val ClassNode.interfaceClasses get() = interfaces.map { pool.findClass(it) }.toSet()
val ClassNode.parentClasses get() = listOfNotNull(superClass).plus(interfaceClasses)

fun ClassNode.findMethod(name: String, desc: String): MethodNode? {
    return methods.firstOrNull { it.name == name && it.desc == desc }
}

fun ClassNode.findField(name: String, desc: String): FieldNode? {
    return fields.firstOrNull { it.name == name && it.desc == desc }
}

fun ClassNode.findSuperMethod(name: String, desc: String): MethodNode? {
    val m = findMethod(name, desc)
    if(m != null) return m
    return superClass?.findSuperMethod(name, desc)
}

fun ClassNode.findSuperField(name: String, desc: String): FieldNode? {
    val f = findField(name, desc)
    if(f != null) return f
    return superClass?.findSuperField(name, desc)
}