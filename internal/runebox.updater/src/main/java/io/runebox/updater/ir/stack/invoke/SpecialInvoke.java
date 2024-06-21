package io.runebox.updater.ir.stack.invoke;

import io.runebox.updater.ir.MethodRef;

/**
 * Invoke a private method, a method in a superclass or a constructor.
 *
 * These methods have in common that they cannot be overridden.
 */
public class SpecialInvoke extends AbstractInstanceInvoke {
    /**
     * Is the invoked method declared within an interface
     */
    private boolean isInterface;

    public SpecialInvoke(MethodRef method, boolean isInterface) {
        super(method);
        this.isInterface = isInterface;
    }

    public boolean isInterface() {
        return isInterface;
    }

    public void setInterface(boolean isInterface) {
        this.isInterface = isInterface;
    }
}
