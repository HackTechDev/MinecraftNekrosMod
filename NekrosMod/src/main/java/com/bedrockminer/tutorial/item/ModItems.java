package com.bedrockminer.tutorial.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public final class ModItems {

	public static ToolMaterial TTUTORIAL = EnumHelper.addToolMaterial("TTUTORIAL", 3, 1000, 15.0F, 4.0F, 30);
	public static ArmorMaterial ATUTORIAL = EnumHelper.addArmorMaterial("ATUTORIAL", 16, new int[] {3, 8, 6, 3}, 30);

	public static Item tutorialPickaxe;
	public static Item tutorialAxe;
	public static Item tutorialSpade;
	public static Item tutorialHoe;
	public static Item tutorialSword;
	public static Item tutorialMultiTool;

	public static Item tutorialHelmet;
	public static Item tutorialChestplate;
	public static Item tutorialLeggings;
	public static Item tutorialBoots;

	public static Item tutorialChocolate;
	public static Item tutorialLuckyCandy;

	public static final void init() {
		GameRegistry.registerItem(tutorialPickaxe = new ItemModPickaxe("tutorial_pickaxe", TTUTORIAL), "tutorial_pickaxe");
		GameRegistry.registerItem(tutorialAxe = new ItemModAxe("tutorial_axe", TTUTORIAL), "tutorial_axe");
		GameRegistry.registerItem(tutorialSpade = new ItemModSpade("tutorial_spade", TTUTORIAL), "tutorial_spade");
		GameRegistry.registerItem(tutorialHoe = new ItemModHoe("tutorial_hoe", TTUTORIAL), "tutorial_hoe");
		GameRegistry.registerItem(tutorialSword = new ItemModSword("tutorial_sword", TTUTORIAL), "tutorial_sword");
		GameRegistry.registerItem(tutorialMultiTool = new ItemModMultitool("tutorial_multitool", TTUTORIAL), "tutorial_multitool");

		GameRegistry.registerItem(tutorialHelmet = new ItemModArmor("tutorial_helmet", ATUTORIAL, "tutorial", 0), "tutorial_helmet");
		GameRegistry.registerItem(tutorialChestplate = new ItemModArmor("tutorial_chestplate", ATUTORIAL, "tutorial", 1), "tutorial_chestplate");
		GameRegistry.registerItem(tutorialLeggings = new ItemModArmor("tutorial_leggings", ATUTORIAL, "tutorial", 2), "tutorial_leggings");
		GameRegistry.registerItem(tutorialBoots = new ItemModArmor("tutorial_boots", ATUTORIAL, "tutorial", 3), "tutorial_boots");

		GameRegistry.registerItem(tutorialChocolate = new ItemModFood("tutorial_chocolate", 2, 0.2f, false,
										new PotionEffect(Potion.moveSpeed.id, 1200, 1),
										new PotionEffect(Potion.jump.id, 600, 0),
										new PotionEffect(Potion.regeneration.id, 200, 1))
			    						.setAlwaysEdible(), "tutorial_chocolate");
		GameRegistry.registerItem(tutorialLuckyCandy = new ItemModAdvancedFood("tutorial_lucky_candy", 1, 0.5f, false)
										.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 4), 0.5)
										.addPotionEffect(new PotionEffect(Potion.wither.id, 200, 4), 0.5).setAlwaysEdible(), "tutorial_lucky_candy");
	}

}
