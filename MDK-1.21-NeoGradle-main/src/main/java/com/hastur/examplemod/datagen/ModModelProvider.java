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
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.item.BlockModelWrapper;
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

		//blockModels.createTrivialBlock(ModBlocks.RUNE_PEDESTAL.get(),);




        itemModels.itemModelOutput.accept(ModItems.RAW_CINNABAR.get(), new BlockModelWrapper
        		.Unbaked(ModelTemplates.FLAT_ITEM.create(ModItems.RAW_CINNABAR.get(),
        		new TextureMapping().put(TextureSlot.LAYER0, 
        		itemLocation(getItemName(ModItems.RAW_CINNABAR.get()))),
        		itemModels.modelOutput),
        		Collections.emptyList()));

        itemModels.itemModelOutput.accept(ModItems.MERCURY.get(), new BlockModelWrapper
        		.Unbaked(ModelTemplates.FLAT_ITEM.create(ModItems.MERCURY.get(),
        		new TextureMapping().put(TextureSlot.LAYER0, 
        		itemLocation(getItemName(ModItems.MERCURY.get()))),
        		itemModels.modelOutput),
        		Collections.emptyList()));
        
        itemModels.itemModelOutput.accept(ModItems.JADE_SHARD.get(), new BlockModelWrapper
        		.Unbaked(ModelTemplates.FLAT_ITEM.create(ModItems.JADE_SHARD.get(),
        		new TextureMapping().put(TextureSlot.LAYER0, 
        		itemLocation(getItemName(ModItems.JADE_SHARD.get()))),
        		itemModels.modelOutput),
        		Collections.emptyList()));
        
        itemModels.itemModelOutput.accept(ModItems.ACTIVATED_JADE_SHARD.get(), new BlockModelWrapper
        		.Unbaked(ModelTemplates.FLAT_ITEM.create(ModItems.ACTIVATED_JADE_SHARD.get(),
        		new TextureMapping().put(TextureSlot.LAYER0, 
        		itemLocation(getItemName(ModItems.ACTIVATED_JADE_SHARD.get()))),
        		itemModels.modelOutput),
        		Collections.emptyList()));
		
        itemModels.itemModelOutput.accept(ModItems.GOLD_AMALGAM.get(), new BlockModelWrapper
        		.Unbaked(ModelTemplates.FLAT_ITEM.create(ModItems.GOLD_AMALGAM.get(),
        		new TextureMapping().put(TextureSlot.LAYER0, 
        		itemLocation(getItemName(ModItems.GOLD_AMALGAM.get()))),
        		itemModels.modelOutput),
        		Collections.emptyList()));
        
        itemModels.itemModelOutput.accept(ModItems.IRON_AMALGAM.get(), new BlockModelWrapper
        		.Unbaked(ModelTemplates.FLAT_ITEM.create(ModItems.IRON_AMALGAM.get(),
        		new TextureMapping().put(TextureSlot.LAYER0, 
        		itemLocation(getItemName(ModItems.IRON_AMALGAM.get()))),
        		itemModels.modelOutput),
        		Collections.emptyList()));
        
        itemModels.itemModelOutput.accept(ModItems.COPPER_AMALGAM.get(), new BlockModelWrapper
        		.Unbaked(ModelTemplates.FLAT_ITEM.create(ModItems.COPPER_AMALGAM.get(),
        		new TextureMapping().put(TextureSlot.LAYER0, 
        		itemLocation(getItemName(ModItems.COPPER_AMALGAM.get()))),
        		itemModels.modelOutput),
        		Collections.emptyList()));
		
        itemModels.itemModelOutput.accept(ModItems.ALCHEMICAL_MEMOIR.get(), new BlockModelWrapper
        		.Unbaked(ModelTemplates.FLAT_ITEM.create(ModItems.ALCHEMICAL_MEMOIR.get(),
        		new TextureMapping().put(TextureSlot.LAYER0, 
        		itemLocation(getItemName(ModItems.ALCHEMICAL_MEMOIR.get()))),
        		itemModels.modelOutput),
        		Collections.emptyList()));

        itemModels.itemModelOutput.accept(ModItems.STARLIGHT_SHARD.get(), new BlockModelWrapper
        		.Unbaked(ModelTemplates.FLAT_ITEM.create(ModItems.STARLIGHT_SHARD.get(),
        		new TextureMapping().put(TextureSlot.LAYER0, 
        		itemLocation(getItemName(ModItems.STARLIGHT_SHARD.get()))),
        		itemModels.modelOutput),
        		Collections.emptyList()));
	}
	
	
    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        Collection<DeferredHolder<Block, ? extends Block>> BLOCKS = ModBlocks.BLOCKS.getEntries();
        Set<DeferredHolder<Block, ? extends Block>> COPY = new HashSet<>(BLOCKS);

        return COPY.stream();
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        Collection<DeferredHolder<Item, ? extends Item>> ITEMS = ModItems.ITEMS.getEntries();
        Set<DeferredHolder<Item, ? extends Item>> COPY = new HashSet<>(ITEMS);


        
        return COPY.stream();
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



}
