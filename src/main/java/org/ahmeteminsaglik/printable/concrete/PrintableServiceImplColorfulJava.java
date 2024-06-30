package org.ahmeteminsaglik.printable.concrete;

import org.ahmeteminsaglik.printable.abstracts.PrintableService;

public class PrintableServiceImplColorfulJava implements PrintableService {
    @Override
    public String getColorfulText(String msg) {
        return PrintTextColorConfiguration.getIdeColor() + msg + PrintTextColorConfiguration.getIdeResetColor();
    }
}
