package com.hastur.examplemod.worldgen.tree;

import java.util.Optional;

import com.hastur.examplemod.ExampleMod;
import com.hastur.examplemod.worldgen.ModConfiguredFeatures;

import net.minecraft.world.level.block.grower.TreeGrower;

public class ModTreeGrowers {
	public static final TreeGrower CERULEA = new TreeGrower(ExampleMod.MODID + ":cerulea",
			Optional.empty(),Optional.of(ModConfiguredFeatures.CERULEA_KEY), Optional.empty());
}
