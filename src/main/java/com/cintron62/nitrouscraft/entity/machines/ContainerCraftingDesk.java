package com.cintron62.nitrouscraft.entity.machines;

import com.cintron62.nitrouscraft.handler.CraftingDeskHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ContainerCraftingDesk extends Container
{
    public InventoryCrafting craftMatrix;
    public IInventory craftResult;
    private World worldObj;
    private int posX;
    private int posY;
    private int posZ;

    public ContainerCraftingDesk(InventoryPlayer invPlayer, World world, int x, int y, int z)
    {
        craftMatrix = new InventoryCrafting(this, 5, 5);
        craftResult = new InventoryCraftResult();
        worldObj = world;
        posX = x;
        posY = y;
        posZ =z;

        this.addSlotToContainer(new SlotCrafting(invPlayer.player, craftMatrix, craftResult, 0, 141, 43));

        for (int i = 0; i < 5; i++)
        {
            for (int k = 0; k < 5; k++)
            {
                this.addSlotToContainer(new Slot(invPlayer, k + i * 9 + 9, 8 +k * 18, 7 + i * 18));
            }
        }

        for (int i = 0; i < 3; i++) {
            for(int k = 0; k < 9; k++) {
                this.addSlotToContainer(new Slot(invPlayer, k + i * 9 + 9, 8 + k * 18, 106 + i * 18));
            }
        }

        for (int i = 0; i < 9; i++) {
            this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 164));
        }

        onCraftMatrixChanged(craftMatrix);
    }

    public void onCraftMatrixChanged(IInventory iinventory)
        {
            craftResult.setInventorySlotContents(0, CraftingDeskHandler.getInstance().findMatchingRecipe(craftMatrix, worldObj));
        }


    @Override
    public boolean canInteractWith(EntityPlayer var1)
        {
            return false;
        }
    public void onContainerClosed(EntityPlayer par1EntityPlayer) {
        super.onContainerClosed(par1EntityPlayer);

        if (!this.worldObj.isRemote) {
            for (int i = 0; i < 9; ++i) {
                ItemStack itemstack = this.craftMatrix.getStackInSlotOnClosing(i);

                if (itemstack != null) {
                    par1EntityPlayer.dropPlayerItemWithRandomChoice(itemstack, false);
                }
            }
        }
    }

        public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
            ItemStack itemstack = null;
            Slot slot = (Slot)this.inventorySlots.get(par2);

            if (slot != null && slot.getHasStack())
            {
                ItemStack itemstack1 = slot.getStack();
                itemstack = itemstack1.copy();

                if (par2 == 0)
                {
                    if (!this.mergeItemStack(itemstack1, 10, 46, true))
                    {
                        return null;
                    }

                    slot.onSlotChange(itemstack1, itemstack);
                }
                else if (par2 >= 10 && par2 < 37)
                {
                    if (!this.mergeItemStack(itemstack1, 37, 46, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 37 && par2 < 46)
                {
                    if (!this.mergeItemStack(itemstack1, 10, 37, false))
                    {
                        return null;
                    }
                }
                else if (!this.mergeItemStack(itemstack1, 10, 46, false))
                {
                    return null;
                }

                if (itemstack1.stackSize == 0)
                {
                    slot.putStack((ItemStack)null);
                }
                else
                {
                    slot.onSlotChanged();
                }

                if (itemstack1.stackSize == itemstack.stackSize)
                {
                    return null;
                }

                slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
            }

            return itemstack;
        }

}
