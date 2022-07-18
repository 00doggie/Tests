package com.doggie.testingmod.init;

import com.doggie.testingmod.TestingMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagKeyInit {
    public static class Blocks {


        public static final TagKey<Block> Hammer = register("hammer");

    private static TagKey<Block> register(String name) {
        return BlockTags.create(new ResourceLocation(TestingMod.MOD_ID, name));
    }

    private static TagKey<Block> registerForge(String name) {
        return BlockTags.create(new ResourceLocation("forge", name));
    }
}
}
