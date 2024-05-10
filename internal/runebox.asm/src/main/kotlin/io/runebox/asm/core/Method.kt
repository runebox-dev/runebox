package io.runebox.asm.core

import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.ParameterNode
import org.objectweb.asm.tree.TryCatchBlockNode

class Method(override var cls: ClassFile) : Member<MethodNode> {

    override var access = 0
    override lateinit var name: String
    override lateinit var desc: String

    constructor(
        cls: ClassFile,
        name: String,
        desc: String,
        access: Int = 0,
        exceptions: MutableList<String> = mutableListOf()
    ) : this(cls) {
        this.name = name
        this.desc = desc
        this.access = access
        this.exceptions = exceptions
    }

    var exceptions = mutableListOf<String>()
    var tryCatchBlocks = mutableListOf<TryCatchBlockNode>()
    var instructions = InsnList()
    var maxStack = 0
    var maxLocals = 0
    var parameters = mutableListOf<ParameterNode>()

    val info get() = MethodInfo(this)

    fun accept(visitor: MethodVisitor) {
        for(param in parameters) {
            visitor.visitParameter(param.name, param.access)
        }
        visitor.visitCode()
        for(tcb in tryCatchBlocks) {
            visitor.visitTryCatchBlock(tcb.start.label, tcb.end.label, tcb.handler.label, tcb.type)
        }
        for(insn in instructions) {
            insn.accept(visitor)
        }
        visitor.visitMaxs(maxStack, maxLocals)
        visitor.visitEnd()
    }

    override fun toString(): String = "$cls.$name $desc"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Method) return false
        if (cls != other.cls) return false
        if (name != other.name) return false
        if (desc != other.desc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = cls.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + desc.hashCode()
        return result
    }
}