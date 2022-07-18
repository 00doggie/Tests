
package com.doggie.testingmod.client.gui;

import com.doggie.testingmod.entity.GermanShepardEntity;
import com.doggie.testingmod.world.inventory.TrainingStickMenu;

import com.google.common.collect.Lists;

import net.minecraft.client.gui.components.AbstractButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Widget;


import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.Containers;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;
import java.util.HashMap;
import java.util.List;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraftforge.client.gui.widget.ExtendedButton;


public class TrainingStickScreen extends  AbstractContainerScreen<TrainingStickMenu> implements Widget {
    private final static HashMap<String, Object> guistate = TrainingStickMenu.guistate;
    private final Level world;
    private final int x, y, z;
    private final Player entity;
   public static  ExtendedButton testButton;
    public static Integer health;



    public TrainingStickScreen(TrainingStickMenu container, Inventory inventory, Component text) {
        super(container, inventory, text);
        this.world = container.world;
        this.x = container.x;
        this.y = container.y;
        this.z = container.z;
        this.entity = container.entity;
        this.imageWidth = 176;
        this.imageHeight = 166;




    }


    private static final ResourceLocation texture = new ResourceLocation("testingmod:textures/gui/test_gui.png");



    @Override
    public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(ms);
        super.render(ms, mouseX, mouseY, partialTicks);
        this.renderTooltip(ms, mouseX, mouseY);
    }

    @Override
    protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
        RenderSystem.setShaderColor(1, 1, 1, 1);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderTexture(0, texture);

        this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        RenderSystem.disableBlend();
    }


    @Override
    public boolean keyPressed(int key, int b, int c) {
        if (key == 256) {
            this.minecraft.player.closeContainer();
            return true;
        }
        return super.keyPressed(key, b, c);
    }

    @Override
    public void containerTick() {
        super.containerTick();
    }

    @Override
    protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
        this.font.draw(poseStack, "" + (entity.getPersistentData().getString("name")) + "", 7, 7, -12829636);
    }

    @Override
    public void onClose() {
        super.onClose();
        Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
    }


    @Override
    public void init() {

        super.init();
        this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
        testButton = addRenderableWidget(
                new ExtendedButton(this.leftPos + 143, this.topPos + 48, 9, 9, new IncreaseSkill(health++),
                        btn -> Minecraft.getInstance().player.displayClientMessage(new TextComponent(health.toString()), false)));
        testButton = addRenderableWidget(
                new ExtendedButton(this.leftPos + 143, this.topPos + 66, 9, 9, new IncreaseSkill(health++),
                        btn -> Minecraft.getInstance().player.displayClientMessage(new TextComponent(health.toString()), false)));
        testButton = addRenderableWidget(
                new ExtendedButton(this.leftPos + 143, this.topPos + 83, 9, 9, new IncreaseSkill(health++),
                        btn -> Minecraft.getInstance().player.displayClientMessage(new TextComponent(health.toString()), false)));


    }



    }


















