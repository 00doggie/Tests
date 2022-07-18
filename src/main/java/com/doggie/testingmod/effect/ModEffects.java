package com.doggie.testingmod.effect;

import com.doggie.testingmod.TestingMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TestingMod.MOD_ID);

    public static RegistryObject<MobEffect> FREEZE = MOB_EFFECTS.register("freeze",
            () -> new FreezeEffect(MobEffectCategory.HARMFUL, 321467));

    public void register(IEventBus bus){
        MOB_EFFECTS.register(bus);
    }
}
