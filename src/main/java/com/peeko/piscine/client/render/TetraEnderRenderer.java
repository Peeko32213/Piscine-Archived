package com.peeko.piscine.client.render;

import com.peeko.piscine.Piscine;
import com.peeko.piscine.client.model.TetraEnderModel;
import com.peeko.piscine.entities.TetraEnderEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TetraEnderRenderer extends MobRenderer<TetraEnderEntity, TetraEnderModel<TetraEnderEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Piscine.MOD_ID, "textures/entity/endertetra.png");

    public TetraEnderRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn,new TetraEnderModel<>(),0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(TetraEnderEntity entity) {
        return TEXTURE;
    }
}
