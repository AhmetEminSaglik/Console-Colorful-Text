package org.ahmeteminsaglik.printable.abstracts;

public interface PrintableService {
    default void initialize() {}

    default void destroy() {}

    String getColorfulText(String msg);

}