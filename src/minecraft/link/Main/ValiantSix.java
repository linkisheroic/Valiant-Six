package link.Main;

import link.Armor.ArmorInitialize;
import link.Blocks.BlockInitialize;
import link.God.GodInitialize;
import link.Items.ItemInitialize;
import link.Tools.ToolsInitialize;
import link.Weapons.WeaponsInitialize;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ValiantSix.modid, name = "Valiant Six", version = "Alpha 0.2.3")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)




public class ValiantSix 
{
	public static final String modid = "valiant";
	
	//Event Manager
		EventManager eventManager = new EventManager();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		BlockInitialize initializeBlocks = new BlockInitialize();
		ArmorInitialize initializeArmor = new ArmorInitialize();
		ItemInitialize initializeItems = new ItemInitialize();
		GodInitialize initializeGods = new GodInitialize();
		WeaponsInitialize initializeWeapons = new WeaponsInitialize();
		CraftingRecipes initializeRecipes = new CraftingRecipes();
		ToolsInitialize initializeTools = new ToolsInitialize();
		
		initializeBlocks.init(event);
		initializeArmor.init(event);
		initializeItems.init(event);
		initializeGods.init(event);
		initializeWeapons.init(event);
		initializeTools.init(event);
		initializeRecipes.init(event);
	
		
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(eventManager);
		
	}
}
