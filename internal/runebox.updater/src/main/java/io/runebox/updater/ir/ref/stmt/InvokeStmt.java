package io.runebox.updater.ir.ref.stmt;

import io.runebox.updater.ir.ref.Expression;
import io.runebox.updater.ir.ref.Statement;
import io.runebox.updater.ir.ref.expr.InvokeExpr;
import io.runebox.updater.ir.ref.invoke.AbstractInvoke;
import io.runebox.updater.ir.util.RCell;

import java.util.Set;

/**
 * Invoke a method without storing the return value.
 *
 * @see InvokeExpr to get the return value
 */
public class InvokeStmt implements Statement {
    private AbstractInvoke invoke;

    public InvokeStmt(AbstractInvoke invoke) {
        this.invoke = invoke;
    }

    public AbstractInvoke getInvoke() {
        return invoke;
    }

    public void setInvoke(AbstractInvoke invoke) {
        this.invoke = invoke;
    }

    @Override
    public Set<RCell<Expression>> getReadValueCells() {
        return invoke.getReadValueCells();
    }
}
