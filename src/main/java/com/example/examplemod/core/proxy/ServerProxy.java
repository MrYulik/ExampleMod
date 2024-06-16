package com.example.examplemod.core.proxy;

import com.example.examplemod.core.Core;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy {

    private final Core core = new Core();

    public void preInit(FMLPreInitializationEvent event) {
        core.preInit(event);
    }

    public void init(FMLInitializationEvent event) {
        core.init(event);
    }
}
