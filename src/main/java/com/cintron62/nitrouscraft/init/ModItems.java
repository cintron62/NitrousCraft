package com.cintron62.nitrouscraft.init;

import com.cintron62.nitrouscraft.discs.*;
import com.cintron62.nitrouscraft.item.*;
import com.cintron62.nitrouscraft.item.ingot.*;
import com.cintron62.nitrouscraft.item.magnet.*;
import com.cintron62.nitrouscraft.item.ore.*;
import com.cintron62.nitrouscraft.referance.Referance;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Referance.MOD_ID)
public class ModItems
{

    //Ingots
    public static final ItemNC PlatinumIngot = new NCPlatinumIngot();
    public static final ItemNC TitaniumIngot = new NCTitaniumIngot();
    public static final ItemNC CobaltIngot = new NCCobaltIngot();
    public static final ItemNC CopperIngot = new NCCopperIngot();
    public static final ItemNC LithiumIngot = new NCLithiumIngot();
    public static final ItemNC TinIngot = new NCTinIngot();
    public static final ItemNC ZincIngot = new NCZincIngot();

    //Magnets
    public static final ItemNC EarthMagnet = new NCEarthMagnet();
    public static final ItemNC RareEarthMagnet = new NCRareEarthMagnet();
    public static final ItemNC FerriteMagnet = new NCFerriteMagnet();
    public static final ItemNC AlnicoMagnet = new NCAlnicoMagnet();
    public static final ItemNC ElectroMagnet = new NCElectroMagnet();

    //OreClusters
    public static final ItemNC IronOreCluster = new NCIronOreCluster();
    public static final ItemNC GoldOreCluster = new NCGoldOreCluster();
    public static final ItemNC CobaltOreCluster = new NCCobaltOreCluster();
    public static final ItemNC CopperOreCluster = new NCCopperOreCluster();
    public static final ItemNC LithiumOreCluster = new NCLithiumOreCluster();
    public static final ItemNC PlatinumOreCluster = new NCPlatinumOreCluster();
    public static final ItemNC TinOreCluster = new NCTinOreCluster();
    public static final ItemNC TitaniumOreCluster = new NCTitaniumOreCluster();
    public static final ItemNC ZincOreCluster = new NCZincOreCluster();


    //Items
    public static final ItemNC ClayIngotMold = new NCClayIngotMold();
    public static final ItemNC WoodIngotMold = new NCWoodIngotMold();
    public static final ItemNC TitaniumIngotMold = new NCTitaniumIngotMold();

    //Discs
    public static final MainRecords Flowering = new Disc1(/*Reference.MOD_ID + ":" + */Strings.disc1);
    public static final MainRecords Bloom = new Disc2(/*Reference.MOD_ID + ":" + */Strings.disc2);
    public static final MainRecords Border = new Disc3(/*Reference.MOD_ID + ":" + */Strings.disc3);

    //Tools
    //Weapons
    //Armor

    public static void init()

    {

        //Ingots
        GameRegistry.registerItem(PlatinumIngot, "PlatinumIngot");
        GameRegistry.registerItem(TitaniumIngot, "TitaniumIngot");
        GameRegistry.registerItem(CobaltIngot, "CobaltIngot");
        GameRegistry.registerItem(CopperIngot, "CopperIngot");
        GameRegistry.registerItem(LithiumIngot, "LithiumIngot");
        GameRegistry.registerItem(TinIngot, "TinIngot");
        GameRegistry.registerItem(ZincIngot, "ZincIngot");

        //Magnets
        GameRegistry.registerItem(EarthMagnet, "EarthMagnet");
        GameRegistry.registerItem(RareEarthMagnet, "RareEarthMagnet");
        GameRegistry.registerItem(FerriteMagnet, "FerriteMagnet");
        GameRegistry.registerItem(AlnicoMagnet, "AlnicoMagnet");
        GameRegistry.registerItem(ElectroMagnet, "ElectroMagnet");


        //OreClusters
        GameRegistry.registerItem(IronOreCluster, "IronOreCluster");
        GameRegistry.registerItem(GoldOreCluster, "GoldOreCluster");
        GameRegistry.registerItem(CobaltOreCluster, "CobaltOreCluster");
        GameRegistry.registerItem(CopperOreCluster, "CopperOreCluster");
        GameRegistry.registerItem(LithiumOreCluster, "LithiumOreCluster");
        GameRegistry.registerItem(PlatinumOreCluster, "PlatinumOreCluster");
        GameRegistry.registerItem(TinOreCluster, "TinOreCluster");
        GameRegistry.registerItem(TitaniumOreCluster, "TitaniumOreCluster");
        GameRegistry.registerItem(ZincOreCluster, "ZincOreCluster");


        //Items
        GameRegistry.registerItem(ClayIngotMold, "ClayIngotMold");
        GameRegistry.registerItem(WoodIngotMold, "WoodIngotMold");
        GameRegistry.registerItem(TitaniumIngotMold, "TitaniumIngotMold");

        //Discs
        GameRegistry.registerItem(Flowering, Strings.disc1);
        GameRegistry.registerItem(Bloom, Strings.disc2);
        GameRegistry.registerItem(Border, Strings.disc3);

        //Tools
        //Weapons
        //Armor

    }
}
