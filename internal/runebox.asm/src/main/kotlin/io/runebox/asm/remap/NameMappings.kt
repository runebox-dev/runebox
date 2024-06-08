package io.runebox.asm.remap

import io.runebox.asm.MemberRef
import io.runebox.asm.hierarchy.ClassHierarchy
import io.runebox.asm.tree.ClassPool
import io.runebox.asm.tree.cls
import io.runebox.asm.tree.toRef
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode
import java.util.*

class NameMappings(val pool: ClassPool) {
    val classes = TreeMap<String, String>()
    val methods = TreeMap<MemberRef, String>()
    val fields = TreeMap<MemberRef, String>()

    val hierarchy = ClassHierarchy(pool)

    fun renameClass(cls: ClassNode, newName: String) {
        if(classes.containsKey(cls.name)) return
        classes[cls.name] = newName
    }

    fun renameMethod(method: MethodNode, newName: String) {
        val ref = method.toRef()
        if(methods.containsKey(ref)) return
        methods[ref] = newName
        for(child in hierarchy.allChildren(method.cls).map { it.cls }) {
            val cref = MemberRef(child.name, method)
            methods[cref] = newName
        }
        for(parent in hierarchy.allParents(method.cls).map { it.cls }) {
            val pref = MemberRef(parent.name, method)
            methods[pref] = newName
        }
    }

    fun renameField(field: FieldNode, newName: String) {
        val ref = field.toRef()
        if(fields.containsKey(ref)) return
        fields[ref] = newName
        for(child in hierarchy.allChildren(field.cls).map { it.cls }) {
            val cref = MemberRef(child.name, field)
            fields[cref] = newName
        }
        for(parent in hierarchy.allParents(field.cls).map { it.cls }) {
            val pref = MemberRef(parent.name, field)
            fields[pref] = newName
        }
    }
}