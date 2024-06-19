package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.ACONST_NULL
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.InsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.VarInsnNode

// Class 435.method7982
// Class45.method850

class GetWindowErrorFixer : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            for(method in cls.methods) {
                val insns = method.instructions.iterator()
                while(insns.hasNext()) {
                    val insn = insns.next()
                    if(insn.isPattern()) {
                        insns.remove()
                        repeat(4) {
                            insns.next()
                            insns.remove()
                        }
                        insns.add(InsnNode(ACONST_NULL))
                        count++
                    }
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Fixed $count 'getWindow' JSObject calls.")
    }

    private fun AbstractInsnNode.isPattern(): Boolean {
        val i0 = this
        if(i0 !is VarInsnNode) return false
        val i1 = i0.next
        if(i1 !is MethodInsnNode) return false
        if(i1.owner != "netscape/javascript/JSObject" || i1.name != "getWindow" || i1.desc != "(Ljava/applet/Applet;)Lnetscape/javascript/JSObject;") return false
        val i4 = i1.next.next.next
        if(i4 !is MethodInsnNode) return false
        if(i4.owner != "netscape/javascript/JSObject" || i4.name != "call") return false
        return true
    }
}