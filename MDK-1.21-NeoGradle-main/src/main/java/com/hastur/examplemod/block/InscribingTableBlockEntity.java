package com.hastur.examplemod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.items.ItemStackHandler;

import static com.hastur.examplemod.block.ModBlockEntities.INSCRIBING_TABLE_ENTITY;
import static com.hastur.examplemod.block.ModBlockEntities.RUNE_PEDESTAL_ENTITY;

public class InscribingTableBlockEntity extends BlockEntity {
    public InscribingTableBlockEntity(BlockPos pos, BlockState state) {
        super(INSCRIBING_TABLE_ENTITY.get(), pos, state);
    }

    public final ItemStackHandler inventory = new ItemStackHandler(1) {
        @Override
        protected int getStackLimit(int slot, ItemStack stack) {
            return 1;
        }

        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            if (!level.isClientSide()) {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }

        }


    };

    public void clearContents() {
        inventory.setStackInSlot(0, ItemStack.EMPTY);
    }
}
