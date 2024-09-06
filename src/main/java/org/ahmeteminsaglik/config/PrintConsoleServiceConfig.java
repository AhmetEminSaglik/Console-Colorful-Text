package org.ahmeteminsaglik.config;

import org.ahmeteminsaglik.printable.EnumPrintOption;
import org.ahmeteminsaglik.printable.abstracts.PrintableConsoleService;
import org.ahmeteminsaglik.printable.concrete.PrintTextColorConfiguration;
import org.ahmeteminsaglik.printable.concrete.PrintableCMDConsoleServiceImpl;
import org.ahmeteminsaglik.printable.concrete.PrintableJavaIDEConsoleServiceImpl;
import org.ahmeteminsaglik.printable.concrete.PrintableStandardConsoleServiceImpl;
import org.fusesource.jansi.Ansi;

public class PrintConsoleServiceConfig {
    private static PrintableConsoleService printableConsoleService = new PrintableJavaIDEConsoleServiceImpl();

    public static void updatePrintableService(EnumPrintOption enumPrintOption) {
        switch (enumPrintOption) {
            case JAVA_IDE:
                updatePrintableService(new PrintableJavaIDEConsoleServiceImpl());
                break;
            case WINDOWS_CMD:
                updatePrintableService(new PrintableCMDConsoleServiceImpl());
                break;
            case STANDARD:
                updatePrintableService(new PrintableStandardConsoleServiceImpl());
                break;
            default:
                System.out.println("Invalid input. Processing with " + printableConsoleService.getClass().getSimpleName());
        }
    }

    private static void updatePrintableService(PrintableConsoleService newPrintableConsoleService) {
        printableConsoleService.destroy();
        printableConsoleService = newPrintableConsoleService;
        printableConsoleService.initialize();
    }

    public static PrintableConsoleService getPrintableService() {
        return printableConsoleService;
    }


    public static void setIdeColor(String color) {
        PrintTextColorConfiguration.setIdeColor(color);
    }

    public static void setIdeResetColor(String color) {
        PrintTextColorConfiguration.setIdeResetColor(color);
    }

    public static void setCmdColor(Ansi.Color color) {
        PrintTextColorConfiguration.setCmdColor(color);
    }
}
