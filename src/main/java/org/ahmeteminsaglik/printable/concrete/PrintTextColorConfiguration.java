package org.ahmeteminsaglik.printable.concrete;

import org.ahmeteminsaglik.utility.ConsoleColors;
import org.fusesource.jansi.Ansi;

public class PrintTextColorConfiguration {
    static private String ideColor = ConsoleColors.GREEN;
    static private String ideResetColor = ConsoleColors.WHITE;
    static private Ansi.Color cmdColor = Ansi.Color.RED;

    public static void setIdeResetColor(String color) {
        ideResetColor = color;
    }

    public static String getIdeColor() {
        return ideColor;
    }

    public static void setIdeColor(String color) {
        ideColor = color;
    }

    public static String getIdeResetColor() {
        return ideResetColor;
    }

    public static Ansi.Color getCmdColor() {
        return cmdColor;
    }

    public static void setCmdColor(Ansi.Color color) {
        cmdColor = color;
    }

}
