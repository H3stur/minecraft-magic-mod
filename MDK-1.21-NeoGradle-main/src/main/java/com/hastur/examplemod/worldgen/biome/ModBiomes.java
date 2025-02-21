
package com.hastur.examplemod.worldgen.biome;

import java.util.List;

import com.google.common.collect.Lists;
import com.hastur.examplemod.ExampleMod;
import com.hastur.examplemod.worldgen.ModOverworldBiomes;
import com.hastur.examplemod.worldgen.ModOverworldRegion;
import com.hastur.examplemod.worldgen.ModPlacedFeatures;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import terrablender.api.Regions;

public class ModBiomes {
	
	
	public static void setupTerraBlender() {
		Regions.register(new ModOverworldRegion(2));
	}
	
	public static void bootstrapBiomes(BootstrapContext<Biome> context) {
		HolderGetter<ConfiguredWorldCarver<?>> carverGetter = context.lookup(Registries.CONFIGURED_CARVER);
        HolderGetter<PlacedFeature> placedFeatureGetter = context.lookup(Registries.PLACED_FEATURE);
        
        register(context,CERULEAN_BIOME, ModOverworldBiomes.ceruleanBiome(placedFeatureGetter, carverGetter));
	}
	
    private static void register(BootstrapContext<Biome> context, ResourceKey<Biome> key, Biome biome)
    {
        context.register(key, biome);
    }
    
    private static List<ResourceKey<Biome>> overworldBiomes = Lists.newArrayList();
    private static List<ResourceKey<Biome>> allBiomes = Lists.newArrayList();

    public static final ResourceKey<Biome> CERULEAN_BIOME = registerOverworld("cerulean_biome");
    
    private static ResourceKey<Biome> registerOverworld(String name)
    {
        ResourceKey<Biome> key = ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, name));
        overworldBiomes.add(key);
        allBiomes.add(key);
        return key;
    }
}
