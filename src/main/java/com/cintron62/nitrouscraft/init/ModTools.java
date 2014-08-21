package com.cintron62.nitrouscraft.init;

import com.cintron62.nitrouscraft.tool.NCCobaltPick;
import com.cintron62.nitrouscraft.tool.NCPlatinumPick;
import com.cintron62.nitrouscraft.tool.NCTitaniumPick;
import com.cintron62.nitrouscraft.tool.PickaxeNC;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModTools
{
    //Pickaxe Modifiers
    public static Item.ToolMaterial NCTitanium = EnumHelper.addToolMaterial("NCTitanium", 4, 2500, 20.0F, 15.0F, 10);
    public static Item.ToolMaterial NCPlatinum = EnumHelper.addToolMaterial("NCPlatinum", 3, 2000, 15.0F, 10.0F, 10);
    public static Item.ToolMaterial NCCobalt = EnumHelper.addToolMaterial("NCCobalt", 4, 2500, 22.0F, 14.0F, 10);


    //Pickaxe
   public static final PickaxeNC TitaniumPick = new NCTitaniumPick(NCTitanium);
   public static final PickaxeNC PlatinumPick = new NCPlatinumPick(NCPlatinum);
   public static final PickaxeNC CobaltPick = new NCCobaltPick(NCCobalt);




    //Registry
    public static void init()
    {
        //Pickaxe Registry
        GameRegistry.registerItem(TitaniumPick, "TitaniumPick");
        GameRegistry.registerItem(PlatinumPick, "PlatinumPick");
        GameRegistry.registerItem(CobaltPick, "CobaltPick");




    }
}
