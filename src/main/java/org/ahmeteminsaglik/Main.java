package org.ahmeteminsaglik;


import org.ahmeteminsaglik.config.PrintServiceConfig;
import org.ahmeteminsaglik.config.PrintableServiceManager;
import org.ahmeteminsaglik.printable.EnumPrintOption;
import org.ahmeteminsaglik.printable.abstracts.PrintableService;
import org.ahmeteminsaglik.utility.ConsoleColors;
import org.fusesource.jansi.Ansi;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static PrintableService ps = new PrintableServiceManager();


    public static void main(String[] args) {

        PrintServiceConfig.setIdeColor(ConsoleColors.BLUE_BRIGHT);
//        PrintServiceConfig.setIdeResetColor(ConsoleColors.CYAN); For d
        PrintServiceConfig.setCmdColor(Ansi.Color.CYAN);
        String exampleText = "This is an example text to print random characters colorful...";
        PrintServiceConfig.updatePrintableService(EnumPrintOption.JAVA_IDE);
        System.out.println(ps.getColorfulText(EnumPrintOption.JAVA_IDE + " IS ACTIVATED:"));
        printJavaIDE(exampleText);
        System.out.println("----------------------");

        PrintServiceConfig.updatePrintableService(EnumPrintOption.WINDOWS_CMD);
        System.out.println(ps.getColorfulText(EnumPrintOption.WINDOWS_CMD + " IS ACTIVATED:"));
        printWindowsCMD(exampleText);
        System.out.println("----------------------");

        PrintServiceConfig.updatePrintableService(EnumPrintOption.STANDARD);
        System.out.println(ps.getColorfulText(EnumPrintOption.STANDARD + " IS ACTIVATED:"));
        printStandard(exampleText);
        System.out.println("----------------------");

        System.out.println("All 3 Colorful Printing types are printed above.\nExiting the program...");
    }

    private static void printJavaIDE(String text) {
        PrintServiceConfig.updatePrintableService(EnumPrintOption.JAVA_IDE);
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
        PrintServiceConfig.updatePrintableService(EnumPrintOption.WINDOWS_CMD);
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
        PrintServiceConfig.updatePrintableService(EnumPrintOption.STANDARD);
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