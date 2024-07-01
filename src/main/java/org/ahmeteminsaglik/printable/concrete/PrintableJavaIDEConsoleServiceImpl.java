package org.ahmeteminsaglik.printable.concrete;

import org.ahmeteminsaglik.printable.abstracts.PrintableConsoleService;

public class PrintableJavaIDEConsoleServiceImpl implements PrintableConsoleService {
    @Override
    public String getColorfulText(String msg) {
        return PrintTextColorConfiguration.getIdeColor() + msg + PrintTextColorConfiguration.getIdeResetColor();
    }
}
