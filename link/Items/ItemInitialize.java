package link.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;

public class ItemInitialize 
{
	int itemIDs[] = new int[39];
	
	public static Item flareEssence;
	public static Item windEssence;
	public static Item earthEssence;
	public static Item iceEssence;
	public static Item electricEssence;
	public static Item voidEssence;
	public static Item codhopianIngot;
	public static Item omegaIngot;;
	public static Item monsterBadge;
	public static Item attorneysBadge, prosecutorsBadge;
	
	//Food Items
	public static Item mead;
	public static Item cloudCake;
	public static Item joltCandy;
	public static Item superChilledCream;
	public static Item mudPie;
	public static Item spicyCookie;
	public static Item darkLicorice;
	
	//Stones
	public static Item strengthStone;
	public static Item hasteStone;
	public static Item waterStone;
	public static Item fireStone;
	public static Item speedStone;
	
		
		//Alchohols
	public static Item vodka;
	public static Item martini;
	public static Item beer;
	public static Item wine;
	public static Item rum;
	public static Item whiskey;
	public static Item mugOfInfiniteAlchohol;
		
		
	
		
	public void init(FMLPreInitializationEvent event)
	{
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	    config.load();
	    
	    itemIDs[0] = config.get("Item", "Codhopian Ingot", 2000).getInt() - 256;
	    itemIDs[1] = config.get("Item", "Flare Essence", 2001).getInt() - 256;
	    itemIDs[2] = config.get("Item", "Gust Essence", 2002).getInt() - 256;
	    itemIDs[3] = config.get("Item", "Freeze Essence", 2003).getInt() - 256;
	    itemIDs[4] = config.get("Item", "Spark Essence", 2004).getInt() - 256;
	    itemIDs[5] = config.get("Item", "Gaia Essence", 2005).getInt() - 256;
	    itemIDs[6] = config.get("Item", "Void Essence", 2006).getInt() - 256;
	    itemIDs[7] = config.get("Item", "Attorney's Badge", 2007).getInt() - 256;
	    itemIDs[8] = config.get("Item", "Prosector's Badge", 2008).getInt() - 256;
	    itemIDs[9] = config.get("Item", "Fire Stone", 2009).getInt() - 256;
	    itemIDs[10] = config.get("Item", "Strength Stone", 2010).getInt() - 256;
	    itemIDs[11] = config.get("Item", "Haste Stone", 2011).getInt() - 256;
	    itemIDs[12] = config.get("Item", "Water Stone", 2012).getInt() - 256;
	    itemIDs[13] = config.get("Item", "Speed Stone", 2013).getInt() - 256;
	    itemIDs[14] = config.get("Item", "Omega Ingot", 2014).getInt() - 256;
	    itemIDs[15] = config.get("Item", "Monster Badge", 2015).getInt() - 256;
	    itemIDs[16] = config.get("Item", "Cloud Cake", 2016).getInt() - 256;
	    itemIDs[17] = config.get("Item", "Jolt Candy", 2017).getInt() - 256;
	    itemIDs[18] = config.get("Item", "Super Chilled Ice Cream", 2018).getInt() - 256;
	    itemIDs[19] = config.get("Item", "Mud Pie", 2019).getInt() - 256;
	    itemIDs[20] = config.get("Item", "Spicy Ramen", 2020).getInt() - 256;
	    itemIDs[21] = config.get("Item", "Dark Licorice", 2021).getInt() - 256;
	    itemIDs[22] = config.get("Item", "Mead", 2022).getInt() - 256;
	    itemIDs[23] = config.get("Item", "Whiskey", 2023).getInt() - 256;
	    itemIDs[24] = config.get("Item", "Rum", 2024).getInt() - 256;
	    itemIDs[25] = config.get("Item", "Wine", 2025).getInt() - 256;
	   
	    
	    
	    
	    config.save();
		
	    codhopianIngot = (new Item(itemIDs[0]).setUnlocalizedName("codhopianIngot").setTextureName("valiant:codhopianIngot").setCreativeTab(CreativeTabs.tabMaterials));
	    flareEssence = (new Item(itemIDs[1]).setUnlocalizedName("flareEssence").setTextureName("valiant:flareEssence").setCreativeTab(CreativeTabs.tabMaterials));
	    windEssence = (new Item(itemIDs[2]).setUnlocalizedName("gustEssence").setTextureName("valiant:windEssence").setCreativeTab(CreativeTabs.tabMaterials));
	    iceEssence = (new Item(itemIDs[3]).setUnlocalizedName("iceEssence").setTextureName("valiant:iceEssence").setCreativeTab(CreativeTabs.tabMaterials));
	    electricEssence = (new Item(itemIDs[4]).setUnlocalizedName("sparkEssence").setTextureName("valiant:electricEssence").setCreativeTab(CreativeTabs.tabMaterials));
	    earthEssence = (new Item(itemIDs[5]).setUnlocalizedName("earthEssence").setTextureName("valiant:earthEssence").setCreativeTab(CreativeTabs.tabMaterials));
	    voidEssence = (new Item(itemIDs[6]).setUnlocalizedName("voidEssence").setTextureName("valiant:voidEssence").setCreativeTab(CreativeTabs.tabMaterials));
	    attorneysBadge = (new Item(itemIDs[7]).setUnlocalizedName("attorneysBadge").setTextureName("valiant:attorneysBadge").setCreativeTab(CreativeTabs.tabMisc));
	    prosecutorsBadge = (new Item(itemIDs[8]).setUnlocalizedName("prosecutorsBadge").setTextureName("valiant:prosecutorsBadge").setCreativeTab(CreativeTabs.tabMisc));
	    fireStone = (new ItemFireStone(itemIDs[9]).setUnlocalizedName("fireStone").setTextureName("valiant:fireStone").setCreativeTab(CreativeTabs.tabMisc));
	    strengthStone = (new ItemStrengthStone(itemIDs[10]).setUnlocalizedName("strengthStone").setTextureName("valiant:strengthStone").setCreativeTab(CreativeTabs.tabMisc));
	    hasteStone = (new ItemHasteStone(itemIDs[11]).setUnlocalizedName("hasteStone").setTextureName("valiant:hasteStone").setCreativeTab(CreativeTabs.tabMisc));
	    waterStone = (new ItemWaterStone(itemIDs[12]).setUnlocalizedName("waterStone").setTextureName("valiant:waterStone").setCreativeTab(CreativeTabs.tabMisc));
	    speedStone = (new ItemSpeedStone(itemIDs[13]).setUnlocalizedName("speedStone").setTextureName("valiant:speedStone").setCreativeTab(CreativeTabs.tabMisc));
	    omegaIngot = (new Item(itemIDs[14]).setUnlocalizedName("omegaIngot").setTextureName("valiant:omegaIngot").setCreativeTab(CreativeTabs.tabMaterials));
	    monsterBadge = (new Item(itemIDs[15]).setUnlocalizedName("monsterBadge").setTextureName("valiant:monsterBadge").setCreativeTab(CreativeTabs.tabMisc));
	    cloudCake = (new ItemCloudCake(itemIDs[16], 3, false).setUnlocalizedName("cloudCake").setTextureName("valiant:cloudCake").setCreativeTab(CreativeTabs.tabFood));
	    joltCandy = (new ItemJoltCandy(itemIDs[17], 3, false).setUnlocalizedName("joltCandy").setTextureName("valiant:joltCandy").setCreativeTab(CreativeTabs.tabFood));
	    superChilledCream = (new ItemSuperChilledIceCream(itemIDs[18], 3, false).setUnlocalizedName("superChilledCream").setTextureName("valiant:superChilledCream").setCreativeTab(CreativeTabs.tabFood));
	    mudPie = (new ItemMudPie(itemIDs[19], 3, false).setUnlocalizedName("mudPie").setTextureName("valiant:mudPie").setCreativeTab(CreativeTabs.tabFood));
	    spicyCookie = (new ItemSpicyCookie(itemIDs[20], 3, false).setUnlocalizedName("spicyCookie").setTextureName("valiant:spicyCookie").setCreativeTab(CreativeTabs.tabFood));
	    darkLicorice = (new ItemDarkLicorice(itemIDs[21], 3, false).setUnlocalizedName("darkLicorice").setTextureName("valiant:darkLicorice").setCreativeTab(CreativeTabs.tabFood));
	    mead = (new ItemBeer(itemIDs[22], 6, false).setUnlocalizedName("mead").setTextureName("valiant:mead").setCreativeTab(CreativeTabs.tabFood));
	    whiskey = (new ItemBeer(itemIDs[23], 6, false).setUnlocalizedName("whiskey").setTextureName("valiant:whiskey").setCreativeTab(CreativeTabs.tabFood));
	    rum = (new ItemBeer(itemIDs[24], 6, false).setUnlocalizedName("rum").setTextureName("valiant:rum").setCreativeTab(CreativeTabs.tabFood));
	    wine = (new ItemBeer(itemIDs[25], 6, false).setUnlocalizedName("wine").setTextureName("valiant:wine").setCreativeTab(CreativeTabs.tabFood));
	    
	    LanguageRegistry.addName(codhopianIngot, "Codhopian Ingot");
	    LanguageRegistry.addName(flareEssence, "Flare Essence");
	    LanguageRegistry.addName(windEssence, "Gust Essence");
	    LanguageRegistry.addName(iceEssence, "Freeze Essence");
	    LanguageRegistry.addName(electricEssence, "Spark Essence");
	    LanguageRegistry.addName(earthEssence, "Gaia Essence");
	    LanguageRegistry.addName(voidEssence, "Void Essence");
	    LanguageRegistry.addName(attorneysBadge, "Attorney's Badge");
	    LanguageRegistry.addName(prosecutorsBadge, "Prosecutor's Badge");
	    LanguageRegistry.addName(fireStone, "Fire Stone");
	    LanguageRegistry.addName(strengthStone, "Strength Stone");
	    LanguageRegistry.addName(hasteStone, "Haste Stone");
	    LanguageRegistry.addName(waterStone, "Water Stone");
	    LanguageRegistry.addName(speedStone, "Speed Stone");
	    LanguageRegistry.addName(omegaIngot, "Omega Ingot");
	    LanguageRegistry.addName(monsterBadge, "Monster Badge");
	    LanguageRegistry.addName(cloudCake, "Cloud Cake");
	    LanguageRegistry.addName(joltCandy, "Jolt Candy");
	    LanguageRegistry.addName(superChilledCream, "Super Chilled Ice Cream");
	    LanguageRegistry.addName(mudPie, "Mud Pie");
	    LanguageRegistry.addName(spicyCookie, "Spicy Cookie");
	    LanguageRegistry.addName(darkLicorice, "Dark Licorice");
	    LanguageRegistry.addName(mead, "Mead");
	    LanguageRegistry.addName(whiskey, "Whiskey");
	    LanguageRegistry.addName(rum, "Rum");
	    LanguageRegistry.addName(wine, "Wine");
	    
	    
	}

}
