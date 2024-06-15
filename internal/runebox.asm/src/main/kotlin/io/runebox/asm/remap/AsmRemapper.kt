package io.runebox.asm.remap

import io.runebox.asm.MemberRef
import org.objectweb.asm.commons.Remapper

open class AsmRemapper(val mappings: NameMap) : Remapper() {
    val pool get() = mappings.pool
    val methodHierarchy get() = mappings.methodHierarchy
    val fieldHierarchy get() = mappings.fieldHierarchy

    override fun map(internalName: String): String? {
        return mappings.classes[internalName] ?: internalName
    }

    override fun mapMethodName(owner: String, name: String, desc: String): String {
        val ref = MemberRef(owner, name, desc)
        val hierarchy = methodHierarchy[ref] ?: return name
        return mappings.methods[hierarchy] ?: name
    }

    override fun mapFieldName(owner: String, name: String, desc: String): String {
        val ref = MemberRef(owner, name, desc)
        val hierarchy = fieldHierarchy[ref] ?: return name
        return mappings.fields[hierarchy] ?: name
    }
}