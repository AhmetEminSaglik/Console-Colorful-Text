package org.ahmeteminsaglik.printable.concrete;

import org.ahmeteminsaglik.printable.abstracts.PrintableConsoleService;

public class PrintableStandartConsoleServiceImpl implements PrintableConsoleService {
    @Override
    public String getColorfulText(String msg) {
        return msg;
    }
}
