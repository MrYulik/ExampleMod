package com.example.examplemod.core;

import com.example.examplemod.core.services.BlockService;
import com.example.examplemod.core.services.EventService;
import com.example.examplemod.core.services.IService;
import com.example.examplemod.core.services.ItemService;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import java.util.ArrayList;
import java.util.List;

public class Core {

    private final List<IService> services;

    public Core() {
        services = new ArrayList<>();
        services.add(new BlockService());
        services.add(new EventService());
        services.add(new ItemService());
    }

    public void preInit(FMLPreInitializationEvent e) {
        services.forEach(service -> service.init(e));
    }

    public void init(FMLInitializationEvent e) {

    }
}
