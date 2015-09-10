package com.bedrockminer.tutorial.item;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.bedrockminer.tutorial.Main;

public class ItemModAdvancedFood extends ItemFood {

	private List<PotionEffect> effects = new ArrayList<>();
	private List<Double> propabilities = new ArrayList<>();

	public ItemModAdvancedFood(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite) {
		super(healAmount, saturationModifier, wolvesFavorite);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabFood);
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);

		for (int i = 0; i < this.effects.size(); i++) {
			if (!world.isRemote && this.effects.get(i) != null && this.effects.get(i).getPotionID() > 0 && Math.random() < this.propabilities.get(i))
				player.addPotionEffect(new PotionEffect(this.effects.get(i).getPotionID(), this.effects.get(i).getDuration(), this.effects.get(i).getAmplifier(), this.effects.get(i).getIsAmbient()));
		}
	}

	public ItemModAdvancedFood addPotionEffect(PotionEffect effect, double propability) {
		this.effects.add(effect);
		this.propabilities.add(propability);
		return this;
	}

	public ItemModAdvancedFood addPotionEffect(PotionEffect effect) {
		return this.addPotionEffect(effect, 1.0);
	}

	public ItemModAdvancedFood removePotionEffect(PotionEffect effect) {
		int index = this.effects.indexOf(effect);
		if (index == -1)
			return this;
		this.effects.remove(index);
		this.propabilities.remove(index);
		return this;
	}
}
