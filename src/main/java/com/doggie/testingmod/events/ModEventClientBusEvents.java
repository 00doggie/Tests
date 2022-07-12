package com.doggie.testingmod.events;

import com.doggie.testingmod.TestingMod;
import com.doggie.testingmod.entity.client.armor.FireArmorRenderer;
import com.doggie.testingmod.init.advanceditems.FireArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

@Mod.EventBusSubscriber(modid = "testingmod", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(FireArmorItem.class, new FireArmorRenderer());

    }
}
