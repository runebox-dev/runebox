package io.runebox.deobfuscator.transformer

import io.runebox.asm.MemberRef
import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.toRef
import io.runebox.asm.isFinal
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.tree.FieldInsnNode

class UnusedFieldRemover : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        val usedFields = pool.allClasses.flatMap { it.methods }
            .flatMap { it.instructions.toArray().asIterable() }
            .mapNotNull { it as? FieldInsnNode }
            .map { MemberRef(it) }
            .toSet()

        for(cls in pool.classes) {
            val fields = cls.fields.iterator()
            while(fields.hasNext()) {
                val field = fields.next()
                if(!usedFields.contains(field.toRef()) && field.access.isFinal) {
                    fields.remove()
                    count++
                }
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count unused fields.")
    }
}