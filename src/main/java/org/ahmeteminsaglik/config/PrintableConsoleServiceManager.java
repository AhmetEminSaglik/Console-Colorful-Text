package org.ahmeteminsaglik.config;

import org.ahmeteminsaglik.printable.abstracts.PrintableConsoleService;

public class PrintableConsoleServiceManager implements PrintableConsoleService {
    @Override
    public String getColorfulText(String msg) {
        return PrintConsoleServiceConfig.getPrintableService().getColorfulText(msg);
    }
}
