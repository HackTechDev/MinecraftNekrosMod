package com.bedrockminer.tutorial;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.block.BlockDispenser;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.ShapedOreRecipe;

import cpw.mods.fml.common.event.FMLServerStartingEvent;

import com.bedrockminer.tutorial.command.ProcedureCommand;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

	public static final String MODID = "tutorial";
	public static final String MODNAME = "Nekros Mod";
	public static final String VERSION = "0.0.1";

	@Instance
	public static Main instance = new Main();

	@SidedProxy(clientSide="com.bedrockminer.tutorial.ClientProxy",
				serverSide="com.bedrockminer.tutorial.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInitMod(FMLPreInitializationEvent event)
	{
		Entities.preinit();
        addRecipes();
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}

     @EventHandler
      public void serverLoad(FMLServerStartingEvent event)
      {
        event.registerServerCommand(new ProcedureCommand());
      }


    /*
     * Add recipes
     */

    private void addRecipes() 
    {
        // Recipes
        // uses 1 item cookie and 7 block sponge in the pattern to make 1 diamond.
        GameRegistry.addRecipe(new ItemStack(Items.diamond), 
            "y y", 
            "yxy", 
            "yyy", 
            'y', Blocks.sponge, 
            'x', Items.cookie 
        );
        
        //uses 4 iron in a the pattern to make 2 gold.(The same shape of a crafting bench put it must be in the top left corner of the grid)
        GameRegistry.addRecipe(new ItemStack(Items.gold_ingot, 2), 
            "xx ", 
            "xx ", 
            "   ", 
            'x', Items.iron_ingot 
        );
        
        //uses 8 black wool(1 being the count, 15 being the damage which makes it black) 1 gold block to make 1 diamond block 
        GameRegistry.addRecipe(new ItemStack(Blocks.diamond_block), 
            "yyy", 
            "yxy", 
            "yyy", 
            'y', new ItemStack(Blocks.wool, 1, 15), 
            'x', Blocks.gold_block
        );
        
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond), Items.gold_ingot, Items.gold_ingot, Items.gold_ingot, Items.gold_ingot);//uses 4 gold bars placed anywhere in the crafting table to get 1 diamond(have to be placed separately not stacked on top of each other)
        
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 2), Items.gold_ingot, Items.gold_ingot, Items.gold_ingot, Items.gold_ingot, Items.diamond);// uses 4 gold and 1 diamond to give you 2 diamonds.
        
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool, 1 ,5), Blocks.wool, Items.stick);// uses 1 wool of any color and 1 stick to give you 1 lime wool. (1 being the count, 5 being the metadata making the wool lime colored).
        
    }
}
