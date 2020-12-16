package com.peeko.piscine.init;

import com.peeko.piscine.Piscine;
import com.peeko.piscine.blocks.BlockItemBase;
import com.peeko.piscine.items.CookedFreshwaterFish;
import com.peeko.piscine.items.FishFood;
import com.peeko.piscine.items.ItemBase;
import com.peeko.piscine.items.RawFreshwaterFish;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Piscine.MOD_ID);

    //Items
    public static final RegistryObject<Item> PLECO_SCALE = ITEMS.register("pleco_scale", ItemBase::new);
    public static final RegistryObject<Item> CORY_SCALE = ITEMS.register("cory_scale", ItemBase::new);

    //Foods
    public static final RegistryObject<RawFreshwaterFish>RAW_FRESHWATER_FISH = ITEMS.register("raw_freshwater_fish", RawFreshwaterFish::new );
    public static final RegistryObject<CookedFreshwaterFish>COOKED_FRESHWATER_FISH = ITEMS.register("cooked_freshwater_fish", CookedFreshwaterFish::new );
    public static final RegistryObject<FishFood>FISH_FOOD = ITEMS.register("fish_food", FishFood::new );

    //Block Items
    public static final RegistryObject<Item> SCALE_BLOCK_ITEM = ITEMS.register("scale_block", () -> new BlockItemBase(ModBlocks.SCALE_BLOCK.get()));

}
