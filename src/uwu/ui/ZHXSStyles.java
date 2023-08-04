package uwu.ui;

import arc.scene.ui.Button;
import mindustry.gen.Tex;

import static mindustry.gen.Tex.*;

public class ZHXSStyles {

    public static Button.ButtonStyle underline;

    public static void load() {
        underline = new Button.ButtonStyle(){{
            up = Tex.underline;
            down = underlineWhite;
            over = underlineOver;
        }};
    }
}
