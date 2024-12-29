
package com.hastur.examplemod.worldgen.biome;

import com.hastur.examplemod.ExampleMod;

import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "overworld"), 5));
    }
}
