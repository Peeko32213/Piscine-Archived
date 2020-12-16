package com.peeko.piscine.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RawFreshwaterFish extends Item {
    public RawFreshwaterFish() {
        super(new Item.Properties()
        .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                .hunger(2)
                .saturation(1f)
                        .fastToEat()
                .build())





        );

    }
}
