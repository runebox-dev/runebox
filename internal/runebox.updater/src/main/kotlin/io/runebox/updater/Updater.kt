package io.runebox.updater

import io.runebox.updater.asm.*
import io.runebox.updater.mapper.JarMapper
import io.runebox.updater.mapper.Mapper
import io.runebox.updater.util.isPrimitive
import org.objectweb.asm.Type
import osrs.Client
import java.io.File

object Updater {

    fun run(inputJar: File, outputJar: File) {
        Logger.info("Starting Updater...")

        val ctx = Mapper.Context()
        val clientClass = Client::class.java
        JarMapper(clientClass.`package`.name, clientClass.classLoader).map(inputJar.toPath(), ctx)

        val mappedClasses = ctx.buildIdHierarchy()


        println(mappedClasses)
    }

    private fun Mapper.Context.buildIdHierarchyAll(): List<IdClass> {
        val identified = buildIdHierarchy().toMutableList()
        var i = 0
        val jar = classes.values.first().jar
        jar.classes.iterator().forEachRemaining { c ->
            if (classes.containsValue(c)) {
                c.instanceFields.filter { !fields.containsValue(it) }.forEach { f ->
                    if (!isTypeDenotable(f.type, classes.values)) return@forEach
                    val klass = identified.first { it.name == f.klass.name }
                    identified.remove(klass)
                    identified.add(klass.copy(fields = klass.fields.plus(IdField("__${f.name}", f.klass.name, f.name, f.access, f.desc))))
                }
                c.instanceMethods.filter { !methods.containsValue(it) }.iterator().forEach { m ->
                    if (!isTypeDenotable(m.returnType, classes.values)) return@forEach
                    if (m.arguments.any { !isTypeDenotable(it, classes.values) }) return@forEach
                    val klass = identified.first { it.name == m.klass.name }
                    identified.remove(klass)
                    val ps = m.arguments.mapIndexed { i, _ -> "arg$i" }
                    identified.add(klass.copy(methods = klass.methods.plus(IdMethod("__${m.name}_${i++}", m.klass.name, m.name, m.access, ps, m.desc))))
                }
            }
            c.staticFields.filter { !fields.containsValue(it) }.forEach { f ->
                if (!isTypeDenotable(f.type, classes.values)) return@forEach
                val klass = identified.first { it.name == "client" }
                identified.remove(klass)
                identified.add(klass.copy(fields = klass.fields.plus(IdField("__${f.klass.name}_${f.name}", f.klass.name, f.name, f.access, f.desc))))
            }
        }
        return identified
    }

    private fun isTypeDenotable(t: Type, classes: Collection<Class2>): Boolean {
        return when {
            t.isPrimitive -> true
            t.sort == Type.ARRAY -> isTypeDenotable(t.elementType, classes)
            else -> classes.any { it.name == t.internalName } || try { Class.forName(t.className); true } catch (e: Exception) { false }
        }
    }


    @JvmStatic
    fun main(args: Array<String>) {
        if(args.size < 2) error("Usage: java -jar Updater.jar <deob-jar> <updated-jar>")
        val inputJar = File(args[0])
        val outputJar = File(args[1])
        run(inputJar, outputJar)
    }
}