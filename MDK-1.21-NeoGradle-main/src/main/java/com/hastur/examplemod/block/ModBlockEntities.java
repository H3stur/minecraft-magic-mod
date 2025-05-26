package com.hastur.examplemod.block;

import com.hastur.examplemod.ExampleMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, ExampleMod.MODID);

    public static final Supplier<BlockEntityType<RunePedestalBlockEntity>> RUNE_PEDESTAL_ENTITY =
            BLOCK_ENTITY_TYPES.register("rune_pedestal_entity", () -> new BlockEntityType<>(
                    RunePedestalBlockEntity::new, ModBlocks.RUNE_PEDESTAL.get()
            ));
    public static final Supplier<BlockEntityType<RunePedestalBlockEntity>> INSCRIBING_TABLE_ENTITY =
            BLOCK_ENTITY_TYPES.register("inscribing_table_entity", () -> new BlockEntityType<>(
                    RunePedestalBlockEntity::new, ModBlocks.INSCRIBING_TABLE.get()
            ));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITY_TYPES.register(eventBus);
    }
}
