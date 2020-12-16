package com.peeko.piscine.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.passive.fish.CodEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class ShrimpRedEntity extends WaterMobEntity {

    //public static final Ingredient TEMPTATION_ITEMS = Ingredient.fromItems(ModItems.FISH_FOOD.get());


    public ShrimpRedEntity(EntityType<? extends WaterMobEntity> type, World worldin) {
        super(type, worldin);
    }


    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return CodEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 1.0d)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.7d);

    }

    @Override
    protected void registerGoals() {
        super.registerGoals();

        this.goalSelector.addGoal(0, new PanicGoal(this, 2.0));


    }

    @Override
    protected SoundEvent getAmbientSound() {return SoundEvents.ENTITY_TROPICAL_FISH_AMBIENT;}

    @Override
    protected SoundEvent getDeathSound() {return SoundEvents.ENTITY_TROPICAL_FISH_DEATH;}

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {return SoundEvents.ENTITY_TROPICAL_FISH_HURT;}

}


