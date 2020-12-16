package com.peeko.piscine.client.render;

import com.peeko.piscine.Piscine;
import com.peeko.piscine.client.model.ShrimpRedModel;
import com.peeko.piscine.entities.ShrimpRedEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ShrimpRedRenderer extends MobRenderer<ShrimpRedEntity, ShrimpRedModel<ShrimpRedEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Piscine.MOD_ID, "textures/entity/shrimpred.png");

    public ShrimpRedRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn,new ShrimpRedModel<>(),0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(ShrimpRedEntity entity) {
        return TEXTURE;
    }
}
