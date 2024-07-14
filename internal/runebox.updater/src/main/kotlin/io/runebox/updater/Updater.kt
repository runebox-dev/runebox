@file:Suppress("UNCHECKED_CAST")

package io.runebox.updater

import io.runebox.asm.core.ClassPool
import io.runebox.asm.core.findField
import io.runebox.asm.core.findMethod
import io.runebox.asm.core.isIgnored
import io.runebox.asm.remap.AsmRemapper
import io.runebox.asm.remap.NameMap
import io.runebox.asm.remap.remap
import net.runelite.asm.ClassFile
import net.runelite.asm.ClassGroup
import net.runelite.asm.Field
import net.runelite.asm.Method
import net.runelite.deob.deobfuscators.mapping.Mapper
import net.runelite.deob.util.JarUtil
import java.io.File

class Updater(
    private val oldJar: File, // The old named deob jar (last version's updater output)
    private val newJar: File, // The new fresh deob jar (Has placeholder unique generated names)
    private val outJar: File,
) {

    val oldPool = ClassPool()
    val newPool = ClassPool()

    fun update() {
        Logger.info("Preparing to update old-jar's name mappings. [${oldJar.name} -> ${newJar.name}].")

        /*
         * Load classes from both old+new input jar files.
         */
        Logger.info("Loading jar files...")
        
        val oldGroup = JarUtil.load(oldJar, true).init()
        val newGroup = JarUtil.load(newJar).init()

        Logger.info("Mapping entries from old -> new... This may take a while.")
        
        val mapper = Mapper(oldGroup, newGroup)
        mapper.run()

        val mapping = mapper.mapping.map
        val classMapping = mapping.filter { it.key is ClassFile } as Map<ClassFile, ClassFile>
        val methodMapping = mapping.filter { it.key is Method } as Map<Method, Method>
        val fieldMapping = mapping.filter { it.key is Field } as Map<Field, Field>
        
        Logger.info("Renaming new node entries from mapped names.")
        
        oldPool.init(oldJar)
        newPool.init(newJar)
        
        val nameMap = NameMap(newPool)
        for(oldCls in oldGroup.classes) {
            if(!oldCls.name.isObfuscatedName() && classMapping.containsKey(oldCls)) {
                val newCls = classMapping[oldCls]!!
                val newNode = newPool.findClass(newCls.name)
                nameMap.mapClass(newNode, oldCls.name)
            }
        }
        for(oldCls in oldGroup.classes) {
            for(oldMethod in oldCls.methods) {
                if(!oldMethod.name.isObfuscatedName() && methodMapping.containsKey(oldMethod)) {
                    val newMethod = methodMapping[oldMethod]!!
                    val newNode = newPool.findClass(newMethod.classFile.name).findMethod(newMethod.name, newMethod.descriptor.toString()) ?: continue
                    nameMap.mapMethod(newNode, oldMethod.name)
                }
            }
        }
        for(oldCls in oldGroup.classes) {
            for(oldField in oldCls.fields) {
                if(!oldField.name.isObfuscatedName() && fieldMapping.containsKey(oldField)) {
                    val newField = fieldMapping[oldField]!!
                    val newNode = newPool.findClass(newField.classFile.name).findField(newField.name, newField.type.toAsmString()) ?: continue
                    nameMap.mapField(newNode, oldField.name)
                }
            }
        }

        val remapper = AsmRemapper(nameMap)
        for(cls in newPool.classes) {
            cls.remap(remapper)
        }

        Logger.info("Mapping Stats: [Classes: ${nameMap.classes.size}, Methods: ${nameMap.methods.size}, Fields: ${nameMap.fields.size}]")

        Logger.info("Saving remapped/updated new-jar to file: ${outJar.name}.")
        newPool.saveJar(outJar)

        Logger.info("Updater complete. Exiting.")
    }

    private fun ClassPool.init(file: File) {
        clear()
        loadJar(file)
        classes.filter { it.name.startsWith("org/") || it.name.startsWith("module") }.forEach { it.isIgnored = true }
        loadHierarchy()
        Logger.info("Finished loading ${classes.size} classes into pool. [Ignored ${ignoredClasses.size}]")
    }

    private fun ClassGroup.init(): ClassGroup {
        val toRemove = mutableListOf<ClassFile>()
        for(cls in classes) {
            if(cls.name.startsWith("org/")) toRemove.add(cls)
        }
        toRemove.forEach { removeClass(it) }
        buildClassGraph()
        lookup()
        return this
    }

    fun String.isObfuscatedName(): Boolean {
        return (this.length <= 2 || (this.length == 3 && this !in listOf("add", "get", "set", "put", "run", "abs", "err", "out"))) || (listOf("Class", "method", "field").any { this.startsWith(it) })
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            if(args.size != 3) error("Usage: java -jar Updater.jar <old-named jar> <new-deob jar> <new-named(output) jar>")

            val oldJar = File(args[0])
            val newJar = File(args[1])
            val outJar = File(args[2])

            val updater = Updater(oldJar, newJar, outJar)
            updater.update()
        }
    }
}