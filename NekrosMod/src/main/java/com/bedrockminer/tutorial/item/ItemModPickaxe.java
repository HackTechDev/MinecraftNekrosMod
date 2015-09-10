package com.bedrockminer.tutorial.item;

import net.minecraft.item.ItemPickaxe;

import com.bedrockminer.tutorial.Main;

public class ItemModPickaxe extends ItemPickaxe {

	public ItemModPickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}

}
