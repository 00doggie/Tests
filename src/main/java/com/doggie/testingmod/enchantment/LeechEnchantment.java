package com.doggie.testingmod.enchantment;

import com.mojang.realmsclient.util.JsonUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import java.math.*;

public class LeechEnchantment extends Enchantment {

    public LeechEnchantment(Rarity rarity, EnchantmentCategory category, EquipmentSlot... slot) {
        super(rarity, category, slot);
    }
    public void reset(){
        float healPlayer = 0;
    }

    @Override
    public void doPostAttack(LivingEntity attacker, Entity target, int eLevel){
        if(!attacker.level.isClientSide){
            ServerLevel serverLevel = ((ServerLevel) attacker.level);
       float healPlayer = attacker.getLastHurtMobTimestamp() * 0.5F ;

            if (eLevel>0){
                attacker.heal(healPlayer);
                reset();


            }
            System.out.println(healPlayer);
        }
        super.doPostAttack(attacker, target, eLevel);

    }


    @Override
    public int getMaxLevel(){
        return 1;
    }
}
