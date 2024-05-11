package io.runebox.asm.archive

import java.io.File
import java.util.jar.JarEntry
import java.util.jar.JarFile
import java.util.jar.JarOutputStream

class JarArchive(file: File) : Archive(file) {

    override fun read(): Map<String, ByteArray> {
        val entries = hashMapOf<String, ByteArray>()
        JarFile(file).use { jar ->
            jar.entries().asSequence().forEach { entry ->
                if(entry.isDirectory) return@forEach
                val bytes = jar.getInputStream(entry).readBytes()
                val name = entry.name
                entries[name] = bytes
            }
        }
        return entries
    }

    override fun write(entries: Map<String, ByteArray>) {
        if(file.exists()) file.delete()
        if(file.parentFile?.exists() != true) file.parentFile?.mkdirs()
        file.createNewFile()
        JarOutputStream(file.outputStream()).use { jos ->
            for((name, bytes) in entries) {
                jos.putNextEntry(JarEntry(name))
                jos.write(bytes)
                jos.closeEntry()
            }
        }
    }
}