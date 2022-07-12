package com.doggie.testingmod.events;

import com.doggie.testingmod.entity.GermanShepardEntity;
import com.doggie.testingmod.entity.ModEntityTypes;
import com.doggie.testingmod.init.advanceditems.Rock;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "testingmod", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.GERMAN_SHEPARD.get(), GermanShepardEntity.createAttributes().build());


    }



}

