package io.runebox.updater.ir.typeannotation;

import io.runebox.updater.ir.annotation.Annotation;

/**
 * Annotate the exception type of a try/catch block.
 */
public class ExceptionTypeAnnotation extends AbstractTypeAnnotation {
    public ExceptionTypeAnnotation(TypePath typePath, Annotation annotation) {
        super(typePath, annotation);
    }

    @Override
    public String toString() {
        return FieldTypeAnnotation.class.getSimpleName() + '{' +
                "typePath=" + getTypePath() +
                ", annotation=" + getAnnotation() +
                '}';
    }
}
