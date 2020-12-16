package com.peeko.piscine.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CookedFreshwaterFish extends Item {
    public CookedFreshwaterFish() {
        super(new Item.Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(5)
                        .saturation(3f)
                        .build())





        );

    }
}