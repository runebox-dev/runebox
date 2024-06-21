package io.runebox.updater.ir.stack.insn;

/**
 * Pop an array from the stack and push its length.
 */
public class ArrayLengthInsn extends AbstractInstruction {
    @Override
    public int getPushCount() {
        return 1;
    }

    @Override
    public int getPopCount() {
        return 1;
    }
}
