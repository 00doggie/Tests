package com.doggie.testingmod.entity.client;

import com.doggie.testingmod.TestingMod;
import com.doggie.testingmod.entity.GermanShepardEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GermanShepardRenderer extends GeoEntityRenderer<GermanShepardEntity> {
    public GermanShepardRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GermanShepardModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(GermanShepardEntity instance) {
        return new ResourceLocation(TestingMod.MOD_ID, "textures/entity/test_wolf/test_wolf.png");
    }

    @Override
    public RenderType getRenderType(GermanShepardEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.1F, 1.1F, 1.1F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
