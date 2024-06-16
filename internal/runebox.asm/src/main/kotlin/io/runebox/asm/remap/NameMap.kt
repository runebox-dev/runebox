package io.runebox.asm.remap

import io.runebox.asm.MemberRef
import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.toRef
import io.runebox.asm.util.collection.DisjointSet
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

class NameMap(val pool: ClassPool) {

    val classes = hashMapOf<String, String>()
    val methods = hashMapOf<DisjointSet.Subset<MemberRef>, String>()
    val fields = hashMapOf<DisjointSet.Subset<MemberRef>, String>()

    val methodHierarchy = pool.createMethodHierarchy()
    val fieldHierarchy = pool.createFieldHierarchy()

    fun mapClass(cls: ClassNode, newName: String) {
        classes[cls.name] = newName
    }

    fun mapMethod(method: MethodNode, newName: String) {
        val hierarchy = methodHierarchy[method.toRef()]!!
        if(methods.containsKey(hierarchy)) return
        methods[hierarchy] = newName
    }

    fun mapField(field: FieldNode, newName: String) {
        val hierarchy = fieldHierarchy[field.toRef()]!!
        if(fields.containsKey(hierarchy)) return
        fields[hierarchy] = newName
    }
}