package com.example.examplemod.core.services;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import java.util.HashMap;

public class ItemService implements IService {

    private final HashMap<String, Item> items;

    public ItemService() {
        items = new HashMap<>();

        // Register Items
        //items.put("ring", new Ring());
    }

    @Override
    public void init(FMLPreInitializationEvent event) {
        items.forEach((name, item) -> GameRegistry.registerItem(item, name));
    }
}
