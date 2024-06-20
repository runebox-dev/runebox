package io.runebox.updater.merge

import io.runebox.asm.core.cls
import io.runebox.asm.core.toRef
import io.runebox.asm.isStatic
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

abstract class Match<T : Any>(val old: T) {
    var isMerged = false
    var highest = 0
    var second = 0
    var highestType: T? = null
    val votes = hashMapOf<T, Int>()
    var new: T? = null
        set(v) {
            field = v
            votes.clear()
        }

    var ownerMatch: ClassNode? = null

    val voteDiff get() = highest - second
    fun best() = highestType!!

    open fun vote(n: T): Boolean {
        if(new != null) return new == n
        if(old::class != n::class) return false
        val v = votes[n]
        if(v != null) {
            val vote = v + 1
            votes[n] = vote
            if(vote > highest) {
                if(n == highestType) {
                    highest = vote
                } else {
                    second = highest
                    highest = vote
                    highestType = n
                }
            } else if(vote > second) {
                second = vote
            }
        } else {
            votes[n] = 1
            if(highest == 0) {
                highest = 1
                highestType = n
            }
        }
        return true
    }

    fun removeVote(n: T) {
        votes.remove(n)
        second = 0
        highest = 0
        highestType = null
        for((type, vote) in votes) {
            if(vote > highest) {
                second = highest
                highest = vote
                highestType = type
            } else if(vote > second) {
                second = vote
            }
        }
    }
}

class ClassMatch(old: ClassNode) : Match<ClassNode>(old) {
    override fun toString(): String {
        return "CLASS[${old.name} -> ${new?.name}]"
    }
}

class MethodMatch(old: MethodNode) : Match<MethodNode>(old) {
    override fun vote(n: MethodNode): Boolean {
        if(new != null) return false
        if(old.access.isStatic xor n.access.isStatic) return false
        if(ownerMatch != null && n.cls.name != ownerMatch!!.name) return false
        if(old.name.startsWith("<") xor n.name.startsWith("<")) return false
        val v = votes[n]
        if(v != null) {
            val vote = v + 1
            votes[n] = vote
            if(vote > highest) {
                if(n == highestType) {
                    highest = vote
                } else {
                    second = highest
                    highest = vote
                    highestType = n
                }
            } else if(vote > second) {
                second = vote
            }
        } else {
            votes[n] = 1
            if(highest == 0) {
                highest = 1
                highestType = n
            }
        }
        return true
    }

    override fun toString(): String {
        return "METHOD[${old.toRef()} -> ${new?.toRef()}]"
    }
}


class FieldMatch(old: FieldNode) : Match<FieldNode>(old) {
    override fun vote(n: FieldNode): Boolean {
        if(new != null) return false
        if(old.access.isStatic xor n.access.isStatic) return false
        if(ownerMatch != null && n.cls.name != ownerMatch!!.name) return false
        val v = votes[n]
        if(v != null) {
            val vote = v + 1
            votes[n] = vote
            if(vote > highest) {
                if(n == highestType) {
                    highest = vote
                } else {
                    second = highest
                    highest = vote
                    highestType = n
                }
            } else if(vote > second) {
                second = vote
            }
        } else {
            votes[n] = 1
            if(highest == 0) {
                highest = 1
                highestType = n
            }
        }
        return true
    }

    override fun toString(): String {
        return "FIELD[${old.toRef()} -> ${new?.toRef()}]"
    }
}