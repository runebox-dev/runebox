package io.runebox.asm.core

import io.runebox.asm.MemberDef
import io.runebox.asm.isStatic
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

val ClassNode.memberMethods get() = methods.filter { !it.access.isStatic && !it.isConstructor }
val ClassNode.staticMethods get() = methods.filter { it.access.isStatic && !it.isInitializer }
val ClassNode.memberFields get() = fields.filter { !it.access.isStatic }
val ClassNode.staticFields get() = fields.filter { it.access.isStatic }

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

fun ClassNode.findMethod(def: MemberDef) = findMethod(def.name, def.desc)
fun ClassNode.findField(def: MemberDef) = findField(def.name, def.desc)
fun ClassNode.findSuperMethod(def: MemberDef) = findSuperMethod(def.name, def.desc)
fun ClassNode.findSuperField(def: MemberDef) = findSuperField(def.name, def.desc)