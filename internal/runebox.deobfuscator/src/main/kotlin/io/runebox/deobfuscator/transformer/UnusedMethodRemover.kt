package io.runebox.deobfuscator.transformer

import com.google.common.collect.Multimap
import com.google.common.collect.MultimapBuilder
import io.runebox.asm.MemberRef
import io.runebox.asm.core.*
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.isObfuscatedName
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode

class UnusedMethodRemover : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        val supers = MultimapBuilder.hashKeys().arrayListValues().build<ClassNode, ClassNode>()
        val subs = MultimapBuilder.hashKeys().arrayListValues().build<ClassNode, ClassNode>()

        for(cls in pool.allClasses) {
            cls.interfaceClasses.forEach { supers.put(cls, it) }
            supers.put(cls, cls.superClass)
        }
        for((cls, superCls) in supers.entries()) {
            subs.put(superCls, cls)
        }

        val usedMethods = pool.classes.asSequence().flatMap { it.methods.asSequence() }
            .flatMap { it.instructions.iterator().asSequence() }
            .mapNotNull { it as? MethodInsnNode }
            .map { MemberRef(it) }
            .toSet()

        val toRemove = hashSetOf<MemberRef>()
        for(cls in pool.classes) {
            for(method in cls.methods) {
                if(method.isUsed(usedMethods, supers, subs)) continue
                toRemove.add(method.toRef())
            }
        }

        for(cls in pool.classes) {
            val methods = cls.methods.iterator()
            while(methods.hasNext()) {
                val method = methods.next()
                if(method.toRef() !in toRemove) continue
                methods.remove()
                count++
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count unused methods.")
    }

    private fun MethodNode.isUsed(usedMethods: Set<MemberRef>, supers: Multimap<ClassNode, ClassNode>, subs: Multimap<ClassNode, ClassNode>): Boolean {
        if(isConstructor || isInitializer) return true
        if(!name.isObfuscatedName()) return true
        if(usedMethods.contains(toRef())) return true
        var superClasses = supers[cls]
        while(superClasses.isNotEmpty()) {
            superClasses.forEach { c ->
                val ref = MemberRef(c.name, name, desc)
                if(ref.isJdkMethod) return true
                if(usedMethods.contains(ref)) return true
            }
            superClasses = superClasses.flatMap { supers[it] }
        }
        var subClasses = subs[cls]
        while(subClasses.isNotEmpty()) {
            subClasses.forEach { c ->
                val ref = MemberRef(c.name, name, desc)
                if(usedMethods.contains(ref)) return true
            }
            subClasses = subClasses.flatMap { subs[it] }
        }
        return false
    }

    private val MemberRef.isJdkMethod: Boolean get() {
        try {
            var classes = listOf(Class.forName(Type.getObjectType(owner).className))
            while(classes.isNotEmpty()) {
                for(cls in classes) {
                    if(cls.declaredMethods.any { it.name == name && Type.getMethodDescriptor(it) == desc }) {
                        return true
                    }
                }
                classes = classes.flatMap {
                    mutableListOf<Class<*>>().apply {
                        addAll(it.interfaces)
                        if(it.superclass != null) {
                            add(it.superclass)
                        }
                    }
                }
            }
        } catch (e: Exception) { /* Nothing */ }
        return false
    }
}