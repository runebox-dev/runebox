package io.runebox.updater.ir.stack.invoke;

import io.runebox.updater.ir.MethodRef;

/**
 * Invoke a method on an instance of a class
 */
public class AbstractInstanceInvoke extends AbstractConcreteInvoke {
    public AbstractInstanceInvoke(MethodRef method) {
        super(method);
    }
}
