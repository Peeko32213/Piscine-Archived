package com.peeko.piscine.init;

import com.peeko.piscine.Piscine;
import com.peeko.piscine.entities.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Piscine.MOD_ID);

    // Entity Types
    public static final RegistryObject<EntityType<TetraEntity>> TETRA = ENTITY_TYPES.register("tetra",
            () -> EntityType.Builder.create(TetraEntity::new, EntityClassification.WATER_AMBIENT)
                    .size(0.5f, 0.3f)
                    .build(new ResourceLocation(Piscine.MOD_ID, "tetra").toString()));

    public static final RegistryObject<EntityType<TetraRummynoseEntity>> TETRA_RUMMYNOSE = ENTITY_TYPES.register("tetra_rummynose",
            () -> EntityType.Builder.create(TetraRummynoseEntity::new, EntityClassification.WATER_AMBIENT)
                    .size(0.5f, 0.3f)
                    .build(new ResourceLocation(Piscine.MOD_ID, "tetra_rummynose").toString()));

    public static final RegistryObject<EntityType<TetraPenguEntity>> TETRA_PENGU = ENTITY_TYPES.register("tetra_penguin",
            () -> EntityType.Builder.create(TetraPenguEntity::new, EntityClassification.WATER_AMBIENT)
                    .size(0.5f, 0.3f)
                    .build(new ResourceLocation(Piscine.MOD_ID, "tetra_penguin").toString()));

    public static final RegistryObject<EntityType<TetraEmberEntity>> TETRA_EMBER = ENTITY_TYPES.register("tetra_ember",
            () -> EntityType.Builder.create(TetraEmberEntity::new, EntityClassification.WATER_AMBIENT)
                    .size(0.5f, 0.3f)
                    .build(new ResourceLocation(Piscine.MOD_ID, "tetra_ember").toString()));

    public static final RegistryObject<EntityType<TetraCaveEntity>> TETRA_CAVE = ENTITY_TYPES.register("tetra_cave",
            () -> EntityType.Builder.create(TetraCaveEntity::new, EntityClassification.WATER_AMBIENT)
                    .size(0.5f, 0.3f)
                    .build(new ResourceLocation(Piscine.MOD_ID, "tetra_cave").toString()));

    public static final RegistryObject<EntityType<TetraGoldEntity>> TETRA_GOLD = ENTITY_TYPES.register("tetra_gold",
            () -> EntityType.Builder.create(TetraGoldEntity::new, EntityClassification.WATER_AMBIENT)
                    .size(0.5f, 0.3f)
                    .build(new ResourceLocation(Piscine.MOD_ID, "tetra_gold").toString()));

    public static final RegistryObject<EntityType<TetraEnderEntity>> TETRA_ENDER = ENTITY_TYPES.register("tetra_ender",
            () -> EntityType.Builder.create(TetraEnderEntity::new, EntityClassification.WATER_AMBIENT)
                    .size(0.5f, 0.3f)
                    .build(new ResourceLocation(Piscine.MOD_ID, "tetra_ender").toString()));

    public static final RegistryObject<EntityType<ShrimpRedEntity>> SHRIMP_RED = ENTITY_TYPES.register("shrimp_red",
            () -> EntityType.Builder.create(ShrimpRedEntity::new, EntityClassification.WATER_AMBIENT)
                    .size(0.5f, 0.3f)
                    .build(new ResourceLocation(Piscine.MOD_ID, "shrimp_red").toString()));
}

