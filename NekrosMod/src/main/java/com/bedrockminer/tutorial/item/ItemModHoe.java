package com.bedrockminer.tutorial.item;

import net.minecraft.item.ItemHoe;

import com.bedrockminer.tutorial.Main;

public class ItemModHoe extends ItemHoe {

	public ItemModHoe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}

}
