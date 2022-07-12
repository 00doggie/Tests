package com.doggie.testingmod.entity.client;

import com.doggie.testingmod.TestingMod;
import com.doggie.testingmod.init.advanceditems.FireArmorItem;
import com.doggie.testingmod.init.advanceditems.RubyShieldItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RubyShieldModel extends AnimatedGeoModel<RubyShieldItem> {
    @Override
    public ResourceLocation getModelLocation(RubyShieldItem object) {
        return new ResourceLocation(TestingMod.MOD_ID, "geo/ruby_shield.geo.json");

    }


    @Override
    public ResourceLocation getTextureLocation(RubyShieldItem object) {
        return new ResourceLocation(TestingMod.MOD_ID, "textures/entity/shield/texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(RubyShieldItem animatable) {
        return new ResourceLocation(TestingMod.MOD_ID, "animations/ruby_shield.animation.json");
    }


}
