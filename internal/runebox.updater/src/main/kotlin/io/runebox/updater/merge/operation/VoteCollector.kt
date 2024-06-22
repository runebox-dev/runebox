@file:Suppress("UNCHECKED_CAST")

package io.runebox.updater.merge.operation

import io.runebox.updater.asm.tree.*
import io.runebox.updater.merge.MergeEngine
import io.runebox.updater.merge.MergeOperation
import io.runebox.updater.merge.match.ClassMatch
import io.runebox.updater.merge.match.FieldMatch
import io.runebox.updater.merge.match.MethodMatch
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode
import kotlin.math.max
import kotlin.math.min

class VoteCollector : MergeOperation {
    override fun operate(set: MergeEngine) {
        /*
         * Classes
         */
        val classMatches = ArrayList<ClassMatch>().also { it.addAll(set.Class.pendingMatches) }
        val classTargetCount = min(classMatches.size, max(20, set.Class.pendingMatches.size / 10))
        classMatches.sortWith { a, b -> b.voteDiff - a.voteDiff }
        for(i in 0 until classTargetCount) {
            val m = classMatches[i]
            if(m.best == null) continue
            m.new = m.best
            set.Class.markAsMatched(m)
            set.incChanges()
            cleanup(set, m.old, m.new!!)
        }
        
        /*
         * Methods
         */
        val methodMatches = ArrayList<MethodMatch>().also { it.addAll(set.Method.pendingMatches) }
        val methodTargetCount = min(methodMatches.size, max(50, set.Method.pendingMatches.size / 10))
        methodMatches.sortWith { a, b -> b.voteDiff - a.voteDiff }
        for(i in 0 until methodTargetCount) {
            val m = methodMatches[i]
            if(m.best == null) continue
            val oldOwner = set.oldGroup.findClass(m.old.cls.name)!!
            val newOwner = set.newGroup.findClass(m.best!!.cls.name)!!
            val ownerMatch = set.Class.pendingMatch(oldOwner)
            if(ownerMatch.new == null) {
                if(set.Class.isMatched(newOwner)) continue
                ownerMatch.new = newOwner
                set.Class.markAsMatched(ownerMatch)
                set.incChanges()
                cleanup(set, oldOwner, newOwner)
            }
            m.new = m.best
            set.Method.markAsMatched(m)
            set.incChanges()
        }

        /*
         * Fields
         */
        val fieldMatches = ArrayList<FieldMatch>().also { it.addAll(set.Field.pendingMatches) }
        val fieldTargetCount = min(fieldMatches.size, max(20, set.Field.pendingMatches.size / 10))
        fieldMatches.sortWith { a, b -> b.voteDiff - a.voteDiff }
        for(i in 0 until fieldTargetCount) {
            val m = fieldMatches[i]
            if(m.best == null) continue
            val oldOwner = set.oldGroup.findClass(m.old.cls.name)!!
            val newOwner = set.newGroup.findClass(m.best!!.cls.name)!!
            val ownerMatch = set.Class.pendingMatch(oldOwner)
            if(ownerMatch.new == null) {
                if(set.Class.isMatched(newOwner)) continue
                ownerMatch.new = newOwner
                set.Class.markAsMatched(ownerMatch)
                set.incChanges()
                cleanup(set, oldOwner, newOwner)
            }
            m.new = m.best
            set.Field.markAsMatched(m)
            set.incChanges()
        }
    }

    private fun cleanup(set: MergeEngine, cls: ClassNode, newCls: ClassNode) {
        for(method in cls.memberMethods) {
            val methodMatch = set.Method.pendingMatch(method)
            if(methodMatch.new == null) {
                val toRemove = mutableListOf<MethodNode>()
                for(vote in methodMatch.votes) {
                    if(vote.key.cls.name != newCls.name) {
                        toRemove.add(vote.key)
                    }
                }
                for(m in toRemove) {
                    methodMatch.removeVote(m)
                }
            }
            methodMatch.ownerMatch = newCls
        }
        for(method in cls.staticMethods) {
            val methodMatch = set.Method.pendingMatch(method)
            if(methodMatch.new == null) {
                val toRemove = mutableListOf<MethodNode>()
                for(vote in methodMatch.votes) {
                    if(vote.key.cls.name != newCls.name) {
                        toRemove.add(vote.key)
                    }
                }
                for(m in toRemove) {
                    methodMatch.removeVote(m)
                }
            }
            methodMatch.ownerMatch = newCls
        }
        for(field in cls.memberFields) {
            val fieldMatch = set.Field.pendingMatch(field)
            if(fieldMatch.new == null) {
                val toRemove = mutableListOf<FieldNode>()
                for(vote in fieldMatch.votes) {
                    if(vote.key.cls.name != newCls.name) {
                        toRemove.add(vote.key)
                    }
                }
                for(m in toRemove) {
                    fieldMatch.removeVote(m)
                }
            }
            fieldMatch.ownerMatch = newCls
        }
        for(field in cls.staticFields) {
            val fieldMatch = set.Field.pendingMatch(field)
            if(fieldMatch.new == null) {
                val toRemove = mutableListOf<FieldNode>()
                for(vote in fieldMatch.votes) {
                    if(vote.key.cls.name != newCls.name) {
                        toRemove.add(vote.key)
                    }
                }
                for(m in toRemove) {
                    fieldMatch.removeVote(m)
                }
            }
            fieldMatch.ownerMatch = newCls
        }
    }
}