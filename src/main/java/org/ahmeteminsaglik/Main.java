package org.ahmeteminsaglik;


import org.ahmeteminsaglik.config.PrintConsoleServiceConfig;
import org.ahmeteminsaglik.config.PrintableConsoleServiceManager;
import org.ahmeteminsaglik.printable.EnumPrintOption;
import org.ahmeteminsaglik.printable.abstracts.PrintableConsoleService;
import org.ahmeteminsaglik.utility.ConsoleColors;
import org.fusesource.jansi.Ansi;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static PrintableConsoleService ps = new PrintableConsoleServiceManager();


    public static void main(String[] args) {

        PrintConsoleServiceConfig.setIdeColor(ConsoleColors.BLUE_BRIGHT);
//        PrintConsoleServiceConfig.setIdeResetColor(ConsoleColors.CYAN); For d
        PrintConsoleServiceConfig.setCmdColor(Ansi.Color.CYAN);
        String exampleText = "This is an example text to print random characters colorful...";
        PrintConsoleServiceConfig.updatePrintableService(EnumPrintOption.JAVA_IDE);
        System.out.println(ps.getColorfulText(EnumPrintOption.JAVA_IDE + " IS ACTIVATED:"));
        printJavaIDE(exampleText);
        System.out.println("----------------------");

        PrintConsoleServiceConfig.updatePrintableService(EnumPrintOption.WINDOWS_CMD);
        System.out.println(ps.getColorfulText(EnumPrintOption.WINDOWS_CMD + " IS ACTIVATED:"));
        printWindowsCMD(exampleText);
        System.out.println("----------------------");

        PrintConsoleServiceConfig.updatePrintableService(EnumPrintOption.STANDARD);
        System.out.println(ps.getColorfulText(EnumPrintOption.STANDARD + " IS ACTIVATED:"));
        printStandard(exampleText);
        System.out.println("----------------------");

        System.out.println("All 3 Colorful Printing types are printed above.\nExiting the program...");
    }

    private static void printJavaIDE(String text) {
        PrintConsoleServiceConfig.updatePrintableService(EnumPrintOption.JAVA_IDE);
        Random random = new Random();
        String colorText = "";
        for (int i = 0; i < text.length(); i++) {
            int val = random.nextInt(2);
            if (val == 1) {
                colorText += updateColorOfCharForIDE(text.charAt(i));
            } else {
                colorText += (text.charAt(i));
            }

        }
        System.out.println(colorText);
    }

    private static void printWindowsCMD(String text) {
        PrintConsoleServiceConfig.updatePrintableService(EnumPrintOption.WINDOWS_CMD);
        Random random = new Random();
        String colorText = "";
        for (int i = 0; i < text.length(); i++) {
            int val = random.nextInt(2);
            if (val == 1) {
                colorText += updateColorOfCharForIDE(text.charAt(i));
            } else {
                colorText += (text.charAt(i));
            }

        }
        System.out.println(colorText);
    }

    private static void printStandard(String text) {
        PrintConsoleServiceConfig.updatePrintableService(EnumPrintOption.STANDARD);
        Random random = new Random();
        String colorText = "";
        for (int i = 0; i < text.length(); i++) {
            int val = random.nextInt(2);
            if (val == 1) {
                colorText += updateColorOfCharForIDE(text.charAt(i));
            } else {
                colorText += (text.charAt(i));
            }

        }
        System.out.println(colorText);
    }

    private static String updateColorOfCharForIDE(char c) {
        return ps.getColorfulText(c + "");
    }

}