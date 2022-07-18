package com.doggie.testingmod.init;
import com.doggie.testingmod.TestingMod;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.ClientRegistry;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import javax.swing.text.JTextComponent;
import java.awt.event.KeyEvent;

@OnlyIn(Dist.CLIENT)
public class KeybindsInit {
    public static KeyMapping exampleKey;

    public static void register(final FMLClientSetupEvent event) {
        exampleKey = create("example_key", KeyEvent.VK_G);

        ClientRegistry.registerKeyBinding(exampleKey);
    }

    private static KeyMapping create(String name, int key) {
        return new KeyMapping("key." + TestingMod.MOD_ID + "." + name, key, "key.category." + TestingMod.MOD_ID);
    }
}
