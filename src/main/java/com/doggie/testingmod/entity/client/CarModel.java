package com.doggie.testingmod.entity.client;

import com.doggie.testingmod.TestingMod;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CarModel extends AnimatedGeoModel<CarEntity> {
    @Override
    public ResourceLocation getModelLocation(CarEntity object) {
        return new ResourceLocation(TestingMod.MOD_ID, "geo/wolf_test.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CarEntity object) {
        return new ResourceLocation(TestingMod.MOD_ID, "textures/entity/test_wolf/test_wolf.png");
    }


    @Override
    public ResourceLocation getAnimationFileLocation(CarEntity animatable) {
        return new ResourceLocation(TestingMod.MOD_ID, "animations/wolf.animations.json");
    }
}
