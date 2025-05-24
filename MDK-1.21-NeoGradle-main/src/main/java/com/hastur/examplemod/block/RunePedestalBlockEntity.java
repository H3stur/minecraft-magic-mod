package com.hastur.examplemod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import static com.hastur.examplemod.block.ModBlockEntities.RUNE_PEDESTAL_ENTITY;

public class RunePedestalBlockEntity extends BlockEntity {
    public RunePedestalBlockEntity(BlockPos pos, BlockState state){
        super(RUNE_PEDESTAL_ENTITY.get(), pos, state);
    }




}
