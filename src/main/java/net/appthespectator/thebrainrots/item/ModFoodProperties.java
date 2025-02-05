package net.appthespectator.thebrainrots.item;

import net.appthespectator.thebrainrots.item.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;


public class ModFoodProperties {
    public static final FoodProperties poop = new FoodProperties.Builder()
            .nutrition(9)
            .saturationModifier(1.2F)
            .effect(new MobEffectInstance(MobEffects.INFESTED, 400, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 500, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.OOZING, 2400, 3), 1.0F)
            .alwaysEdible()
            .build();
}
