package io.runebox.updater.ir.conversion.stack2asm;

import io.runebox.updater.ir.stack.StackBody;
import io.runebox.updater.ir.stack.StackLocal;
import io.runebox.updater.ir.stack.insn.Instruction;
import io.runebox.updater.ir.util.RWCell;
import org.objectweb.asm.tree.LabelNode;

import java.util.*;

public class ConversionContext {
    private final List<StackLocal> locals;
    private final Map<Instruction, List<RWCell<LabelNode>>> convertedLabels = new HashMap<>();

    public ConversionContext(StackBody body) {
        List<StackLocal> allLocals = body.getLocals();
        this.locals = new ArrayList<>(allLocals.size());

        body.getThisLocal().ifPresent(this.locals::add);
        this.locals.addAll(body.getParameterLocals());

        Set<StackLocal> refAndThisLocal = new HashSet<>(this.locals);
        for (StackLocal local : allLocals) {
            if (!refAndThisLocal.contains(local)) {
                this.locals.add(local);
            }
        }
    }

    /**
     * Get the unique index of a local.
     * If the local in not contained within {@link StackBody#getLocals()},
     * then a new index is assigned for that local.
     *
     * @param local whose index we want
     * @return local index
     */
    public int getLocalIndex(StackLocal local) {
        int index = locals.indexOf(local);
        if (index < 0) {
            index = locals.size();
            locals.add(local);
        }
        return index;
    }

    public void registerLabel(Instruction target, RWCell<LabelNode> labelCell) {
        List<RWCell<LabelNode>> cells = convertedLabels.computeIfAbsent(target, x -> new ArrayList<>());
        cells.add(labelCell);
    }

    public Map<Instruction, List<RWCell<LabelNode>>> getConvertedLabels() {
        return convertedLabels;
    }
}
