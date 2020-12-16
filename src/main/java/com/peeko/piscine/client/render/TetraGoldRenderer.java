package com.peeko.piscine.client.render;

import com.peeko.piscine.Piscine;
import com.peeko.piscine.client.model.TetraGoldModel;
import com.peeko.piscine.entities.TetraGoldEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TetraGoldRenderer extends MobRenderer<TetraGoldEntity, TetraGoldModel<TetraGoldEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Piscine.MOD_ID, "textures/entity/tetragold.png");

    public TetraGoldRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn,new TetraGoldModel<>(),0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(TetraGoldEntity entity) {
        return TEXTURE;
    }
}
