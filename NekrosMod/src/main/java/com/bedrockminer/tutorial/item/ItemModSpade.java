package com.bedrockminer.tutorial.item;

import net.minecraft.item.ItemSpade;

import com.bedrockminer.tutorial.Main;

public class ItemModSpade extends ItemSpade {

	public ItemModSpade(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}
}
