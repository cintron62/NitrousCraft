package com.cintron62.nitrouscraft.discs;

import net.minecraft.util.ResourceLocation;

/**
 * Created by Rikusen on 8/23/2014.
 */
public class Disc3 extends MainRecords {

    public Disc3(String p_i45350_1_) {
        super(p_i45350_1_);
        this.setTextureName(Strings.disc3);
        this.setUnlocalizedName(Strings.disc3);
    }

    @Override
    public ResourceLocation getRecordResource(String name)
    {
        return new ResourceLocation("nitrouscraft:" + name);
    }

}
