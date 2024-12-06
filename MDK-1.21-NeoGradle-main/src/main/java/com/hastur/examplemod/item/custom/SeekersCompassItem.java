package com.hastur.examplemod.item.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SeekersCompassItem extends Item {	

	public SeekersCompassItem(Properties properties) {
		super(properties);
	}
	
	public BlockPos pPos;
	
	
	//Should run whenever you right click with the Item
	@Override
	public InteractionResult use(Level pLevel, Player pPlayer, InteractionHand pUsedHand){
		
		pPlayer.displayClientMessage(message(), false);
		
		return InteractionResult.PASS;
	}
	
	//Should run every tick the Item is in a players inventory
	@Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
		
		pPos = pEntity.blockPosition();
	}
	
	//Test Component for my Message
    public Component message() {
        return Component.literal("You are currently standing at: "+pPos.getX()+" "+pPos.getZ());
    }
	
}
