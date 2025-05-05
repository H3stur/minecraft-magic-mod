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
import net.minecraft.world.level.block.SeagrassBlock;
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
	
	public static final DeferredBlock<Block> LIMESTONE = genericStoneBlock("limestone");

	public static final DeferredBlock<Block> ASHES = registerBlock("ashes",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "limestone")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));

	public static final DeferredBlock<Block> SUSPICIOUS_ASHES = registerBlock("suspicious_ashes",
			() -> new Block(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "limestone")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));

	public static final DeferredBlock<Block> BLUE_MOSS_BLOCK = genericStoneBlock("blue_moss_block");
	public static final DeferredBlock<Block> JADEITE = genericStoneBlock("jadeite");
	public static final DeferredBlock<Block> ACTIVATED_JADEITE = genericStoneBlock("activated_jadeite");
	public static final DeferredBlock<Block> JADEITE_BLOCK = genericStoneBlock("jadeite_block");
	public static final DeferredBlock<Block> ACTIVATED_JADEITE_BLOCK = genericStoneBlock("activated_jadeite_block");
	public static final DeferredBlock<Block> JADEITE_BRICKS = genericStoneBlock("jadeite_bricks");
	public static final DeferredBlock<Block> ACTIVATED_JADEITE_BRICKS = genericStoneBlock("activated_jadeite_bricks");
	public static final DeferredBlock<Block> RAW_CINNABAR_BLOCK = genericStoneBlock("raw_cinnabar_block");
	public static final DeferredBlock<Block> NULLSTONE = genericStoneBlock("nullstone");

	public static final DeferredBlock<Block> RUNE_PEDESTAL = registerBlock("rune_pedestal",
			() -> new RunePedestalBlock(BlockBehaviour.Properties.of()
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "rune_pedestal")))
					.strength(3f)
					.noOcclusion()
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));

	public static final DeferredBlock<Block> JADEITE_BLOCK_SLAB = registerBlock("jadeite_block_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE_SLAB)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "jadeite_block_slab")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));

	public static final DeferredBlock<Block> JADEITE_BRICKS_SLAB = registerBlock("jadeite_bricks_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE_SLAB)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "jadeite_bricks_slab")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));

	public static final DeferredBlock<Block> JADEITE_BLOCK_STAIRS = registerBlock("jadeite_block_stairs",
			() -> new StairBlock(ModBlocks.JADEITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "jadeite_block_stairs")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.WOOD
					)));

	public static final DeferredBlock<Block> JADEITE_BRICK_STAIRS = registerBlock("jadeite_brick_stairs",
			() -> new StairBlock(ModBlocks.JADEITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "jadeite_brick_stairs")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.WOOD
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
	
	public static final DeferredBlock<Block> BLUE_CATTAIL = registerBlock("blue_cattail",
			() -> new SeagrassBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SEAGRASS)
					.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "blue_cattail")))
					.strength(3f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.STONE
					)));
	
	
	public static final DeferredBlock<Block> GLOOM_LOG = genericPillarBlock("gloom_log");
	public static final DeferredBlock<Block> GLOOM_WOOD = genericPillarBlock("gloom_wood");
	public static final DeferredBlock<Block> STRIPPED_GLOOM_LOG = genericPillarBlock("stripped_gloom_log");
	public static final DeferredBlock<Block> STRIPPED_GLOOM_WOOD = genericPillarBlock("stripped_gloom_wood");
	
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
	
	public static final DeferredBlock<Block> CERULEA_LOG = genericPillarBlock("cerulea_log");
	public static final DeferredBlock<Block> CERULEA_WOOD = genericPillarBlock("cerulea_wood");
	
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
	

	public static final DeferredBlock<Block> genericStoneBlock(String name)
	{
		return registerBlock(name,
				() -> new Block(BlockBehaviour.Properties.of()
						.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, name)))
						.strength(2.5f)
						.requiresCorrectToolForDrops()
						.sound(SoundType.STONE
						)));
	}

	public static final DeferredBlock<Block> genericPillarBlock(String name)
	{
		return registerBlock(name,
				() -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
						.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, name)))
						.strength(3f)
						.requiresCorrectToolForDrops()
						.sound(SoundType.WOOD
						)));
	}

	
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
