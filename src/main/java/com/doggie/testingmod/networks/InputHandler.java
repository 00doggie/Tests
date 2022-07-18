package com.doggie.testingmod.networks;

import com.doggie.testingmod.TestingMod;
import com.doggie.testingmod.init.KeybindsInit;
import com.doggie.testingmod.networks.packets.InputMessage;
import com.doggie.testingmod.networks.packets.PacketHandler;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "testingmod", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class InputHandler {

    @SubscribeEvent
    public static void onKeyPress(InputEvent.KeyInputEvent event) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level == null) return;
        onInput(mc, event.getKey(), event.getAction());
    }

    @SubscribeEvent
    public static void onMouseClick(InputEvent.MouseInputEvent event) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level == null) return;
        onInput(mc, event.getButton(), event.getAction());
    }

    private static void onInput(Minecraft mc, int key, int action) {
        if (mc.screen == null && KeybindsInit.exampleKey.isDown()) {
            PacketHandler.CHANNEL.sendToServer(new InputMessage(key));
        }
    }
}
