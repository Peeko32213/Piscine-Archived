package com.peeko.piscine.client.render;

import com.peeko.piscine.Piscine;
import com.peeko.piscine.client.model.TetraCaveModel;
import com.peeko.piscine.entities.TetraCaveEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TetraCaveRenderer extends MobRenderer<TetraCaveEntity, TetraCaveModel<TetraCaveEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Piscine.MOD_ID, "textures/entity/tetracave.png");

    public TetraCaveRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn,new TetraCaveModel<>(),0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(TetraCaveEntity entity) {
        return TEXTURE;
    }
}
