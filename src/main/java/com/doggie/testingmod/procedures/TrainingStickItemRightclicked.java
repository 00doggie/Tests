package com.doggie.testingmod.procedures;


import com.doggie.testingmod.init.ItemInit;
import com.doggie.testingmod.world.inventory.TrainingStickMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;



import javax.annotation.Nullable;

import io.netty.buffer.Unpooled;


@Mod.EventBusSubscriber
public class TrainingStickItemRightclicked {
    @SubscribeEvent
    public static void onUseItem(PlayerInteractEvent.RightClickItem event) {

        ItemStack heldStack = event.getItemStack();
        if (event != null && event.getPlayer() != null && heldStack.getItem().equals(ItemInit.TRAINING_STICK.get()))   {
            execute(event, event.getPlayer().level, event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getPlayer());
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Player player) {
        execute(null, world, x, y, z, player);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        {
            if (entity instanceof ServerPlayer _ent) {
                BlockPos _bpos = new BlockPos(x, y, z);
                NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
                    @Override
                    public Component getDisplayName() {
                        return new TextComponent("TrainingStick");
                    }

                    @Override
                    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
                        return new TrainingStickMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
                    }
                }, _bpos);
            }
        }
    }
}

