package org.ahmeteminsaglik.printable.concrete;

import org.ahmeteminsaglik.printable.abstracts.PrintableService;

public class PrintableServiceImplSTANDARD implements PrintableService {
    @Override
    public String getColorfulText(String msg) {
        return msg;
    }
}
