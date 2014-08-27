package com.cintron62.nitrouscraft;

import com.cintron62.nitrouscraft.handler.ConfigurationHandler;
import com.cintron62.nitrouscraft.init.*;
import com.cintron62.nitrouscraft.proxy.IProxy;
import com.cintron62.nitrouscraft.referance.Referance;
import com.cintron62.nitrouscraft.utility.LogHelper;
import com.cintron62.nitrouscraft.worldgen.NitrousCraftGenerator;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Referance.MOD_ID, name = Referance.MOD_NAME, version = Referance.VERSION, guiFactory = Referance.GUI_FACTORY_CLASS)
public class NitrousCraft
{

    @Mod.Instance(Referance.MOD_ID)
    public static NitrousCraft instance;

    @SidedProxy(clientSide = Referance.CLIENT_PROXY_CLASS, serverSide = Referance.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete!");

        ModItems.init();

        ModBlock.init();

        ModTools.init();

        NitrousCraftGenerator eventWorldGen = new NitrousCraftGenerator();

        GameRegistry.registerWorldGenerator(eventWorldGen, 0);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();

        Smelting.init();

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }



}
