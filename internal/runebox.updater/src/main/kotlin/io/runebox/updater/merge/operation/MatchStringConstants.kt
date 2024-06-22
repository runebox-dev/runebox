package io.runebox.updater.merge.operation

import io.runebox.updater.asm.tree.ClassGroup
import io.runebox.updater.asm.tree.memberMethods
import io.runebox.updater.asm.tree.staticMethods
import io.runebox.updater.merge.MergeEngine
import io.runebox.updater.merge.MergeOperation
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.LdcInsnNode
import kotlin.collections.set

class MatchStringConstants : MergeOperation {
    override fun operate(set: MergeEngine) {
        val oldUnique = UniqueConstantMapper(set.oldGroup).map()
        val newUnique = UniqueConstantMapper(set.newGroup).map()
        for(e in oldUnique) {
            val old = e.value
            val new = newUnique[e.key]
            if(new != null) {
                val oldComplexity = old.methods.size
                val newComplexity = new.methods.size
                if(newComplexity < oldComplexity * 0.1 || oldComplexity < newComplexity * 0.1) continue
                set.Class.vote(old, new)
            }
        }
    }

    private class UniqueConstantMapper(val group: ClassGroup) {
        private val unique = hashMapOf<String, ClassNode>()
        private val nonUnique = hashSetOf<String>()
        private lateinit var current: ClassNode

        fun map(): Map<String, ClassNode> {
            for(cls in group.classes) {
                current = cls
                for(method in cls.memberMethods) {
                    for(insn in method.instructions.filter { it is LdcInsnNode }) {
                        insn as LdcInsnNode
                        if(insn.cst !is String) continue
                        processString(insn.cst as String)
                    }
                }
                for(method in cls.staticMethods) {
                    for(insn in method.instructions.filter { it is LdcInsnNode }) {
                        insn as LdcInsnNode
                        if(insn.cst !is String) continue
                        processString(insn.cst as String)
                    }
                }
            }
            return unique
        }

        private fun processString(str: String) {
            if(nonUnique.contains(str)) return
            val cls = unique[str]
            if(cls == null) {
                unique[str] = current
            } else if(cls != current) {
                nonUnique.add(str)
                unique.remove(str)
            }
        }
    }
}