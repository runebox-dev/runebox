package io.runebox.updater.ir.util;

/**
 * Read-only view of a {@link RWCell}.
 *
 * @param <T>
 */
public interface RCell<T> extends Cell {
    T get();
}
