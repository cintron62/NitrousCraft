package com.cintron62.nitrouscraft.tool;

import com.cintron62.nitrouscraft.creativetab.CreativeTabNC;
import com.cintron62.nitrouscraft.item.ItemNC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import scala.reflect.internal.Trees;

import static com.cintron62.nitrouscraft.referance.Referance.MOD_ID;

public class PickaxeNC extends ItemPickaxe
{

    public PickaxeNC(ToolMaterial p_i45347_1_) {
        super(p_i45347_1_);
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
