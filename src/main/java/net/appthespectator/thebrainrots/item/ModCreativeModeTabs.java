package net.appthespectator.thebrainrots.item;

import net.appthespectator.thebrainrots.TheBrainRots;
import net.appthespectator.thebrainrots.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheBrainRots.MOD_ID);

    public static final RegistryObject<CreativeModeTab> The_Brain_Rots = CREATIVE_MODE_TABS.register("the_brain_rots",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.goonergem.get()))
                    .title(Component.translatable("creativetab.thebrainrots.gooner"))
                    .displayItems((itemDisplayParameters, output) -> {
                      output.accept(ModItems.goonergem.get());
                      output.accept(ModItems.gooneringot.get());

                      output.accept(ModBlocks.gooner_ore.get());
                      output.accept(ModBlocks.gooner_block.get());

                      output.accept(ModItems.fu.get());


                    }).build());




    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
