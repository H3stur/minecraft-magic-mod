package com.hastur.examplemod.datagen;

import java.util.concurrent.CompletableFuture;

import com.hastur.examplemod.block.ModBlocks;
import com.hastur.examplemod.item.ModItems;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;

public class ModRecipeProvider extends RecipeProvider{
	
	private final HolderGetter<Item> items;
	
	public ModRecipeProvider(HolderLookup.Provider lookupProvider, RecipeOutput output) {
        super(lookupProvider, output);
        this.items = lookupProvider.lookupOrThrow(Registries.ITEM);
    }
        
	@Override
	protected void buildRecipes(){
		
		// Craft 9 Raw Cinnabar into a Block
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_CINNABAR_BLOCK.get(),1)
        .pattern("AAA")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ModItems.RAW_CINNABAR)
        .unlockedBy(getHasName(ModItems.RAW_CINNABAR), has(ModItems.RAW_CINNABAR))
        .save(output);

        // Craft 9 Raw Cinnabar into a Block
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, ModBlocks.INSCRIBING_TABLE.get(),1)
                .pattern("AAA")
                .pattern("CBC")
                .pattern("C C")
                .define('A', Blocks.DEEPSLATE)
                .define('B', ModItems.JADE_SHARD)
                .define('C', Blocks.OAK_LOG)
                .unlockedBy(getHasName(ModItems.JADE_SHARD), has(ModItems.JADE_SHARD))
                .save(output);

        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JADEITE_BLOCK.get(),4)
        .pattern("AA ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', ModBlocks.JADEITE)
        .unlockedBy(getHasName(ModBlocks.JADEITE), has(ModBlocks.JADEITE))
        .save(output);
        
        ShapedRecipeBuilder.shaped(items, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JADEITE_BRICKS.get(),4)
        .pattern("AA ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', ModBlocks.JADEITE_BLOCK)
        .unlockedBy(getHasName(ModBlocks.JADEITE_BLOCK), has(ModBlocks.JADEITE_BLOCK))
        .save(output);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModItems.RAW_CINNABAR, 9)
        .requires(ModBlocks.RAW_CINNABAR_BLOCK)
        .unlockedBy(getHasName(ModItems.RAW_CINNABAR), has(ModBlocks.RAW_CINNABAR_BLOCK))
        .save(output);
        
        ShapelessRecipeBuilder.shapeless(items, RecipeCategory.MISC, ModBlocks.CERULEA_PLANKS, 4)
        .requires(ModBlocks.CERULEA_LOG)
        .unlockedBy(getHasName(ModBlocks.CERULEA_LOG), has(ModBlocks.CERULEA_PLANKS))
        .save(output);
        
	}
	
	
    public static final class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }
	
        @Override
        public String getName() {
            return "MOD NAME recipes";
        }
        
        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider lookupProvider, RecipeOutput output) {
            return new ModRecipeProvider(lookupProvider, output);
        }
}
} 