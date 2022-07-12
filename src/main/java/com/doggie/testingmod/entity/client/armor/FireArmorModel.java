package com.doggie.testingmod.entity.client.armor;

import com.doggie.testingmod.TestingMod;
import com.doggie.testingmod.init.advanceditems.FireArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FireArmorModel extends AnimatedGeoModel<FireArmorItem> {
    @Override
    public ResourceLocation getModelLocation(FireArmorItem object) {
        return new ResourceLocation(TestingMod.MOD_ID, "geo/fire_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(FireArmorItem object) {
        return new ResourceLocation(TestingMod.MOD_ID, "textures/models/armor/fire_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(FireArmorItem animatable) {
        return new ResourceLocation(TestingMod.MOD_ID, "animations/fire_armor.animation.json");
    }
}
