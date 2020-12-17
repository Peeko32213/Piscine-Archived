package com.peeko.piscine.util;

import com.peeko.piscine.Piscine;
import com.peeko.piscine.client.render.*;
import com.peeko.piscine.init.ModEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Piscine.MOD_ID, value = Dist.CLIENT)
public class ClientEventBusSubscriber {


    @SubscribeEvent
    public void onClientSetup(FMLClientSetupEvent event) {

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TETRA.get(), TetraRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TETRA_RUMMYNOSE.get(), TetraRummynoseRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TETRA_PENGU.get(), TetraPenguRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TETRA_EMBER.get(), TetraEmberRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TETRA_CAVE.get(), TetraCaveRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TETRA_GOLD.get(), TetraGoldRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TETRA_ENDER.get(), TetraEnderRenderer::new);


    }


}
