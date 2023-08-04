package zzc.ui;

import arc.assets.Loadable;
import uwu.ui.dialogs.About.MainMenu;

public class ZHXSUI implements Loadable {

    public MainMenu mainMenu;

    public void init() {
        mainMenu = new MainMenu();
        mainMenu.build();
    }
}
