package com.doggie.testingmod.entity.client;

import com.doggie.testingmod.TestingMod;
import com.doggie.testingmod.init.ItemInit;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class TestingModClient {

    public static void subscribeClientEvents() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(TestingModClient::onClientSetup);


    }

    public static void onClientSetup(FMLClientSetupEvent event) {
        {



    }
    ItemProperties.register(
            ItemInit.RUBY_SHIELD.get(),
            new ResourceLocation("blocking"),
                (itemStack, world, livingEntity, integer) ->
    livingEntity != null &&
            livingEntity.isUsingItem() &&
            livingEntity.getUseItem() == itemStack ? 1.0F : 0.0F
            );
}
    }
