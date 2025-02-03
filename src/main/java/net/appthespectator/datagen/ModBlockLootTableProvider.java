package net.appthespectator.datagen;

import net.appthespectator.thebrainrots.block.ModBlocks;
import net.appthespectator.thebrainrots.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.gooner_block.get());
        dropSelf(ModBlocks.chicken_bake.get());

        this.add(ModBlocks.gooner_ore.get(),
                block -> createOreDrop(ModBlocks.gooner_ore.get(), ModItems.goonergem.get()));
    }


    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
