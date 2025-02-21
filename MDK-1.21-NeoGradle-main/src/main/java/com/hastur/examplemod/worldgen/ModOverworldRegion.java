package com.hastur.examplemod.worldgen;

import java.util.function.Consumer;

import com.hastur.examplemod.ExampleMod;
import com.hastur.examplemod.worldgen.biome.ModBiomes;
import com.mojang.datafixers.util.Pair;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import terrablender.api.Region;
import terrablender.api.RegionType;

public class ModOverworldRegion extends Region{

	public static final ResourceLocation LOCATION = ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "overworld");
	
    public ModOverworldRegion(int weight)
    {
        super(LOCATION, RegionType.OVERWORLD, weight);
    }
    
    public static void bootstrapBiomes(BootstrapContext<Biome> context)
    {
        HolderGetter<ConfiguredWorldCarver<?>> carverGetter = context.lookup(Registries.CONFIGURED_CARVER);
        HolderGetter<PlacedFeature> placedFeatureGetter = context.lookup(Registries.PLACED_FEATURE);
        
        register(context, ModBiomes.CERULEAN_BIOME, ModOverworldBiomes.ceruleanBiome(placedFeatureGetter, carverGetter));
    }
    
    private static void register(BootstrapContext<Biome> context, ResourceKey<Biome> key, Biome biome)
    {
        context.register(key, biome);
    }
    
    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.FOREST, ModBiomes.CERULEAN_BIOME);
        });
    }
}
