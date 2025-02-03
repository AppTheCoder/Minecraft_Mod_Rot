package net.appthespectator.thebrainrots.util;

import net.appthespectator.thebrainrots.TheBrainRots;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> needs_gooner_tool = createTag("needs_gooner_tool");
        public static final TagKey<Block> incorrect_for_gooner_tool = createTag("incorrect_for_gooner_tool");


        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(TheBrainRots.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(TheBrainRots.MOD_ID, name));
        }
    }
}