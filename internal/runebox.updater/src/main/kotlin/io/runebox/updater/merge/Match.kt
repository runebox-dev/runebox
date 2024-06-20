package io.runebox.updater.merge

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

    fun vote(n: T): Boolean {
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

class ClassMatch(old: ClassNode) : Match<ClassNode>(old)
class MethodMatch(old: MethodNode) : Match<MethodNode>(old)
class FieldMatch(old: FieldNode) : Match<FieldNode>(old)