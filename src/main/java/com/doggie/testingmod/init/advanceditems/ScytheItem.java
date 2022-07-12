package com.doggie.testingmod.init.advanceditems;



import com.doggie.testingmod.init.ItemInit;
import com.google.common.base.Suppliers;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import net.minecraft.world.entity.LivingEntity;


import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;




import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = "testingmod")
public class ScytheItem extends SwordItem {

    public ScytheItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {


        super(p_43269_, p_43270_, p_43271_, p_43272_);


    }



    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        attacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 2));
        //The one wielding the weapon. You.
        target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 2));







        // The one being hit by the weapon. the mob or another player.
        return super.hurtEnemy(stack, target, attacker);
    }

}









