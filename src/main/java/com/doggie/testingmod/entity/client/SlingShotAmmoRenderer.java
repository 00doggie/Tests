package com.doggie.testingmod.entity.client;

import com.doggie.testingmod.TestingMod;
import com.doggie.testingmod.init.advanceditems.SlingshotAmmo;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SlingShotAmmoRenderer extends ArrowRenderer<SlingshotAmmo> {
    public SlingShotAmmoRenderer(EntityRendererProvider.Context p_173917_) {
        super(p_173917_);
    }



    @Override
    public ResourceLocation getTextureLocation(SlingshotAmmo p_114482_) {
        Item referenceItem = p_114482_.getPickResult().getItem();
        return new ResourceLocation(TestingMod.MOD_ID, "textures/entity/sling_shot/rock" + referenceItem.getRegistryName().getPath()+ ".png");
    }
}
