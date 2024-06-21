package io.runebox.updater.ir.conversion.stack2asm;

import io.runebox.updater.ir.MethodDescriptor;
import io.runebox.updater.ir.Path;
import io.runebox.updater.ir.type.*;
import io.runebox.updater.ir.typeannotation.TypePath;

import java.util.List;
import java.util.Optional;

/**
 * A collection of utility methods for conversion from 'stack' data structures to their 'asm' representation.
 *
 * @see io.runebox.updater.ir.conversion.asm2stack.AsmUtil conversions in the other direction
 */
public class AsmUtil {
    public static org.objectweb.asm.Type toAsmReturnType(Optional<Type> type) {
        return type.map(AsmUtil::toAsmType).orElse(org.objectweb.asm.Type.VOID_TYPE);
    }

    public static org.objectweb.asm.Type toAsmType(Type type) {
        if (type instanceof PrimitiveType) {
            // most used primitive types first
            if (type instanceof IntType) {
                return org.objectweb.asm.Type.INT_TYPE;
            } else if (type instanceof LongType) {
                return org.objectweb.asm.Type.LONG_TYPE;
            } else if (type instanceof FloatType) {
                return org.objectweb.asm.Type.FLOAT_TYPE;
            } else if (type instanceof DoubleType) {
                return org.objectweb.asm.Type.DOUBLE_TYPE;
            }

            // less common types
            if (type instanceof BooleanType) {
                return org.objectweb.asm.Type.BOOLEAN_TYPE;
            } else if (type instanceof ByteType) {
                return org.objectweb.asm.Type.BYTE_TYPE;
            } else if (type instanceof ShortType) {
                return org.objectweb.asm.Type.SHORT_TYPE;
            } else if (type instanceof CharType) {
                return org.objectweb.asm.Type.CHAR_TYPE;
            }
        } else if (type instanceof ObjectType) {
            Path name = ((ObjectType) type).getName();
            return org.objectweb.asm.Type.getObjectType(AsmUtil.toInternalName(name));
        } else if (type instanceof ArrayType) {
            ArrayType array = (ArrayType) type;
            int dimensions = array.getDimensions();
            String baseDescriptor = toAsmType(array.getBaseType()).getDescriptor();

            StringBuilder builder = new StringBuilder(dimensions + baseDescriptor.length());

            for (int i = 0; i < dimensions; i++) {
                builder.append('[');
            }

            builder.append(baseDescriptor);

            return org.objectweb.asm.Type.getType(builder.toString());
        }

        throw new AssertionError();
    }

    public static String toModuleName(Path path) {
        return path.join('.');
    }

    public static String toInternalName(Path path) {
        return path.join('/');
    }

    public static String toInternalName(RefType refType) {
        return toAsmType(refType).getInternalName();
    }

    public static String toDescriptor(Type type) {
        return toAsmType(type).getDescriptor();
    }

    public static String methodDescriptorToString(MethodDescriptor descriptor) {
        return methodDescriptorToType(descriptor).getDescriptor();
    }

    public static String methodDescriptorToString(Optional<Type> returnType, List<Type> parameterTypes) {
        return methodDescriptorToType(returnType, parameterTypes).getDescriptor();
    }

    public static org.objectweb.asm.Type methodDescriptorToType(MethodDescriptor descriptor) {
        return methodDescriptorToType(descriptor.getReturnType(), descriptor.getParameterTypes());
    }

    public static org.objectweb.asm.Type methodDescriptorToType(Optional<Type> returnType, List<Type> parameterTypes) {
        org.objectweb.asm.Type asmReturnType = AsmUtil.toAsmReturnType(returnType);

        org.objectweb.asm.Type[] asmParameterTypes = parameterTypes.stream()
                .map(AsmUtil::toAsmType)
                .toArray(org.objectweb.asm.Type[]::new);

        return org.objectweb.asm.Type.getMethodType(asmReturnType, asmParameterTypes);
    }

    public static String pathToDescriptor(Path path) {
        return 'L' + toInternalName(path) + ';';
    }

    public static org.objectweb.asm.TypePath toAsmTypePath(TypePath typePath) {
        StringBuilder builder = new StringBuilder();
        for (TypePath.Kind kind : typePath.getPaths()) {
            if (kind instanceof TypePath.Kind.Array) {
                builder.append('[');
            } else if (kind instanceof TypePath.Kind.InnerClass) {
                builder.append('.');
            } else if (kind instanceof TypePath.Kind.TypeArgument) {
                int index = ((TypePath.Kind.TypeArgument) kind).getTypeArgumentIndex();
                builder.append(index);
                builder.append(';');
            } else if (kind instanceof TypePath.Kind.WildcardBound) {
                builder.append('*');
            } else {
                throw new AssertionError();
            }
        }
        return org.objectweb.asm.TypePath.fromString(builder.toString());
    }
}
