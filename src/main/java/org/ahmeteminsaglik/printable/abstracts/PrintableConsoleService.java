package org.ahmeteminsaglik.printable.abstracts;

public interface PrintableConsoleService {
    default void initialize() {}

    default void destroy() {}

    String getColorfulText(String msg);

    String getInfoColor(String msg);

    String getSuccessColor(String msg);

    String getCancelColor(String msg);

    String getWarningColor(String msg);

    String getErrorColor(String msg);
}