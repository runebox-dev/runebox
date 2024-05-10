package io.runebox.asm

import com.google.common.reflect.ClassPath
import io.kotest.core.names.TestName
import io.kotest.core.spec.style.FunSpec
import io.kotest.core.spec.style.scopes.addTest
import io.kotest.core.test.TestScope
import io.runebox.asm.core.ClassFile
import io.runebox.asm.core.ClassGroup

abstract class AsmSpec(body: AsmSpec.() -> Unit = {}) : FunSpec() {
    private fun scanClasses(packageName: String): List<String> {
        val results = mutableListOf<String>()
        val classPath = ClassPath.from(Thread.currentThread().contextClassLoader)
        for (info in classPath.getTopLevelClassesRecursive(packageName)) {
            results.add(info.name)
        }
        return results
    }

    var group = ClassGroup()
        private set

    private var origGroup: ClassGroup

    init {
        val classes = scanClasses("testclasses")
        for(className in classes) {
            val klass = Class.forName(className.replace("/", ".").replace(".class", ""))
            val cls = group.readClass(klass)
            group.addClass(cls)
        }
        group.build()
        origGroup = group

        // Run the body.
        body()
    }

    fun ClassGroup.reset(): ClassGroup {
        group = origGroup
        return group
    }

    fun classTest(name: String, className: String, block: ClassFile.() -> Unit) {
        val test: TestScope.() -> Unit = { group.findClass(className).block() }
        addTest(TestName(name), false, null, test)
    }

    fun methodTest(name: String, className: String, methodName: String, block: ClassFile.() -> Unit) {
        val test: TestScope.() -> Unit = { group.findClass(className).block() }
        addTest(TestName(name), false, null, test)
    }
}