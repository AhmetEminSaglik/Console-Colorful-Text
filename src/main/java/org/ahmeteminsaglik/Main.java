package org.ahmeteminsaglik;

import org.ahmeteminsaglik.config.PrintConsoleServiceConfig;
import org.ahmeteminsaglik.config.PrintableConsoleServiceManager;
import org.ahmeteminsaglik.printable.EnumPrintOption;
import org.ahmeteminsaglik.printable.abstracts.PrintableConsoleService;

public class Main {
    private static PrintableConsoleService ps = new PrintableConsoleServiceManager();

    public static void main(String[] args) {
        printIDE();
        printStandard();
        printCMD();
    }
    private static void printIDE() {
        System.out.println("IDE ");
        PrintConsoleServiceConfig.updatePrintableService(EnumPrintOption.JAVA_IDE);
        printTest();
    }

    private static void printCMD() {
        System.out.println("WINDOWS_CMD ");
        PrintConsoleServiceConfig.updatePrintableService(EnumPrintOption.WINDOWS_CMD);
        printTest();
    }

    private static void printStandard() {
        System.out.println("STANDARD ");
        PrintConsoleServiceConfig.updatePrintableService(EnumPrintOption.STANDARD);
        printTest();
    }

    private static void printTest() {
        System.out.println(ps.getInfoColor("1-) INFO test"));
        System.out.println(ps.getSuccessColor("2-) Success test"));
        System.out.println(ps.getWarningColor("3-) Warning test"));
        System.out.println(ps.getCancelColor("4-) Cancel test"));
        System.out.println(ps.getErrorColor("5-) Error test"));
        System.out.println("----------------");
    }

}
