package io.runebox.deobfuscator.transformer

import com.google.common.collect.Iterables
import com.google.common.collect.TreeMultimap
import io.runebox.asm.MemberRef
import io.runebox.asm.core.*
import io.runebox.asm.isStatic
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.INVOKESTATIC
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.LineNumberNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import java.util.*

class StaticMethodOwnerFixer : Transformer {

    private var count = 0

    // class106.method2771() // used
    // class76.method2123() // dup

    override fun transform(pool: ClassPool) {
        val unusedStaticMethods = hashSetOf<MemberRef>()
        val usedStaticMethods = hashSetOf<MemberRef>()
        val dupMethodMap = TreeMultimap.create<String, MemberRef>()
        val origMethodOwnerMap = TreeMap<MemberRef, String>()

        for(method in pool.classes.flatMap { it.methods }) {
            if(!method.access.isStatic) continue
            if(method.isInitializer) continue
            unusedStaticMethods.add(method.toRef())
        }
        for(method in pool.classes.flatMap { it.methods }) {
            for(insn in method.instructions) {
                if(insn !is MethodInsnNode || insn.opcode != INVOKESTATIC) continue
                val ref = MemberRef(insn)
                if(unusedStaticMethods.remove(ref)) {
                    usedStaticMethods.add(ref)
                }
            }
        }

        for(methodRef in usedStaticMethods.plus(unusedStaticMethods)) {
            val method = methodRef.resolveMethod(pool) ?: continue
            dupMethodMap.put(method.fingerprint, methodRef)
        }

        dupMethodMap.asMap().entries.removeIf { it.value.size == 1 }
        for(entry in dupMethodMap.asMap().entries) {
            val methods = entry.value
            val ref = methods.first()
            val origRef = methods.maxBy { it.owner }
            if(ref.owner == origRef.owner) continue
            origMethodOwnerMap[ref] = origRef.owner
        }

        val movedMethods = hashSetOf<MethodNode>()
        origMethodOwnerMap.forEach { (src, orig) ->
            val srcMethod = src.resolveMethod(pool) ?: error("Failed to resolve method $src.")
            val origCls = pool.findClass(orig)

            val exceptions = Iterables.toArray(srcMethod.exceptions, String::class.java)
            val movedMethod = MethodNode(srcMethod.access, srcMethod.name, srcMethod.desc, srcMethod.signature, exceptions)
            srcMethod.accept(movedMethod)
            origCls.methods.add(movedMethod)
            movedMethod.init(origCls)
            movedMethods.add(movedMethod)
            count++
        }

        for(cls in pool.allClasses) {
            for(method in cls.methods) {
                val insns = method.instructions.iterator()
                while(insns.hasNext()) {
                    val insn = insns.next()
                    if(insn !is MethodInsnNode) continue
                    val ref = MemberRef(insn)
                    if(origMethodOwnerMap.containsKey(ref)) {
                        val origOwner = origMethodOwnerMap[ref] ?: continue
                        insn.owner = origOwner
                    }
                }
            }
        }

        for(method in origMethodOwnerMap.keys.mapNotNull { it.resolveMethod(pool) }) {
            method.cls.methods.remove(method)
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Moved $count static methods to original class.")
    }

    private val MethodNode.fingerprint: String get() {
        return "$desc.${instructions.hash}"
    }

    private val InsnList.lineNumbers: List<Int> get() {
        val lineNumbers = iterator().asSequence().mapNotNull { it as? LineNumberNode }.map { it.line }.toList()
        return lineNumbers.sorted()
    }

    private val InsnList.hash: Int get() {
        return lineNumbers.hashCode()
    }
}