package com.cintron62.nitrouscraft.ore;

import com.cintron62.nitrouscraft.block.BlockNC;
import com.cintron62.nitrouscraft.creativetab.CreativeTabNC;
import com.cintron62.nitrouscraft.init.ModBlock;
import com.cintron62.nitrouscraft.init.ModItems;
import net.minecraft.item.Item;

import java.util.Random;

public class NCEarthMagnetOre extends BlockNC
{
    public NCEarthMagnetOre() {

        super();
        this.setBlockName("EarthMagnetOre");
        this.setBlockTextureName("earthmagnetore");
        this.setCreativeTab(CreativeTabNC.NC_TAB);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 2);

    }

    public Item getItemDropped(int i, Random random, int j)
    {
        return this == ModBlock.EarthMagnetOre ? ModItems.EarthMagnet : Item.getItemFromBlock(this);
    }

    public int getQuantityDropped(Random random)
    {
        return this == ModBlock.EarthMagnetOre ? 1 + random.nextInt(3) : 3;
    }

}
