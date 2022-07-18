package com.doggie.testingmod.init.advanceditems;

import com.doggie.testingmod.init.ItemInit;
import com.google.common.collect.Sets;
import net.minecraft.core.AxisCycle;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib3.core.util.Axis;

import java.util.Set;

public class HammerItem extends DiggerItem {


    private static final Set<Block> DIGGABLES = Sets.newHashSet(Blocks.OAK_LOG, Blocks.SPRUCE_LOG, Blocks.BIRCH_LOG, Blocks.JUNGLE_LOG, Blocks.ACACIA_LOG, Blocks.DARK_OAK_LOG, Blocks.WARPED_STEM, Blocks.CRIMSON_STEM, Blocks.OAK_WOOD, Blocks.SPRUCE_WOOD, Blocks.BIRCH_WOOD, Blocks.JUNGLE_WOOD, Blocks.ACACIA_WOOD, Blocks.DARK_OAK_WOOD, Blocks.WARPED_HYPHAE, Blocks.CRIMSON_HYPHAE, Blocks.OAK_LEAVES, Blocks.SPRUCE_LEAVES, Blocks.BIRCH_LEAVES, Blocks.JUNGLE_LEAVES, Blocks.ACACIA_LEAVES, Blocks.DARK_OAK_LEAVES, Blocks.NETHER_WART_BLOCK, Blocks.WARPED_WART_BLOCK, Blocks.AZALEA_LEAVES, Blocks.FLOWERING_AZALEA_LEAVES);


    Direction.Axis setAxis;


    private Player player;


    public HammerItem(float attackDamage, float attackSpeed, Tier tier, TagKey<Block> blockKey, Properties properties) {
        super(attackDamage, attackSpeed, tier, blockKey, properties);


    }

    private void breakBlock(BlockPos newBlockPos, Level level) {
        level.getBlockState(newBlockPos).getBlock().destroy(level, newBlockPos, level.getBlockState(newBlockPos));
    }

    @Override
    public boolean mineBlock(ItemStack stack, Level level, BlockState blockState, BlockPos blockPos, LivingEntity livingEntity) {
        int blockX = blockPos.getX();
        int blockY = blockPos.getY();
        int blockZ = blockPos.getZ();
        setAxis = livingEntity.getDirection().getAxis();

        if (!level.isClientSide && blockState.getDestroySpeed(level, blockPos) != 0.0F) {
            stack.hurtAndBreak(1, livingEntity, (livingEntity1) -> {
                livingEntity1.broadcastBreakEvent(EquipmentSlot.MAINHAND);

                if (DIGGABLES.contains(level.getBlockState(blockPos).getBlock())) {

                    switch (setAxis) {
                        case Y:

                            for (int x = -1; x > 2; x++) {
                                for (int z = -1; z < 2; z++) {
                                    BlockPos newBlockPos = new BlockPos(blockX + x, blockY, blockZ + z);
                                    if (DIGGABLES.contains(level.getBlockState(newBlockPos).getBlock())) {
                                        breakBlock(newBlockPos, level);

                                    }
                                }
                                break;
                            }

                        case X:
                            for (int z = -1; z < 2; z++) {
                                for (int y = -1; y < 2; y++) {

                                    BlockPos newBlockPos = new BlockPos(blockX, blockY + y, blockZ + z);
                                    if (DIGGABLES.contains(level.getBlockState(newBlockPos).getBlock())) {
                                        breakBlock(newBlockPos, level);

                                    }
                                }
                            }
                            break;


                        case Z:
                            for (int x = -1; x < 2; x++) {
                                for (int y = -1; y < 2; y++) {

                                    BlockPos newBlockPos = new BlockPos(blockX + x, blockY + y, blockZ);
                                    if (DIGGABLES.contains(level.getBlockState(newBlockPos).getBlock())) {
                                        breakBlock(newBlockPos, level);

                                    }
                                }
                            }
                            break;
                    }

                }
            });
        }

        return true;
    }
}













