package com.doggie.testingmod.enchantment;

import com.doggie.testingmod.effect.FreezeEffect;
import com.doggie.testingmod.effect.ModEffects;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentHelper;

public class FreezeEnchantment extends Enchantment {

    public FreezeEnchantment(Rarity rarity, EnchantmentCategory category, EquipmentSlot... slot) {
        super(rarity, category, slot);
    }

    @Override
    public void doPostAttack( LivingEntity player, Entity target,int eLevel){
        if(!player.level.isClientSide){
            ServerLevel serverLevel = ((ServerLevel) target.level);
            if ( eLevel >0 && target instanceof LivingEntity livingEntity ) {
                livingEntity.addEffect(new MobEffectInstance(ModEffects.FREEZE.get(), 80, 1));
            }
        }
        super.doPostAttack(player, target, eLevel);
    }

    @Override
    public int getMaxLevel(){
        return 1;
    }
}


