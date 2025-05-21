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
	
	public static final DeferredItem<Item> MERCURY = genericItem("mercury");
	public static final DeferredItem<Item> ACTIVATED_JADE_SHARD = genericItem("activated_jade_shard");
	public static final DeferredItem<Item> JADE_SHARD = genericItem("jade_shard");
	public static final DeferredItem<Item> STARLIGHT_SHARD = genericItem("starlight_shard");
	public static final DeferredItem<Item> RAW_CINNABAR = genericItem("raw_cinnabar");
	public static final DeferredItem<Item> ALCHEMICAL_MEMOIR = genericItem("alchemical_memoir");
	public static final DeferredItem<Item> GOLD_AMALGAM = genericItem("gold_amalgam");
	public static final DeferredItem<Item> IRON_AMALGAM = genericItem("iron_amalgam");
	public static final DeferredItem<Item> COPPER_AMALGAM = genericItem("copper_amalgam");

	public static final DeferredItem<Item> genericItem (String name)
	{
		return ITEMS.register(name,
				() -> new Item(new Item.Properties()
						.useItemDescriptionPrefix()
						.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ExampleMod.MODID,name)))));
	}
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
