package io.runebox.asm.core

import org.objectweb.asm.FieldVisitor

class Field(override var cls: ClassFile) : Member<Field> {

    override var access: Int = 0
    override lateinit var name: String
    override lateinit var desc: String
    var value: Any? = null

    constructor(cls: ClassFile, name: String, desc: String, access: Int = 0, value: Any? = null) : this(cls) {
        this.name = name
        this.desc = desc
        this.access = access
        this.value = value
    }

    val info get() = FieldInfo(this)

    fun accept(visitor: FieldVisitor) {
        visitor.visitEnd()
    }

    override fun toString(): String = "$cls.$name $desc"

    override fun hashCode(): Int {
        var result = cls.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + desc.hashCode()
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Field) return false
        if (cls != other.cls) return false
        if (name != other.name) return false
        if (desc != other.desc) return false
        return true
    }
}