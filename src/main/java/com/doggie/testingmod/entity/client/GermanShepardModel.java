package com.doggie.testingmod.entity.client;

import com.doggie.testingmod.TestingMod;
import com.doggie.testingmod.entity.GermanShepardEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GermanShepardModel extends AnimatedGeoModel<GermanShepardEntity> {
    @Override
    public ResourceLocation getModelLocation(GermanShepardEntity object) {
        return new ResourceLocation(TestingMod.MOD_ID, "geo/wolf_test.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GermanShepardEntity object) {
        return new ResourceLocation(TestingMod.MOD_ID, "textures/entity/test_wolf/test_wolf.png");
    }


    @Override
    public ResourceLocation getAnimationFileLocation(GermanShepardEntity animatable) {
        return new ResourceLocation(TestingMod.MOD_ID, "animations/test_wolf.animation.json");
    }
}
