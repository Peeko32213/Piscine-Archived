package com.peeko.piscine.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Properties().group(ItemGroup.MATERIALS));
    }
}
