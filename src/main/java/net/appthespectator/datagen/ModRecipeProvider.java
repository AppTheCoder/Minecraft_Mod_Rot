package net.appthespectator.datagen;

import net.appthespectator.thebrainrots.TheBrainRots;
import net.appthespectator.thebrainrots.block.ModBlocks;
import net.appthespectator.thebrainrots.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.gooner_block.get())
                .pattern("GGG")
                .pattern("GGG")
                .pattern("GGG")
                .define('G', ModItems.gooneringot.get())
                .unlockedBy(getHasName(ModItems.gooneringot.get()), has(ModItems.gooneringot.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.chicken_bake.get())
                .pattern("CCC")
                .pattern("CGC")
                .pattern("CCC")
                .define('G', ModItems.gooneringot.get())
                .define('C', Items.COOKED_CHICKEN)
                .unlockedBy(getHasName(Items.COOKED_CHICKEN), has(Items.COOKED_CHICKEN)).save(pRecipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.gooneringot.get(), 9)
                .requires(ModBlocks.gooner_block.get())
                .unlockedBy(getHasName(ModBlocks.gooner_block.get()), has(ModBlocks.gooner_block.get())).save(pRecipeOutput);

        // Need if have an item with same result
        //.save(pRecipeOutput, TheBrainRots.MOD_ID + ":alexandrite_from_magic_block");

    }
}