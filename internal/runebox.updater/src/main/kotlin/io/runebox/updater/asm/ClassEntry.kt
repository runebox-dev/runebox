package io.runebox.updater.asm

import org.objectweb.asm.Type

sealed class ClassEntry(val pool: ClassPool, type: Type) {
    val id = type.descriptor
    val name = type.internalName

    override fun toString(): String {
        return name
    }
}

