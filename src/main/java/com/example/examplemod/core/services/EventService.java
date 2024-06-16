package com.example.examplemod.core.services;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import java.util.ArrayList;
import java.util.List;

public class EventService implements IService {

    private final List<Object> eventListeners;

    public EventService() {
        eventListeners = new ArrayList<>();

        // Register Events
        //eventListeners.add(new PlayerEventListener());
    }

    @Override
    public void init(FMLPreInitializationEvent event) {
        eventListeners.forEach(MinecraftForge.EVENT_BUS::register);
    }
}
