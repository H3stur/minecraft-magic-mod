package com.hastur.examplemod.item;

import com.hastur.examplemod.ExampleMod;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExampleMod.MODID);
	
	public static final DeferredItem<Item> MERCURY = ITEMS.register("mercury",
			() -> new Item(new Item.Properties()
					.useItemDescriptionPrefix()
					.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "mercury")))));
	
	public static final DeferredItem<Item> ACTIVATED_JADE_SHARD = ITEMS.register("activated_jade_shard",
			() -> new Item(new Item.Properties()
					.useItemDescriptionPrefix()
					.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "activated_jade_shard")))));
	
	public static final DeferredItem<Item> JADE_SHARD = ITEMS.register("jade_shard",
			() -> new Item(new Item.Properties()
					.useItemDescriptionPrefix()
					.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "jade_shard")))));
	
	public static final DeferredItem<Item> STARLIGHT_SHARD = ITEMS.register("starlight_shard",
			() -> new Item(new Item.Properties()
					.useItemDescriptionPrefix()
					.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "starlight_shard")))));
	
	public static final DeferredItem<Item> RAW_CINNABAR = ITEMS.register("raw_cinnabar",
			() -> new Item(new Item.Properties()
					.useItemDescriptionPrefix()
					.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "raw_cinnabar")))));
	
	public static final DeferredItem<Item> ALCHEMICAL_MEMOIR = ITEMS.register("alchemical_memoir",
			() -> new Item(new Item.Properties()
					.useItemDescriptionPrefix()
					.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "alchemical_memoir")))));
	
	public static final DeferredItem<Item> GOLD_AMALGAM = ITEMS.register("gold_amalgam",
			() -> new Item(new Item.Properties()
					.useItemDescriptionPrefix()
					.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "gold_amalgam")))));
	
	public static final DeferredItem<Item> IRON_AMALGAM = ITEMS.register("iron_amalgam",
			() -> new Item(new Item.Properties()
					.useItemDescriptionPrefix()
					.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "iron_amalgam")))));
	
	public static final DeferredItem<Item> COPPER_AMALGAM = ITEMS.register("copper_amalgam",
			() -> new Item(new Item.Properties()
					.useItemDescriptionPrefix()
					.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID, "copper_amalgam")))));
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
