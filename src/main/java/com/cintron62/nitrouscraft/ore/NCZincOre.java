package com.cintron62.nitrouscraft.ore;

import com.cintron62.nitrouscraft.block.BlockNC;
import com.cintron62.nitrouscraft.creativetab.CreativeTabNC;

public class NCZincOre extends BlockNC
{
    public NCZincOre()
    {

        super();
        this.setBlockName("ZincOre");
        this.setBlockTextureName("zincore");
        this.setCreativeTab(CreativeTabNC.NC_TAB);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeStone);

    }
}
