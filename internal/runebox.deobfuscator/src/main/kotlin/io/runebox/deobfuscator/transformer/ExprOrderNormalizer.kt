package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.exprTree
import io.runebox.asm.expr.*
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.isObfuscatedName
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.AbstractInsnNode

class ExprOrderNormalizer : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            for(method in cls.methods) {
                val exprTree = method.exprTree
                exprTree.accept(object : ExprVisitor() {
                    override fun visitBinary(expr: BinaryExpr) {
                        if(expr.insn.canReorder) {
                            if((expr.right is ConstExpr) && (expr.left is VarLoadExpr || expr.left is FieldExpr || expr.left is MethodExpr)) {
                                expr.swap()
                                count++
                            } else if((expr.right is VarLoadExpr) && (expr.left is FieldExpr || expr.left is MethodExpr)) {
                                expr.swap()
                                count++
                            } else if(expr.right is VarLoadExpr && expr.left is VarLoadExpr) {
                                if((expr.right as VarLoadExpr).idx < (expr.left as VarLoadExpr).idx) {
                                    expr.swap()
                                    count++
                                }
                            } else if(expr.right is FieldExpr && expr.left is FieldExpr) {
                                if(!(expr.right as FieldExpr).name.isObfuscatedName() && (expr.left as FieldExpr).name.isObfuscatedName()) {
                                    expr.swap()
                                    count++
                                }
                                if(!(expr.right as FieldExpr).isStatic && (expr.left as FieldExpr).isStatic) {
                                    expr.swap()
                                    count++
                                }
                            }
                        }
                    }
                })
                method.exprTree = exprTree
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Reordered $count binary expression operands.")
    }

    private val AbstractInsnNode.canReorder get() = opcode in listOf(IF_ICMPEQ, IF_ICMPNE, IF_ACMPEQ, IF_ACMPNE, IMUL, IADD)
}