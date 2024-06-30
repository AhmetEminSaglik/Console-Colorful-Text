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


        PrintServiceConfig.updatePrintableService(EnumPrintOption.INTELLIJ_IDEA);
        PrintServiceConfig.setIdeColor(ConsoleColors.BLUE_BRIGHT);
//        PrintServiceConfig.setIdeResetColor(ConsoleColors.CYAN);
        PrintServiceConfig.setCmdColor(Ansi.Color.CYAN);
        System.out.println("INTELLIJ_IDEA Print --> " + ps.getColorfulText("INTELLIJ_IDEA is activated"));

        PrintServiceConfig.updatePrintableService(EnumPrintOption.WINDOWS_CMD);
        System.out.println("CMD Print --> " + ps.getColorfulText("CMD is activated"));

        PrintServiceConfig.updatePrintableService(EnumPrintOption.STANDARD);
        System.out.println("STANDARD Print --> " + ps.getColorfulText("STANDARD is activated"));

//
        System.out.println("Text For IDE : ");
        String text = getText();

        Scanner scanner = new Scanner(System.in);
        int val = 0;
        while (val != -1) {
            System.out.println("0==INTELIJ/ 1==CMD / -1 -> exit");
            val = scanner.nextInt();
            if (val == -1) {
                System.out.println("Exitting from the program...");
                return;
            } else if (val % 2 == 0) {
                printIntelij(text);
            } else {
                printCMD(text);
            }
        }
    }

    private static void printIntelij(String text) {
        PrintServiceConfig.updatePrintableService(EnumPrintOption.INTELLIJ_IDEA);
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

    private static void printCMD(String text) {
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

    private static String updateColorOfCharForIDE(char c) {
        return ps.getColorfulText(c + "");
    }

    private static String getText() {
        return "Hello this is a random text to test random colorfulc character.\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
    }
}