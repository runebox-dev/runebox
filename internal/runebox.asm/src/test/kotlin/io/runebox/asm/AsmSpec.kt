package io.runebox.asm

import io.kotest.core.spec.style.FunSpec

abstract class AsmSpec(body: AsmSpec.() -> Unit = {}) : FunSpec({

}) {

    var group = ClassGroup()

    init {
        for(klass in TestClasses) {
            group.addClass(klass)
        }
        group.buildHierarchy()
        body()
    }
}