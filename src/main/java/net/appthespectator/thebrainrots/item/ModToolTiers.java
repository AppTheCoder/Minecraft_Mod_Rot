package net.appthespectator.thebrainrots.item;

import net.appthespectator.thebrainrots.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier gooner = new ForgeTier(1400, 6, 3f, 20,
            ModTags.Blocks.needs_gooner_tool, () -> Ingredient.of(ModItems.gooneringot.get()),
            ModTags.Blocks.incorrect_for_gooner_tool);
    }

