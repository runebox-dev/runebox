package io.runebox.asm

import com.google.common.reflect.ClassPath

object TestClasses : HashSet<Class<*>>() {
    init {
        if(this.isEmpty()) {
            val classPath = ClassPath.from(TestClasses.javaClass.classLoader)
            classPath.getTopLevelClassesRecursive("testclasses").forEach { info ->
                val klass = Class.forName(info.name, false, TestClasses.javaClass.classLoader)
                this.add(klass)
            }
        }
    }

    fun createClassGroup() = ClassGroup().also {
        this.forEach { klass -> it.addClass(klass) }
    }
}