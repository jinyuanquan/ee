package betterscreenshot;

import arc.Events;
import betterscreenshot.features.BetterScreenShotFeature;
import mindustry.game.EventType;
import mindustry.gen.Icon;
import mindustry.mod.Mod;

import static mindustry.Vars.ui;

public class BetterScreenShotMod extends Mod {

    private static boolean settingsAdded;

    @Override
    public void init() {
        BetterScreenShotFeature.init();

        Events.on(EventType.ClientLoadEvent.class, e -> {
            if (settingsAdded) return;
            settingsAdded = true;
            ui.settings.addCategory("@settings.betterscreenshot", Icon.map, BetterScreenShotFeature::buildSettings);
        });
    }
}
