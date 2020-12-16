package com.peeko.piscine.client.render;

import com.peeko.piscine.Piscine;
import com.peeko.piscine.client.model.TetraEmberModel;
import com.peeko.piscine.entities.TetraEmberEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TetraEmberRenderer extends MobRenderer<TetraEmberEntity, TetraEmberModel<TetraEmberEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Piscine.MOD_ID, "textures/entity/tetraember.png");

    public TetraEmberRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn,new TetraEmberModel<>(),0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(TetraEmberEntity entity) {
        return TEXTURE;
    }
}
