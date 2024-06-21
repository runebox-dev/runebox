package io.runebox.updater.ir.stack.insn;

import io.runebox.updater.ir.type.*;

/**
 * Pop an array, an index and a value.
 * The value will be stored in the array at the index.
 */
public class ArrayStoreInsn extends AbstractTypeInsn {
    /**
     * Create an array store instruction
     *
     * @param type the type of the value that gets stored in the array
     */
    public ArrayStoreInsn(Type type) {
        super(type);
    }

    @Override
    protected boolean isTypeSupported(Type type) {
        return true;
    }

    @Override
    public int getPushCount() {
        return 0;
    }

    @Override
    public int getPopCount() {
        return 3;
    }
}
