package com.hastur.examplemod.block;

import java.util.function.Supplier;

import com.hastur.examplemod.ExampleMod;
import com.hastur.examplemod.item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
	public static final DeferredRegister.Blocks BLOCKS = 
			DeferredRegister.createBlocks(ExampleMod.MODID);
	
	
	public static final DeferredBlock<Block> CINNABAR_ORE = registerBlock("cinnabar_ore",
			() -> new Block(BlockBehaviour.Properties.of()
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> DEEPSLATE_CINNABAR_ORE = registerBlock("deepslate_cinnabar_ore",
			() -> new Block(BlockBehaviour.Properties.of()
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> JADEITE = registerBlock("jadeite",
			() -> new Block(BlockBehaviour.Properties.of()
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> JADEITE_BLOCK = registerBlock("jadeite_block",
			() -> new Block(BlockBehaviour.Properties.of()
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> JADEITE_BRICKS = registerBlock("jadeite_bricks",
			() -> new Block(BlockBehaviour.Properties.of()
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> RAW_CINNABAR_BLOCK = registerBlock("raw_cinnabar_block",
			() -> new Block(BlockBehaviour.Properties.of()
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> NULLSTONE = registerBlock("nullstone",
			() -> new Block(BlockBehaviour.Properties.of()
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> CRUCIBLE = registerBlock("crucible",
			() -> new Block(BlockBehaviour.Properties.of()
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> NULLSTONE_UNOBTAINIUM_ORE = registerBlock("nullstone_unobtainium_ore",
			() -> new Block(BlockBehaviour.Properties.of()
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
		DeferredBlock<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name,toReturn);
		return toReturn;
	}
	
	
	private static<T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}
	
	
	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}