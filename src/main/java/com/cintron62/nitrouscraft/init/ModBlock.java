package com.cintron62.nitrouscraft.init;

import com.cintron62.nitrouscraft.block.BlockNC;
import com.cintron62.nitrouscraft.block.NCPlatinumBlock;
import com.cintron62.nitrouscraft.block.NCTitaniumBlock;
import com.cintron62.nitrouscraft.ore.NCPlatinumOre;
import com.cintron62.nitrouscraft.ore.NCTitaniumOre;
import com.cintron62.nitrouscraft.referance.Referance;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Referance.MOD_ID)
public class ModBlock
{
    //Blocks
    public static final BlockNC PlatinumBlock = new NCPlatinumBlock();
    public static final BlockNC TitaniumBlock = new NCTitaniumBlock();

    //Ore
    public static final BlockNC PlatinumOre =new NCPlatinumOre();
    public static final BlockNC TitaniumOre =new NCTitaniumOre();

    public static void init()
    {
        //Blocks
        GameRegistry.registerBlock(PlatinumBlock, "PlatinumBlock");
        GameRegistry.registerBlock(TitaniumBlock, "TitaniumBlock");

        //Ores
        GameRegistry.registerBlock(PlatinumOre, "PlatinumOre");
        GameRegistry.registerBlock(TitaniumOre, "TitaniumOre");
    }
}
