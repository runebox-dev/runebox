package io.runebox.updater.merge

import io.runebox.asm.core.ClassPool
import io.runebox.updater.Logger
import io.runebox.updater.merge.operation.JumpOperation
import io.runebox.updater.merge.operation.MatchStringConstants
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

class MergeEngine(
    val oldPool: ClassPool,
    val newPool: ClassPool
) {
    val classMatches = hashMapOf<ClassNode, ClassMatch>()
    val classMatchesInv = hashMapOf<ClassNode, ClassMatch>()
    
    val methodMatches = hashMapOf<MethodNode, MethodMatch>()
    val methodMatchesInv = hashMapOf<MethodNode, MethodMatch>()
    
    val fieldMatches = hashMapOf<FieldNode, FieldMatch>()
    val fieldMatchesInv = hashMapOf<FieldNode, FieldMatch>()

    private val pendingClassMatches = hashMapOf<ClassNode, ClassMatch>()
    private val pendingMethodMatches = hashMapOf<MethodNode, MethodMatch>()
    private val pendingFieldMatches = hashMapOf<FieldNode, FieldMatch>()

    private var changesLastCycle = 0

    private val operations = mutableListOf<MergeOperation>()
    private fun jumpTo(index: Int, predicate: (MergeEngine) -> Boolean) = JumpOperation(index, predicate)

    init {
        operations.add(MatchStringConstants())
        operations.add(jumpTo(1) {
            val c = it.changesLastCycle
            it.changesLastCycle = 0
            c > 0
        })
    }

    fun merge() {
        Logger.info("Merging...")

        var i = 0
        while(i < operations.size) {
            val op = operations[i]
            if(op is JumpOperation) {
                if(op.predicate(this)) {
                    i = op.target - 1
                    continue
                }
            }
            op.operate(this)
            i++
        }
    }
    
    fun getPendingMatch(cls: ClassNode): ClassMatch {
        var match = classMatches[cls]
        if(match != null) return match
        match = pendingClassMatches[cls]
        if(match == null) {
            match = ClassMatch(cls)
            pendingClassMatches[cls] = match
        }
        return match
    }
    
    fun vote(old: ClassNode, n: ClassNode): Boolean {
        val match = getPendingMatch(old)
        if(classMatchesInv.containsKey(n)) return match.new == n
        return match.vote(n)
    }
    
    fun isClassMatched(cls: ClassNode) = classMatchesInv.containsKey(cls) || classMatches.containsKey(cls)
    
    fun markMatched(entry: ClassMatch) {
        if(entry.new == null) throw IllegalStateException()
        pendingClassMatches.remove(entry.old)
        classMatches[entry.old] = entry
        classMatchesInv[entry.new!!] = entry
        for(match in pendingClassMatches.values) {
            match.removeVote(entry.new!!)
        }
    }
    
    fun allClassMatches() = classMatches.values
    fun getPendingClassMatches() = pendingClassMatches.values

    fun getPendingMatch(method: MethodNode): MethodMatch {
        var match = methodMatches[method]
        if(match != null) return match
        match = pendingMethodMatches[method]
        if(match == null) {
            match = MethodMatch(method)
            pendingMethodMatches[method] = match
        }
        return match
    }

    fun vote(old: MethodNode, n: MethodNode): Boolean {
        val match = getPendingMatch(old)
        if(methodMatchesInv.containsKey(n)) return match.new == n
        return match.vote(n)
    }

    fun isMethodMatched(method: MethodNode) = methodMatchesInv.containsKey(method) || methodMatches.containsKey(method)

    fun markMatched(entry: MethodMatch) {
        if(entry.new == null) throw IllegalStateException()
        pendingMethodMatches.remove(entry.old)
        methodMatches[entry.old] = entry
        methodMatchesInv[entry.new!!] = entry
        for(match in pendingMethodMatches.values) {
            match.removeVote(entry.new!!)
        }
    }

    fun allMethodMatches() = methodMatches.values
    fun getPendingMethodMatches() = pendingMethodMatches.values

    fun getPendingMatch(field: FieldNode): FieldMatch {
        var match = fieldMatches[field]
        if(match != null) return match
        match = pendingFieldMatches[field]
        if(match == null) {
            match = FieldMatch(field)
            pendingFieldMatches[field] = match
        }
        return match
    }

    fun vote(old: FieldNode, n: FieldNode): Boolean {
        val match = getPendingMatch(old)
        if(fieldMatchesInv.containsKey(n)) return match.new == n
        return match.vote(n)
    }

    fun isFieldMatched(field: FieldNode) = fieldMatchesInv.containsKey(field) || fieldMatches.containsKey(field)

    fun markMatched(entry: FieldMatch) {
        if(entry.new == null) throw IllegalStateException()
        pendingFieldMatches.remove(entry.old)
        fieldMatches[entry.old] = entry
        fieldMatchesInv[entry.new!!] = entry
        for(match in pendingFieldMatches.values) {
            match.removeVote(entry.new!!)
        }
    }

    fun allFieldMatches() = fieldMatches.values
    fun getPendingFieldMatches() = pendingFieldMatches.values


}