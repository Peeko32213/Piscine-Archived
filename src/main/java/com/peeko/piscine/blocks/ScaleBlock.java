package com.peeko.piscine.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ScaleBlock extends Block {


    public ScaleBlock() {
        super(Block.Properties.create(Material.WOOD)
                .hardnessAndResistance(6.0f, 4.0f)
                .sound(SoundType.WOOD)
                .harvestLevel(3)
                .harvestTool(ToolType.AXE)

        );
    }
}
