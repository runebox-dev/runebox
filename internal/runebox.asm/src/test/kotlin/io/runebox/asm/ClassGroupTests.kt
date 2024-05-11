package io.runebox.asm

import io.kotest.matchers.ints.shouldBeGreaterThan
import io.kotest.matchers.shouldBe
import org.objectweb.asm.tree.ClassNode

class ClassGroupTests : AsmSpec({

    test("Load classes from jar.") {
        val hierarchyMethodSets = group.createMethodHierarchySets()
        hierarchyMethodSets.elements shouldBeGreaterThan 0
    }

    test("clear_hierarchy_with_multiple_interface_classes") {
        val group = ClassGroup()
        val class1 = ClassInfo(group, ClassNode())
        val class2 = ClassInfo(group, ClassNode())
        val class3 = ClassInfo(group, ClassNode())
        val class4 = ClassInfo(group, ClassNode())
        val class5 = ClassInfo(group, ClassNode())

        class1.interfaces.add("Interface1")
        class1.interfaces.add("Interface2")
        class1.interfaces.add("Interface3")

        class2.interfaces.add("Interface1")
        class2.interfaces.add("Interface2")

        class3.interfaces.add("Interface1")
        class3.interfaces.add("Interface3")

        class4.interfaces.add("Interface2")
        class4.interfaces.add("Interface3")

        class5.interfaces.add("Interface1")

        group.addClass(class1)
        group.addClass(class2)
        group.addClass(class3)
        group.addClass(class4)
        group.addClass(class5)

        class1.buildHierarchy()
        class2.buildHierarchy()
        class3.buildHierarchy()
        class4.buildHierarchy()
        class5.buildHierarchy()

        class1.parentClasses.size shouldBe 5
        class2.parentClasses.size shouldBe 4
        class3.parentClasses.size shouldBe 4
        class4.parentClasses.size shouldBe 4
        class5.parentClasses.size shouldBe 3

        class1.clearHierarchy()

        class1.parentClasses.size shouldBe 0
        class2.parentClasses.size shouldBe 3
        class3.parentClasses.size shouldBe 3
        class4.parentClasses.size shouldBe 3
        class5.parentClasses.size shouldBe 2
    }
})