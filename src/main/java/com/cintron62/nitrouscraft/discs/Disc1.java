package com.cintron62.nitrouscraft.discs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Rikusen on 8/23/2014.
 */
public class Disc1 extends MainRecords {

    public Disc1(String p_i45350_1_) {
        super(p_i45350_1_);
        this.setTextureName(Strings.disc1);
        this.setUnlocalizedName(Strings.disc1);
    }

    @Override
    public ResourceLocation getRecordResource(String name)
    {
        return new ResourceLocation("nitrouscraft:" + name);
    }

}
