package net.appthespectator.datagen;

import net.appthespectator.thebrainrots.TheBrainRots;
import net.appthespectator.thebrainrots.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

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
    }
}
