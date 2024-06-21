package io.runebox.updater.ir.stack.insn;

import io.runebox.updater.ir.type.*;

/**
 * Pop two numbers from the stack, multiply them and push the result onto the stack.
 */
public class MulInsn extends AbstractBinaryMathInsn {
    public MulInsn(Type type) {
        super(type);
    }

    @Override
    protected boolean isTypeSupported(Type type) {
        return type instanceof IntType || type instanceof LongType || type instanceof FloatType || type instanceof DoubleType;
    }
}
