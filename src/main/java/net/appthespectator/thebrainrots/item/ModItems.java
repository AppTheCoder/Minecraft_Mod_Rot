package net.appthespectator.thebrainrots.item;

import net.appthespectator.thebrainrots.TheBrainRots;
import net.appthespectator.thebrainrots.item.custom.DoubleChunkItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item>  ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheBrainRots.MOD_ID);


    public  static final RegistryObject<Item> goonergem = ITEMS.register("goonergem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> gooneringot = ITEMS.register("gooneringot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> fu = ITEMS.register("fu",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> Double_Chunk = ITEMS.register("double_chunk",
            () -> new DoubleChunkItem(new Item.Properties().durability(64)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
