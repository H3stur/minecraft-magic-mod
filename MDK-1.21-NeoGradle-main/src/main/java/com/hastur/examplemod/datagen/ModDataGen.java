package com.hastur.examplemod.datagen;

import java.util.concurrent.CompletableFuture;

import com.hastur.examplemod.ExampleMod;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = ExampleMod.MODID, value = Dist.CLIENT)
public class ModDataGen {
	@SubscribeEvent
	public static void gatherData(GatherDataEvent.Client event) {
		
		DataGenerator generator = event.getGenerator();
		PackOutput output = generator.getPackOutput();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
	
		//event.addProvider(new ModBlockStateProvider(output, existingFileHelper));
		
		event.addProvider(new ModModelProvider(output));
		event.addProvider(new ModRecipeProvider.Runner(output, event.getLookupProvider()));
	}
}

