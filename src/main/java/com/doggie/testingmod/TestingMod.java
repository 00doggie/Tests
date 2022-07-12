package com.doggie.testingmod;

import com.doggie.testingmod.entity.ModEntityTypes;
import com.doggie.testingmod.entity.client.GermanShepardRenderer;
import com.doggie.testingmod.entity.client.TestingModClient;
import com.doggie.testingmod.init.BlockInit;
import com.doggie.testingmod.init.ItemInit;
//import com.doggie.testingmod.init.ModScreens;
import com.doggie.testingmod.init.advanceditems.LongSwordItem;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import software.bernie.geckolib3.GeckoLib;

@Mod( "testingmod")

public class TestingMod {


    public static String MOD_ID = "testingmod";

    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab(MOD_ID) {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.RUBY.get());
        }
    };

    public  TestingMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);



        ModEntityTypes.register(bus);
        GeckoLib.initialize();

        bus.addListener(TestingMod::clientSetup);


        MinecraftForge.EVENT_BUS.register(bus);
        MinecraftForge.EVENT_BUS.register(LongSwordItem.attackRangeAttributeModifier);

        if (FMLEnvironment.dist == Dist.CLIENT) {
            TestingModClient.subscribeClientEvents();
        }


    }



    private static void clientSetup(final FMLClientSetupEvent event) {

        EntityRenderers.register(ModEntityTypes.GERMAN_SHEPARD.get(), GermanShepardRenderer::new);
        EntityRenderers.register(ModEntityTypes.ROCK.get(), ThrownItemRenderer::new);




    }


}



