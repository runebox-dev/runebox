package io.runebox.updater.asm

import java.io.File

class ClassEnv {
    val groupA = ClassGroup(this, false)
    val groupB = ClassGroup(this, false)
    val sharedGroup = ClassGroup(this, true)

    fun getSharedClass(name: String) = sharedGroup.getClass(name)
    fun getSharedClassById(id: String) = sharedGroup.getClassById(id)

    fun addSharedClass(cls: ClassEntry): Boolean {
        if(sharedGroup.getClass(cls.name) != null) return false
        sharedGroup.addClass(cls)
        return true
    }

    fun init(jarA: File, jarB: File) {
        groupA.init(jarA)
        groupB.init(jarB)

        groupA.process()
        groupB.process()
    }
}