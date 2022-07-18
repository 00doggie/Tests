package com.doggie.testingmod.enchantment;

import com.doggie.testingmod.TestingMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static DeferredRegister<Enchantment> ENCHANTMENTS  = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TestingMod.MOD_ID);

        public static RegistryObject<Enchantment> LEECH = ENCHANTMENTS.register("leech",
                () -> new LeechEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> FREEZE = ENCHANTMENTS.register("freeze",
            () -> new FreezeEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));

    public static void register(IEventBus bus){
        ENCHANTMENTS.register(bus);

    }
}
