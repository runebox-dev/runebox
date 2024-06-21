package io.runebox.updater.ir.handle;

import io.runebox.updater.ir.MethodRef;

public class InvokeStaticHandle extends AbstractAmbiguousMethodHandle {
    public InvokeStaticHandle(MethodRef methodRef, boolean isInterface) {
        super(methodRef, isInterface);
    }
}
