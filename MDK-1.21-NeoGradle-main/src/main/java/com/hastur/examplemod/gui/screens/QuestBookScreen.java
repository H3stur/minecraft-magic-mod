package com.hastur.examplemod.gui.screens;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class QuestBookScreen extends Screen{

	private static final Component TITLE = Component.translatable("gui.quests");

	// mouseX and mouseY indicate the scaled coordinates of where the cursor is in on the screen
	@Override
	public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
	    // Background is typically rendered first
	    this.renderBackground(graphics, mouseX, mouseY, partialTick);

	    // Render things here before widgets (background textures)

	    // Then the widgets if this is a direct child of the Screen
	    super.render(graphics, mouseX, mouseY, partialTick);

	    // Render things after widgets (tooltips)
	}

	@Override
	public void onClose() {

	    super.onClose();
	}

	@Override
	public void removed() {

	    super.removed()
	;}
	
	
	public QuestBookScreen() {
		super(TITLE);
	}
}
