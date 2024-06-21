package io.runebox.updater.ir.stack.insn;

import io.runebox.updater.ir.type.Type;

/**
 * An instruction that takes two values from the stack,
 * does a computation and pushes the result.
 */
public abstract class AbstractBinaryMathInsn extends AbstractTypeInsn {
    public AbstractBinaryMathInsn(Type type) {
        super(type);
    }

    @Override
    public int getPushCount() {
        return 1;
    }

    @Override
    public int getPopCount() {
        return 2;
    }
}
