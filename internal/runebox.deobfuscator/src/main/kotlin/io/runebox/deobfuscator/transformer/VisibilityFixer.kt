package io.runebox.deobfuscator.transformer

import io.runebox.asm.core.ClassPool
import io.runebox.asm.ir.ExprTree
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes.*
import java.lang.reflect.Modifier

class VisibilityFixer : Transformer {

    private var count = 0

    override fun transform(pool: ClassPool) {
        for(cls in pool.classes) {
            for(method in cls.methods) {
                val t = ExprTree(method)
                t.build()
                t.print()
                method.access = method.access.transformAccess(true)
            }
            for(field in cls.fields) {
                field.access = field.access.transformAccess(false)
            }
        }
    }

    override fun postTransform(pool: ClassPool) {
        Logger.info("Modified $count method/field visibility access flags.")
    }

    private fun Int.transformAccess(removeFinalAccess: Boolean): Int {
        var access = this
        if((access and ACC_PUBLIC) == 0) {
            if((access and ACC_PROTECTED) > 0) {
                access = access and ACC_PROTECTED.inv()
            }
            if((access and ACC_PRIVATE) > 0) {
                access = access and ACC_PRIVATE.inv()
            }
            access = access or Modifier.PUBLIC
            count++
        }
        if(removeFinalAccess && (access and ACC_FINAL) > 0 && (access and ACC_STATIC) > 0) {
            access = access and ACC_FINAL.inv()
            count++
        }
        return access
    }
}