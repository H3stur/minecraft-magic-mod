package com.hastur.examplemod.datagen;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import com.hastur.examplemod.ExampleMod;
import com.hastur.examplemod.worldgen.ModConfiguredFeatures;
import com.hastur.examplemod.worldgen.ModOverworldRegion;
import com.hastur.examplemod.worldgen.ModPlacedFeatures;
import com.hastur.examplemod.worldgen.biome.ModBiomes;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider{
	
	public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
			.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
			.add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
			.add(Registries.BIOME, ModBiomes::bootstrapBiomes);
	
	public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
		super(output, registries, BUILDER, Set.of(ExampleMod.MODID));
	}
}
