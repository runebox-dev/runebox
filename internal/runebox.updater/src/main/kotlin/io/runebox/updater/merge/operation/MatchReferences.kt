package io.runebox.updater.merge.operation

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.exprTree
import io.runebox.asm.expr.ExprVisitor
import io.runebox.asm.expr.FieldExpr
import io.runebox.updater.merge.MergeEngine
import io.runebox.updater.merge.MergeOperation
import io.runebox.updater.merge.MergeUtil
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

class MatchReferences : MergeOperation {

    private var prepped = false
    val oldFieldGets = HashMultimap.create<FieldNode, MethodNode>()
    val newFieldGets = HashMultimap.create<FieldNode, MethodNode>()
    val oldFieldPuts = HashMultimap.create<FieldNode, MethodNode>()
    val newFieldPuts = HashMultimap.create<FieldNode, MethodNode>()

    private fun prep(set: MergeEngine) {
        prepped = true
        val oldFinder = RefFinder(set.oldPool, oldFieldGets, oldFieldPuts)
        for(m in set.oldPool.allClasses.flatMap { it.methods }) {
            oldFinder.curMethod = m
            m.exprTree.accept(oldFinder)
        }
        val newFinder = RefFinder(set.newPool, newFieldGets, newFieldPuts)
        for(m in set.newPool.allClasses.flatMap { it.methods }) {
            newFinder.curMethod = m
            m.exprTree.accept(newFinder)
        }
    }

    override fun operate(set: MergeEngine) {
        if(!prepped) prep(set)
        println()
    }

    class RefFinder(
        private val pool: ClassPool,
        private val fieldGets: Multimap<FieldNode, MethodNode>,
        private val fieldPuts: Multimap<FieldNode, MethodNode>,
    ) : ExprVisitor() {
        lateinit var curMethod: MethodNode

        override fun visitField(expr: FieldExpr) {
            val owner = pool.findClass(expr.owner)
            val field = if(expr.isStatic) MergeUtil.resolveStaticField(owner, expr.name, expr.desc) else MergeUtil.resolveField(owner, expr.name, expr.desc)
            if(field != null) {
                if(expr.isGetter) fieldGets.put(field, curMethod)
                if(expr.isSetter) fieldPuts.put(field, curMethod)
            }
        }
    }
}