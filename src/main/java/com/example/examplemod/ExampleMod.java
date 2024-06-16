package com.example.examplemod;

import com.example.examplemod.core.Constants;
import com.example.examplemod.core.MyCreativeTab;
import com.example.examplemod.core.proxy.ServerProxy;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Constants.MODID, version = Constants.VERSION, name = Constants.NAME)
public class ExampleMod {

    @SidedProxy(serverSide = Constants.PACKAGE_SERVER, clientSide = Constants.PACKAGE_CLIENT)
    public ServerProxy proxy;

    public final static MyCreativeTab TAB = new MyCreativeTab();

    @Mod.Instance(Constants.MODID)
    public ExampleMod instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
}
