package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Type
import org.objectweb.asm.tree.LdcInsnNode
import org.objectweb.asm.tree.MultiANewArrayInsnNode
import org.objectweb.asm.tree.TypeInsnNode

class UnusedClassRemover : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        val emptyClasses = mutableSetOf<String>()
        val referencedClasses = mutableSetOf<String>()

        fun Type.addReference() {
            when(sort) {
                Type.OBJECT -> referencedClasses.add(internalName)
                Type.ARRAY -> elementType.addReference()
                Type.METHOD -> {
                    argumentTypes.forEach { it.addReference() }
                    returnType.addReference()
                }
            }
        }

        for(cls in pool.allClasses) {
            if(cls.fields.isEmpty() && cls.methods.isEmpty()) emptyClasses.add(cls.name)
            if(cls.superName != null) referencedClasses.add(cls.superName)
            for(itf in cls.interfaces) referencedClasses.add(itf)
        }
        for(cls in pool.allClasses) {
            for(field in cls.fields) {
                Type.getType(field.desc).addReference()
            }
            for(method in cls.methods) {
                Type.getType(method.desc).addReference()
                for(insn in method.instructions) {
                    when(insn) {
                        is LdcInsnNode -> if(insn.cst is Type) (insn.cst as Type).addReference()
                        is TypeInsnNode -> referencedClasses.add(insn.desc)
                        is MultiANewArrayInsnNode -> referencedClasses.add(insn.desc)
                    }
                }
            }
        }

        var changed = false
        do {
            changed = false
            for(name in emptyClasses.subtract(referencedClasses)) {
                if(pool.containsClass(name)) {
                    pool.removeClass(name)
                    changed = true
                    count++
                }
            }
        } while(changed)
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Removed $count unused/empty classes.")
    }
}