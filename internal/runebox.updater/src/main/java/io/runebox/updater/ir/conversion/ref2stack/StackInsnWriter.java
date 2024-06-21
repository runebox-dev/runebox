package io.runebox.updater.ir.conversion.ref2stack;

import io.runebox.updater.ir.ref.RefLocal;
import io.runebox.updater.ir.ref.Statement;
import io.runebox.updater.ir.stack.StackLocal;
import io.runebox.updater.ir.stack.insn.Instruction;
import io.runebox.updater.ir.util.AbstractStackInsnWriter;
import io.runebox.updater.ir.util.RWCell;

/**
 * Instruction visitor that collects all events represented as {@link Instruction} and
 * registers instruction references to a {@link ConversionContext}.
 */
public class StackInsnWriter extends AbstractStackInsnWriter<Statement, RefLocal> {
    private final ConversionContext ctx;

    public StackInsnWriter(ConversionContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public void registerTargetCell(Statement target, RWCell<Instruction> cell) {
        this.ctx.registerInstructionReference(target, cell);
    }

    @Override
    public StackLocal convertLocal(RefLocal refLocal) {
        return ctx.getStackLocal(refLocal);
    }
}
