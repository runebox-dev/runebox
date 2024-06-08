package io.runebox.asm.remap

import io.runebox.asm.MemberRef
import io.runebox.asm.Hierarchy
import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.toRef
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode
import java.util.*

class NameMappings(val pool: ClassPool) {
    val classes = TreeMap<String, String>()
    val methods = TreeMap<MemberRef, String>()
    val fields = TreeMap<MemberRef, String>()

    val hierarchy = Hierarchy(pool)

    fun renameClass(cls: ClassNode, newName: String) {
        if(classes.containsKey(cls.name)) return
        classes[cls.name] = newName
    }

    fun renameMethod(method: MethodNode, newName: String) {
        val mref = method.toRef()
        if(methods.containsKey(mref)) return
        methods[mref] = newName
        for(child in hierarchy.findChildClasses(mref.owner)) {
            val cref = MemberRef(child.name, mref.toDef())
            methods[cref] = newName
        }
        for(parent in hierarchy.findParentClasses(mref.owner)) {
            val pref = MemberRef(parent.name, mref.toDef())
            methods[pref] = newName
        }
    }

    fun renameField(field: FieldNode, newName: String) {
        val fref = field.toRef()
        if(fields.containsKey(fref)) return
        fields[fref] = newName
        for(child in hierarchy.findChildClasses(fref.owner)) {
            val cref = MemberRef(child.name, fref.toDef())
            fields[cref] = newName
        }
        for(parent in hierarchy.findParentClasses(fref.owner)) {
            val pref = MemberRef(parent.name, fref.toDef())
            fields[pref] = newName
        }
    }
}