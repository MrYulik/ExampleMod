package com.example.examplemod.core.services;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import java.util.HashMap;

public class BlockService implements IService {

    private final HashMap<String, Block> blocks;

    public BlockService() {
        blocks = new HashMap<>();

        //Register Blocks
        //blocks.put("testBlock", TestBlock());
    }

    @Override
    public void init(FMLPreInitializationEvent event) {
        blocks.forEach((name, block) -> {
            GameRegistry.registerBlock(block, name);
            if(block.hasTileEntity(0)) {
                GameRegistry.registerTileEntity(block.createTileEntity(null, 0).getClass(), name + "_tile");
            }
        });
    }
}
