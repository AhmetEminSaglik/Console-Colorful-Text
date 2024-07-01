package org.ahmeteminsaglik.printable;

public enum EnumPrintOption {
    JAVA_IDE(1, "JAVA_IDE"),
    WINDOWS_CMD(1, "WINDOWS_CMD"),
    STANDARD(1, "STANDARD");

    private final int id;
    private final String name;

    EnumPrintOption(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
