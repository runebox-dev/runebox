package io.runebox.updater.ir.stack.insn;

import io.runebox.updater.ir.type.IntType;
import io.runebox.updater.ir.type.LongType;
import io.runebox.updater.ir.type.Type;

/**
 * Pop a long/int and a int value from the stack.
 * Shift the bits of the long/int value to the right and push the result.
 *
 * @see ShrInsn same functionality but preserves the sign.
 */
public class UShrInsn extends AbstractBinaryMathInsn {
    public UShrInsn(Type type) {
        super(type);
    }

    @Override
    protected boolean isTypeSupported(Type type) {
        return type instanceof IntType || type instanceof LongType;
    }
}
