package io.runebox.asm.core

import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.Opcodes.V1_8

class ClassFile() : Node<ClassFile> {
    override lateinit var group: ClassGroup internal set

    var isDependency : Boolean = false
    var isIgnored: Boolean = false

    var version: Int = V1_8
    override var access: Int = 0
    override lateinit var name: String
    var sourceFile: String? = null

    constructor(group: ClassGroup) : this() {
        this.group = group
    }

    constructor(group: ClassGroup, name: String) : this(group) {
        this.name = name
    }

    var superName: String? = null
        internal set

    var interfaceNames: MutableList<String> = mutableListOf()
        internal set

    var superClass: ClassFile? = null
    var interfaces: MutableList<ClassFile> = mutableListOf()
    var children: MutableList<ClassFile> = mutableListOf()

    var methods = mutableListOf<Method>()
    var fields = mutableListOf<Field>()

    fun findMethod(name: String, desc: String) = methods.firstOrNull { it.name == name && it.desc == desc }
    fun findField(name: String, desc: String) = fields.firstOrNull { it.name == name && it.desc == desc }
    fun findMethod(info: MethodInfo) = findMethod(info.name, info.desc)
    fun findField(info: FieldInfo) = findField(info.name, info.desc)

    fun lookupMethod(name: String, desc: String): Method? {
        var ret = findMethod(name, desc)?.also { return it }
        if(superClass != null) return superClass!!.lookupMethod(name, desc)
        return null
    }

    fun lookupField(name: String, desc: String): Field? {
        var ret = findField(name, desc)?.also { return it }
        if(superClass != null) return superClass!!.lookupField(name, desc)
        return null
    }

    fun lookupMethod(info: MethodInfo) = lookupMethod(info.name, info.desc)
    fun lookupField(info: FieldInfo) = lookupField(info.name, info.desc)

    fun accept(visitor: ClassVisitor) {
        interfaceNames = interfaces.map { it.name }.toMutableList()
        superName = superClass?.name
        visitor.visit(version, access, name, null, superName, interfaceNames.toTypedArray())
        visitor.visitSource(sourceFile, null)
        for (method in methods) {
            val mv =
                visitor.visitMethod(method.access, method.name, method.desc, null, method.exceptions.toTypedArray())
            method.accept(mv)
        }
        for (field in fields) {
            val fv = visitor.visitField(field.access, field.name, field.desc, null, field.value)
            field.accept(fv)
        }
        visitor.visitEnd()
    }

    override fun toString(): String = name

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClassFile) return false
        if (name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}