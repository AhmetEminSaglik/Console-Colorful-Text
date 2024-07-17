package org.ahmeteminsaglik.printable.concrete;

import org.ahmeteminsaglik.printable.abstracts.PrintableConsoleService;
import org.ahmeteminsaglik.utility.ConsoleColors;

public class PrintableJavaIDEConsoleServiceImpl implements PrintableConsoleService {
    @Override
    public String getColorfulText(String msg) {
        return PrintTextColorConfiguration.getIdeColor() + msg + PrintTextColorConfiguration.getIdeResetColor();
    }

    @Override
    public String getInfoColor(String msg) {
        return ConsoleColors.BLUE_BRIGHT + msg + PrintTextColorConfiguration.getIdeResetColor();
    }

    @Override
    public String getSuccessColor(String msg) {
        return ConsoleColors.GREEN_BRIGHT + msg + PrintTextColorConfiguration.getIdeResetColor();
    }

    @Override
    public String getCancelColor(String msg) {
        return ConsoleColors.YELLOW_BRIGHT + msg + PrintTextColorConfiguration.getIdeResetColor();
    }

    @Override
    public String getWarningColor(String msg) {
        return ConsoleColors.PURPLE_BRIGHT + msg + PrintTextColorConfiguration.getIdeResetColor();
    }

    @Override
    public String getErrorColor(String msg) {
        return ConsoleColors.RED_BRIGHT + msg + PrintTextColorConfiguration.getIdeResetColor();
    }
}
