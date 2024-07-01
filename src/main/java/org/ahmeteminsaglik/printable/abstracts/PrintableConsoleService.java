package org.ahmeteminsaglik.printable.abstracts;

public interface PrintableConsoleService {
    default void initialize() {}

    default void destroy() {}

    String getColorfulText(String msg);

}