package com.hastur.examplemod.item;

import com.hastur.examplemod.ExampleMod;
import com.hastur.examplemod.item.custom.SeekersCompassItem;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ExampleMod.MODID);
	
	public static final DeferredItem<Item> MERCURY = ITEMS.register("mercury",
			() -> new Item(new Item.Properties()));
	
	public static final DeferredItem<Item> STARLIGHT_SHARD = ITEMS.register("starlight_shard",
			() -> new Item(new Item.Properties()));
	
	public static final DeferredItem<Item> RAW_CINNABAR = ITEMS.register("raw_cinnabar",
			() -> new Item(new Item.Properties()));
	
	public static final DeferredItem<Item> ALCHEMICAL_MEMOIR = ITEMS.register("alchemical_memoir",
			() -> new Item(new Item.Properties()));
	
	public static final DeferredItem<Item> GOLD_AMALGAM = ITEMS.register("gold_amalgam",
			() -> new Item(new Item.Properties()));
	
	public static final DeferredItem<Item> IRON_AMALGAM = ITEMS.register("iron_amalgam",
			() -> new Item(new Item.Properties()));
	
	public static final DeferredItem<Item> COPPER_AMALGAM = ITEMS.register("copper_amalgam",
			() -> new Item(new Item.Properties()));
	
	public static final DeferredItem<Item> SEEKERS_COMPASS = ITEMS.register("seekers_compass",
			() -> new SeekersCompassItem(new SeekersCompassItem.Properties()));
	
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}