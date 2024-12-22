package com.hastur.examplemod.worldgen.biome;

import com.hastur.examplemod.ExampleMod;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class ModBiomes {
	
	public static final ResourceKey<Biome> CERULEAN_BIOME = ResourceKey.create(Registries.BIOME,
			ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "cerulean_biome"));
	
	public static void boostrap(BootstrapContext<Biome> context) {		
		context.register(CERULEAN_BIOME, ceruleanBiome(context));
	}
	
	private static Biome ceruleanBiome(BootstrapContext<Biome> context){
		
		return new Biome.BiomeBuilder()
				.build();
	}
}
