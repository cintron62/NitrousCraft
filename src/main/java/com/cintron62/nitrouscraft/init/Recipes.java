package com.cintron62.nitrouscraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import static com.cintron62.nitrouscraft.init.ModItems.*;
import static com.cintron62.nitrouscraft.init.ModTools.*;

public class Recipes extends OreDictionary
{
    public static void init()
    {

        //GameRegistry.addRecipe(new "ItemStack(Insert Output Item Here"), "sss", "sss", "sss", 's', new ItemStack("Insert Ingot Here"));
        // "CCC", "CCC" "CCC" States block position for crafting. First set being "TOP", Second "MID", Third "BOT"
        //Can mix and match to include other materials! EX: "CCC", " X ", " X ", where X states different material
        //'C', 'X', or more states the material to be used. See below for reference!
        // GameRegistry.addRecipe(new ItemStack(Output Item), "SSS", " X ", " X ", 'S', new ItemStack(Material 1), 'X', new ItemStack(Material 2));

        //Tools
        GameRegistry.addRecipe(new ItemStack(TitaniumPick), "ccc", " w ", " w ", 'c', new ItemStack(TitaniumIngot), 'w', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(TitaniumSword), " c ", " c ", " w ", 'c', new ItemStack(TitaniumIngot), 'w', new ItemStack(Items.stick));

        GameRegistry.addRecipe(new ItemStack(PlatinumPick), "ccc", " w ", " w ", 'c', new ItemStack(PlatinumIngot), 'w', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(PlatinumSword), " c ", " c ", " w ", 'c', new ItemStack(PlatinumIngot), 'w', new ItemStack(Items.stick));

        GameRegistry.addRecipe(new ItemStack(CobaltPick), "ccc", " w ", " w ", 'c', new ItemStack(CobaltIngot), 'w', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(CobaltSword), " c ", " c ", " w ", 'c', new ItemStack(CobaltIngot), 'w', new ItemStack(Items.stick));

        //Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlock.TitaniumBlock), "sss", "sss", "sss", 's', new ItemStack(TitaniumIngot));
        GameRegistry.addRecipe(new ItemStack(ModBlock.PlatinumBlock), "sss", "sss", "sss", 's', new ItemStack(PlatinumIngot));
        GameRegistry.addRecipe(new ItemStack(ModBlock.CobaltBlock), "sss", "sss", "sss", 's', new ItemStack(CobaltIngot));
        GameRegistry.addRecipe(new ItemStack(ModBlock.ZincBlock), "sss", "sss", "sss", 's', new ItemStack(ZincIngot));
        GameRegistry.addRecipe(new ItemStack(ModBlock.LithiumBlock), "sss", "sss", "sss", 's', new ItemStack(LithiumIngot));
        GameRegistry.addRecipe(new ItemStack(ModBlock.TinBlock), "sss", "sss", "sss", 's', new ItemStack(TinIngot));
        GameRegistry.addRecipe(new ItemStack(ModBlock.CopperBlock), "sss", "sss", "sss", 's', new ItemStack(CopperIngot));

        //Ingots
        GameRegistry.addRecipe(new ItemStack(ModItems.TitaniumIngot, 9), "   ", " s ", "   ", 's', new ItemStack(ModBlock.TitaniumBlock));

        //Machines


        //Items
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.ClayIngotMold), "   ", "c c", "ccc", 'c', new ItemStack(Items.clay_ball));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.WoodIngotMold), "   ", "c c", "ccc", 'c', new ItemStack(Blocks.log));
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.TitaniumIngotMold), "   ", "c c", "ccc", 'c', new ItemStack(ModItems.TitaniumIngot));
    }
}
