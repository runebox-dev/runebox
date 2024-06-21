package io.runebox.deobfuscator.transformer

import com.google.common.collect.TreeMultimap
import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.cls
import io.runebox.asm.core.init
import io.runebox.asm.core.isInitializer
import io.runebox.asm.isStatic
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.asm.copy
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*
import java.util.*

class StaticMethodOrigClassMover : Transformer {

    private var count = 0

    private val duplicateMethodsMap = TreeMultimap.create<String, String>()
    private val origMethodOwnersMap = TreeMap<String, String>()

    override fun transform(pool: ClassPool) {
        pool.classes.forEach { cls ->
            cls.methods.forEach methodLoop@ { method ->
                if(method.access.isStatic && !method.isInitializer) {
                    duplicateMethodsMap.put(method.fingerprint, "${cls.name}.${method.name}${method.desc}")
                }
            }
        }

        duplicateMethodsMap.asMap().entries.removeIf { it.value.size == 1 }
        val duplicateMethods = duplicateMethodsMap.asMap().values.sortedBy { it.first() }

        pool.classes.forEach { cls ->
            for(method in cls.methods) {
                val dups = duplicateMethods.firstOrNull { it.contains(method.id) } ?: continue
                val classNames = dups.minus(method.id).map { it.split(".").first() }.distinct()
                val realClassName = classNames.first()
                if(cls.name == realClassName) continue
                origMethodOwnersMap[method.id] = realClassName
            }
        }

        val methodNameMap = pool.classes.flatMap { it.methods }.associateBy { it.id }
        val movedMethods = hashSetOf<MethodNode>()

        origMethodOwnersMap.forEach { (src, orig) ->
            val srcMethod = methodNameMap[src] ?: return@forEach
            val origCls = pool.classes.firstOrNull { it.name == orig } ?: return@forEach

            val movedMethod = srcMethod.copy()
            origCls.methods.add(movedMethod)

            movedMethod.init(origCls)
            placedMethods.add(movedMethod.id)

            movedMethods.add(movedMethod)
            count++
        }

        val movedMethodsNameMap = movedMethods.associateBy { it.id }
        pool.classes.forEach { cls ->
            cls.methods.forEach { method ->
                val insns = method.instructions.iterator()
                while(insns.hasNext()) {
                    val insn = insns.next()
                    if(insn !is MethodInsnNode) continue
                    val identifier = "${insn.owner}.${insn.name}${insn.desc}"
                    if(origMethodOwnersMap.containsKey(identifier)) {
                        val origCls = origMethodOwnersMap[identifier] ?: continue
                        insn.owner = origCls
                        count++
                    }
                }
            }
        }

        origMethodOwnersMap.keys.mapNotNull { methodNameMap[it] }.forEach { method ->
            method.cls.methods.remove(method)
            count++
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Moved $count static methods to original class.")
    }

    private val MethodNode.id get() = "${cls.name}.$name$desc"

    private val MethodNode.fingerprint: String get() = "${Type.getReturnType(desc)}.${(instructions.lineNumberRange ?: "*")}.${instructions.hash}"

    private val InsnList.lineNumberRange: IntRange? get() {
        val lineNumbers = iterator().asSequence().mapNotNull { it as? LineNumberNode }.mapNotNull { it.line }.toList()
        if(lineNumbers.isEmpty()) return null
        return lineNumbers.first()..lineNumbers.last()
    }

    private val InsnList.hash: Int get() = iterator().asSequence().mapNotNull {
        when(it) {
            is FieldInsnNode -> "${it.owner}.${it.name}:${it.opcode}"
            is MethodInsnNode -> "${it.opcode}:${it.owner}.${it.name}"
            is InsnNode -> it.opcode.toString()
            else -> null
        }
    }.toSet().hashCode()

    companion object {
        internal val placedMethods = hashSetOf<String>()
    }
}