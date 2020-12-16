package com.peeko.piscine.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.peeko.piscine.entities.ShrimpRedEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class ShrimpRedModel<T extends ShrimpRedEntity> extends EntityModel<T> {
    private ModelRenderer Tail;
    private ModelRenderer Body;
    private ModelRenderer AntenaeRight;
    private ModelRenderer AntenaeLeft;

    public ShrimpRedModel() {
        textureWidth = 32;
        textureHeight = 32;

        Tail = new ModelRenderer(this);
        Tail.setRotationPoint(0.0F, 21.75F, 0.0F);
        Tail.setTextureOffset(8, 0).addBox(-1.0F, -0.75F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
        Tail.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -5.0F, 4.0F, 0.0F, 3.0F, 0.0F, false);

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 23.0F, 3.0F);
        Body.setTextureOffset(7, 7).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
        Body.setTextureOffset(8, 12).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Body.setTextureOffset(10, 4).addBox(0.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Body.setTextureOffset(2, 3).addBox(-1.5F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);
        Body.setTextureOffset(0, 3).addBox(0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

        ModelRenderer legsRight = new ModelRenderer(this);
        legsRight.setRotationPoint(0.0F, 1.0F, -3.0F);
        Body.addChild(legsRight);
        setRotationAngle(legsRight, 0.0F, 0.0F, 0.3491F);
        legsRight.setTextureOffset(0, 2).addBox(-1.0F, -1.0F, -1.0F, 0.0F, 2.0F, 5.0F, 0.0F, false);

        ModelRenderer legsLeft = new ModelRenderer(this);
        legsLeft.setRotationPoint(2.0F, 0.5F, -3.0F);
        Body.addChild(legsLeft);
        setRotationAngle(legsLeft, 0.0F, 0.0F, -0.3491F);
        legsLeft.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 0.0F, 2.0F, 5.0F, 0.0F, false);

        AntenaeRight = new ModelRenderer(this);
        AntenaeRight.setRotationPoint(2.25F, -1.55F, -1.0F);
        Body.addChild(AntenaeRight);
        setRotationAngle(AntenaeRight, 0.48F, 0.0F, 0.0F);
        AntenaeRight.setTextureOffset(0, 9).addBox(-2.0F, -4.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, false);

        AntenaeLeft = new ModelRenderer(this);
        AntenaeLeft.setRotationPoint(-0.25F, -1.55F, -1.0F);
        Body.addChild(AntenaeLeft);
        setRotationAngle(AntenaeLeft, 0.48F, 0.0F, 0.0F);
        AntenaeLeft.setTextureOffset(4, 12).addBox(-2.0F, -4.0F, 1.0F, 2.0F, 4.0F, 0.0F, 0.0F, false);
    }



    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Tail.render(matrixStack, buffer, packedLight, packedOverlay);
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        float f = 1.0F;
        if (!entityIn.isInWater()) {
            f = 1.5F;
        }

        this.Tail.rotateAngleY = -f * 0.45F * MathHelper.sin(0.6F * ageInTicks);
    }
}
