package link.God;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class GodInitialize 
{
	int godIDs[] = new int[8];
	
	//God Weapons
		public static Item baneOfLight;
		public static Item divineBolt;
		public static Item pickOfRighteousness;
		public static Item staffOfControlling;
		public static Item swordOfSlayers;
		public static Item cloudSword;
	    public static Item deathsAdder;
	    
	    static EnumToolMaterial god = EnumHelper.addToolMaterial("God", 5, 9999, 50F, 15, 14);
	
	public void init(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	    config.load();
	    
	    godIDs[0] = config.get("Item", "Bane Of Hallows", 3000).getInt() -256;
	    godIDs[1] = config.get("Item", "Divine Bolt", 3001).getInt() - 256;
	    godIDs[2] = config.get("Item", "Pick Of Righteousness", 3002).getInt() - 256;
	    godIDs[3] = config.get("Item", "Staff Of Controlling", 3003).getInt() - 256;
	    godIDs[4] = config.get("Item", "Sword Of Slayers", 3004).getInt() - 256;
	    godIDs[5] = config.get("Item", "Cloud Sword", 3005).getInt() - 256;
	    godIDs[6] = config.get("Item", "Death's Adder", 3006).getInt() - 256;
	    
	    config.save();
	    
	    baneOfLight = (new ItemBaneOfLight(godIDs[0], god).setUnlocalizedName("baneOfLight").setTextureName("valiant:baneOfLight").setCreativeTab(CreativeTabs.tabCombat));
	    divineBolt = (new ItemDivineBolt(godIDs[1], god).setUnlocalizedName("divineBolt").setTextureName("valiant:divineBolt").setCreativeTab(CreativeTabs.tabCombat));
	    pickOfRighteousness = (new ItemPickOfRighteousness(godIDs[2], god).setUnlocalizedName("pickOfRight").setTextureName("valiant:pickOfRight").setCreativeTab(CreativeTabs.tabCombat));
	    staffOfControlling = (new ItemStaffOfControlling(godIDs[3]).setUnlocalizedName("staffOfControl").setTextureName("valiant:staffOfControl").setCreativeTab(CreativeTabs.tabCombat));
	    swordOfSlayers = (new ItemSwordOfSlayers(godIDs[4], god).setUnlocalizedName("swordOfSlayers").setTextureName("valiant:swordOfSlayers").setCreativeTab(CreativeTabs.tabCombat));
	    cloudSword = (new ItemCloudSword(godIDs[5], god).setUnlocalizedName("cloudSword").setTextureName("valiant:cloudSword").setCreativeTab(CreativeTabs.tabCombat));
	    deathsAdder = (new ItemDeathsAdder(godIDs[6]).setUnlocalizedName("deathsAdder").setTextureName("valiant:deathsAdder").setCreativeTab(CreativeTabs.tabCombat));
	   
	    LanguageRegistry.addName(baneOfLight, "Bane of Hallows");
	    LanguageRegistry.addName(divineBolt, "Divine Bolt");
	    LanguageRegistry.addName(pickOfRighteousness, "Pick of Righteousness");
	    LanguageRegistry.addName(staffOfControlling, "Staff of Controlling");
	    LanguageRegistry.addName(swordOfSlayers, "Sword of Slayers");
	    LanguageRegistry.addName(cloudSword, "Cloud Sword");
	    LanguageRegistry.addName(deathsAdder, "Death's Adder");
		
	}

}
