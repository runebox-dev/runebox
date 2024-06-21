package io.runebox.updater.ir.ref.invoke;

import io.runebox.updater.ir.MethodDescriptor;
import io.runebox.updater.ir.ref.Expression;
import io.runebox.updater.ir.ref.Referencing;
import io.runebox.updater.ir.util.RCell;
import io.runebox.updater.ir.util.RWCell;

import java.lang.invoke.CallSite;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public abstract class AbstractInvoke implements Referencing {
    /**
     * Arguments passed to the invoked {@link CallSite}.
     */
    private List<Expression> arguments;

    public AbstractInvoke(List<Expression> arguments) {
        this.arguments = arguments;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public void setArguments(List<Expression> arguments) {
        this.arguments = arguments;
    }

    public List<RWCell<Expression>> getArgumentCells() {
        return IntStream.range(0, arguments.size())
                .mapToObj(index -> RWCell.ofList(arguments, index, Expression.class))
                .collect(Collectors.toUnmodifiableList());
    }

    /**
     * Get the argument and return type of the invoked method.
     *
     * @return descriptor of the invoked method
     */
    public abstract MethodDescriptor getMethodDescriptor();

    @Override
    public Set<RCell<Expression>> getReadValueCells() {
        return Set.copyOf(getArgumentCells());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractInvoke that = (AbstractInvoke) o;
        return Objects.equals(arguments, that.arguments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arguments);
    }
}
