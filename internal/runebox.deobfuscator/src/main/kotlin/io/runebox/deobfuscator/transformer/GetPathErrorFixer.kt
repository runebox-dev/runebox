package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.POP
import org.objectweb.asm.tree.InsnNode
import org.objectweb.asm.tree.LdcInsnNode
import org.objectweb.asm.tree.MethodInsnNode

class GetPathErrorFixer : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        var seen = 0
        for(cls in pool.classes) {
            for(method in cls.methods) {
                val insns = method.instructions.toArray()
                for(insn in insns) {
                    if(insn !is MethodInsnNode) continue
                    if(insn.name != "getPath") continue
                    if(++seen == 2) {
                        val pop = InsnNode(POP)
                        val ldc = LdcInsnNode("")
                        method.instructions.insert(insn, pop)
                        method.instructions.insert(pop, ldc)
                        method.instructions.remove(insn)
                        count++
                        break
                    }
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Fixed $count malformed 'getPath()' method calls.")
    }
}