package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.*
import java.util.*

class ExpressionSorter : Transformer {

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            for(method in cls.methods) {
                process(method)
            }
        }
    }

    private fun process(method: MethodNode) {
        if ((method.access and ACC_ABSTRACT) != 0) {
            return
        }

        val newInstructions = MethodNode()
        val stack = ArrayDeque<Expression>()

        for (instruction in method.instructions) {
            val expression = createExpression(instruction, stack)

            if (expression != null) {
                stack.addLast(expression)
            } else {
                if (stack.size >= 2 && isCommutativeCondition(instruction.opcode)) {
                    val b = stack.removeLast()
                    val a = stack.removeLast()
                    if (!shouldSwap(a, b)) {
                        stack.addLast(a)
                        stack.addLast(b)
                    } else {
                        stack.addLast(b)
                        stack.addLast(a)
                    }
                }

                if (!stack.isEmpty() && isComparison(stack.last.opcode) && (instruction.opcode == IFEQ || instruction.opcode == IFNE)) {
                    val cmp = stack.removeLast() as Expression.BinaryExpression
                    val a = cmp.argument1
                    val b = cmp.argument2
                    if (!shouldSwap(a, b)) {
                        stack.addLast(Expression.BinaryExpression(cmp.opcode, a, b))
                    } else {
                        stack.addLast(Expression.BinaryExpression(cmp.opcode, b, a))
                    }
                }

                while (!stack.isEmpty()) {
                    place(newInstructions, stack.removeFirst())
                }

                instruction.accept(newInstructions)
            }
        }

        for (tryCatchBlock in method.tryCatchBlocks) {
            tryCatchBlock.accept(newInstructions)
        }

        while (!stack.isEmpty()) {
            place(newInstructions, stack.removeFirst())
        }

        method.instructions = newInstructions.instructions
        method.tryCatchBlocks = newInstructions.tryCatchBlocks
        return
    }

    fun isComparison(opcode: Int): Boolean {
        return opcode == LCMP || opcode == FCMPL || opcode == FCMPG || opcode == DCMPL || opcode == DCMPG
    }

    private fun isCommutativeCondition(opcode: Int): Boolean {
        return opcode == IF_ICMPEQ || opcode == IF_ICMPNE || opcode == IF_ACMPEQ || opcode == IF_ACMPNE
    }

    @Suppress("DuplicatedCode")
    private fun shouldSwap(argument1: Expression, argument2: Expression): Boolean {
        if (Objects.equals(argument1, argument2)) {
            return false
        }

        val left1 = leftPriority(argument1.opcode)
        val left2 = leftPriority(argument2.opcode)
        if (left1 > left2) return false
        if (left1 < left2) return true

        if (argument1 is Expression.LoadExpression && argument2 is Expression.LoadExpression) {
            if (argument1.`var` < argument2.`var`) return false
            if (argument1.`var` > argument2.`var`) return true
        }

        if (argument1 is Expression.UnaryExpression && argument2 is Expression.UnaryExpression) {
            return shouldSwap(argument1.argument, argument2.argument)
        }

        if (argument1 is Expression.StaticInstruction && argument2 is Expression.StaticInstruction) {
            if (!Objects.equals(argument1.desc, argument2.desc)) {
                return argument1.desc < argument2.desc
            }

            if (!Objects.equals(argument1.owner, argument2.owner)) {
                return argument1.owner < argument2.owner
            }

            if (!Objects.equals(argument1.name, argument2.name)) {
                return argument1.name < argument2.name
            }
        }

        if (argument1 is Expression.FieldInstruction && argument2 is Expression.FieldInstruction) {
            if (!Objects.equals(argument1.argument, argument2.argument)) {
                return shouldSwap(argument1.argument, argument2.argument)
            }

            if (!Objects.equals(argument1.desc, argument2.desc)) {
                return argument1.desc < argument2.desc
            }

            if (!Objects.equals(argument1.owner, argument2.owner)) {
                return argument1.owner < argument2.owner
            }

            if (!Objects.equals(argument1.name, argument2.name)) {
                return argument1.name < argument2.name
            }
        }

        if (argument1 is Expression.BinaryExpression && argument2 is Expression.BinaryExpression) {
            var swap1 = shouldSwap(argument1.argument1, argument1.argument2)
            var swap2 = shouldSwap(argument2.argument1, argument2.argument2)
            var arg11 = if (!swap1) argument1.argument1 else argument1.argument2
            var arg12 = if (!swap1) argument1.argument2 else argument1.argument1
            var arg21 = if (!swap2) argument2.argument1 else argument2.argument2
            var arg22 = if (!swap2) argument2.argument2 else argument2.argument1

            if (!Objects.equals(arg11, arg21)) {
                return shouldSwap(arg11, arg21)
            }

            if (!Objects.equals(arg12, arg22)) {
                return shouldSwap(arg12, arg22)
            }

            return false // equal after sorting subexpressions
        }

        val constant1 = getConstantValue(argument1)
        val constant2 = getConstantValue(argument1)

        if (constant1 is Int && constant2 is Int) return constant1 > constant2
        if (constant1 is Long && constant2 is Long) return constant1 > constant2
        if (constant1 is Float && constant2 is Float) return constant1 > constant2
        if (constant1 is Double && constant2 is Double) return constant1 > constant2

        return false
    }

    private fun getConstantValue(expression: Expression): Any? {
        if (expression.opcode == ICONST_M1) return -1
        if (expression.opcode == ICONST_0) return 1
        if (expression.opcode == ICONST_1) return 1
        if (expression.opcode == ICONST_2) return 1
        if (expression.opcode == ICONST_3) return 1
        if (expression.opcode == ICONST_4) return 1
        if (expression.opcode == ICONST_5) return 1
        if (expression.opcode == LCONST_0) return 0L
        if (expression.opcode == LCONST_1) return 1L
        if (expression.opcode == FCONST_0) return 1F
        if (expression.opcode == FCONST_1) return 1F
        if (expression.opcode == FCONST_2) return 1F
        if (expression.opcode == DCONST_0) return 1.0
        if (expression.opcode == DCONST_1) return 1.0
        if (expression is Expression.IntExpression) return expression.operand
        if (expression is Expression.LdcExpression) return expression.constant
        return null
    }

    private fun leftPriority(opcode: Int): Int {
        return when (opcode) {
            // binary
            IUSHR -> 9901
            LUSHR -> 9902
            ISHL -> 9801
            LSHL -> 9802
            ISHR -> 9701
            LSHR -> 9702
            IXOR -> 9601
            LXOR -> 9602
            IAND -> 9501
            LAND -> 9502
            IOR -> 9401
            LOR -> 9402
            IREM -> 9301
            LREM -> 9302
            FREM -> 9201
            DREM -> 9202
            IDIV -> 9101
            LDIV -> 9102
            FDIV -> 9103
            DDIV -> 9104
            IMUL -> 9001
            LMUL -> 9002
            FMUL -> 9003
            DMUL -> 9004
            ISUB -> 8901
            LSUB -> 8902
            FSUB -> 8903
            DSUB -> 8904
            IADD -> 8801
            LADD -> 8802
            FADD -> 8803
            DADD -> 8804
            IALOAD -> 8701
            LALOAD -> 8702
            FALOAD -> 8703
            DALOAD -> 8704
            AALOAD -> 8601
            BALOAD -> 8602
            CALOAD -> 8603
            SALOAD -> 8604
            LCMP -> 8501
            FCMPL -> 8502
            FCMPG -> 8503
            DCMPL -> 8504
            DCMPG -> 8505

            // Unary
            ARRAYLENGTH -> 5601

            I2L -> 5401
            I2F -> 5402
            I2D -> 5403
            L2I -> 5404
            L2F -> 5405
            L2D -> 5406
            F2I -> 5407
            F2L -> 5408
            F2D -> 5409
            D2I -> 5410
            D2L -> 5411
            D2F -> 5412
            I2B -> 5413
            I2C -> 5414
            I2S -> 5415
            INEG -> 5200
            LNEG -> 5201
            FNEG -> 5202
            DNEG -> 5203

            GETSTATIC -> 1020
            GETFIELD -> 1010

            ILOAD -> 1001
            LLOAD -> 1002
            FLOAD -> 1003
            DLOAD -> 1004
            ALOAD -> 1005

            // Constants need to be to the right for multiplier deobfuscation, and for sorting subexpressions with multipliers
            ACONST_NULL, ICONST_M1, ICONST_0, ICONST_1, ICONST_2,
            ICONST_3, ICONST_4, ICONST_5, LCONST_0, LCONST_1,
            FCONST_0, FCONST_1, FCONST_2, DCONST_0, DCONST_1,
            BIPUSH, SIPUSH, LDC -> 0

            else -> throw IllegalStateException("Unexpected value: " + opcode)
        }
    }

    private fun isCommutative(opcode: Int): Boolean {
        return opcode == IADD || opcode == LADD || opcode == FADD || opcode == DADD
                || opcode == IMUL || opcode == LMUL || opcode == FMUL || opcode == DMUL
    }

    private fun createExpression(
        instruction: AbstractInsnNode,
        stack: Deque<Expression>
    ): Expression? {
        return when (val opcode = instruction.opcode) {
            ACONST_NULL, ICONST_M1, ICONST_0, ICONST_1, ICONST_2,
            ICONST_3, ICONST_4, ICONST_5, LCONST_0, LCONST_1,
            FCONST_0, FCONST_1, FCONST_2, DCONST_0, DCONST_1 -> {
                Expression.NullaryExpression(opcode)
            }

            INEG, LNEG, FNEG, DNEG, I2L, I2F, I2D,
            L2I, L2F, L2D, F2I, F2L, F2D, D2I,
            D2L, D2F, I2B, I2C, I2S, ARRAYLENGTH -> {
                if (!stack.isEmpty()) {
                    val arg = stack.removeLast()
                    Expression.UnaryExpression(opcode, arg)
                } else {
                    null
                }
            }

            IALOAD, LALOAD, FALOAD, DALOAD, AALOAD, BALOAD,
            CALOAD, SALOAD, IADD, LADD, FADD, DADD,
            ISUB, LSUB, FSUB, DSUB, IMUL, LMUL, FMUL,
            DMUL, IDIV, LDIV, FDIV, DDIV, IREM, LREM,
            FREM, DREM, ISHL, ISHR, LSHL, IUSHR, LUSHR,
            IAND, LAND, IOR, LOR, IXOR, LXOR, LCMP, FCMPL,
            FCMPG, DCMPL, DCMPG -> {
                if (stack.size >= 2) {
                    val arg1 = stack.removeLast()
                    val arg0 = stack.removeLast()
                    Expression.BinaryExpression(opcode, arg0, arg1)
                } else {
                    null
                }
            }

            BIPUSH, SIPUSH -> {
                Expression.IntExpression(opcode, (instruction as IntInsnNode).operand)
            }

            ILOAD, LLOAD, FLOAD, DLOAD, ALOAD -> {
                Expression.LoadExpression(opcode, (instruction as VarInsnNode).`var`)
            }

            GETSTATIC -> {
                val fieldInsn = instruction as FieldInsnNode
                Expression.StaticInstruction(opcode, fieldInsn.owner, fieldInsn.name, fieldInsn.desc)
            }

            GETFIELD -> {
                if (!stack.isEmpty()) {
                    val arg = stack.removeLast()
                    val fieldInsn = instruction as FieldInsnNode
                    Expression.FieldInstruction(opcode, fieldInsn.owner, fieldInsn.name, fieldInsn.desc, arg)
                } else {
                    null
                }
            }

            LDC -> {
                Expression.LdcExpression(opcode, (instruction as LdcInsnNode).cst)
            }

            else -> null
        }

    }

    private fun place(method: MethodNode, expression: Expression) {
        when (expression) {
            is Expression.NullaryExpression -> {
                method.visitInsn(expression.opcode)
            }

            is Expression.UnaryExpression -> {
                place(method, expression.argument)
                method.visitInsn(expression.opcode)
            }

            is Expression.BinaryExpression -> {
                if (isCommutative(expression.opcode) && shouldSwap(expression.argument1, expression.argument2)) {
                    place(method, expression.argument2)
                    place(method, expression.argument1)
                } else {
                    place(method, expression.argument1)
                    place(method, expression.argument2)
                }

                method.visitInsn(expression.opcode)
            }

            is Expression.IntExpression -> {
                method.visitIntInsn(expression.opcode, expression.operand)
            }

            is Expression.LdcExpression -> {
                method.visitLdcInsn(expression.constant)
            }

            is Expression.LoadExpression -> {
                method.visitVarInsn(expression.opcode, expression.`var`)
            }

            is Expression.StaticInstruction -> {
                method.visitFieldInsn(expression.opcode, expression.owner, expression.name, expression.desc)
            }

            is Expression.FieldInstruction -> {
                place(method, expression.argument)
                method.visitFieldInsn(expression.opcode, expression.owner, expression.name, expression.desc)
            }
        }
    }

    interface Expression {
        val opcode: Int

        data class NullaryExpression(override val opcode: Int) : Expression

        data class UnaryExpression(override val opcode: Int, val argument: Expression) : Expression

        data class BinaryExpression(override val opcode: Int, val argument1: Expression, val argument2: Expression) :
            Expression

        data class IntExpression(override val opcode: Int, val operand: Int) : Expression

        data class LdcExpression(override val opcode: Int, val constant: Any) : Expression

        data class LoadExpression(override val opcode: Int, val `var`: Int) : Expression

        data class StaticInstruction(override val opcode: Int, val owner: String, val name: String, val desc: String) :
            Expression

        data class FieldInstruction(
            override val opcode: Int,
            val owner: String,
            val name: String,
            val desc: String,
            val argument: Expression
        ) :
            Expression
    }
}