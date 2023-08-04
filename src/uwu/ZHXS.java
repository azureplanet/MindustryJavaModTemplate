package uwu;

import arc.scene.style.Drawable;
import uwu.ui.ZHXSIcons;
import uwu.ui.ZHXSStyles;
import uwu.ui.ZHXSUI;

public class ZHXS {

    public static final String modName = "aughhhh";
    public static final String modDisplayName = "整活像素";
    public static final String modDisplayVersion = "Astable-v0.10";
    public static final double modVersion = 0.10;
    public static final Drawable modLogo = UwuMod.getModDrawable("dialog_logo");
    public static ZHXSUI ui;

    public static void init() {
        ZHXSStyles.load();
        ZHXSIcons.load();
        ui = new ZHXSUI();
        ui.init();
    }
    
    public static <T extends Drawable> T getModDrawable(String name){
        return Core.atlas.getDrawable(ZHXS.modName + "-" + name);
    }
}
