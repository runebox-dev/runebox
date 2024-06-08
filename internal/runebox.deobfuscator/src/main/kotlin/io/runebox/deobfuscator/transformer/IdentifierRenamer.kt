package io.runebox.deobfuscator.transformer

import io.runebox.asm.isAbstract
import io.runebox.asm.isInterface
import io.runebox.asm.isStatic
import io.runebox.asm.remap.NameMappings
import io.runebox.asm.tree.ClassPool
import io.runebox.asm.tree.findField
import io.runebox.asm.tree.findMethod
import io.runebox.asm.tree.toRef
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
        
        // Generate Class Names
        for(cls in pool.classes) {
            if(!cls.name.isObfuscatedName()) continue
            mappings.renameClass(cls, "class${++classCount}")
        }

        // Generate Method Names
        for(cls in pool.classes) {
            val parents = mappings.hierarchy.allParents(cls).map { it.cls }
            for(method in cls.methods) {
                if(parents.none { it.findMethod(method.name, method.desc) != null }) {
                    if(!method.name.isObfuscatedName() || mappings.methods.containsKey(method.toRef())) continue
                    val newName = if(method.access.isStatic) "smethod${++methodCount}"
                    else if(method.access.isAbstract || method.access.isInterface) "vmethod${++methodCount}"
                    else "method${++methodCount}"
                    mappings.renameMethod(method, newName)
                }
            }
        }
        for(method in pool.classes.flatMap { it.methods }) {
            if(!method.name.isObfuscatedName() || mappings.methods.containsKey(method.toRef())) continue
            val newName = if(method.access.isStatic) "smethod${++methodCount}"
            else if(method.access.isAbstract || method.access.isInterface) "vmethod${++methodCount}"
            else "method${++methodCount}"
            mappings.renameMethod(method, newName)
        }

        // Generate Field Names
        for(cls in pool.classes) {
            val parents = mappings.hierarchy.allParents(cls).map { it.cls }
            for(field in cls.fields) {
                if(parents.none { it.findField(field.name, field.desc) != null }) {
                    if(!field.name.isObfuscatedName() || mappings.fields.containsKey(field.toRef())) continue
                    val newName = if(field.access.isStatic) "sfield${++fieldCount}" else "field${++fieldCount}"
                    mappings.renameField(field, newName)
                }
            }
        }
        for(field in pool.classes.flatMap { it.fields }) {
            if(!field.name.isObfuscatedName() || mappings.fields.containsKey(field.toRef())) continue
            val newName = if(field.access.isStatic) "sfield${++fieldCount}" else "field${++fieldCount}"
            mappings.renameField(field, newName)
        }

        // Apply mappings to the ClassPool.
        pool.remap(mappings)

        // Completed
        Logger.info("Renamed $classCount Classes.")
        Logger.info("Renamed $methodCount Methods.")
        Logger.info("Renamed $fieldCount Fields.")
    }
}