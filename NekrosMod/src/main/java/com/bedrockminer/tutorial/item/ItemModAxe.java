package com.bedrockminer.tutorial.item;

import net.minecraft.item.ItemAxe;

import com.bedrockminer.tutorial.Main;

public class ItemModAxe extends ItemAxe {

	public ItemModAxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}
}
