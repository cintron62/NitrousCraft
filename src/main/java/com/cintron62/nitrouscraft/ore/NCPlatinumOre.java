package com.cintron62.nitrouscraft.ore;

import com.cintron62.nitrouscraft.block.BlockNC;
import com.cintron62.nitrouscraft.creativetab.CreativeTabNC;

public class NCPlatinumOre extends BlockNC
{
    public NCPlatinumOre()
    {
        super();
        this.setBlockName("PlatinumOre");
        this.setBlockTextureName("platinumore");
        this.setCreativeTab(CreativeTabNC.NC_TAB);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeStone);

    }
}
