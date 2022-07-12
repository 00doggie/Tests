package com.doggie.testingmod.init.advanceditems;

import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import com.doggie.testingmod.init.ItemInit;
import com.google.common.base.Suppliers;

import com.google.common.collect.ImmutableMultimap;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.fml.common.Mod;
import java.util.UUID;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = "testingmod")
public class LongSwordItem extends SwordItem {
    private Item self()
    {
        return (Item) this;
    }

    public static final AttributeModifier attackRangeAttributeModifier =
            new AttributeModifier(UUID.fromString("44e2b427-e7f3-452c-84d6-c5bdd865d27d"), "Range modifier", 2,
                    AttributeModifier.Operation.ADDITION);

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
        return self().getDefaultAttributeModifiers(slot);
    }

    private static final Supplier<Multimap<Attribute, AttributeModifier>> attackRangeModifier = Suppliers.memoize(() ->

            ImmutableMultimap.of(ForgeMod.ATTACK_RANGE.get(), attackRangeAttributeModifier)
    );

    public LongSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }


    @SubscribeEvent
    public static void holdingLongSwordIncreasesRange(LivingEvent.LivingUpdateEvent event) {
        if (!(event.getEntity() instanceof Player))
            return;



        Player player = (Player) event.getEntityLiving();
        if (player.isHolding(ItemInit.LONG_SWORD.get())) {
            player.getAttributes()
                    .addTransientAttributeModifiers(attackRangeModifier.get());
        }if (!player.isHolding(ItemInit.LONG_SWORD.get())) {
            player.getAttributes()
                    .removeAttributeModifiers(attackRangeModifier.get());
        }
        return;

    }
}
