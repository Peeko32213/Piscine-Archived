package com.peeko.piscine.client.render;

import com.peeko.piscine.Piscine;
import com.peeko.piscine.client.model.TetraModel;
import com.peeko.piscine.entities.TetraEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TetraRenderer extends MobRenderer<TetraEntity, TetraModel<TetraEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Piscine.MOD_ID, "textures/entity/tetra.png");

    public TetraRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn,new TetraModel<>(),0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(TetraEntity entity) {
        return TEXTURE;
    }
}
