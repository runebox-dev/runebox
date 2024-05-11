package io.runebox.asm

import io.runebox.asm.type.FieldDef
import io.runebox.asm.type.MethodDef
import org.objectweb.asm.tree.ClassNode

class ClassInfo(override val group: ClassGroup, override val node: ClassNode) : NodeInfo<ClassNode>() {
    var isIgnored = false
    var isDependency = false

    override var access by node::access
    override var name by node::name
    var superName by node::superName
    var interfaces by node::interfaces
    var sourceFile by node::sourceFile

    var superClass: ClassInfo? = null
    var interfaceClasses: MutableList<ClassInfo> = mutableListOf()
    var childClasses: MutableList<ClassInfo> = mutableListOf()
    val parentClasses: List<ClassInfo> get() = listOfNotNull(superClass).plus(interfaceClasses)

    val methods: List<MethodInfo> get() = node.methods.map { MethodInfo(this, it) }
    val fields: List<FieldInfo> get() = node.fields.map { FieldInfo(this, it) }
    
    val memberMethods get() = methods.filter { !it.isStatic }
    val staticMethods get() = methods.filter { it.isStatic }
    val constructors get() = methods.filter { it.isConstructor }
    val staticInitializer get() = methods.firstOrNull { it.isInitializer }
    
    val memberFields get() = fields.filter { !it.isStatic }
    val staticFields get() = fields.filter { it.isStatic }

    fun addMethod(method: MethodInfo) = node.methods.add(method.node)
    fun removeMethod(method: MethodInfo) = node.methods.remove(method.node)
    fun addField(field: FieldInfo) = node.fields.add(field.node)
    fun removeField(field: FieldInfo) = node.fields.remove(field.node)
    
    fun findMethod(name: String, desc: String) = methods.firstOrNull { it.name == name && it.desc == desc }
    fun findMethod(def: MethodDef) = findMethod(def.name, def.desc)
    fun findStaticMethod(name: String, desc: String) = staticMethods.filter { it.name == name && it.desc == desc }
    fun findStaticMethod(def: MethodDef) = findStaticMethod(def.name, def.desc)
    
    fun findField(name: String, desc: String) = fields.firstOrNull { it.name == name && it.desc == desc }
    fun findField(def: FieldDef) = findField(def.name, def.desc)
    fun findStaticField(name: String, desc: String) = staticFields.filter { it.name == name && it.desc == desc }
    fun findStaticField(def: FieldDef) = findStaticField(def.name, def.desc)

    fun findSuperMethod(name: String, desc: String): MethodInfo? {
        val ret = findMethod(name, desc)
        if(ret != null) return ret
        if(superClass != null) return superClass!!.findSuperMethod(name, desc)
        return null
    }
    fun findSuperMethod(def: MethodDef) = findSuperMethod(def.name, def.desc)

    fun findSuperField(name: String, desc: String): FieldInfo? {
        val ret = findField(name, desc)
        if(ret != null) return ret
        if(superClass != null) return superClass!!.findSuperField(name, desc)
        return null
    }
    fun findSuperField(def: FieldDef) = findSuperField(def.name, def.desc)

    fun clearHierarchy() {
        superClass = null
        interfaceClasses.clear()
        childClasses.clear()
    }

    fun buildHierarchy() {
        if(parentClasses.isNotEmpty()) {
            throw IllegalStateException("Class $name hierarchy must be cleared before being rebuilt.")
        }
        superClass = superName?.let { group.findClass(it) }
        superClass?.childClasses?.add(this)
        for(itfCls in interfaces.map { group.findClass(it) }) {
            interfaceClasses.add(itfCls)
            itfCls.childClasses.add(this)
        }
    }

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