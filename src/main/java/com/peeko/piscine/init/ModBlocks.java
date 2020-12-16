package com.peeko.piscine.init;

import com.peeko.piscine.Piscine;
import com.peeko.piscine.blocks.ScaleBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Piscine.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> SCALE_BLOCK = BLOCKS.register("scale_block", ScaleBlock::new);

}
