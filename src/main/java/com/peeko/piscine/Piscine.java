package com.peeko.piscine;

import com.peeko.piscine.entities.*;
import com.peeko.piscine.init.ModBlocks;
import com.peeko.piscine.init.ModEntityTypes;
import com.peeko.piscine.init.ModItems;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("psc")
public class Piscine
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "psc";

    public Piscine() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

        DeferredWorkQueue.runLater(() -> {

            GlobalEntityTypeAttributes.put(ModEntityTypes.TETRA.get(), TetraEntity.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntityTypes.TETRA_RUMMYNOSE.get(), TetraRummynoseEntity.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntityTypes.TETRA_PENGU.get(), TetraPenguEntity.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntityTypes.TETRA_EMBER.get(), TetraEmberEntity.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntityTypes.TETRA_CAVE.get(), TetraCaveEntity.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntityTypes.TETRA_GOLD.get(), TetraGoldEntity.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntityTypes.TETRA_ENDER.get(), TetraEnderEntity.setCustomAttributes().create());


        });

    }



    private void doClientStuff(final FMLClientSetupEvent event) { }
}
