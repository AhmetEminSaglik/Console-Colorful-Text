package org.ahmeteminsaglik.printable.concrete;

import org.ahmeteminsaglik.printable.abstracts.PrintableService;
import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.ansi;

public class PrintableServiceImplColorfulCMD implements PrintableService {
    @Override
    public void initialize() {
        AnsiConsole.systemInstall();
    }

    @Override
    public void destroy() {
        AnsiConsole.systemUninstall();
    }

    @Override
    public String getColorfulText(String msg) {
        return ansi().fg(PrintTextColorConfiguration.getCmdColor()).a(msg).reset() + "";
    }
}
