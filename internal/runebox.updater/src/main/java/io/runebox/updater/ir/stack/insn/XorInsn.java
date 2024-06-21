package io.runebox.updater.ir.stack.insn;

import io.runebox.updater.ir.type.IntType;
import io.runebox.updater.ir.type.LongType;
import io.runebox.updater.ir.type.Type;

/**
 * Pop two int/long values, calculate the logical xor ('^' operator) and push the result.
 */
public class XorInsn extends AbstractBinaryMathInsn {
    public XorInsn(Type type) {
        super(type);
        if (!(type instanceof IntType) && !(type instanceof LongType)) {
            throw new IllegalArgumentException(type + " is not supported by logical xor instruction");
        }
    }

    @Override
    protected boolean isTypeSupported(Type type) {
        return type instanceof IntType || type instanceof LongType;
    }
}
