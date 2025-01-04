package com.hastur.examplemod.block;

import java.util.function.Supplier;

import com.hastur.examplemod.ExampleMod;
import com.hastur.examplemod.item.ModItems;
import com.hastur.examplemod.worldgen.tree.ModTreeGrowers;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
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
					.strength(2.5f)
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
	
	public static final DeferredBlock<Block> ACTIVATED_JADEITE = registerBlock("activated_jadeite",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "activated_jadeite")))
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
	
	public static final DeferredBlock<Block> ACTIVATED_JADEITE_BLOCK = registerBlock("activated_jadeite_block",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "activated_jadeite_block")))
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
	
	public static final DeferredBlock<Block> ACTIVATED_JADEITE_BRICKS = registerBlock("activated_jadeite_bricks",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "activated_jadeite_bricks")))
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
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "gloom_log")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.WOOD
					)));
	
	public static final DeferredBlock<Block> GLOOM_WOOD = registerBlock("gloom_wood",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "gloom_wood")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.WOOD
					)));
	
	public static final DeferredBlock<Block> STRIPPED_GLOOM_LOG = registerBlock("stripped_gloom_log",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "stripped_gloom_log")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.WOOD
					)));
	
	public static final DeferredBlock<Block> STRIPPED_GLOOM_WOOD = registerBlock("stripped_gloom_wood",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "stripped_gloom_wood")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.WOOD
					)));
	
	public static final DeferredBlock<Block> GLOOM_PLANKS = registerBlock("gloom_planks",
			() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "gloom_planks")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.WOOD
					)));
	
	public static final DeferredBlock<Block> GLOOM_STAIRS = registerBlock("gloom_stairs",
			() -> new StairBlock(ModBlocks.GLOOM_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "gloom_stairs")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.WOOD
					)));
	
	public static final DeferredBlock<Block> GLOOM_SLAB = registerBlock("gloom_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "gloom_slab")))
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
	
	public static final DeferredBlock<Block> CERULEA_SAPLING = registerBlock("cerulea_sapling",
			() -> new SaplingBlock(ModTreeGrowers.CERULEA,BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "cerulea_sapling")))
					.strength(1f)
					.noCollission()
					.noOcclusion()
					.sound(SoundType.GRASS
					)));
	
	public static final DeferredBlock<Block> GLOOM_LEAVES = registerBlock("gloom_leaves",
			() -> new Block(BlockBehaviour.Properties.of()
					.noOcclusion()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "gloom_leaves")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.GRASS
					)));
	
	public static final DeferredBlock<Block> CERULEA_LEAVES = registerBlock("cerulea_leaves",
			() -> new Block(BlockBehaviour.Properties.of()
					.noOcclusion()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "cerulea_leaves")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.GRASS
					)));
	
	public static final DeferredBlock<Block> CERULEA_LOG = registerBlock("cerulea_log",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "cerulea_log")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.WOOD
					)));
	
	public static final DeferredBlock<Block> CERULEA_WOOD = registerBlock("cerulea_wood",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "cerulea_wood")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.WOOD
					)));
	
	public static final DeferredBlock<Block> CERULEA_PLANKS = registerBlock("cerulea_planks",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "cerulea_planks")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.WOOD
					)));
	
	public static final DeferredBlock<Block> CERULEA_STAIRS = registerBlock("cerulea_stairs",
			() -> new StairBlock(ModBlocks.CERULEA_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "cerulea_stairs")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.WOOD
					)));
	
	public static final DeferredBlock<Block> CERULEA_SLAB = registerBlock("cerulea_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "cerulea_slab")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.WOOD
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
