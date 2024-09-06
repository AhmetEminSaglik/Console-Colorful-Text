package org.ahmeteminsaglik.printable.concrete;

import org.ahmeteminsaglik.printable.abstracts.PrintableConsoleService;

public class PrintableStandardConsoleServiceImpl implements PrintableConsoleService {
    @Override
    public String getColorfulText(String msg) {
        return msg;
    }

    @Override
    public String getInfoColor(String msg) {
        return msg;
    }

    @Override
    public String getSuccessColor(String msg) {
        return msg;
    }

    @Override
    public String getCancelColor(String msg) {return msg;}

    @Override
    public String getWarningColor(String msg) {
        return msg;
    }

    @Override
    public String getErrorColor(String msg) {
        return msg;
    }
}
