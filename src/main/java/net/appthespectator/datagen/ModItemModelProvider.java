package net.appthespectator.datagen;

import net.appthespectator.thebrainrots.TheBrainRots;
import net.appthespectator.thebrainrots.block.ModBlocks;
import net.appthespectator.thebrainrots.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public  ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheBrainRots.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.goonergem.get());
        basicItem(ModItems.gooneringot.get());

        basicItem(ModItems.Double_Chunk.get());
        basicItem(ModItems.fu.get());

        buttonItem(ModBlocks.gooner_button, ModBlocks.gooner_block);

        handheldItem(ModItems.gooner_sword);
        handheldItem(ModItems.gooner_pickaxe);
        handheldItem(ModItems.gooner_shovel);
        handheldItem(ModItems.gooner_axe);
        handheldItem(ModItems.gooner_hoe);
    }



    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(TheBrainRots.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void buttonItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(TheBrainRots.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

}

