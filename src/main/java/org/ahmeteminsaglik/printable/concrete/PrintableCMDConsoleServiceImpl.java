package org.ahmeteminsaglik.printable.concrete;

import org.ahmeteminsaglik.printable.abstracts.PrintableConsoleService;
import org.ahmeteminsaglik.utility.ConsoleColors;
import org.fusesource.jansi.Ansi;
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

    @Override
    public String getInfoColor(String msg) {
//        return ConsoleColors.RED_BRIGHT + msg + PrintTextColorConfiguration.getIdeResetColor();
        return ansi().fg(Ansi.Color.CYAN).a(msg).reset() + "";
    }

    @Override
    public String getSuccessColor(String msg) {
        return ansi().fg(Ansi.Color.GREEN).a(msg).reset() + "";
    }

    @Override
    public String getCancelColor(String msg) {
        return ansi().fg(Ansi.Color.YELLOW).a(msg).reset() + "";
    }

    @Override
    public String getWarningColor(String msg) {
        return ansi().fg(Ansi.Color.MAGENTA).a(msg).reset() + "";
    }

    @Override
    public String getErrorColor(String msg) {
        return ansi().fg(Ansi.Color.RED).a(msg).reset() + "";
    }

}
