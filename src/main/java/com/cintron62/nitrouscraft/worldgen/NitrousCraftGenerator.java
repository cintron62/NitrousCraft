package com.cintron62.nitrouscraft.worldgen;

import com.cintron62.nitrouscraft.NitrousCraft;
import com.cintron62.nitrouscraft.block.BlockNC;
import com.cintron62.nitrouscraft.init.ModBlock;
import com.cintron62.nitrouscraft.ore.NCPlatinumOre;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class NitrousCraftGenerator implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case 0:
                //Generate Surface World
                generateSurface(world, random, chunkX * 16, chunkZ * 16);

            case -1:
                //Generate Nether World
                generateNether(world, random, chunkX * 16, chunkZ * 16);

            case 1:
                //Generate End World
                generateEnd(world, random, chunkX * 16, chunkZ * 16);

        }
    }

    private void generateSurface(World world, Random random, int x, int z) {
        //this.addOreSpawn(ModBlock.WhateverOre, world, random, x = BlockXPos, z = BlockZPos, maxX, maxZ, maxVeinSize, ChancetoSpawn, minY, maxY);

        this.addOreSpawn(ModBlock.PlatinumOre, world, random, x, z, 16, 16, 2+random.nextInt(8), 13, 6, 28);
        this.addOreSpawn(ModBlock.TitaniumOre, world, random, x, z, 16, 16, 2+random.nextInt(8), 13, 6, 28);
        this.addOreSpawn(ModBlock.CopperOre, world, random, x, z, 16, 16, 6+random.nextInt(10), 32, 6, 64);
        this.addOreSpawn(ModBlock.TinOre, world, random, x, z, 16, 16, 6+random.nextInt(10), 32, 6, 64);
        this.addOreSpawn(ModBlock.CobaltOre, world, random, x, z, 16, 16, 1+random.nextInt(4), 8, 6, 16);
        this.addOreSpawn(ModBlock.LithiumOre, world, random, x, z, 16, 16, 4+random.nextInt(8), 24, 6, 64);
        this.addOreSpawn(ModBlock.ZincOre, world, random, x, z, 16, 16, 4+random.nextInt(8), 28, 6, 96);

        this.addOreSpawn(ModBlock.PlatinumOre, world, random, x, z, 16, 16, 2+random.nextInt(8), 25, 6, 100);
        this.addOreSpawn(ModBlock.TitaniumOre, world, random, x, z, 16, 16, 2+random.nextInt(8), 25, 6, 100);

    }

    private void generateNether(World world, Random random, int x, int z) {

    }

    private void generateEnd(World world, Random random, int x, int z) {

    }

    private void addOreSpawn(BlockNC Ore, World world, Random random, int BlockXPos, int BlockZPos, int maxX, int maxZ, int maxVeinSize, int ChancetoSpawn, int minY, int maxY) {
        for (int i = 0; i < ChancetoSpawn; i++) {
            int posX = BlockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = BlockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(Ore, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }

}
