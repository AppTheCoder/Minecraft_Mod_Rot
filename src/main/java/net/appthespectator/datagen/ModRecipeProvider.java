package net.appthespectator.datagen;

import net.appthespectator.thebrainrots.block.ModBlocks;
import net.appthespectator.thebrainrots.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.gooner_sword.get())
                .pattern(" G ")
                .pattern(" G ")
                .pattern(" S ")
                .define('G', ModItems.gooneringot.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.gooneringot.get()), has(ModItems.gooneringot.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.gooner_pickaxe.get())
                .pattern("GGG")
                .pattern(" S ")
                .pattern(" S ")
                .define('G', ModItems.gooneringot.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.gooneringot.get()), has(ModItems.gooneringot.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.gooner_axe.get())
                .pattern("GG ")
                .pattern("GS ")
                .pattern(" S ")
                .define('G', ModItems.gooneringot.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.gooneringot.get()), has(ModItems.gooneringot.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.gooner_shovel.get())
                .pattern(" G ")
                .pattern(" S ")
                .pattern(" S ")
                .define('G', ModItems.gooneringot.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.gooneringot.get()), has(ModItems.gooneringot.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.gooner_hoe.get())
                .pattern("GG ")
                .pattern(" S ")
                .pattern(" S ")
                .define('G', ModItems.gooneringot.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.gooner_sword.get()), has(ModItems.gooner_sword.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.gooner_bow.get())
                .pattern(" G ")
                .pattern(" G ")
                .pattern("   ")
                .define('G', ModItems.gooneringot.get())
                .unlockedBy(getHasName(ModItems.gooner_bow.get()), has(ModItems.gooneringot.get())).save(pRecipeOutput);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.toilet.get())
                .pattern("NNN")
                .pattern("BGB")
                .pattern("BBB")
                .define('G', ModItems.gooneringot.get())
                .define('B', Items.BRICK)
                .define('N', Items.NETHER_BRICK)
                .unlockedBy(getHasName(ModItems.gooner_sword.get()), has(ModItems.gooner_sword.get())).save(pRecipeOutput);




        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.gooneringot.get(), 9)
                .requires(ModBlocks.gooner_block.get())
                .unlockedBy(getHasName(ModBlocks.gooner_block.get()), has(ModBlocks.gooner_block.get())).save(pRecipeOutput);

        // Need if have an item with same result
        //.save(pRecipeOutput, TheBrainRots.MOD_ID + ":gooner_from_chicken_bake");

        stairBuilder(ModBlocks.gooner_stairs.get(), Ingredient.of(ModItems.gooneringot.get())).group("gooner")
                .unlockedBy(getHasName(ModItems.gooneringot.get()), has(ModItems.gooneringot.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.gooner_slab.get(), ModItems.gooneringot.get());

        buttonBuilder(ModBlocks.gooner_button.get(), Ingredient.of(ModItems.gooneringot.get())).group("gooner")
                .unlockedBy(getHasName(ModItems.gooneringot.get()), has(ModItems.gooneringot.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.gooner_pressure_plate.get(), ModItems.gooneringot.get());
    }
}