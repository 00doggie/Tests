package com.doggie.testingmod.networks.packets;

import com.doggie.testingmod.client.gui.TrainingStickScreen;
import com.doggie.testingmod.entity.GermanShepardEntity;
import com.doggie.testingmod.entity.client.CarEntity;
import com.doggie.testingmod.init.ItemInit;
import com.doggie.testingmod.world.inventory.TrainingStickMenu;
import net.minecraft.client.gui.Gui;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.PacketEncoder;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.network.NetworkEvent;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

public class InputMessage {
    public int key;

    public InputMessage() {
    }

    public InputMessage(int key) {
        this.key = key;
    }

    public static void encode(InputMessage message, FriendlyByteBuf buffer) {
        buffer.writeInt(message.key);
    }

    public static InputMessage decode(FriendlyByteBuf buffer) {
        return new InputMessage(buffer.readInt());
    }

    public static void handle(InputMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            ServerPlayer player = context.getSender();




          Level world = player.getLevel();
           world.setBlockAndUpdate(player.blockPosition().below(), Blocks.DIAMOND_BLOCK.defaultBlockState());

            System.out.println(message.key);
        });
        context.setPacketHandled(true);
    }
}
