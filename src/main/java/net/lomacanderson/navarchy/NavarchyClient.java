package net.lomacanderson.navarchy;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.lomacanderson.navarchy.client.NavarchyHudOverlay;

public class NavarchyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HudRenderCallback.EVENT.register(new NavarchyHudOverlay());
    }
}
