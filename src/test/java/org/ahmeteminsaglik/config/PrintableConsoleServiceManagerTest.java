package org.ahmeteminsaglik.config;

import org.ahmeteminsaglik.printable.EnumPrintOption;
import org.ahmeteminsaglik.printable.abstracts.PrintableConsoleService;
import org.junit.jupiter.api.Test;

class PrintableConsoleServiceManagerTest {

    private static PrintableConsoleService ps = new PrintableConsoleServiceManager();

    @Test
    void printText() {
        printIDE();
        printCMD();
        printStandard();
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
        System.out.println(ps.getInfoColor("INFO test"));
        System.out.println(ps.getSuccessColor("Success test"));
        System.out.println(ps.getWarningColor("Warning test"));
        System.out.println(ps.getCancelColor("Cancel test"));
        System.out.println(ps.getErrorColor("Error test"));
        System.out.println("----------------");

    }


}