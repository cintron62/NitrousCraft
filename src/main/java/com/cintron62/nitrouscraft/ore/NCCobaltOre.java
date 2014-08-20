package com.cintron62.nitrouscraft.ore;

import com.cintron62.nitrouscraft.block.BlockNC;
import com.cintron62.nitrouscraft.creativetab.CreativeTabNC;

public class NCCobaltOre extends BlockNC
{
    public NCCobaltOre()
    {

        super();
        this.setBlockName("CobaltOre");
        this.setBlockTextureName("cobaltore");
        this.setCreativeTab(CreativeTabNC.NC_TAB);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeStone);

    }
}
