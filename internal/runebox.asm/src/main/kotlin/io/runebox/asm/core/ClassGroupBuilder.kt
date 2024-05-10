package io.runebox.asm.core

internal class ClassGroupBuilder(private val group: ClassGroup) {

    fun build() {
        for(cls in group.allClasses) {
            cls.clearHierarchy()
        }
        for(cls in group.allClasses) {
            cls.buildHierarchy()
        }
    }

    private fun ClassFile.clearHierarchy() {
        superClass = null
        interfaces.clear()
        children.clear()
    }

    private fun ClassFile.buildHierarchy() {
        superClass = superName?.let { group.findClass(it) }
        superClass?.children?.add(this)
        interfaces.addAll(interfaceNames.map { group.findClass(it) })
        interfaces.forEach { itf -> itf.children.add(this) }
    }
}