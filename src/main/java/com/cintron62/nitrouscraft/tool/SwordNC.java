package com.cintron62.nitrouscraft.tool;

import com.cintron62.nitrouscraft.creativetab.CreativeTabNC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import static com.cintron62.nitrouscraft.referance.Referance.MOD_ID;

public class SwordNC extends ItemSword
{

    public SwordNC(ToolMaterial p_i45356_1_) {
        super(p_i45356_1_);
        this.setCreativeTab(CreativeTabNC.NC_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
