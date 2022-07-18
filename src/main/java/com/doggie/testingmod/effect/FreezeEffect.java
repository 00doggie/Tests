package com.doggie.testingmod.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class FreezeEffect extends MobEffect {
  public FreezeEffect(MobEffectCategory category, int color) {
        super(category, color);
    }
    public void applyEffectTick(LivingEntity entity, int amp) {
      if (!entity.level.isClientSide){
          Double x = entity.getX();
          Double y = entity.getY();
          Double z = entity.getZ();
          entity.teleportTo(x,y,z);
          entity.setDeltaMovement(0,0,0);
      }
      super.applyEffectTick(entity, amp);
    }
    @Override
    public boolean isDurationEffectTick(int duration, int amp){
      return true;
    }



}
