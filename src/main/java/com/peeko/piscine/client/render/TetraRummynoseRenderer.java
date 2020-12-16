package com.peeko.piscine.client.render;

import com.peeko.piscine.Piscine;
import com.peeko.piscine.client.model.TetraRummynoseModel;
import com.peeko.piscine.entities.TetraRummynoseEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TetraRummynoseRenderer extends MobRenderer<TetraRummynoseEntity, TetraRummynoseModel<TetraRummynoseEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Piscine.MOD_ID, "textures/entity/tetrarummynose.png");

    public TetraRummynoseRenderer(EntityRendererManager renderManagerIn) {super(renderManagerIn,new TetraRummynoseModel<>(),0.3f); }

    @Override
    public ResourceLocation getEntityTexture(TetraRummynoseEntity entity) {
        return TEXTURE;
    }
}
