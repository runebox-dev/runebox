package io.runebox.deobfuscator.transformer

import io.runebox.asm.isAbstract
import io.runebox.asm.isInterface
import io.runebox.asm.isStatic
import io.runebox.asm.remap.NameMappings
import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.toRef
import io.runebox.deobfuscator.Logger
import io.runebox.deobfuscator.Transformer
import io.runebox.deobfuscator.isObfuscatedName

class IdentifierRenamer : Transformer {

    private var classCount = 0
    private var methodCount = 0
    private var fieldCount = 0

    private lateinit var mappings: NameMappings

    override fun transform(pool: ClassPool) {
        mappings = NameMappings(pool)

        Logger.info("Generating unique names...")

        // Generate Class Names
        for(cls in pool.classes) {
            if(!cls.name.isObfuscatedName()) continue
            mappings.renameClass(cls, "class${++classCount}")
        }

        // Generate Method Names
        for(method in pool.classes.flatMap { it.methods }) {
            if(!method.name.isObfuscatedName() || mappings.methods.containsKey(method.toRef())) continue
            val newName = when {
                method.access.isStatic -> "staticMethod${++methodCount}"
                method.access.isAbstract || method.access.isInterface -> "vmethod${++methodCount}"
                else -> "method${++methodCount}"
            }
            mappings.renameMethod(mappings.hierarchy.findRootMethod(method), newName)
        }

        // Generate Field Names
        for(field in pool.classes.flatMap { it.fields }) {
            if(!field.name.isObfuscatedName() || mappings.fields.containsKey(field.toRef())) continue
            val newName = when {
                field.access.isStatic -> "staticField${++fieldCount}"
                field.access.isAbstract || field.access.isInterface -> "vfield${++fieldCount}"
                else -> "field${++fieldCount}"
            }
            mappings.renameField(mappings.hierarchy.findRootField(field), newName)
        }

        Logger.info("Applying generated names...")

        // Apply mappings to the ClassPool.
        pool.remap(mappings)

        // Completed
        Logger.info("Renamed $classCount Classes.")
        Logger.info("Renamed $methodCount Methods.")
        Logger.info("Renamed $fieldCount Fields.")
    }
}