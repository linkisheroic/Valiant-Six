package link.Armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ArmorInitialize 
{
	int armorIDs[] = new int[28];
	
	//Armor
	public static Item codhopianHelm;
	public static Item codhopianChest;
	public static Item codhopianLeggings;
	public static Item codhopianBoots;
	
	public static Item flareHelm;
	public static Item flareChest;
	public static Item flareLeggings;
	public static Item flareBoots;
	
	public static Item sparkHelm;
	public static Item sparkChest;
	public static Item sparkLeggings;
	public static Item sparkBoots;
	
	public static Item gustHelm;
	public static Item gustChest;
	public static Item gustLeggings;
	public static Item gustBoots;
	
	public static Item voidHelm;
	public static Item voidChest;
	public static Item voidLeggings;
	public static Item voidBoots;
	
	public static Item freezeHelm;
	public static Item freezeChest;
	public static Item freezeLeggings;
	public static Item freezeBoots;
	
	public static Item gaiaHelm;
	public static Item gaiaChest;
	public static Item gaiaLeggings;
	public static Item gaiaBoots;
	
		
		
	static EnumArmorMaterial codhopiaArmor = EnumHelper.addArmorMaterial("CodhopiaArmor", 33, new int[]{3, 8, 6, 3}, 10);
	static EnumArmorMaterial flareArmor = EnumHelper.addArmorMaterial("FlareArmor", 100, new int[]{4, 9, 7, 4}, 10);
	static EnumArmorMaterial sparkArmor = EnumHelper.addArmorMaterial("SparkArmor", 100, new int[]{4, 9, 7, 4}, 10);
	static EnumArmorMaterial gustArmor = EnumHelper.addArmorMaterial("GustArmor", 100, new int[]{4, 9, 7, 4}, 10);
	static EnumArmorMaterial voidArmor = EnumHelper.addArmorMaterial("VoidArmor", 100, new int[]{4, 9, 7, 4}, 10);
	static EnumArmorMaterial freezeArmor = EnumHelper.addArmorMaterial("FreezeArmor", 100, new int[]{4, 9, 7, 4}, 10);
	static EnumArmorMaterial gaiaArmor = EnumHelper.addArmorMaterial("GaiaArmor", 100, new int[]{4, 9, 7, 4}, 10);
	
	
	
		
	public void init(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	    config.load();
	    
	    armorIDs[0] = config.get("Item", "Codhopian Helmet", 2500).getInt() - 256;
	    armorIDs[1] = config.get("Item", "Codhopian Chestplate", 2501).getInt() - 256;
	    armorIDs[2] = config.get("Item", "Codhopian Leggings", 2502).getInt() - 256;
	    armorIDs[3] = config.get("Item", "Codhopian Boots", 2503).getInt() - 256;
	    
	    armorIDs[4] = config.get("Item", "Flare Helmet", 2504).getInt() - 256;
	    armorIDs[5] = config.get("Item", "Flare Chestplate", 2505).getInt() - 256;
	    armorIDs[6] = config.get("Item", "Flare Leggings", 2506).getInt() - 256;
	    armorIDs[7] = config.get("Item", "Flare Boots", 2507).getInt() - 256;
	    
	    armorIDs[8] = config.get("Item", "Gust Helmet", 2508).getInt() - 256;
	    armorIDs[9] = config.get("Item", "Gust Chestplate", 2509).getInt() - 256;
	    armorIDs[10] = config.get("Item", "Gust Leggings", 2510).getInt() - 256;
	    armorIDs[11] = config.get("Item", "Gust Boots", 2511).getInt() - 256;
	    
	    armorIDs[12] = config.get("Item", "Spark Helmet", 2512).getInt() - 256;
	    armorIDs[13] = config.get("Item", "Spark Chestplate", 2513).getInt() - 256;
	    armorIDs[14] = config.get("Item", "Spark Leggings", 2514).getInt() - 256;
	    armorIDs[15] = config.get("Item", "Spark Boots", 2515).getInt() - 256;
	    
	    armorIDs[16] = config.get("Item", "Freeze Helmet", 2516).getInt() - 256;
	    armorIDs[17] = config.get("Item", "Freeze Chestplate", 2517).getInt() - 256;
	    armorIDs[18] = config.get("Item", "Freeze Leggings", 2518).getInt() - 256;
	    armorIDs[19] = config.get("Item", "Freeze Boots", 2519).getInt() - 256;
	    
	    armorIDs[20] = config.get("Item", "Gaia Helmet", 2520).getInt() - 256;
	    armorIDs[21] = config.get("Item", "Gaia Chestplate", 2521).getInt() - 256;
	    armorIDs[22] = config.get("Item", "Gaia Leggings", 2522).getInt() - 256;
	    armorIDs[23] = config.get("Item", "Gaia Boots", 2523).getInt() - 256;
	    
	    armorIDs[24] = config.get("Item", "Void Helmet", 2524).getInt() - 256;
	    armorIDs[25] = config.get("Item", "Void Chestplate", 2525).getInt() - 256;
	    armorIDs[26] = config.get("Item", "Void Leggings", 2526).getInt() - 256;
	    armorIDs[27] = config.get("Item", "Void Boots", 2527).getInt() - 256;
	    
	    config.save();
	    
	    codhopianHelm = (new ItemCodhopianArmor(armorIDs[0], codhopiaArmor, 4, 0).setUnlocalizedName("codhopianHelm").setTextureName("valiant:codhopianHelm").setCreativeTab(CreativeTabs.tabCombat));
		codhopianChest = (new ItemCodhopianArmor(armorIDs[1], codhopiaArmor, 4, 1).setUnlocalizedName("codhopianChest").setTextureName("valiant:codhopianChest").setCreativeTab(CreativeTabs.tabCombat));
		codhopianLeggings = (new ItemCodhopianArmor(armorIDs[2], codhopiaArmor, 4, 2).setUnlocalizedName("codhopianLeggings").setTextureName("valiant:codhopianLeggings").setCreativeTab(CreativeTabs.tabCombat));
		codhopianBoots = (new ItemCodhopianArmor(armorIDs[3], codhopiaArmor, 4, 3).setUnlocalizedName("codhopianBoots").setTextureName("valiant:codhopianBoots").setCreativeTab(CreativeTabs.tabCombat));
		
		flareHelm = (new ItemFlareArmor(armorIDs[4], flareArmor, 4, 0).setUnlocalizedName("flareHelm").setTextureName("valiant:flareHelm").setCreativeTab(CreativeTabs.tabCombat));
		flareChest = (new ItemFlareArmor(armorIDs[5], flareArmor, 4, 1).setUnlocalizedName("flareChest").setTextureName("valiant:flareChest").setCreativeTab(CreativeTabs.tabCombat));
		flareLeggings = (new ItemFlareArmor(armorIDs[6], flareArmor, 4, 2).setUnlocalizedName("flareLeggings").setTextureName("valiant:flareLeggings").setCreativeTab(CreativeTabs.tabCombat));
		flareBoots = (new ItemFlareArmor(armorIDs[7], flareArmor, 4, 3).setUnlocalizedName("flareBoots").setTextureName("valiant:flareBoots").setCreativeTab(CreativeTabs.tabCombat));
		
		gustHelm = (new ItemGustArmor(armorIDs[8], gustArmor, 4, 0).setUnlocalizedName("gustHelm").setTextureName("valiant:gustHelm").setCreativeTab(CreativeTabs.tabCombat));
		gustChest = (new ItemGustArmor(armorIDs[9], gustArmor, 4, 1).setUnlocalizedName("gustChest").setTextureName("valiant:gustChest").setCreativeTab(CreativeTabs.tabCombat));
		gustLeggings = (new ItemGustArmor(armorIDs[10], gustArmor, 4, 2).setUnlocalizedName("gustLeggings").setTextureName("valiant:gustLeggings").setCreativeTab(CreativeTabs.tabCombat));
		gustBoots = (new ItemGustArmor(armorIDs[11], gustArmor, 4, 3).setUnlocalizedName("gustBoots").setTextureName("valiant:gustBoots").setCreativeTab(CreativeTabs.tabCombat));
		
		sparkHelm = (new ItemElectricArmor(armorIDs[12], sparkArmor, 4, 0).setUnlocalizedName("sparkHelm").setTextureName("valiant:sparkHelm").setCreativeTab(CreativeTabs.tabCombat));
		sparkChest = (new ItemElectricArmor(armorIDs[13], sparkArmor, 4, 1).setUnlocalizedName("sparkChest").setTextureName("valiant:sparkChest").setCreativeTab(CreativeTabs.tabCombat));
		sparkLeggings = (new ItemElectricArmor(armorIDs[14], sparkArmor, 4, 2).setUnlocalizedName("sparkLeggings").setTextureName("valiant:sparkLeggings").setCreativeTab(CreativeTabs.tabCombat));
		sparkBoots = (new ItemElectricArmor(armorIDs[15], sparkArmor, 4, 3).setUnlocalizedName("sparkBoots").setTextureName("valiant:sparkBoots").setCreativeTab(CreativeTabs.tabCombat));
		
		freezeHelm = (new ItemFreezeArmor(armorIDs[16], freezeArmor, 4, 0).setUnlocalizedName("freezeHelm").setTextureName("valiant:freezeHelm").setCreativeTab(CreativeTabs.tabCombat));
		freezeChest = (new ItemFreezeArmor(armorIDs[17], freezeArmor, 4, 1).setUnlocalizedName("freezeChest").setTextureName("valiant:freezeChest").setCreativeTab(CreativeTabs.tabCombat));
		freezeLeggings = (new ItemFreezeArmor(armorIDs[18], freezeArmor, 4, 2).setUnlocalizedName("freezeLeggings").setTextureName("valiant:freezeLeggings").setCreativeTab(CreativeTabs.tabCombat));
		freezeBoots = (new ItemFreezeArmor(armorIDs[19], freezeArmor, 4, 3).setUnlocalizedName("freezeBoots").setTextureName("valiant:freezeBoots").setCreativeTab(CreativeTabs.tabCombat));
		
		gaiaHelm = (new ItemGaiaArmor(armorIDs[20], gaiaArmor, 4, 0).setUnlocalizedName("gaiaHelm").setTextureName("valiant:gaiaHelm").setCreativeTab(CreativeTabs.tabCombat));
		gaiaChest = (new ItemGaiaArmor(armorIDs[21], gaiaArmor, 4, 1).setUnlocalizedName("gaiaChest").setTextureName("valiant:gaiaChest").setCreativeTab(CreativeTabs.tabCombat));
		gaiaLeggings = (new ItemGaiaArmor(armorIDs[22], gaiaArmor, 4, 2).setUnlocalizedName("gaiaLeggings").setTextureName("valiant:gaiaLeggings").setCreativeTab(CreativeTabs.tabCombat));
		gaiaBoots = (new ItemGaiaArmor(armorIDs[23], gaiaArmor, 4, 3).setUnlocalizedName("gaiaBoots").setTextureName("valiant:gaiaBoots").setCreativeTab(CreativeTabs.tabCombat));
		
		voidHelm = (new ItemVoidArmor(armorIDs[24], voidArmor, 4, 0).setUnlocalizedName("voidHelm").setTextureName("valiant:voidHelm").setCreativeTab(CreativeTabs.tabCombat));
		voidChest = (new ItemVoidArmor(armorIDs[25], voidArmor, 4, 1).setUnlocalizedName("voidChest").setTextureName("valiant:voidChest").setCreativeTab(CreativeTabs.tabCombat));
		voidLeggings = (new ItemVoidArmor(armorIDs[26], voidArmor, 4, 2).setUnlocalizedName("voidLeggings").setTextureName("valiant:voidLeggings").setCreativeTab(CreativeTabs.tabCombat));
		voidBoots = (new ItemVoidArmor(armorIDs[27], voidArmor, 4, 3).setUnlocalizedName("voidBoots").setTextureName("valiant:voidBoots").setCreativeTab(CreativeTabs.tabCombat));
		
		
		
		LanguageRegistry.addName(codhopianHelm, "Codhopian Helmet");
		LanguageRegistry.addName(codhopianChest, "Codhopian Chestplate");
		LanguageRegistry.addName(codhopianLeggings, "Codhopian Leggings");
		LanguageRegistry.addName(codhopianBoots, "Codhopian Boots");
		LanguageRegistry.addName(flareHelm, "Flare Helmet");
		LanguageRegistry.addName(flareChest, "Flare Chestplate");
		LanguageRegistry.addName(flareLeggings, "Flare Leggings");
		LanguageRegistry.addName(flareBoots, "Flare Boots");
		LanguageRegistry.addName(gustHelm, "Gust Helmet");
		LanguageRegistry.addName(gustChest, "Gust Chestplate");
		LanguageRegistry.addName(gustLeggings, "Gust Leggings");
		LanguageRegistry.addName(gustBoots, "Gust Boots");
		LanguageRegistry.addName(sparkHelm, "Spark Helmet");
		LanguageRegistry.addName(sparkChest, "Spark Chestplate");
		LanguageRegistry.addName(sparkLeggings, "Spark Leggings");
		LanguageRegistry.addName(sparkBoots, "Spark Boots");
		LanguageRegistry.addName(freezeHelm, "Freeze Helmet");
		LanguageRegistry.addName(freezeChest, "Freeze Chestplate");
		LanguageRegistry.addName(freezeLeggings, "Freeze Leggings");
		LanguageRegistry.addName(freezeBoots, "Freeze Boots");
		LanguageRegistry.addName(gaiaHelm, "Gaia Helmet");
		LanguageRegistry.addName(gaiaChest, "Gaia Chestplate");
		LanguageRegistry.addName(gaiaLeggings, "Gaia Leggings");
		LanguageRegistry.addName(gaiaBoots, "Gaia Boots");
		LanguageRegistry.addName(voidHelm, "Void Helmet");
		LanguageRegistry.addName(voidChest, "Void Chestplate");
		LanguageRegistry.addName(voidLeggings, "Void Leggings");
		LanguageRegistry.addName(voidBoots, "Void Boots");
	}

}
