package io.runebox.updater.asm

import org.objectweb.asm.ClassReader
import org.objectweb.asm.Opcodes.ACC_SUPER
import org.objectweb.asm.Opcodes.V1_1
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import java.io.File
import java.net.URI
import java.net.URL
import java.nio.file.FileSystemNotFoundException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.jar.JarFile

class ClassGroup(val env: ClassEnv, val isShared: Boolean) {

    private val classMap = hashMapOf<String, ClassEntry>()
    private val arrayClassMap = hashMapOf<String, ClassEntry>()

    val classes: Set<ClassEntry> get() = classMap.values.filterIsInstanceTo(mutableSetOf())

    fun init(file: File) {
        JarFile(file).use { jar ->
            jar.stream().iterator().asSequence().filter { it.name.endsWith(".class") }.forEach { entry ->
                val cls = readClass(jar.getInputStream(entry).readBytes())
                classMap[cls.id] = cls
            }
        }
    }

    fun addClass(cls: ClassEntry) {
        if(classMap.containsKey(cls.id)) return
        classMap[cls.id] = cls
    }

    fun getClass(name: String): ClassEntry? {
        assert(name[0] != 'L')
        return if(name[0] == '[') arrayClassMap[name] else classMap[ClassEntry.id(name)]
    }

    fun getClassById(id: String): ClassEntry? {
        assert(id[0] == '[' || id[0] == 'L')
        return if(id[0] == '[') arrayClassMap[id] else classMap[id]
    }

    fun getCreateClass(name: String): ClassEntry {
        assert(name[0] != 'L')
        return getCreateClassById(ClassEntry.id(name))
    }

    fun getCreateClassById(id: String): ClassEntry {
        var ret: ClassEntry?

        if(id[0] == '[') {
            ret = env.getSharedClassById(id)
            if(ret != null) return ret

            ret = arrayClassMap[id]
            if(ret != null) return ret

            val elementId = id.substring(id.lastIndexOf('[') + 1)
            val elementCls = getCreateClassById(elementId)

            val node = ClassNode().also {
                it.version = V1_1
                it.access = ACC_SUPER
                it.name = getClassName(id)
                it.signature = null
                it.superName = "java/lang/Object"
                it.interfaces = mutableListOf()
            }
            val cls = ClassEntry(elementCls.group, id, node)
            cls.isReal = false
            cls.elementClass = elementCls
            elementCls.arrayClasses.add(cls)

            if(elementCls.group.isShared) {
                env.addSharedClass(cls)
                ret = cls
            } else {
                arrayClassMap[id] = cls
                ret = cls
            }
        } else {
            ret = getClassById(id)
            if(ret != null) return ret

            ret = env.getSharedClassById(id)
            if(ret != null) return ret

            ret = getMissingClass(id)
        }

        return ret
    }

    private fun getMissingClass(id: String): ClassEntry {
        var name = id
        if(name.length > 1) {
            name = if(name[0] == '[') name else name.substring(1, name.length - 1)
        }

        if(name.length == 1) {
            name = "java/lang/" + Type.getType(name).className.replaceFirstChar { it.uppercase() }
        }

        if(name.length > 1) {
            var file: Path? = null
            val url = ClassLoader.getSystemResource("$name.class")
            if(url != null) {
                file = getPath(url)
            }
            if(file != null) {
                val cls = env.sharedGroup.readClass(Files.readAllBytes(file), flags = ClassReader.SKIP_CODE)
                if(env.addSharedClass(cls)) {
                    processA(cls)
                }
                return cls
            }
        }

        val node = ClassNode().also {
            it.version = V1_1
            it.access = ACC_SUPER
            it.name = name
            it.superName = if(name == "java/lang/Object") null else "java/lang/Object"
            it.interfaces = mutableListOf()
        }
        val ret = ClassEntry(env.sharedGroup, id, node)
        ret.isReal = false
        env.addSharedClass(ret)
        return ret
    }

    private fun getPath(url: URL): Path? = try {
        val uri = url.toURI()
        var ret = Paths.get(uri)
        if(uri.scheme == "jrt" && !Files.exists(ret)) {
            ret = Paths.get(URI(uri.scheme, uri.userInfo, uri.host, uri.port, "/modules${uri.path}", uri.query, uri.fragment))
        }
        ret
    } catch (e: FileSystemNotFoundException) {
        null
    }

    private fun getClassName(id: String): String {
        var name = id
        if(name.length > 1) {
            name = if(name[0] == '[') name else name.substring(1, name.length - 1)
        }

        if(name.length == 1) {
            name = "java/lang/" + Type.getType(name).className.replaceFirstChar { it.uppercase() }
        }

        return name
    }

    private fun readClass(bytes: ByteArray, flags: Int = ClassReader.SKIP_FRAMES): ClassEntry {
        val node = ClassNode()
        val reader = ClassReader(bytes)
        reader.accept(node, flags)
        return ClassEntry(this, ClassEntry.id(node.name), node)
    }

    fun process() {
        env.sharedGroup.getCreateClassById("java/lang/Object")

        // Step A
        for(cls in classes) {
            processA(cls)
        }
    }

    private fun processA(cls: ClassEntry) {
        val cn = cls.node

        if(cn.superName != null && cls.parent == null) {
            cls.parent = getCreateClass(cn.superName)
            cls.parent?.children?.add(cls)
        }
        cn.interfaces.map { getCreateClass(it) }.forEach { itfCls ->
            cls.interfaces.add(itfCls)
            itfCls.implementers.add(cls)
        }
    }
}