package io.runebox.updater.ir.ref.invoke;

import io.runebox.updater.ir.MethodRef;
import io.runebox.updater.ir.ref.Expression;
import io.runebox.updater.ir.util.RCell;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class InvokeStatic extends AbstractConcreteInvoke implements AmbigiousInvoke {
    /**
     * Is the method declared within an interface
     */
    private boolean isInterface;

    public InvokeStatic(MethodRef method, List<Expression> arguments, boolean isInterface) {
        super(method, arguments);
        this.isInterface = isInterface;
    }

    public boolean isInterface() {
        return isInterface;
    }

    public void setInterface(boolean isInterface) {
        this.isInterface = isInterface;
    }

    @Override
    public Set<RCell<Expression>> getReadValueCells() {
        return Set.copyOf(getArgumentCells());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InvokeStatic that = (InvokeStatic) o;
        return isInterface == that.isInterface;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isInterface);
    }
}
