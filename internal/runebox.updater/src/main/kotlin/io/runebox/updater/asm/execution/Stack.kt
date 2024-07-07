package io.runebox.updater.asm.execution

class Stack(maxStack: Int) {
    private var stack = arrayOfNulls<StackValue>(maxStack * 2)
    var size: Int = 0
        private set

    constructor(other: Stack) : this(other.size) {
        this.size = other.size
        this.stack = other.stack.clone()
    }

    fun push(v: StackValue) {
        if(size == stack.size) error("Stack Overflow.")
        stack[size++] = v
    }

    fun pop(): StackValue {
        if(size <= 0) error("Stack Underflow")
        return stack[--size]!!
    }

    fun values() = stack.toList()

}