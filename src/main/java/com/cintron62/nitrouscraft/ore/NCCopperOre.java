package com.cintron62.nitrouscraft.ore;

import com.cintron62.nitrouscraft.block.BlockNC;
import com.cintron62.nitrouscraft.creativetab.CreativeTabNC;

public class NCCopperOre extends BlockNC
{
     public NCCopperOre()
     {

        super();
        this.setBlockName("CopperOre");
        this.setBlockTextureName("copperore");
        this.setCreativeTab(CreativeTabNC.NC_TAB);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 3);

        }
}
