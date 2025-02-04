package net.appthespectator.datagen;

import net.appthespectator.thebrainrots.TheBrainRots;
import net.appthespectator.thebrainrots.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TheBrainRots.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.gooner_ore);
        blockWithItem(ModBlocks.gooner_block);

        blockWithItem(ModBlocks.toilet_ore);

        blockWithItem(ModBlocks.chicken_bake);

        blockItem(ModBlocks.gooner_block);

        slabBlock(ModBlocks.gooner_slab.get(), blockTexture(ModBlocks.gooner_block.get()), blockTexture(ModBlocks.gooner_block.get()));
        stairsBlock(ModBlocks.gooner_stairs.get(), blockTexture(ModBlocks.gooner_block.get()));

        pressurePlateBlock(ModBlocks.gooner_pressure_plate.get(), blockTexture(ModBlocks.gooner_block.get()));
        buttonBlock(ModBlocks.gooner_button.get(), blockTexture(ModBlocks.gooner_block.get()));

        blockItem(ModBlocks.gooner_slab);
        blockItem(ModBlocks.gooner_stairs);
        blockItem(ModBlocks.gooner_pressure_plate);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));

    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("thebrainrots:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("thebrainrots:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}