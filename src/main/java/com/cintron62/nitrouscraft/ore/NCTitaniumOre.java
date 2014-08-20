package com.cintron62.nitrouscraft.ore;

import com.cintron62.nitrouscraft.block.BlockNC;
import com.cintron62.nitrouscraft.creativetab.CreativeTabNC;

public class NCTitaniumOre extends BlockNC
{
    public NCTitaniumOre()
    {
        super();
        this.setBlockName("TitaniumOre");
        this.setBlockTextureName("titaniumore");
        this.setCreativeTab(CreativeTabNC.NC_TAB);
        this.setHardness(4.0F);
        this.setResistance(6.0F);
        this.setStepSound(soundTypeStone);

    }
}
