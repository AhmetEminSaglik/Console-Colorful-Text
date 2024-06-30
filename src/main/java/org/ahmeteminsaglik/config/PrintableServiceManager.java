package org.ahmeteminsaglik.config;

import org.ahmeteminsaglik.printable.abstracts.PrintableService;

public class PrintableServiceManager implements PrintableService {
    @Override
    public String getColorfulText(String msg) {
        return PrintServiceConfig.getPrintableService().getColorfulText(msg);
    }
}
