package io.runebox.updater.ir.ref.invoke;

import io.runebox.updater.ir.MethodRef;
import io.runebox.updater.ir.ref.Expression;

import java.util.List;

public class InvokeInterface extends AbstractInstanceInvoke {
    public InvokeInterface(MethodRef method, Expression instance, List<Expression> arguments) {
        super(method, instance, arguments);
    }
}
