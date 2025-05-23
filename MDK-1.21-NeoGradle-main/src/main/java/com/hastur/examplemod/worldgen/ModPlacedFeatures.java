package com.hastur.examplemod.worldgen;

import java.util.List;

import com.hastur.examplemod.ExampleMod;
import com.hastur.examplemod.block.ModBlocks;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class ModPlacedFeatures {

	public static final ResourceKey<PlacedFeature> CINNABAR_ORE_PLACED_KEY = registerKey("cinnabar_ore_placed");
	
	public static final ResourceKey<PlacedFeature> CERULEA_TREE_PLACED_KEY = registerKey("cerulea_tree_placed");
	
	public static final ResourceKey<PlacedFeature> CERULEA_ROCKS_PLACED_KEY = registerKey("cerulea_rocks_placed");
	
	
	public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, CINNABAR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_CINNABAR_ORE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        
        register(context, CERULEA_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CERULEA_KEY),
        		VegetationPlacements.treePlacement(PlacementUtils.countExtra(5, 0.2F, 2),ModBlocks.CERULEA_SAPLING.get()));
        
        
        //register(context, CERULEA_ROCKS_PLACED_KEY,configuredFeatures.getOrThrow(ModConfiguredFeatures.CERULEA_ROCKS_KEY),
        		//VegetationPlacements.treePlacement(PlacementUtils.countExtra(5, 0.2F, 2),ModBlocks.CERULEA_SAPLING.get()));
    }
	
	
	
	private static ResourceKey<PlacedFeature> registerKey(String name){
		return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, name));
	}
	
    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
            List<PlacementModifier> modifiers) {
    		context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
