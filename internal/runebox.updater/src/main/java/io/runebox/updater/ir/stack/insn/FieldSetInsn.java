package io.runebox.updater.ir.stack.insn;

import io.runebox.updater.ir.FieldRef;

/**
 * Store a value in a field.
 */
public class FieldSetInsn extends AbstractFieldInsn {
    public FieldSetInsn(FieldRef field, boolean isStatic) {
        super(field, isStatic);
    }

    @Override
    public int getPushCount() {
        return 0;
    }

    @Override
    public int getPopCount() {
        return isStatic() ? 1 : 2;
    }
}
