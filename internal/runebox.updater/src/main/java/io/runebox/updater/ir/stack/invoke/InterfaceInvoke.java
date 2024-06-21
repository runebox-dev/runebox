package io.runebox.updater.ir.stack.invoke;

import io.runebox.updater.ir.MethodRef;

/**
 * Invoke an instance method of an interface.
 */
public class InterfaceInvoke extends AbstractInstanceInvoke {
    public InterfaceInvoke(MethodRef method) {
        super(method);
    }
}
