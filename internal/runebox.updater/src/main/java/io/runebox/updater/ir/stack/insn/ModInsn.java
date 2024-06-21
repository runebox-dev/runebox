package io.runebox.updater.ir.stack.insn;

import io.runebox.updater.ir.type.*;

/**
 * Pop two numbers from the stack, calculate the remainder and push it onto the stack.
 */
public class ModInsn extends AbstractBinaryMathInsn {
    public ModInsn(Type type) {
        super(type);
    }

    @Override
    protected boolean isTypeSupported(Type type) {
        return type instanceof IntType || type instanceof LongType ||
                type instanceof FloatType || type instanceof DoubleType;
    }
}
