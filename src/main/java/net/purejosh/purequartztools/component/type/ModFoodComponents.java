package net.purejosh.purequartztools.component.type;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent QUARTZ_APPLE = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200, 0), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodComponent QUARTZ_CARROT = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(1.2F)
            .build();
}
