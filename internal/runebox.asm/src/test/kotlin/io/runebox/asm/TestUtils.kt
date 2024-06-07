package io.runebox.asm

import com.google.common.reflect.ClassPath
import io.runebox.asm.tree.ClassPool

fun testClassPool(pkg: String = "testclasses"): ClassPool {
    val pool = ClassPool()
    val klasses = ClassPath.from(ClassLoader.getSystemClassLoader())
        .allClasses
        .filter { it.packageName.startsWith(pkg) }
        .map { "${it.name.replace(".", "/")}.class" }
        .toSet()
    for(klass in klasses) {
        val cls = ClassLoader.getSystemClassLoader().getResourceAsStream(klass)?.readBytes()?.toClassNode()
            ?: throw ClassNotFoundException("Could not find class: $klass in runtime classpath.")
        pool.addClass(cls)
    }
    return pool
}