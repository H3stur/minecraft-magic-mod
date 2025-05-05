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
						output.accept(ModItems.IRON_AMALGAM);
						output.accept(ModItems.GOLD_AMALGAM);
						output.accept(ModItems.COPPER_AMALGAM);
						output.accept(ModItems.JADE_SHARD);
						output.accept(ModItems.ACTIVATED_JADE_SHARD);
						
			}).build());
	
	public static final Supplier<CreativeModeTab> PRAECONIS_BLOCKS_TAB = CREATIVE_MODE_TAB.register("praeconis_blocks_tab",
			() -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CINNABAR_ORE.get()))
					.title(Component.translatable("creativetab.examplemod.praeconis_blocks"))
					.displayItems((itemDisplayParameters, output) -> {
						output.accept(ModBlocks.CINNABAR_ORE);
						output.accept(ModBlocks.DEEPSLATE_CINNABAR_ORE);
						output.accept(ModBlocks.LIMESTONE);
						output.accept(ModBlocks.ASHES);
						output.accept(ModBlocks.SUSPICIOUS_ASHES);
						output.accept(ModBlocks.JADEITE);
						output.accept(ModBlocks.JADEITE_BLOCK);
						output.accept(ModBlocks.JADEITE_BLOCK_SLAB);
						output.accept(ModBlocks.JADEITE_BRICKS_SLAB);
						output.accept(ModBlocks.JADEITE_BLOCK_STAIRS);
						output.accept(ModBlocks.JADEITE_BRICK_STAIRS);
						output.accept(ModBlocks.JADEITE_BRICKS);
						output.accept(ModBlocks.ACTIVATED_JADEITE_BLOCK);
						output.accept(ModBlocks.ACTIVATED_JADEITE_BRICKS);
						output.accept(ModBlocks.ACTIVATED_JADEITE);
						output.accept(ModBlocks.RAW_CINNABAR_BLOCK);
						output.accept(ModBlocks.NULLSTONE);
						output.accept(ModBlocks.CRUCIBLE);
						output.accept(ModBlocks.NULLSTONE_UNOBTAINIUM_ORE);
						
						output.accept(ModBlocks.BLUE_CATTAIL);
						output.accept(ModBlocks.BLUE_MOSS_BLOCK);

						output.accept(ModBlocks.RUNE_PEDESTAL);
						
						output.accept(ModBlocks.GLOOM_LOG);
						output.accept(ModBlocks.GLOOM_LEAVES);
						output.accept(ModBlocks.GLOOM_PLANKS);
						output.accept(ModBlocks.GLOOM_SLAB);
						output.accept(ModBlocks.GLOOM_STAIRS);
						output.accept(ModBlocks.GLOOM_WOOD);
						output.accept(ModBlocks.STRIPPED_GLOOM_WOOD);
						output.accept(ModBlocks.STRIPPED_GLOOM_LOG);

						output.accept(ModBlocks.CERULEA_LOG);
						output.accept(ModBlocks.CERULEA_PLANKS);
						output.accept(ModBlocks.CERULEA_WOOD);
						output.accept(ModBlocks.CERULEA_SLAB);
						output.accept(ModBlocks.CERULEA_STAIRS);
						output.accept(ModBlocks.CERULEA_LEAVES);
						output.accept(ModBlocks.CERULEA_SAPLING);
						
						output.accept(ModBlocks.MYSTICAL_GRASS);
						
			}).build());
	
	
	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TAB.register(eventBus);
	}
}
