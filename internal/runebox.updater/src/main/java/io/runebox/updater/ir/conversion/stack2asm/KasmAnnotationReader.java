package io.runebox.updater.ir.conversion.stack2asm;

import io.runebox.updater.ir.annotation.*;
import io.runebox.updater.ir.type.Type;
import org.objectweb.asm.AnnotationVisitor;

import java.util.LinkedHashMap;

public class KasmAnnotationReader {
    private final LinkedHashMap<String, AnnotationValue> values;

    public KasmAnnotationReader(AbstractAnnotation annotation) {
        this(annotation.getValues());
    }

    public KasmAnnotationReader(LinkedHashMap<String, AnnotationValue> values) {
        this.values = values;
    }

    public void accept(AnnotationVisitor av) {
        values.forEach((key, value) -> visitValue(av, key, value));
    }

    private void visitValue(AnnotationVisitor av, String name, AnnotationValue value) {
        if (value instanceof PrimitiveAnnotationValue) {
            Object cst;
            if (value instanceof BooleanAnnotationValue) {
                cst = ((BooleanAnnotationValue) value).getValue();
            } else if (value instanceof ByteAnnotationValue) {
                cst = ((ByteAnnotationValue) value).getValue();
            } else if (value instanceof ShortAnnotationValue) {
                cst = ((ShortAnnotationValue) value).getValue();
            } else if (value instanceof CharAnnotationValue) {
                cst = ((CharAnnotationValue) value).getValue();
            } else if (value instanceof DoubleAnnotationValue) {
                cst = ((DoubleAnnotationValue) value).getValue();
            } else if (value instanceof FloatAnnotationValue) {
                cst = ((FloatAnnotationValue) value).getValue();
            } else if (value instanceof IntAnnotationValue) {
                cst = ((IntAnnotationValue) value).getValue();
            } else if (value instanceof LongAnnotationValue) {
                cst = ((LongAnnotationValue) value).getValue();
            } else {
                throw new AssertionError();
            }
            av.visit(name, cst);
        } else if (value instanceof StringAnnotationValue) {
            String string = ((StringAnnotationValue) value).getValue();
            av.visit(name, string);
        } else if (value instanceof ArrayAnnotationValue) {
            AnnotationVisitor arrayVisitor = av.visitArray(name);
            for (AnnotationValue arrayValue : ((ArrayAnnotationValue) value).getArray()) {
                visitValue(arrayVisitor, null, arrayValue);
            }
        } else if (value instanceof ClassAnnotationValue) {
            Type type = ((ClassAnnotationValue) value).getValue();
            av.visit(name, AsmUtil.toAsmType(type));
        } else if (value instanceof EnumAnnotationValue) {
            EnumAnnotationValue enumValue = (EnumAnnotationValue) value;
            String descriptor = AsmUtil.pathToDescriptor(enumValue.getType());
            av.visitEnum(name, descriptor, enumValue.getName());
        } else if (value instanceof AnnotationAnnotationValue) {
            AnnotationAnnotationValue annoValue = (AnnotationAnnotationValue) value;
            AnnotationVisitor _av = av.visitAnnotation(name, AsmUtil.pathToDescriptor(annoValue.getType()));
            annoValue.getValues().forEach((_name, _value) -> {
                visitValue(_av, _name, _value);
            });
        } else {
            throw new AssertionError();
        }
    }
}
