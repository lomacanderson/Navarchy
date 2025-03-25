package net.lomacanderson.navarchy.client;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.lomacanderson.navarchy.Navarchy;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;

public class NavarchyHudOverlay implements HudRenderCallback {
    private static final Identifier EXPAND = new Identifier(Navarchy.MOD_ID,
            "textures/arrows.png");
    @Override
    public void onHudRender(DrawContext drawContext, float v) {
        int x = 0;
        int y = 0;
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null) {
            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();

            x = width / 2;
            y = height;
        }

        drawContext.drawTexture(EXPAND, x * 2 - 20, y / 2, 0, 0, 16, 16, 16, 16);

    }
}