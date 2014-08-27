package com.cintron62.nitrouscraft.init;

import com.cintron62.nitrouscraft.tool.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModTools
{
    //Pickaxe Modifiers
    public static Item.ToolMaterial NCTPick = EnumHelper.addToolMaterial("Titanium", 4, 2500, 20.0F, 15.0F, 10);
    public static Item.ToolMaterial NCPPick = EnumHelper.addToolMaterial("Platinum", 3, 2000, 15.0F, 10.0F, 10);
    public static Item.ToolMaterial NCCPick = EnumHelper.addToolMaterial("Cobalt", 4, 2500, 22.0F, 14.0F, 10);

    //Sword Modifiers
    public static Item.ToolMaterial NCTSword = EnumHelper.addToolMaterial("Titanium", 3, 2300, 8.0F, 25.0F, 10);
    public static Item.ToolMaterial NCPSword = EnumHelper.addToolMaterial("Platinum", 3, 1900, 8.0F, 15.0F, 10);
    public static Item.ToolMaterial NCCSword = EnumHelper.addToolMaterial("Cobalt", 3, 2400, 8.0F, 20.0F, 10);


    //Axe Modifiers


    //Pickaxe
   public static final PickaxeNC TitaniumPick = new NCTitaniumPick(NCTPick);
   public static final PickaxeNC PlatinumPick = new NCPlatinumPick(NCPPick);
   public static final PickaxeNC CobaltPick = new NCCobaltPick(NCCPick);

    //Swords
    public static final SwordNC TitaniumSword = new NCTitaniumSword (NCTSword);
    public static final SwordNC PlatinumSword = new NCPlatinumSword (NCPSword);
    public static final SwordNC CobaltSword =  new NCCobaltSword (NCCSword);

    //Axes




    //Registry
    public static void init()
    {
        //Pickaxe Registry
        GameRegistry.registerItem(TitaniumPick, "TitaniumPick");
        GameRegistry.registerItem(PlatinumPick, "PlatinumPick");
        GameRegistry.registerItem(CobaltPick, "CobaltPick");

        //Sword Registry
        GameRegistry.registerItem(TitaniumSword, "TitaniumSword");
        GameRegistry.registerItem(PlatinumSword, "PlatinumSword");
        GameRegistry.registerItem(CobaltSword, "CobaltSword");

        //Axe Registry




    }
}
