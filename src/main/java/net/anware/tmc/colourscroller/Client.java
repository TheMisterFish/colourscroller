package net.anware.tmc.colourscroller;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer {

    public static final String ID = "colourscroller";

    @Override
    public void onInitializeClient() {
        Settings.reg();
    }
}