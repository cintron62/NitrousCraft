package com.cintron62.nitrouscraft.init;

import com.cintron62.nitrouscraft.block.NCTitaniumBlock;
import com.cintron62.nitrouscraft.item.ItemNC;
import com.cintron62.nitrouscraft.item.NCPlatinumIngot;
import com.cintron62.nitrouscraft.item.NCTitaniumIngot;
import com.cintron62.nitrouscraft.referance.Referance;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Referance.MOD_ID)
public class ModItems
{
    public static final ItemNC PlatinumIngot = new NCPlatinumIngot();
    public static final ItemNC TitaniumIngot = new NCTitaniumIngot();

    public static void init()

    {
        GameRegistry.registerItem(PlatinumIngot, "PlatinumIngot");
        GameRegistry.registerItem(TitaniumIngot, "TitaniumIngot");
    }
}
