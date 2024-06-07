package io.runebox.asm.hierarchy

import io.runebox.asm.MemberRef
import io.runebox.asm.tree.findMethod
import io.runebox.asm.tree.toRef

class MethodHierarchy(val classHierarchy: ClassHierarchy) {
    val pool get() = classHierarchy.pool

    val roots = hashSetOf<MemberRef>()

    init {
        for(cls in pool.allClasses) {
            val parents = classHierarchy.allParents(cls)!!
            for(method in cls.methods) {
                if(parents.none { it.cls.findMethod(method.name, method.desc) != null }) {
                    roots.add(method.toRef())
                }
            }
        }
    }

    class Node(val ref: MemberRef) {

        override fun toString(): String = ref.toString()
        override fun equals(other: Any?): Boolean = other is Node && ref == other.ref
        override fun hashCode(): Int = ref.hashCode()
    }
}