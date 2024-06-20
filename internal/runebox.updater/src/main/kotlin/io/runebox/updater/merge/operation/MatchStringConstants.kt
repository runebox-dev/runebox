package io.runebox.updater.merge.operation

import io.runebox.asm.core.memberMethods
import io.runebox.asm.core.staticMethods
import io.runebox.updater.merge.MergeEngine
import io.runebox.updater.merge.MergeOperation
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.LdcInsnNode

class MatchStringConstants : MergeOperation {
    override fun operate(set: MergeEngine) {
        var walker = Walker()
        for(cls in set.oldPool.classes) {
            walker.cur = cls
            cls.memberMethods.forEach { walker.process(it.instructions) }
            cls.staticMethods.forEach { walker.process(it.instructions) }
        }
        val oldUnique = walker.unique

        walker = Walker()
        for(cls in set.newPool.classes) {
            walker.cur = cls
            cls.memberMethods.forEach { walker.process(it.instructions) }
            cls.staticMethods.forEach { walker.process(it.instructions) }
        }
        val newUnique = walker.unique

        for(entry in oldUnique.entries) {
            val old = entry.value
            val new = newUnique[entry.key]
            if(new != null) {
                set.vote(old, new)
            }
        }
    }

    private class Walker {
        val unique = hashMapOf<String, ClassNode>()
        val nonUnique = hashSetOf<String>()
        lateinit var cur: ClassNode

        fun process(insns: InsnList) {
            for(insn in insns) {
                if(insn !is LdcInsnNode) continue
                if(insn.cst !is String) continue

                val str = insn.cst as String
                if(nonUnique.contains(str)) continue
                val c = unique[str]
                if(c == null) {
                    unique[str] = cur
                } else if(c != cur) {
                    nonUnique.add(str)
                    unique.remove(str)
                }
            }
        }
    }
}