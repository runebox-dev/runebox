package io.runebox.updater.ir.ref.invoke;

/**
 * A method invoke that stores whether the owner of the method is a class or interface.
 */
public interface AmbigiousInvoke {
    boolean isInterface();
    void setInterface(boolean isInterface);
}
