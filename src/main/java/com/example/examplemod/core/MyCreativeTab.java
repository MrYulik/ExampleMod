package com.example.examplemod.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MyCreativeTab extends CreativeTabs {

    public MyCreativeTab() {
        super(Constants.MODID);
    }

    @Override
    public Item getTabIconItem() {
        return Items.blaze_rod;
    }
}
