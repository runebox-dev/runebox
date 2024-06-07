package io.runebox.asm

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ints.shouldBeGreaterThan
import io.runebox.asm.tree.ClassPool

class ClassPoolTests : FunSpec( {

    lateinit var pool: ClassPool

    beforeSpec {
        pool = testClassPool()
    }

    test("Add classes to pool") {
        pool.classes.size shouldBeGreaterThan 0
    }
})