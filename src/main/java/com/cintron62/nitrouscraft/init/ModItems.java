package com.cintron62.nitrouscraft.init;

import com.cintron62.nitrouscraft.block.NCTitaniumBlock;
import com.cintron62.nitrouscraft.item.*;
import com.cintron62.nitrouscraft.referance.Referance;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Referance.MOD_ID)
public class ModItems
{
    public static final ItemNC PlatinumIngot = new NCPlatinumIngot();
    public static final ItemNC TitaniumIngot = new NCTitaniumIngot();
    public static final ItemNC CobaltIngot = new NCCobaltIngot();
    public static final ItemNC CopperIngot = new NCCopperIngot();
    public static final ItemNC LithiumIngot = new NCLithiumIngot();
    public static final ItemNC TinIngot = new NCTinIngot();
    public static final ItemNC ZincIngot = new NCZincIngot();

    public static void init()

    {
        GameRegistry.registerItem(PlatinumIngot, "PlatinumIngot");
        GameRegistry.registerItem(TitaniumIngot, "TitaniumIngot");
        GameRegistry.registerItem(CobaltIngot, "CobaltIngot");
        GameRegistry.registerItem(CopperIngot, "CopperIngot");
        GameRegistry.registerItem(LithiumIngot, "LithiumIngot");
        GameRegistry.registerItem(TinIngot, "TinIngot");
        GameRegistry.registerItem(ZincIngot, "ZincIngot");

    }
}
