package io.runebox.updater.ir.stack.insn;

import io.runebox.updater.ir.typeannotation.InsnTypeAnnotation;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractInstruction implements Instruction {
    private List<InsnTypeAnnotation> typeAnnotations = new ArrayList<>();

    public List<InsnTypeAnnotation> getTypeAnnotations() {
        return typeAnnotations;
    }

    public void setTypeAnnotations(List<InsnTypeAnnotation> typeAnnotations) {
        this.typeAnnotations = typeAnnotations;
    }
}
