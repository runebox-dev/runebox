package io.runebox.asm.visitor

import io.runebox.asm.core.ClassFile
import io.runebox.asm.core.ClassGroup
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.FieldVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes.ASM9

class AsmClassVisitor(val cls: ClassFile) : ClassVisitor(ASM9){

    constructor(group: ClassGroup) : this(ClassFile(group))

    val group get() = cls.group

    override fun visit(version: Int, access: Int, name: String, signature: String?, superName: String?, interfaces: Array<out String>) {
        cls.version = version
        cls.name = name
        cls.superName = superName
        cls.interfaceNames = interfaces.toMutableList()
    }

    override fun visitSource(source: String?, debug: String?) {
        cls.sourceFile = source
    }

    override fun visitMethod(
        access: Int,
        name: String,
        descriptor: String,
        signature: String?,
        exceptions: Array<out String>?
    ): MethodVisitor {
        return AsmMethodVisitor(cls, name, descriptor, access, exceptions?.toMutableList() ?: mutableListOf())
    }

    override fun visitField(
        access: Int,
        name: String,
        descriptor: String,
        signature: String?,
        value: Any?
    ): FieldVisitor {
        return AsmFieldVisitor(cls, name, descriptor, access, value)
    }

    override fun visitEnd() {

    }
}