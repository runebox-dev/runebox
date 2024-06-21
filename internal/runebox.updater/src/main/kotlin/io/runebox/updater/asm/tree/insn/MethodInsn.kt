package io.runebox.updater.asm.tree.insn

import io.runebox.updater.asm.tree.ClassGroup
import io.runebox.updater.asm.tree.findMethod
import io.runebox.updater.asm.tree.resolveMethod
import io.runebox.updater.asm.tree.virtualMethods
import io.runebox.updater.util.nullField
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode

var MethodInsnNode.targetMethod: MethodNode? by nullField()
var MethodInsnNode.targetMethods: List<MethodNode>? by nullField()

fun MethodInsnNode.resolve(group: ClassGroup) {
    when(opcode) {
        INVOKESPECIAL -> {
            targetMethod = null
            val tc = group.getClass(owner) ?: return
            val tm = tc.findMethod(name, desc) ?: return
            targetMethod = tm
        }

        INVOKEINTERFACE -> {
            fun lookupMethods(): List<MethodNode>? {
                val tc = group.getClass(owner) ?: return null
                val tm = tc.findMethod(name, desc) ?: return null
                return tm.virtualMethods
            }
            targetMethods = lookupMethods()
            targetMethod = targetMethods?.firstOrNull()
        }

        INVOKEVIRTUAL -> {
            fun lookupMethod(): MethodNode? {
                val tc = group.getClass(owner) ?: return null
                return tc.resolveMethod(name, desc)
            }
            fun lookupMethods(): List<MethodNode>? {
                val m = lookupMethod() ?: return null
                return m.virtualMethods
            }
            targetMethods = lookupMethods()
            targetMethod = lookupMethod()
        }

        INVOKESTATIC -> {
            fun lookupMethod(): MethodNode? {
                val tc = group.getClass(owner) ?: return null
                val tm = tc.resolveMethod(name, desc) ?: return null
                return tm
            }
            targetMethod = lookupMethod()
        }
    }
}