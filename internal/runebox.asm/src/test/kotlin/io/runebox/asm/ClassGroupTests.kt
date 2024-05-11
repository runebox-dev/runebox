package io.runebox.asm

import io.kotest.matchers.ints.shouldBeGreaterThan

class ClassGroupTests : AsmSpec({

    test("Load classes from jar.") {
        group.allClasses.size shouldBeGreaterThan 0
    }
})