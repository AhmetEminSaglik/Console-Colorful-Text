package org.ahmeteminsaglik.config;

import org.ahmeteminsaglik.printable.abstracts.PrintableConsoleService;

public class PrintableConsoleServiceManager implements PrintableConsoleService {
    @Override
    public String getColorfulText(String msg) {
        return PrintConsoleServiceConfig.getPrintableService().getColorfulText(msg);
    }

    @Override
    public String getInfoColor(String msg) {
        return PrintConsoleServiceConfig.getPrintableService().getInfoColor(msg);
    }

    @Override
    public String getSuccessColor(String msg) {
        return PrintConsoleServiceConfig.getPrintableService().getSuccessColor(msg);
    }

    @Override
    public String getCancelColor(String msg) {
        return PrintConsoleServiceConfig.getPrintableService().getCancelColor(msg);
    }

    @Override
    public String getWarningColor(String msg) {
        return PrintConsoleServiceConfig.getPrintableService().getWarningColor(msg);
    }

    @Override
    public String getErrorColor(String msg) {
        return PrintConsoleServiceConfig.getPrintableService().getErrorColor(msg);
    }
}
