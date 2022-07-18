package com.doggie.testingmod.init;

import com.doggie.testingmod.TestingMod;
import com.doggie.testingmod.entity.ModEntityTypes;
//import com.doggie.testingmod.init.advanceditems.TrainingStick;
import com.doggie.testingmod.entity.client.CarEntity;
import com.doggie.testingmod.init.advanceditems.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit {


    public static final DeferredRegister <Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestingMod.MOD_ID);

    //Items

    public static final RegistryObject<Item> RUBY = register("ruby",
            () -> new Item(new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));
    public static final RegistryObject<Item> ROCK = register("rock",
            () -> new RockItem(new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> TRAINING_STICK = register("training_stick",
            () -> new TrainingStickItem(new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));






    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.HEAD,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.CHEST,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.LEGS,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ArmorMaterials.RUBY, EquipmentSlot.FEET,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));





    public static final RegistryObject<Item> FIRE_HELMET = ITEMS.register("fire_helmet",
            () -> new FireArmorItem(ArmorMaterials.RUBY, EquipmentSlot.HEAD,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> FIRE_CHESTPLATE = ITEMS.register("fire_chestplate",
            () -> new FireArmorItem(ArmorMaterials.RUBY, EquipmentSlot.CHEST,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> FIRE_LEGGINGS = ITEMS.register("fire_leggings",
            () -> new FireArmorItem(ArmorMaterials.RUBY, EquipmentSlot.LEGS,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> FIRE_BOOTS = ITEMS.register("fire_boots",
            () -> new FireArmorItem(ArmorMaterials.RUBY, EquipmentSlot.FEET,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));


    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(Tiers.RUBY, 2, -2.8f,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RUBY_HAMMER = ITEMS.register("ruby_hammer",
            () -> new HammerItem(5, 2, Tiers.RUBY,TagKeyInit.Blocks.Hammer,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(Tiers.RUBY, 4, -2.4f,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> SCYTHE = ITEMS.register("scythe",
            () -> new ScytheItem(Tiers.RAGE, 4, -2.4f,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));


    public static final RegistryObject<Item> LONG_SWORD = ITEMS.register("long_sword",
            () -> new LongSwordItem(Tiers.RAGE, 4, -2.4f,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(Tiers.RUBY, 1f, -3f,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(Tiers.RUBY, -2, -1f,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));



    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(Tiers.RUBY, 7, -3.1f,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RUBY_SHIELD = ITEMS.register("ruby_shield",
            () -> new RubyShieldItem((new Item.Properties()).durability(336).tab(TestingMod.TUTORIAL_TAB)));

    public static final RegistryObject<Item> GERMAN_SHEPARD_SPAWN_EGG = ITEMS.register("german_shepard_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GERMAN_SHEPARD,0xb98349, 0x9e7347,
                    new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));
    public static final RegistryObject<Item> SLINGSHOT = ITEMS.register("slingshot",
            () -> new SlingShotItem(new Item.Properties().tab(TestingMod.TUTORIAL_TAB).durability(500)));

   public static final RegistryObject <Item> SLINGSHOT_AMMO = ITEMS.register("slingshot_ammo",
           () -> new SlingShotAmmoItem(new Item.Properties().tab(TestingMod.TUTORIAL_TAB), 1.5F));

public static final RegistryObject<Item> CAR = ITEMS.register("car",
        () ->   new MinecartItem(CarEntity.Type.RIDEABLE, new Item.Properties().tab(TestingMod.TUTORIAL_TAB)));



   





    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
        return ITEMS.register(name, item);
    }




}
