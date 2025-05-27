package com.hastur.examplemod.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class InscribingTableBlock extends BaseEntityBlock {
    public InscribingTableBlock(Properties properties) {
        super(properties);

        this.registerDefaultState(this.stateDefinition.any().setValue(BlockStateProperties.FACING, Direction.NORTH));
    }

    public static final MapCodec<InscribingTableBlock> CODEC = simpleCodec(InscribingTableBlock::new);

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new InscribingTableBlockEntity(blockPos, blockState);
    }

    public static final VoxelShape SHAPE = Block.box(0.0,0.0,0.0,16,14,16);

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context){
        return SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.FACING); // Add facing to the block's state definition
    }

    // Correct method for getting the state of the block when it's placed
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        // The block faces the opposite direction of where the player is looking
        return this.defaultBlockState().setValue(BlockStateProperties.FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        //if(level.getBlockEntity(pos) instanceof InscribingTableBlockEntity inscribingTableBlockEntity) {
        //    ((ServerPlayer) player).openMenu(new SimpleMenuProvider(inscribingTableBlockEntity, Component.literal("inscribing_Table")), pos);
        //    return InteractionResult.PASS;
        //}
        return InteractionResult.PASS;
    }
}
