package com.bedrockminer.tutorial;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.bedrockminer.tutorial.RenderScorpioid;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class Renderers {
	
	public static void init(){
	
		RenderingRegistry.registerEntityRenderingHandler(EntityScorpioid.class, new RenderScorpioid());
		
	}
}
