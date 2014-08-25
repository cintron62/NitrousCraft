package com.cintron62.nitrouscraft.entity.machines;

import com.cintron62.nitrouscraft.NitrousCraft;
import com.cintron62.nitrouscraft.referance.Referance;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;


public class NCSmoothStoneFurnace extends BlockContainer
{
    private final boolean isActive;

    @SideOnly(Side.CLIENT)
    private IIcon iconFront;

    public NCSmoothStoneFurnace(boolean isActive)
    {
        super(Material.rock);
        this.isActive = isActive;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(Referance.MOD_ID + ":" + "SmoothStoneFurnaceSide");
        this.iconFront = iconRegister.registerIcon(Referance.MOD_ID + ":" + (this.isActive ? "SmoothStoneFurnaceFrontOn" : "SmoothStoneFurnaceOff"));
    }


    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return null;
    }
}
