package com.doggie.testingmod.world;

import com.doggie.testingmod.TestingMod;
import com.doggie.testingmod.world.feature.ore.GenerateOres;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "testingmod")
public class WorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        GenerateOres.generateOres(event);


    }
}

