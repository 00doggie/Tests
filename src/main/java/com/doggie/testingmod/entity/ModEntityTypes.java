package com.doggie.testingmod.entity;

import com.doggie.testingmod.TestingMod;
import com.doggie.testingmod.init.advanceditems.Rock;
import com.doggie.testingmod.init.advanceditems.RubyShieldItem;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, TestingMod.MOD_ID);

    public static final RegistryObject<EntityType<GermanShepardEntity>> GERMAN_SHEPARD =
            ENTITY_TYPES.register("german_shepard",
                    () -> EntityType.Builder.of(GermanShepardEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(TestingMod.MOD_ID, "german_shepard").toString()));

    public static final RegistryObject<EntityType<Rock>> ROCK =
            ENTITY_TYPES.register("rock",
                    () -> EntityType.Builder.of(Rock::new, MobCategory.MISC).sized(0.25F, 0.25F).updateInterval(4).clientTrackingRange(10)
                    .build(new ResourceLocation(TestingMod.MOD_ID, "rock").toString()));




    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

