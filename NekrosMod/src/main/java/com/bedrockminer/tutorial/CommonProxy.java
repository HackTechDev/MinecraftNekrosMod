package com.bedrockminer.tutorial;

import com.bedrockminer.tutorial.block.ModBlocks;
import com.bedrockminer.tutorial.crafting.ModCrafting;
import com.bedrockminer.tutorial.item.ModItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.init();
		ModBlocks.init();
	}

	public void init(FMLInitializationEvent e) {
		ModCrafting.init();
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
