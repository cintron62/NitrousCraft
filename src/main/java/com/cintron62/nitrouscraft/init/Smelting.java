package com.cintron62.nitrouscraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

/**
 * Created by Rikusen on 8/20/2014.
 */
public class Smelting
{
    public static void init()
    {
        GameRegistry.addSmelting(ModBlock.TitaniumOre, new ItemStack(ModItems.TitaniumIngot), 0);
        GameRegistry.addSmelting(ModBlock.PlatinumOre, new ItemStack(ModItems.PlatinumIngot), 0);
        GameRegistry.addSmelting(ModBlock.CobaltOre, new ItemStack(ModItems.CobaltIngot), 0);
        GameRegistry.addSmelting(ModBlock.CopperOre, new ItemStack(ModItems.CopperIngot), 0);
        GameRegistry.addSmelting(ModBlock.LithiumOre, new ItemStack(ModItems.LithiumIngot), 0);
        GameRegistry.addSmelting(ModBlock.TinOre, new ItemStack(ModItems.TinIngot), 0);
        GameRegistry.addSmelting(ModBlock.ZincOre, new ItemStack(ModItems.ZincIngot), 0);
    }
}
