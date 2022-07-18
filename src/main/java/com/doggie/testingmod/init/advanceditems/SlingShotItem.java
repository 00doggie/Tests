package com.doggie.testingmod.init.advanceditems;

import com.doggie.testingmod.init.ItemInit;
import com.doggie.testingmod.init.SlingShotAmmoItem;
import net.minecraft.tags.ItemTags;

import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;

import java.util.function.Predicate;

public class SlingShotItem extends BowItem {
    public SlingShotItem(Properties p_40660_) {
        super(p_40660_);
    }




    public int getDefaultProjectileRange() {
        return 15;
    }

    @Override
    public AbstractArrow customArrow(AbstractArrow slingshotAmmo) {
        return slingshotAmmo;
    }

    public static final Predicate<ItemStack> ROCK_ONLY = (p_43017_) -> {

        return p_43017_.is(ItemInit.SLINGSHOT_AMMO.get());
    };

    public Predicate<ItemStack> getAllSupportedProjectiles() {
        return ROCK_ONLY;
    }



}
