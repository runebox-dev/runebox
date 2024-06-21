package io.runebox.updater.ir.handle;

import io.runebox.updater.ir.MethodRef;

public class InvokeSpecialHandle extends AbstractAmbiguousMethodHandle {
    public InvokeSpecialHandle(MethodRef methodRef, boolean isInterface) {
        super(methodRef, isInterface);
    }
}
