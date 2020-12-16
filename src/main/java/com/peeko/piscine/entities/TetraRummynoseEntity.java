package com.peeko.piscine.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.fish.CodEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class TetraRummynoseEntity extends CodEntity {

    //public static final Ingredient TEMPTATION_ITEMS = Ingredient.fromItems(ModItems.FISH_FOOD.get());


    public TetraRummynoseEntity(EntityType<? extends CodEntity> p_i50279_1_, World p_i50279_2_) {
        super(p_i50279_1_, p_i50279_2_);
    }


    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return CodEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 2.5d)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 1.6d);

    }

       @Override
    protected SoundEvent getAmbientSound() {return SoundEvents.ENTITY_TROPICAL_FISH_AMBIENT;}

    @Override
    protected SoundEvent getDeathSound() {return SoundEvents.ENTITY_TROPICAL_FISH_DEATH;}

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {return SoundEvents.ENTITY_TROPICAL_FISH_HURT;}

    @Override
    protected SoundEvent getFlopSound() {return SoundEvents.ENTITY_TROPICAL_FISH_FLOP;}
}


