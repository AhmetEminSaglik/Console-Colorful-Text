package org.ahmeteminsaglik.printable.concrete;

import org.ahmeteminsaglik.printable.abstracts.PrintableConsoleService;
import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.ansi;

public class PrintableCMDConsoleServiceImpl implements PrintableConsoleService {
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
