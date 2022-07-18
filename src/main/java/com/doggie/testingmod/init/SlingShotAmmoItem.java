package com.doggie.testingmod.init;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SlingShotAmmoItem extends ArrowItem {
    public final float damage;
    public SlingShotAmmoItem(Properties p_40512_, float damage) {
        super(p_40512_);
        this.damage = damage;
    }
    @Override
    public AbstractArrow createArrow(Level p_40513_, ItemStack p_40514_, LivingEntity p_40515_) {
        Arrow arrow = new Arrow(p_40513_, p_40515_);
        arrow.setEffectsFromItem(p_40514_);
        return arrow;
    }

}

