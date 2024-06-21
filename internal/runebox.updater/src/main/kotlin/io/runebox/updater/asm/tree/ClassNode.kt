package io.runebox.updater.asm.tree

import io.runebox.updater.util.field
import io.runebox.updater.util.mutableListField
import io.runebox.updater.util.nullField
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

var ClassNode.group: ClassGroup by field()
var ClassNode.isIgnored: Boolean by field { false }

fun ClassNode.init(group: ClassGroup) {
    this.group = group
    methods.forEach { it.init(this) }
    fields.forEach { it.init(this) }
}

var ClassNode.superClass: ClassNode? by nullField()
val ClassNode.interfaceClasses: MutableList<ClassNode> by mutableListField()
val ClassNode.childClasses: MutableList<ClassNode> by mutableListField()

fun ClassNode.findMethod(name: String, desc: String) = methods.firstOrNull { it.name == name && it.desc == desc }
fun ClassNode.findField(name: String, desc: String) = fields.firstOrNull { it.name == name && it.desc == desc }
fun ClassNode.findField(name: String) = fields.firstOrNull { it.name == name }

fun ClassNode.resolveMethod(name: String, desc: String): MethodNode? {
    val ret = findMethod(name, desc)
    if(ret != null) return ret
    if(superClass != null) {
        return superClass!!.resolveMethod(name, desc)
    }
    return null
}

fun ClassNode.resolveField(name: String, desc: String): FieldNode? {
    val ret = findField(name, desc)
    if(ret != null) return ret
    if(superClass != null) {
        return superClass!!.resolveField(name, desc)
    }
    return null
}

fun ClassNode.clearInheritance() {
    superClass = null
    interfaceClasses.clear()
    childClasses.clear()
}

fun ClassNode.buildInheritance() {
    val superCls = group.findClass(superName)
    if(superCls != null) {
        superClass = superCls
        superClass!!.childClasses.add(this)
    }
    for(itfCls in interfaces.mapNotNull { group.findClass(it) }) {
        interfaceClasses.add(itfCls)
        itfCls.childClasses.add(this)
    }
}

