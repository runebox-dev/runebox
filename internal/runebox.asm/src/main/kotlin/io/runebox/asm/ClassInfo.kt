package io.runebox.asm

import org.objectweb.asm.tree.ClassNode

class ClassInfo(override val group: ClassGroup, override val node: ClassNode) : NodeInfo<ClassNode>() {
    var isIgnored = false
    var isDependency = false

    override var access by node::access
    override var name by node::name
    var superName by node::superName
    var interfaces by node::interfaces
    var sourceFile by node::sourceFile

    val methods: List<MethodInfo> get() = node.methods.map { MethodInfo(this, it) }
    val fields: List<FieldInfo> get() = node.fields.map { FieldInfo(this, it) }

    fun addMethod(method: MethodInfo) = node.methods.add(method.node)
    fun removeMethod(method: MethodInfo) = node.methods.remove(method.node)

    fun addField(field: FieldInfo) = node.fields.add(field.node)
    fun removeField(field: FieldInfo) = node.fields.remove(field.node)

    override fun toString(): String {
        return name
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClassInfo) return false
        if (name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        return name?.hashCode() ?: 0
    }

}