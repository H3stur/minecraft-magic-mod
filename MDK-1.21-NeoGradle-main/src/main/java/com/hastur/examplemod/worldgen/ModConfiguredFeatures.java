package com.hastur.examplemod.worldgen;

import java.util.List;

import com.hastur.examplemod.ExampleMod;
import com.hastur.examplemod.block.ModBlocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures {
	
	public static final ResourceKey<ConfiguredFeature<?,?>> OVERWORLD_CINNABAR_ORE_KEY = registerKey("cinnabar_ore");
	
	
	public static void bootstrap(BootstrapContext<ConfiguredFeature<?,?>> context) {
		RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
		RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
		
		
		List<OreConfiguration.TargetBlockState> overworldCinnabarOres = List.of(OreConfiguration.target(stoneReplaceable,
				ModBlocks.CINNABAR_ORE.get().defaultBlockState()),
				OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_CINNABAR_ORE.get().defaultBlockState()));
		
		register(context, OVERWORLD_CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCinnabarOres, 9));
	}
	
	
	public static ResourceKey<ConfiguredFeature<?,?>> registerKey(String name){
		return ResourceKey.create(Registries.CONFIGURED_FEATURE , ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, name));
	}
	
	private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?,?>> context, ResourceKey<ConfiguredFeature<?,?>> key, F feature, FC configuration) {
		context.register(key,  new ConfiguredFeature<>(feature, configuration));
	}
	
}
