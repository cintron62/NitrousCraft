package com.cintron62.nitrouscraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModBlock.TitaniumBlock), "sss", "sss", "sss", 's', new ItemStack(ModItems.TitaniumIngot));
    }
}
