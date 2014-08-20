package com.cintron62.nitrouscraft.creativetab;

import com.cintron62.nitrouscraft.init.ModItems;
import com.cintron62.nitrouscraft.referance.Referance;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabNC
{
    public static final CreativeTabs NC_TAB = new CreativeTabs(Referance.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.PlatinumIngot;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Nitrous Craft";
        }
    };
}