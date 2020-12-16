package com.peeko.piscine.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FishFood extends Item {
    public FishFood() {
        super(new Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(1)
                        .saturation(0f)
                        .effect(new EffectInstance(Effects.HUNGER, 100, 1), 1)
                        .build())





        );

    }
}