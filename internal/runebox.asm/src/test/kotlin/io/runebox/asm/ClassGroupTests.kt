package io.runebox.asm

import io.kotest.matchers.ints.shouldBeGreaterThan
import io.runebox.asm.archive.JarArchive
import java.io.File

class ClassGroupTests : AsmSpec({

    test("Load classes from jar.") {
        group.allClasses.size shouldBeGreaterThan 0
        group.writeArchive(JarArchive(File("../../gamepack.out.jar")))
    }
})