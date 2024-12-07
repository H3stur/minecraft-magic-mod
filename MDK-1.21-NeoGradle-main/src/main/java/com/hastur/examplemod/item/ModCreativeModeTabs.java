package com.hastur.examplemod.item;

import java.util.function.Supplier;

import com.hastur.examplemod.ExampleMod;
import com.hastur.examplemod.block.ModBlocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = 
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MODID);
	
	
	public static final Supplier<CreativeModeTab> PRAECONIS_ITEMS_TAB = CREATIVE_MODE_TAB.register("praeconis_items_tab",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_CINNABAR.get()))
					.title(Component.translatable("creativetab.examplemod.praeconis_items"))
					.displayItems((itemDisplayParameters, output) -> {
						output.accept(ModItems.MERCURY);
						output.accept(ModItems.RAW_CINNABAR);
						output.accept(ModItems.ALCHEMICAL_MEMOIR);
						output.accept(ModItems.STARLIGHT_SHARD);
						output.accept(ModItems.SEEKERS_COMPASS);
						output.accept(ModItems.IRON_AMALGAM);
						output.accept(ModItems.GOLD_AMALGAM);
						output.accept(ModItems.COPPER_AMALGAM);
						
			}).build());
	
	public static final Supplier<CreativeModeTab> PRAECONIS_BLOCKS_TAB = CREATIVE_MODE_TAB.register("praeconis_blocks_tab",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CINNABAR_ORE.get()))
					.title(Component.translatable("creativetab.examplemod.praeconis_blocks"))
					.displayItems((itemDisplayParameters, output) -> {
						output.accept(ModBlocks.CINNABAR_ORE);
						output.accept(ModBlocks.DEEPSLATE_CINNABAR_ORE);
						output.accept(ModBlocks.JADEITE);
						output.accept(ModBlocks.JADEITE_BLOCK);
						output.accept(ModBlocks.JADEITE_BRICKS);
						output.accept(ModBlocks.RAW_CINNABAR_BLOCK);
						output.accept(ModBlocks.NULLSTONE);
						output.accept(ModBlocks.CRUCIBLE);
						output.accept(ModBlocks.NULLSTONE_UNOBTAINIUM_ORE);
						output.accept(ModBlocks.GLOOM_LOG);
						output.accept(ModBlocks.GLOOM_LEAVES);
						output.accept(ModBlocks.MYSTICAL_GRASS);
						
			}).build());
	
	
	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TAB.register(eventBus);
	}
}
