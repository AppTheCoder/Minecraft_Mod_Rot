package net.appthespectator.thebrainrots.item.custom;

import net.appthespectator.thebrainrots.block.ModBlocks;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.apache.logging.log4j.core.jmx.Server;

import java.util.Map;

public class DoubleChunkItem extends Item {
    private static final Map<Block, Block> Double_Map =
            Map.of(
                    Blocks.IRON_ORE, ModBlocks.gooner_ore.get(),
                    ModBlocks.gooner_ore.get(), Blocks.IRON_ORE,
                    Blocks.DEEPSLATE_IRON_ORE, ModBlocks.gooner_ore.get()
            );

    public DoubleChunkItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Block clickedBlock = level.getBlockState(pContext.getClickedPos()).getBlock();

        if(Double_Map.containsKey(clickedBlock)){
            if(!level.isClientSide()){
                level.setBlockAndUpdate(pContext.getClickedPos(),Double_Map.get(clickedBlock).defaultBlockState());

                pContext.getItemInHand().hurtAndBreak(1,((ServerLevel) level), ((ServerPlayer) pContext.getPlayer()),
                    item -> pContext.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, pContext.getClickedPos(), SoundEvents.CAMEL_EAT, SoundSource.BLOCKS);

            }
        }

        return InteractionResult.SUCCESS;
    }
}
