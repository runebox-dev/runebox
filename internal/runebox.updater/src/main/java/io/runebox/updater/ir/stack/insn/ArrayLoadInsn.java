package io.runebox.updater.ir.stack.insn;

import io.runebox.updater.ir.type.*;

/**
 * Pop an array and an index and push the value at that index within the array.
 */
public class ArrayLoadInsn extends AbstractTypeInsn {
    public ArrayLoadInsn(Type type) {
        super(type);
    }

    @Override
    protected boolean isTypeSupported(Type type) {
        return type instanceof RefType ||
                type instanceof IntType || type instanceof LongType ||
                type instanceof FloatType || type instanceof DoubleType;
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
