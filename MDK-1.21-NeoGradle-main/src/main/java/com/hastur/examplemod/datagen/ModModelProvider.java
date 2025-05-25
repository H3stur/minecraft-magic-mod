package com.hastur.examplemod.datagen;

import java.util.*;
import java.util.stream.Stream;

import com.hastur.examplemod.ExampleMod;
import com.hastur.examplemod.block.ModBlocks;
import com.hastur.examplemod.item.ModItems;

import com.sun.jna.platform.win32.Variant;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.MultiPartGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.block.model.VariantMutator;
import net.minecraft.client.renderer.item.BlockModelWrapper;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.loaders.CompositeModelBuilder;
import net.neoforged.neoforge.registries.DeferredHolder;


public class ModModelProvider extends ModelProvider{
	public ModModelProvider(PackOutput output) {
        super(output);
    }
	
	@Override
	protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
		blockModels.createTrivialBlock(ModBlocks.JADEITE.get(), TexturedModel.CUBE);
		blockWithSlab(blockModels, ModBlocks.JADEITE_BRICKS.get(), ModBlocks.JADEITE_BRICKS_SLAB.get());
		blockWithSlab(blockModels, ModBlocks.JADEITE_BLOCK.get(), ModBlocks.JADEITE_BLOCK_SLAB.get());
		stairsBlock(blockModels, ModBlocks.JADEITE_BRICK_STAIRS.get(), ModBlocks.JADEITE_BRICKS.get());
		stairsBlock(blockModels, ModBlocks.JADEITE_BLOCK_STAIRS.get(), ModBlocks.JADEITE_BLOCK.get());
		
		blockModels.createTrivialBlock(ModBlocks.ACTIVATED_JADEITE.get(), TexturedModel.CUBE);
		blockModels.createTrivialBlock(ModBlocks.ACTIVATED_JADEITE_BRICKS.get(), TexturedModel.CUBE);
		blockModels.createTrivialBlock(ModBlocks.ACTIVATED_JADEITE_BLOCK.get(), TexturedModel.CUBE);
		
		blockModels.createTrivialBlock(ModBlocks.LIMESTONE.get(), TexturedModel.CUBE);

		blockModels.createTrivialBlock(ModBlocks.BLUE_MOSS_BLOCK.get(), TexturedModel.CUBE);

		blockModels.createTrivialBlock(ModBlocks.ASHES.get(), TexturedModel.CUBE);
		blockModels.createTrivialBlock(ModBlocks.SUSPICIOUS_ASHES.get(), TexturedModel.CUBE);
		
		blockModels.createTrivialBlock(ModBlocks.CINNABAR_ORE.get(), TexturedModel.CUBE);
		blockModels.createTrivialBlock(ModBlocks.DEEPSLATE_CINNABAR_ORE.get(), TexturedModel.CUBE);
		blockModels.createTrivialBlock(ModBlocks.RAW_CINNABAR_BLOCK.get(), TexturedModel.CUBE);
		

		logBlock(blockModels, ModBlocks.CERULEA_LOG.get(), ModBlocks.CERULEA_WOOD.get());

		blockModels.createTrivialBlock(ModBlocks.CERULEA_LEAVES.get(),TexturedModel.LEAVES.updateTemplate(template ->
				template.extend().renderType("minecraft:cutout").build()));



		blockWithSlab(blockModels, ModBlocks.CERULEA_PLANKS.get(), ModBlocks.CERULEA_SLAB.get());
		stairsBlock(blockModels, ModBlocks.CERULEA_STAIRS.get(), ModBlocks.CERULEA_PLANKS.get());
		


		blockModels.createTrivialBlock(ModBlocks.CERULEA_SAPLING.get(),TexturedModel.CUBE);

		blockModels.createTrivialBlock(ModBlocks.NULLSTONE.get(), TexturedModel.CUBE);
		blockModels.createTrivialBlock(ModBlocks.NULLSTONE_UNOBTAINIUM_ORE.get(), TexturedModel.CUBE);
		



		
		logBlock(blockModels, ModBlocks.GLOOM_LOG.get(), ModBlocks.GLOOM_WOOD.get());
		logBlock(blockModels, ModBlocks.STRIPPED_GLOOM_LOG.get(), ModBlocks.STRIPPED_GLOOM_WOOD.get());
		blockWithSlab(blockModels, ModBlocks.GLOOM_PLANKS.get(), ModBlocks.GLOOM_SLAB.get());
		stairsBlock(blockModels, ModBlocks.GLOOM_STAIRS.get(), ModBlocks.GLOOM_PLANKS.get());
		

		blockModels.createTrivialBlock(ModBlocks.GLOOM_LEAVES.get(),TexturedModel.LEAVES.updateTemplate(template ->
				template.extend().renderType("minecraft:cutout").build()));

		blockModels.createTrivialBlock(ModBlocks.CRUCIBLE.get(), TexturedModel.ORIENTABLE_ONLY_TOP);

		blockModels.createTrivialBlock(ModBlocks.MYSTICAL_GRASS.get(),TexturedModel.CUBE);

		blockModels.createTrivialBlock(ModBlocks.BLUE_CATTAIL.get(),TexturedModel.CUBE);






		genericItemModel(ModItems.RAW_CINNABAR.get(),itemModels);
		genericItemModel(ModItems.MERCURY.get(),itemModels);
		genericItemModel(ModItems.JADE_SHARD.get(),itemModels);
		genericItemModel(ModItems.ACTIVATED_JADE_SHARD.get(),itemModels);
		genericItemModel(ModItems.GOLD_AMALGAM.get(),itemModels);
		genericItemModel(ModItems.IRON_AMALGAM.get(),itemModels);
		genericItemModel(ModItems.COPPER_AMALGAM.get(),itemModels);
		genericItemModel(ModItems.ALCHEMICAL_MEMOIR.get(),itemModels);
        genericItemModel(ModItems.STARLIGHT_SHARD.get(),itemModels);
		genericItemModel(ModItems.BLANK_RUNE.get(),itemModels);
		genericItemModel(ModItems.PRIMITIVE_RUNE.get(),itemModels);
	}

	public void genericItemModel(Item item, ItemModelGenerators itemModels)
	{
		itemModels.itemModelOutput.accept(item, new BlockModelWrapper
				.Unbaked(ModelTemplates.FLAT_ITEM.create(item,
				new TextureMapping().put(TextureSlot.LAYER0,
						itemLocation(getItemName(item))),
				itemModels.modelOutput),
				Collections.emptyList()));
	}
    
    private String getItemName(Item item){
        ResourceLocation location = BuiltInRegistries.ITEM.getKey(item);
        return location.getPath();
    }
    
    private ResourceLocation itemLocation(String modelName){
        return ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "item/" + modelName);
    }
    
    private void stairsBlock(BlockModelGenerators blockModels, Block block, Block materialBlock){
        ResourceLocation texture = blockLocation(getBlockName(materialBlock));
        blockModels.new BlockFamilyProvider(TextureMapping.defaultTexture(texture)
                .put(TextureSlot.BOTTOM, texture)
                .put(TextureSlot.TOP, texture)
                .put(TextureSlot.SIDE, texture)
        ).stairs(block);
    }
    
    private void blockWithSlab(BlockModelGenerators blockModels, Block block, Block slab){
        ResourceLocation texture = blockLocation(getBlockName(block));
        blockModels.new BlockFamilyProvider(TextureMapping.cube(texture)
                .put(TextureSlot.BOTTOM, texture)
                .put(TextureSlot.TOP, texture)
                .put(TextureSlot.SIDE, texture)
        ).fullBlock(block, ModelTemplates.CUBE_ALL).slab(slab);
    }
    
    private void logBlock(BlockModelGenerators blockModels, Block block, Block wood){
        blockModels.woodProvider(block).logWithHorizontal(block).wood(wood);
    }
    
    private String getBlockName(Block block){
        ResourceLocation location = BuiltInRegistries.BLOCK.getKey(block);
        return location.getPath();
    }
    
    private ResourceLocation blockLocation(String modelName){
        return ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "block/" + modelName);
    }


	@Override
	protected Stream<? extends Holder<Block>> getKnownBlocks() {
		return ModBlocks.BLOCKS.getEntries().stream().filter(x -> !x.is(ModBlocks.RUNE_PEDESTAL) && !x.is(ModBlocks.INSCRIBING_TABLE));
	}

	@Override
	protected Stream<? extends Holder<Item>> getKnownItems() {
		return ModItems.ITEMS.getEntries().stream().filter(x -> x.get() != ModBlocks.RUNE_PEDESTAL.asItem()  && x.get() != ModBlocks.INSCRIBING_TABLE.asItem());
	}
}
