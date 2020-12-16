package com.peeko.piscine.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.peeko.piscine.entities.TetraRummynoseEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class TetraRummynoseModel<T extends TetraRummynoseEntity> extends EntityModel<T> {

    private final ModelRenderer Body;
    private final ModelRenderer Tail;

    public TetraRummynoseModel() {
        textureWidth = 32;
        textureHeight = 32;

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 16.0F, 2.0F);
        setRotationAngle(Body, 0.0F, 3.1416F, 0.0F);
        Body.setTextureOffset(0, 0).addBox(-1.5F, 2.3333F, -2.5833F, 3.0F, 3.0F, 7.0F, 0.0F, false);
        Body.setTextureOffset(8, 6).addBox(0.0F, 0.3333F, -2.5833F, 0.0F, 2.0F, 4.0F, 0.0F, false);
        Body.setTextureOffset(8, 8).addBox(0.0F, 5.3333F, -2.5833F, 0.0F, 2.0F, 4.0F, 0.0F, false);
        Body.setTextureOffset(0, 2).addBox(-1.525F, 3.3333F, -1.0833F, 0.0F, 2.0F, 3.0F, 0.0F, false);
        Body.setTextureOffset(0, 0).addBox(1.525F, 3.3333F, -1.0833F, 0.0F, 2.0F, 3.0F, 0.0F, false);

        Tail = new ModelRenderer(this);
        Tail.setRotationPoint(0.0F, 19.75F, 4.5F);
        setRotationAngle(Tail, 0.0F, 3.1416F, 0.0F);
        Tail.setTextureOffset(0, 6).addBox(0.0F, -3.4167F, 0.0F, 0.0F, 7.0F, 4.0F, 0.0F, false);
    }


    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float f = 1.0F;
        if (!entityIn.isInWater()) {
            f = 1.5F;
        }

        this.Tail.rotateAngleY = -f * 0.45F * MathHelper.sin(0.6F * ageInTicks);
    }


    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
        Tail.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
