package com.cintron62.nitrouscraft.client.gui;

import com.cintron62.nitrouscraft.NitrousCraft;
import com.cintron62.nitrouscraft.entity.machines.ContainerCraftingDesk;
import com.cintron62.nitrouscraft.referance.Referance;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class GuiCraftingDesk extends GuiContainer
{
    private ResourceLocation texture = new ResourceLocation(Referance.MOD_ID + ":" + "textures/gui/CraftingDesk.png");

    public GuiCraftingDesk(InventoryPlayer invPlayer, World world, int x, int y, int z)
    {
        super(new ContainerCraftingDesk(invPlayer, world, x, y, z));

        this.xSize = 176;
        this.ySize = 188;

    }

    public void onGuiClosed(){
        super.onGuiClosed();
    }

    protected void drawGuiContainerForegroundLayer(int i, int j){
        this.fontRendererObj.drawString(StatCollector.translateToLocal("CraftingDesk"), 100, 5, 0xFFFFFF);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3)
    {
        GL11.glColor4f(1F, 1F, 1F, 1F);

        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);

        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
