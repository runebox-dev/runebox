package io.runebox.deobfuscator.transformer

import io.runebox.asm.InsnMatcher
import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.isConstructor
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.TypeInsnNode

class ErrorConstructorRemover : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            val toRemove = mutableListOf<MethodNode>()
            methodLoop@ for(method in cls.methods) {
                if(!method.isConstructor) continue
                for(matchedInsns in PATTERN.match(method)) {
                    val new = matchedInsns[0] as TypeInsnNode
                    if(new.desc != "java/lang/Error") continue@methodLoop
                    toRemove.add(method)
                    count++
                    break
                }
            }
            cls.methods = cls.methods.toTypedArray().copyOf().toMutableList().also { it.removeAll(toRemove) }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count empty 'java/lang/Error' throwing constructors.")
    }

    private val PATTERN = InsnMatcher.compile("""
        (NEW)
        (DUP)
        (INVOKESPECIAL)
        (ATHROW)
    """.trimIndent())
}