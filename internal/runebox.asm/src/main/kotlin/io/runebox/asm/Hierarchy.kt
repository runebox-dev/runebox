@file:Suppress("DuplicatedCode")

package io.runebox.asm

import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.cls
import io.runebox.asm.core.toDef
import io.runebox.asm.core.toRef
import org.objectweb.asm.Opcodes.ACC_STATIC
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode
import kotlin.reflect.KFunction1

class Hierarchy(val pool: ClassPool) {

    private val classMap = hashMapOf<String, ClassNode>()
    private val parentsMap = hashMapOf<String, MutableList<ClassNode>>()
    private val childrenMap = hashMapOf<String, MutableList<ClassNode>>()

    init {
        val queue = ArrayDeque<String>()
        for(cls in pool.allClasses.plus(pool.jvmClasses)) {
            queue.addFirst(cls.name)
        }
        while(queue.isNotEmpty()) {
            val cur = queue.removeFirst()
            val cls = pool.findClass(cur)
            if(cls.superName != null) {
                visit(cls)
                queue.addFirst(cls.superName)
                cls.interfaces.forEach(queue::addFirst)
            }
        }
    }

    private fun visit(cls: ClassNode) {
        visitSuper(cls, cls.superName)
        for(itf in cls.interfaces) {
            visitSuper(cls, itf)
        }
    }

    private fun visitSuper(cls: ClassNode, superName: String?) {

        val parent = if(superName == null) null else findClass(superName)
        if(parent != null && parent.name == Type.getInternalName(Object::class.java)) return
        parentsMap.computeIfAbsent(cls.name) { mutableListOf() }.add(parent!!)
        if(parent != null) {
            val parentChildren = childrenMap.computeIfAbsent(parent.name) { mutableListOf() }
            if(!parentChildren.contains(cls)) {
                parentChildren.add(cls)
            }
        }
    }

    private fun visitHierarchy(
        visited: HashSet<String>,
        root: String,
        visitor: (ClassNode) -> Unit,
        provider: KFunction1<String, List<ClassNode>>
    ) {
        if(visited.contains(root)) return
        for(cls in provider(root)) {
            visitor(cls)
            visited.add(root)
            visitHierarchy(visited, cls.name, visitor, provider)
        }
    }

    fun findImediateParentClasses(root: String): List<ClassNode> = parentsMap.getOrDefault(root, emptyList())
    fun findImediateChildClasses(root: String): List<ClassNode> = childrenMap.getOrDefault(root, emptyList())

    fun visitParentsOf(root: String, visitor: (ClassNode) -> Unit) { visitHierarchy(hashSetOf(), root, visitor, ::findImediateParentClasses) }
    fun visitChildrenOf(root: String, visitor: (ClassNode) -> Unit) { visitHierarchy(hashSetOf(), root, visitor, ::findImediateChildClasses) }

    fun visitRelativesOf(root: String, visitor: (ClassNode) -> Unit) {
        visitChildrenOf(root, visitor)
        visitParentsOf(root, visitor)
    }

    fun findParentClasses(root: String): Set<ClassNode> {
        val parents = hashSetOf<ClassNode>()
        visitParentsOf(root, parents::add)
        return parents
    }

    fun findChildClasses(root: String): Set<ClassNode> {
        val children = hashSetOf<ClassNode>()
        visitChildrenOf(root, children::add)
        return children
    }

    fun findParentMethod(method: MethodNode): MethodNode? {
        for(parent in findParentClasses(method.cls.name)) {
            for(parentMethod in parent.methods) {
                if(parentMethod.toDef() == method.toDef()) {
                    return method
                }
            }
        }
        return null
    }

    fun findRootMethod(method: MethodNode): MethodNode {
        for(cls in pool.allClasses) {
            val parents = findParentClasses(cls.name)
            for(m in cls.methods) {
                if(m.name != method.name || m.desc != method.desc) continue
                if(parents.none { it.methods.any { it.name == m.name && it.desc == m.desc } }) {
                    return m
                }
            }
        }
        return method
    }

    fun isMethodOverridden(ref: MemberRef): Boolean {
        for(parentCls in findParentClasses(ref.owner)) {
            for(parentMethod in parentCls.methods) {
                if(parentMethod.name == ref.name && parentMethod.desc == ref.desc && (parentMethod.access and ACC_STATIC) == 0) {
                    return true
                }
            }
        }
        return false
    }

    fun isMethodOverridden(method: MethodNode): Boolean = isMethodOverridden(method.toRef())

    fun findParentField(field: FieldNode): FieldNode? {
        for(parent in findParentClasses(field.cls.name)) {
            val m = parent.fields.firstOrNull { it.name == field.name && it.desc == field.desc }
            if(m != null) return m
        }
        return null
    }

    fun findRootField(field: FieldNode): FieldNode {
        for(cls in pool.allClasses) {
            val parents = findParentClasses(cls.name)
            for(m in cls.fields) {
                if(m.name != field.name || m.desc != field.desc) continue
                if(parents.none { it.fields.any { it.name == m.name && it.desc == m.desc } }) {
                    return m
                }
            }
        }
        return field
    }

    fun isFieldOverridden(ref: MemberRef): Boolean {
        for(parentCls in findParentClasses(ref.owner)) {
            for(parentField in parentCls.fields) {
                if(parentField.name == ref.name && parentField.desc == ref.desc && (parentField.access and ACC_STATIC) == 0) {
                    return true
                }
            }
        }
        return false
    }

    fun isFieldOverridden(field: FieldNode): Boolean = isFieldOverridden(field.toRef())

    fun findMethodHierarchy(method: MethodNode): List<MemberRef> {
        val results = mutableListOf<MemberRef>()
        val rootMethod = findRootMethod(method)
        results.add(rootMethod.toRef())
        for(childCls in findChildClasses(rootMethod.cls.name)) {
            val cref = MemberRef(childCls.name, rootMethod.toDef())
            results.add(cref)
        }
        for(parentCls in findParentClasses(rootMethod.cls.name)) {
            val pref = MemberRef(parentCls.name, rootMethod.toDef())
            results.add(pref)
        }
        return results
    }

    private fun findClass(name: String): ClassNode {
        return classMap[name] ?: pool.findClass(name)
    }
}