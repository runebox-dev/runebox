package io.runebox.updater.merge.operation

import io.runebox.asm.core.cls
import io.runebox.updater.merge.*
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode
import kotlin.math.max
import kotlin.math.min

class VoteCollector : MergeOperation {
    override fun operate(set: MergeEngine) {
        val classMatches = mutableListOf<ClassMatch>().also { it.addAll(set.getPendingClassMatches()) }
        val targetClassCount = min(classMatches.size, max(20, set.getPendingClassMatches().size / 10))
        classMatches.sortWith { a, b -> b.voteDiff - a.voteDiff }
        for(i in 0 until targetClassCount) {
            val match = classMatches[i]
            if(match.highestType == null) continue
            match.new = match.highestType
            set.markMatched(match)
            set.changes++
            cleanup(set, match.old, match.new!!)
        }
        
        val methodMatches = mutableListOf<MethodMatch>().also { it.addAll(set.getPendingMethodMatches()) }
        val targetMethodCount = min(methodMatches.size, max(50, set.getPendingMethodMatches().size / 10))
        methodMatches.sortWith { a, b -> b.voteDiff - a.voteDiff }
        for(i in 0 until targetMethodCount) {
            val methodMatch = methodMatches[i]
            if(methodMatch.highestType == null) continue
            val oldOwner = set.oldPool.findClass(methodMatch.old.cls.name)
            val newOwner = set.newPool.findClass(methodMatch.highestType!!.cls.name)
            val ownerMatch = set.getPendingMatch(oldOwner)
            if(ownerMatch.new == null) {
                if(set.isClassMatched(newOwner)) continue
                ownerMatch.new = newOwner
                set.markMatched(ownerMatch)
                set.changes++
                cleanup(set, oldOwner, newOwner)
            }
            methodMatch.new = methodMatch.highestType
            set.markMatched(methodMatch)
            set.changes++
        }

        val fieldMatches = mutableListOf<FieldMatch>().also { it.addAll(set.getPendingFieldMatches()) }
        val targetFieldCount = min(fieldMatches.size, max(20, set.getPendingFieldMatches().size / 10))
        fieldMatches.sortWith { a, b -> b.voteDiff - a.voteDiff }
        for(i in 0 until targetFieldCount) {
            val fieldMatch = fieldMatches[i]
            if(fieldMatch.highestType == null) continue
            val oldOwner = set.oldPool.findClass(fieldMatch.old.cls.name)
            val newOwner = set.newPool.findClass(fieldMatch.highestType!!.cls.name)
            val ownerMatch = set.getPendingMatch(oldOwner)
            if(ownerMatch.new == null) {
                if(set.isClassMatched(newOwner)) continue
                ownerMatch.new = newOwner
                set.markMatched(ownerMatch)
                set.changes++
                cleanup(set, oldOwner, newOwner)
            }
            fieldMatch.new = fieldMatch.highestType
            set.markMatched(fieldMatch)
            set.changes++
        }
    }

    private fun cleanup(set: MergeEngine, cls: ClassNode, newCls: ClassNode) {
        for(method in cls.methods) {
            val methodMatch = set.getPendingMatch(method)
            if(methodMatch.new == null) {
                val toRemove = mutableListOf<MethodNode>()
                for(vote in methodMatch.votes.entries) {
                    if(vote.key.cls.name != newCls.name) toRemove.add(vote.key)
                }
                for(m in toRemove) {
                    methodMatch.removeVote(m)
                }
            }
            methodMatch.ownerMatch = newCls
        }
        for(field in cls.fields) {
            val fieldMatch = set.getPendingMatch(field)
            if(fieldMatch.new == null) {
                val toRemove = mutableListOf<FieldNode>()
                for(vote in fieldMatch.votes.entries) {
                    if(vote.key.cls.name != newCls.name) toRemove.add(vote.key)
                }
                for(m in toRemove) {
                    fieldMatch.removeVote(m)
                }
            }
            fieldMatch.ownerMatch = newCls
        }
    }
}