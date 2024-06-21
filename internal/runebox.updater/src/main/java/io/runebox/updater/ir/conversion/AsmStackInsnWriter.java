package io.runebox.updater.ir.conversion;

import io.runebox.updater.ir.conversion.asm2stack.ConversionContext;
import io.runebox.updater.ir.stack.StackLocal;
import io.runebox.updater.ir.stack.insn.Instruction;
import io.runebox.updater.ir.util.AbstractStackInsnWriter;
import io.runebox.updater.ir.util.RWCell;
import org.objectweb.asm.tree.LabelNode;

/**
 * Instruction visitor that collects all events represented as {@link Instruction}.
 */
public class AsmStackInsnWriter extends AbstractStackInsnWriter<LabelNode, Integer> {
    private final ConversionContext ctx;

    public AsmStackInsnWriter(ConversionContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public void registerTargetCell(LabelNode label, RWCell<Instruction> cell) {
        ctx.registerForwardInsnCell(label, cell);
    }

    @Override
    public StackLocal convertLocal(Integer localIndex) {
        return ctx.getLocal(localIndex);
    }
}
