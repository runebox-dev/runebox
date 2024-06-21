package io.runebox.updater.asm.core

import io.runebox.updater.util.field
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodNode

var MethodNode.cls: ClassNode by field()

fun MethodNode.init(cls: ClassNode) {
    this.cls = cls
}

val MethodNode.isConstructor get() = name == "<init>"
val MethodNode.isInitializer get() = name == "<clinit>"

val MethodNode.virtualMethods: List<MethodNode> get() {
    fun findSuperMethods(methods: MutableList<MethodNode>, owner: ClassNode?, name: String, desc: String): MutableList<MethodNode> {
        if(owner == null) return methods
        val m = owner.findMethod(name, desc)
        if(m != null && !m.isStatic) {
            methods.add(m)
        }
        val parentMethods = findSuperMethods(mutableListOf(), owner.superClass, name, desc)
        for(itf in owner.interfaceClasses) {
            parentMethods.addAll(findSuperMethods(mutableListOf(), itf, name, desc))
        }
        return if(parentMethods.isEmpty()) methods else parentMethods
    }

    fun findChildMethods(methods: MutableList<MethodNode>, visited: HashSet<ClassNode>, owner: ClassNode?, name: String, desc: String) {
        if(owner == null || visited.contains(owner)) return
        visited.add(owner)

        val m = owner.findMethod(name, desc)
        if(m != null && !m.isStatic) {
            methods.add(m)
        }

        for(child in owner.childClasses) {
            findChildMethods(methods, visited, child, name, desc)
        }
    }

    val methods = mutableListOf<MethodNode>()
    if(this.isStatic) {
        methods.add(this)
        return methods
    }

    val superMethods = findSuperMethods(mutableListOf(), cls, name, desc)
    for(m in superMethods) {
        findChildMethods(methods, hashSetOf(), m.cls, m.name, m.desc)
    }

    return methods
}