package com.cintron62.nitrouscraft.entity.machines;

import com.cintron62.nitrouscraft.NitrousCraft;
import com.cintron62.nitrouscraft.block.BlockNC;
import com.cintron62.nitrouscraft.creativetab.CreativeTabNC;
import com.cintron62.nitrouscraft.referance.Referance;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class NCCraftingDesk extends BlockNC {
    @SideOnly(Side.CLIENT)
    private IIcon CraftingDeskFront;

    @SideOnly(Side.CLIENT)
    private IIcon CraftingDeskTop;

    public NCCraftingDesk() {
        super(Material.wood);
        this.setBlockName("WorkSurface");
        this.setCreativeTab(CreativeTabNC.NC_TAB);

    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        return metadata == 0 && side == 3 ? this.CraftingDeskFront : side == 1? this.CraftingDeskTop : (side == 0 ? this.CraftingDeskTop : (side == metadata ? this.CraftingDeskFront : this.blockIcon));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Referance.MOD_ID + ":" + "CraftingDeskSide");
        this.CraftingDeskFront = iconRegister.registerIcon(Referance.MOD_ID + ":" + "CraftingDeskFront");
        this.CraftingDeskTop = iconRegister.registerIcon(Referance.MOD_ID + ":" + "CraftingDeskTop");
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c) {

        if (!player.isSneaking())
        {
            player.openGui(NitrousCraft.instance, NitrousCraft.guiIDCraftingDesk, world, x, y, z);
            return true;
        }
        else
        {
            return false;

        }
    }
}