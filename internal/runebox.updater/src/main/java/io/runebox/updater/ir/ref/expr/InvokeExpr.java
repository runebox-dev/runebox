package io.runebox.updater.ir.ref.expr;

import io.runebox.updater.ir.ref.Expression;
import io.runebox.updater.ir.ref.invoke.AbstractInvoke;
import io.runebox.updater.ir.ref.stmt.InvokeStmt;
import io.runebox.updater.ir.type.Type;
import io.runebox.updater.ir.util.RCell;

import java.util.Objects;
import java.util.Set;

/**
 * An expression for the result of a method invoke.
 *
 * @see InvokeStmt for invokations of methods of <tt>void</tt> type
 */
public class InvokeExpr implements Expression {
    /**
     * Invocation whose result in captured
     */
    private AbstractInvoke invoke;

    public InvokeExpr(AbstractInvoke invoke) {
        this.invoke = invoke;
    }

    public AbstractInvoke getInvoke() {
        return invoke;
    }

    public void setInvoke(AbstractInvoke invoke) {
        this.invoke = invoke;
    }

    @Override
    public Type getType() {
        return invoke.getMethodDescriptor().getReturnType()
                .orElseThrow(() -> new IllegalStateException("Void in InvokeExpr"));
    }

    @Override
    public Set<RCell<Expression>> getReadValueCells() {
        return invoke.getReadValueCells();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvokeExpr that = (InvokeExpr) o;
        return Objects.equals(invoke, that.invoke);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoke);
    }
}
