package io.runebox.updater.ir.ref.stmt;

import io.runebox.updater.ir.ref.Statement;
import io.runebox.updater.ir.util.RWCell;

import java.util.Set;

/**
 * Instruction that may branch to other instructions within the method.
 */
public interface BranchStmt extends Statement {
    /**
     * Get all statements to which this instruction might branch.
     *
     * @return a list of branch targets
     */
    Set<Statement> getBranchTargets();

    /**
     * Get references to all uses of branch targets.
     *
     * @return cells of all branch targets
     */
    Set<RWCell<Statement>> getBranchTargetsCells();
}
