package io.runebox.asm.visitor

import io.runebox.asm.core.ClassFile
import io.runebox.asm.core.Field
import org.objectweb.asm.FieldVisitor
import org.objectweb.asm.Opcodes.ASM9

class AsmFieldVisitor(
    private val cls: ClassFile,
    name: String,
    desc: String,
    access: Int = 0,
    value: Any? = null
) : FieldVisitor(ASM9) {

    private val field = Field(cls, name, desc, access, value)

    override fun visitEnd() {
        cls.fields.add(field)
    }
}