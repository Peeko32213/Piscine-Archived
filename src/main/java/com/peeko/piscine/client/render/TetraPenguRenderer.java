package com.peeko.piscine.client.render;

import com.peeko.piscine.Piscine;
import com.peeko.piscine.client.model.TetraPenguModel;
import com.peeko.piscine.entities.TetraPenguEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TetraPenguRenderer extends MobRenderer <TetraPenguEntity, TetraPenguModel<TetraPenguEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Piscine.MOD_ID, "textures/entity/tetrapenguin.png");

    public TetraPenguRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new TetraPenguModel<>(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(TetraPenguEntity entity) {
        return TEXTURE;
    }
}
