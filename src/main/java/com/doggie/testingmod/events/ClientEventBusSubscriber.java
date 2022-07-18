package com.doggie.testingmod.events;

import com.doggie.testingmod.entity.ModEntityTypes;
import com.doggie.testingmod.entity.client.SlingShotAmmoRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = "testingmod", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(ModEntityTypes.SLINGSHOT_AMMO.get(), SlingShotAmmoRenderer::new);

    }
}
