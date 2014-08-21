package com.cintron62.nitrouscraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

import static com.cintron62.nitrouscraft.init.ModItems.*;

/**
 * Created by Rikusen on 8/20/2014.
 */
public class Smelting
{
    //GameRegistry.addSmelting(Insert Output, new ItemStack(Insert Input), XP given);

    public static void init()
    {
        GameRegistry.addSmelting(ModBlock.TitaniumOre, new ItemStack(TitaniumIngot), 0);
        GameRegistry.addSmelting(ModBlock.PlatinumOre, new ItemStack(PlatinumIngot), 0);
        GameRegistry.addSmelting(ModBlock.CobaltOre, new ItemStack(CobaltIngot), 0);
        GameRegistry.addSmelting(ModBlock.CopperOre, new ItemStack(CopperIngot), 0);
        GameRegistry.addSmelting(ModBlock.LithiumOre, new ItemStack(LithiumIngot), 0);
        GameRegistry.addSmelting(ModBlock.TinOre, new ItemStack(TinIngot), 0);
        GameRegistry.addSmelting(ModBlock.ZincOre, new ItemStack(ZincIngot), 0);
    }
}
