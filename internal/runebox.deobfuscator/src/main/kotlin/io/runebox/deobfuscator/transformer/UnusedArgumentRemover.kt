package io.runebox.deobfuscator.transformer

import com.google.common.collect.MultimapBuilder
import io.runebox.asm.MemberRef
import io.runebox.asm.core.*
import io.runebox.asm.isAbstract
import io.runebox.asm.isStatic
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.isObfuscatedName
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.Type.*
import org.objectweb.asm.tree.*

class UnusedArgumentRemover : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        val rootMethods = hashSetOf<MemberRef>()
        val methodsMultiMap = MultimapBuilder.hashKeys().arrayListValues().build<MemberRef, MethodNode>()
        val methodsMap = methodsMultiMap.asMap()

        for(cls in pool.classes) {
            val superClasses = cls.supers
            for(method in cls.methods) {
                if(superClasses.none { it.findMethod(method.name, method.desc) != null }) {
                    rootMethods.add(method.toRef())
                }
            }
        }

        for(cls in pool.classes) {
            for(method in cls.methods) {
                val ref = pool.findOverride(method.toRef(), rootMethods) ?: continue
                methodsMultiMap.put(ref, method)
            }
        }

        val itr = methodsMap.iterator()
        for((_, method) in itr) {
            if(method.any { !it.hasUnusedLastArg }) itr.remove()
        }

        for(cls in pool.classes) {
            for(method in cls.methods) {
                for(insn in method.instructions) {
                    if(insn !is MethodInsnNode) continue
                    val ref = pool.findOverride(MemberRef(insn), methodsMap.keys) ?: continue
                    if(!insn.previous.isIntConstant) methodsMap.remove(ref)
                }
            }
        }

        for(method in methodsMultiMap.values()) {
            val oldDesc = method.desc
            val newDesc = oldDesc.dropLastArg()
            method.desc = newDesc
            count++
        }

        for(cls in pool.classes) {
            for(method in cls.methods) {
                val insns = method.instructions
                for(insn in insns) {
                    if(insn !is MethodInsnNode) continue
                    val found = pool.findOverride(MemberRef(insn), methodsMap.keys)
                    if(found != null) {
                        insn.desc = insn.desc.dropLastArg()
                        val prev = insn.previous
                        insns.remove(prev)
                    }
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count unused method arguments.")
    }

    private val ClassNode.supers: Collection<ClassNode> get() {
        return listOfNotNull(superClass).plus(interfaceClasses).flatMap { it.supers.plus(it) }
    }

    private fun ClassPool.findOverride(ref: MemberRef, methods: Set<MemberRef>): MemberRef? {
        if(ref in methods) return ref
        if(ref.name.startsWith("<init>")) return null
        val cls = findClass(ref.owner)
        for(superCls in cls.supers) {
            return findOverride(MemberRef(superCls.name, ref.name, ref.desc), methods) ?: continue
        }
        return null
    }

    private fun String.dropLastArg(): String {
        val type = Type.getMethodType(this)
        return Type.getMethodDescriptor(type.returnType, *type.argumentTypes.copyOf(type.argumentTypes.size - 1))
    }

    private val MethodNode.lastArgIndex: Int get() {
        val offset = if(access.isStatic) 1 else 0
        return (Type.getArgumentsAndReturnSizes(desc) shr 2) - offset - 1
    }

    private val MethodNode.hasUnusedLastArg: Boolean get() {
        val argTypes = Type.getArgumentTypes(desc)
        if(argTypes.isEmpty()) return false
        val lastArgType = argTypes.last()
        if(lastArgType !in listOf(BYTE_TYPE, SHORT_TYPE, INT_TYPE)) return false
        if(access.isAbstract) return true
        for(insn in instructions) {
            if(insn !is VarInsnNode) continue
            if(insn.`var` == lastArgIndex) return false
        }
        return name.isObfuscatedName()
    }

    private val AbstractInsnNode.isIntConstant: Boolean get() = when(opcode) {
        LDC -> (this as LdcInsnNode).cst is Int
        in ICONST_M1..ICONST_5 -> true
        in BIPUSH..SIPUSH -> true
        else -> false
    }
}