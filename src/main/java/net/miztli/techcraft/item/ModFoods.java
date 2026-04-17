package net.miztli.techcraft.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties EMPANADA = new FoodProperties.Builder().nutrition(20)
            .saturationMod(5f).effect( () -> new MobEffectInstance(MobEffects.REGENERATION, 200), 1).build();
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2)
            .saturationMod(2f).build();
    public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(4)
            .saturationMod(2f).build();
}
