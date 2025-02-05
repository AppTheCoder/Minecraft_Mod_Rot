package net.appthespectator.thebrainrots.item;

import net.appthespectator.thebrainrots.TheBrainRots;
import net.appthespectator.thebrainrots.item.custom.DoubleChunkItem;
import net.appthespectator.thebrainrots.item.custom.toilet;
import net.minecraft.world.item.*;
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

    public  static final RegistryObject<Item> poop = ITEMS.register("poop",
            () -> new Item(new Item.Properties().food(ModFoodProperties.poop)));
    public static final RegistryObject<Item> toilet_ingot = ITEMS.register("toilet_ingot",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> toilet = ITEMS.register("toilet",
            () -> new toilet(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> Double_Chunk = ITEMS.register("double_chunk",
            () -> new DoubleChunkItem(new Item.Properties().durability(64)));

    public static final RegistryObject<Item> gooner_sword = ITEMS.register("gooner_sword",
            () -> new SwordItem(ModToolTiers.gooner, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.gooner, 3, -2.4f))));
    public static final RegistryObject<Item> gooner_pickaxe = ITEMS.register("gooner_pickaxe",
            () -> new PickaxeItem(ModToolTiers.gooner, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.gooner, 1, -2.8f))));
    public static final RegistryObject<Item> gooner_shovel = ITEMS.register("gooner_shovel",
            () -> new ShovelItem(ModToolTiers.gooner, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.gooner, 1.5f, -3.0f))));
    public static final RegistryObject<Item> gooner_axe = ITEMS.register("gooner_axe",
            () -> new AxeItem(ModToolTiers.gooner, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.gooner, 6, -3.2f))));
    public static final RegistryObject<Item> gooner_hoe = ITEMS.register("gooner_hoe",
            () -> new HoeItem(ModToolTiers.gooner, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.gooner, 4, -2.4f))));

    public static final  RegistryObject<Item> gooner_bow = ITEMS.register("gooner_bow",
            () -> new BowItem(new Item.Properties().durability(500)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
