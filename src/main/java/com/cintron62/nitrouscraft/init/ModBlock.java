package com.cintron62.nitrouscraft.init;

import com.cintron62.nitrouscraft.block.*;
import com.cintron62.nitrouscraft.block.brickblocks.*;
import com.cintron62.nitrouscraft.block.solidblocks.*;
import com.cintron62.nitrouscraft.entity.machines.NCCraftingDesk;
import com.cintron62.nitrouscraft.ore.*;
import com.cintron62.nitrouscraft.referance.Referance;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Referance.MOD_ID)
public class ModBlock
{
    //Blocks
    public static final BlockNC PlatinumBlock = new NCPlatinumBlock();
    public static final BlockNC TitaniumBlock = new NCTitaniumBlock();
    public static final BlockNC CopperBlock = new NCCopperBlock();
    public static final BlockNC TinBlock = new NCTinBlock();
    public static final BlockNC CobaltBlock = new NCCobaltBlock();
    public static final BlockNC LithiumBlock = new NCLithiumBlock();
    public static final BlockNC ZincBlock = new NCZincBlock();
    public static final BlockNC PlatinumBrick = new NCPlatinumBrick();
    public static final BlockNC TitaniumBrick = new NCTitaniumBrick();
    public static final BlockNC CopperBrick = new NCCopperBrick();
    public static final BlockNC TinBrick = new NCTinBrick();
    public static final BlockNC CobaltBrick = new NCCobaltBrick();
    public static final BlockNC LithiumBrick = new NCLithiumBrick();
    public static final BlockNC ZincBrick = new NCZincBrick();


    //Ore
    public static final BlockNC PlatinumOre =new NCPlatinumOre();
    public static final BlockNC TitaniumOre =new NCTitaniumOre();
    public static final BlockNC CopperOre =new NCCopperOre();
    public static final BlockNC TinOre =new NCTinOre();
    public static final BlockNC CobaltOre =new NCCobaltOre();
    public static final BlockNC LithiumOre =new NCLithiumOre();
    public static final BlockNC ZincOre =new NCZincOre();
    public static final BlockNC EarthMagnetOre =new NCEarthMagnetOre();

    //Machines
    public static BlockNC CraftingDesk = new NCCraftingDesk();

    public static void init()
    {
        //Blocks
        GameRegistry.registerBlock(PlatinumBlock, "PlatinumBlock");
        GameRegistry.registerBlock(TitaniumBlock, "TitaniumBlock");
        GameRegistry.registerBlock(CopperBlock, "CopperBlock");
        GameRegistry.registerBlock(TinBlock, "TinBlock");
        GameRegistry.registerBlock(CobaltBlock, "CobaltBlock");
        GameRegistry.registerBlock(LithiumBlock, "LithiumBlock");
        GameRegistry.registerBlock(ZincBlock, "ZincBlock");
        GameRegistry.registerBlock(PlatinumBrick, "PlatinumBrick");
        GameRegistry.registerBlock(TitaniumBrick, "TitaniumBrick");
        GameRegistry.registerBlock(CopperBrick, "CopperBrick");
        GameRegistry.registerBlock(TinBrick, "TinBrick");
        GameRegistry.registerBlock(CobaltBrick, "CobaltBrick");
        GameRegistry.registerBlock(LithiumBrick, "LithiumBrick");
        GameRegistry.registerBlock(ZincBrick, "ZincBrick");

        //Ores
        GameRegistry.registerBlock(PlatinumOre, "PlatinumOre");
        GameRegistry.registerBlock(TitaniumOre, "TitaniumOre");
        GameRegistry.registerBlock(CopperOre, "CopperOre");
        GameRegistry.registerBlock(TinOre, "TinOre");
        GameRegistry.registerBlock(CobaltOre, "CobaltOre");
        GameRegistry.registerBlock(LithiumOre, "LithiumOre");
        GameRegistry.registerBlock(ZincOre, "ZincOre");
        GameRegistry.registerBlock(EarthMagnetOre, "EarthMagnetOre");

        //Machines
        GameRegistry.registerBlock(CraftingDesk, "CraftingDesk");



    }
}
