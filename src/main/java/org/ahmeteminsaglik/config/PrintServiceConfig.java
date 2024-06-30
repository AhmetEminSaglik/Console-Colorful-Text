package org.ahmeteminsaglik.config;

import org.ahmeteminsaglik.printable.EnumPrintOption;
import org.ahmeteminsaglik.printable.abstracts.PrintableService;
import org.ahmeteminsaglik.printable.concrete.PrintTextColorConfiguration;
import org.ahmeteminsaglik.printable.concrete.PrintableServiceImplColorfulCMD;
import org.ahmeteminsaglik.printable.concrete.PrintableServiceImplColorfulJava;
import org.ahmeteminsaglik.printable.concrete.PrintableServiceImplSTANDARD;
import org.fusesource.jansi.Ansi;

public class PrintServiceConfig {
    private static PrintableService printableService = new PrintableServiceImplColorfulJava();

    public static void updatePrintableService(EnumPrintOption enumPrintOption) {
        switch (enumPrintOption) {
            case INTELLIJ_IDEA:
                updatePrintableService(new PrintableServiceImplColorfulJava());
                break;
            case WINDOWS_CMD:
                updatePrintableService(new PrintableServiceImplColorfulCMD());
                break;
            case STANDARD:
                updatePrintableService(new PrintableServiceImplSTANDARD());
                break;
            default:
                System.out.println("Invalid input. Processing with " + printableService.getClass().getSimpleName());
        }
    }

    private static void updatePrintableService(PrintableService newPrintableService) {
        printableService.destroy();
        printableService = newPrintableService;
        printableService.initialize();
    }

    public static PrintableService getPrintableService() {
        return printableService;
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
