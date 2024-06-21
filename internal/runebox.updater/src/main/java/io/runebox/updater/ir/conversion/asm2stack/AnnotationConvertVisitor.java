package io.runebox.updater.ir.conversion.asm2stack;

import io.runebox.updater.ir.annotation.AbstractAnnotation;
import io.runebox.updater.ir.annotation.AnnotationValue;
import org.objectweb.asm.AnnotationVisitor;

/**
 * AnnotationVisitor that converts and adds all values to an {@link AbstractAnnotation}.
 */
public class AnnotationConvertVisitor extends AbstractAnnotationConvertVisitor {
    private AbstractAnnotation annotation;

    public AnnotationConvertVisitor(AnnotationVisitor annotationVisitor, AbstractAnnotation annotation) {
        super(annotationVisitor);
        this.annotation = annotation;
    }

    @Override
    public void visitConvertedAnnotationValue(String name, AnnotationValue av) {
        this.annotation.getValues().put(name, av);
    }
}
