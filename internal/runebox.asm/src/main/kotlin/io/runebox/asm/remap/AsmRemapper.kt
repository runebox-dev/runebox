package io.runebox.asm.remap

import io.runebox.asm.MemberRef
import org.objectweb.asm.commons.Remapper

open class AsmRemapper(val mappings: NameMappings) : Remapper() {

    val pool get() = mappings.pool

    override fun map(internalName: String): String {
        return mappings.classes.getOrDefault(internalName, internalName)
    }

    override fun mapFieldName(owner: String, name: String, descriptor: String): String {
        val ref = MemberRef(owner, name, descriptor)
        return mappings.fields[ref] ?: return name
    }

    override fun mapMethodName(owner: String, name: String, descriptor: String): String {
        val ref = MemberRef(owner, name, descriptor)
        return mappings.methods[ref] ?: return name
    }
}