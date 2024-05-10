package io.runebox.asm

import io.kotest.matchers.ints.shouldBeGreaterThan

class ClassGroupTests : AsmSpec({

    test("Verify classes have been loaded into group.") {
        group.allClasses.size shouldBeGreaterThan 0
    }
})