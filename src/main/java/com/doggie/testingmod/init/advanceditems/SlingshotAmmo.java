
package com.doggie.testingmod.init.advanceditems;

import com.doggie.testingmod.entity.ModEntityTypes;
import com.doggie.testingmod.init.ItemInit;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SlingshotAmmo extends AbstractArrow {

    private final Item referenceItem;
    public SlingshotAmmo(EntityType<? extends AbstractArrow> type, Level level) {
        super(type, level);
        this.referenceItem = ItemInit.SLINGSHOT_AMMO.get();

    }




    public SlingshotAmmo(LivingEntity shooter, Level level, Item referenceItem){
        super(ModEntityTypes.SLINGSHOT_AMMO.get(), shooter, level);
        this.referenceItem = referenceItem;
    }





    @Override
 public ItemStack getPickupItem() {
        return new ItemStack(this.referenceItem);
    }
}


