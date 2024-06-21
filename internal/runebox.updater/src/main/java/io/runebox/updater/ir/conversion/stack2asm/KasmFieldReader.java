package io.runebox.updater.ir.conversion.stack2asm;

import io.runebox.updater.ir.Attribute;
import io.runebox.updater.ir.Field;
import io.runebox.updater.ir.annotation.Annotation;
import io.runebox.updater.ir.typeannotation.FieldTypeAnnotation;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.TypeReference;

public class KasmFieldReader {
    private final Field field;

    public KasmFieldReader(Field field) {
        this.field = field;
    }

    public void accept(FieldVisitor fv) {
        visitAnnotations(fv);
        visitTypeAnnotations(fv);
        visitAttributes(fv);
        fv.visitEnd();
    }

    private void visitAnnotations(FieldVisitor fv) {
        for (Annotation annotation : field.getAnnotations()) {
            String descriptor = AsmUtil.pathToDescriptor(annotation.getType());
            boolean isVisible = annotation.isRuntimeVisible();

            AnnotationVisitor av = fv.visitAnnotation(descriptor, isVisible);
            if (av != null) {
                new KasmAnnotationReader(annotation).accept(av);
            }
        }
    }

    private void visitTypeAnnotations(FieldVisitor fv) {
        for (FieldTypeAnnotation typeAnnotation : field.getTypeAnnotations()) {
            Annotation annotation = typeAnnotation.getAnnotation();

            int typeRef = TypeReference.newTypeReference(TypeReference.FIELD).getValue();
            TypePath typePath = AsmUtil.toAsmTypePath(typeAnnotation.getTypePath());
            String descriptor = AsmUtil.pathToDescriptor(annotation.getType());
            boolean isVisible = annotation.isRuntimeVisible();

            AnnotationVisitor av = fv.visitTypeAnnotation(typeRef, typePath, descriptor, isVisible);
            if (av != null) {
                new KasmAnnotationReader(annotation).accept(av);
            }
        }
    }

    private void visitAttributes(FieldVisitor fv) {
        for (Attribute attribute : field.getAttributes()) {
            fv.visitAttribute(new CustomAttribute(attribute.getName(), attribute.getData()));
        }
    }
}
