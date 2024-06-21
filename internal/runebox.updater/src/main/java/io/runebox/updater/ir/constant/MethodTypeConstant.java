package io.runebox.updater.ir.constant;

import io.runebox.updater.ir.MethodDescriptor;
import io.runebox.updater.ir.type.ObjectType;
import io.runebox.updater.ir.type.Type;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * An instance of "java.lang.invoke.MethodType".
 */
public class MethodTypeConstant implements BootstrapConstant, PushableConstant, DexConstant, Constant {
    /**
     * Immutable list of argument types
     */
    private final List<Type> argumentTypes;

    /**
     * Return type of the method.
     */
    private final Optional<Type> returnType;

    public MethodTypeConstant(MethodDescriptor descriptor) {
        this(descriptor.getParameterTypes(), descriptor.getReturnType());
    }

    public MethodTypeConstant(List<Type> argumentTypes, Optional<Type> returnType) {
        this.argumentTypes = List.copyOf(argumentTypes);
        this.returnType = returnType;
    }

    public List<Type> getArgumentTypes() {
        return argumentTypes;
    }

    public Optional<Type> getReturnType() {
        return returnType;
    }

    public MethodDescriptor toDescriptor() {
        return new MethodDescriptor(argumentTypes, returnType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MethodTypeConstant that = (MethodTypeConstant) o;
        return Objects.equals(argumentTypes, that.argumentTypes) &&
                Objects.equals(returnType, that.returnType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(argumentTypes, returnType);
    }

    @Override
    public String toString() {
        return MethodTypeConstant.class.getSimpleName() + '{' +
                "argumentTypes=" + argumentTypes +
                ", returnType=" + returnType +
                '}';
    }

    @Override
    public ObjectType getType() {
        return ObjectType.METHOD_TYPE;
    }
}
