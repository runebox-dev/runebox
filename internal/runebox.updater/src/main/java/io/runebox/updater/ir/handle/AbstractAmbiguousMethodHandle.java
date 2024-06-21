package io.runebox.updater.ir.handle;

import io.runebox.updater.ir.MethodRef;

/**
 * Method Handle where the containing class might be either an interface or a class.
 */
public abstract class AbstractAmbiguousMethodHandle extends AbstractMethodHandle {
    /**
     * Is the method declared within an interface
     */
    private boolean isInterface;

    public AbstractAmbiguousMethodHandle(MethodRef methodRef, boolean isInterface) {
        super(methodRef);
        this.isInterface = isInterface;
    }

    public boolean isInterface() {
        return isInterface;
    }

    public void setInterface(boolean anInterface) {
        isInterface = anInterface;
    }
}
