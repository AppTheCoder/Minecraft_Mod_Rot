package net.appthespectator.datagen;

import net.appthespectator.thebrainrots.TheBrainRots;
import net.appthespectator.thebrainrots.block.ModBlocks;
import net.appthespectator.thebrainrots.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TheBrainRots.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.chicken_bake.get());


        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.gooner_ore.get())
                .add(ModBlocks.gooner_block.get());


        tag(ModTags.Blocks.needs_gooner_tool)
               // .add(ModBlocks.NEXT TIER OF STUFF)
                .add(Blocks.OBSIDIAN)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.incorrect_for_gooner_tool)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.needs_gooner_tool);
    }
}
