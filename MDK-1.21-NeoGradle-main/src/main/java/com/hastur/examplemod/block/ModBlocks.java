package com.hastur.examplemod.block;

import java.util.function.Supplier;

import com.hastur.examplemod.ExampleMod;
import com.hastur.examplemod.item.ModItems;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerBlock;
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
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "cinnabar_ore")))
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> DEEPSLATE_CINNABAR_ORE = registerBlock("deepslate_cinnabar_ore",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "deepslate_cinnabar_ore")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> JADEITE = registerBlock("jadeite",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "jadeite")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> JADEITE_BLOCK = registerBlock("jadeite_block",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "jadeite_block")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> JADEITE_BRICKS = registerBlock("jadeite_bricks",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "jadeite_bricks")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> RAW_CINNABAR_BLOCK = registerBlock("raw_cinnabar_block",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "raw_cinnabar_block")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> NULLSTONE = registerBlock("nullstone",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "nullstone")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> CRUCIBLE = registerBlock("crucible",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "crucible")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> NULLSTONE_UNOBTAINIUM_ORE = registerBlock("nullstone_unobtainium_ore",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "nullstone_unobtainium_ore")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> GLOOM_LOG = registerBlock("gloom_log",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "gloom_log")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.WOOD
					)));
	
	public static final DeferredBlock<Block> MYSTICAL_GRASS = registerBlock("mystical_grass",
			() -> new FlowerBlock(MobEffects.ABSORPTION, 0, BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "mystical_grass")))
					.strength(3f)
					.noCollission()
					.noOcclusion()
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	public static final DeferredBlock<Block> GLOOM_LEAVES = registerBlock("gloom_leaves",
			() -> new Block(BlockBehaviour.Properties.of()
					.noOcclusion()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "gloom_leaves")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.GRASS
					)));
	
	
	
	
	private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
		DeferredBlock<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name,toReturn);
		return toReturn;
	}
	
	
	private static<T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().useBlockDescriptionPrefix()
				.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, name)))));
	}
	
	
	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
