package link.Weapons;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class WeaponsInitialize 
{
	int weaponIDs[] = new int[21];
	
	//Codhopian Tools
			
			public static Item codhopianSword;			
			public static Item flareSword;									
			public static Item voidSword;									
			public static Item gustSword;
			public static Item gustBow;			
			public static Item sparkSword;					
			public static Item quakeSword;						
			public static Item freezeSword;
			
			
			//Gilded Weapons
			public static Item gildedCodhopianSword;
			public static Item gildedWoodenSword;
			public static Item gildedStoneSword;
			public static Item gildedIronSword;
			public static Item gildedGoldenSword;
			public static Item gildedDiamondSword;
			public static Item gildedFlareSword;
			public static Item gildedGustSword;
			public static Item gildedSparkSword;
			public static Item gildedGaiaSword;
			public static Item gildedFreezeSword;
			public static Item gildedVoidSword;			
		
		//Tool Materials
			static EnumToolMaterial codhopia = EnumHelper.addToolMaterial("Codhopia", 2, 1000, 7F, 5, 14);
			static EnumToolMaterial flare = EnumHelper.addToolMaterial("Flare", 3, 3000, 7F, 6, 14);
			static EnumToolMaterial voids = EnumHelper.addToolMaterial("Void", 3, 3500, 7F, 7, 14);
			static EnumToolMaterial gust = EnumHelper.addToolMaterial("Gust", 3, 3400, 9F, 5, 14);
			static EnumToolMaterial spark = EnumHelper.addToolMaterial("Spark", 3, 3800, 12F, 8, 14);
			static EnumToolMaterial quake = EnumHelper.addToolMaterial("Quake", 3, 2800, 6F, 10, 14);
			static EnumToolMaterial freeze = EnumHelper.addToolMaterial("Freeze", 3, 3500, 7F, 6, 14);
				
				//Gilded Tool Materials
			static EnumToolMaterial gildedCodhopia = EnumHelper.addToolMaterial("GildCodhopia", 3, 2000, 7F, 10, 14);
			static EnumToolMaterial gildedFlare = EnumHelper.addToolMaterial("GildFlare", 3, 6000, 7F, 12, 14);
			static EnumToolMaterial gildedVoids = EnumHelper.addToolMaterial("GildVoid", 3, 7000, 7F, 14, 14);
			static EnumToolMaterial gildedGust = EnumHelper.addToolMaterial("GildGust", 3, 6800, 9F, 10, 14);
			static EnumToolMaterial gildedSpark = EnumHelper.addToolMaterial("GildSpark", 3, 7600, 12F, 16, 14);
			static EnumToolMaterial gildedQuake = EnumHelper.addToolMaterial("GildQuake", 3, 5600, 6F, 20, 14);
			static EnumToolMaterial gildedFreeze = EnumHelper.addToolMaterial("GildFreeze", 3, 7000, 7F, 12, 14);
			static EnumToolMaterial gildedWood = EnumHelper.addToolMaterial("GildWood", 2, 118, 2F, 1, 14);
			static EnumToolMaterial gildedStone = EnumHelper.addToolMaterial("GildStone", 2, 262, 4F, 2, 14);
			static EnumToolMaterial gildedIron = EnumHelper.addToolMaterial("GildIron", 3, 500, 6F, 4, 14);
			static EnumToolMaterial gildedGold = EnumHelper.addToolMaterial("GildGold", 1, 64, 12F, 1, 14);
			static EnumToolMaterial gildedDiamond = EnumHelper.addToolMaterial("GildDiamond", 3, 3122, 8F, 6, 14);
	
	public void init(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	    config.load();
	    
	    weaponIDs[0] = config.get("Item", "Codhopian Sword", 3500).getInt() - 256;
	    weaponIDs[1] = config.get("Item", "Flare Sword", 3501).getInt() - 256;
	    weaponIDs[2] = config.get("Item", "Gust Sword", 3502).getInt() - 256;
	    weaponIDs[3] = config.get("Item", "Spark Sword", 3503).getInt() - 256;
	    weaponIDs[4] = config.get("Item", "Freeze Sword", 3504).getInt() - 256;
	    weaponIDs[5] = config.get("Item", "Gaia Sword", 3505).getInt() - 256;
	    weaponIDs[6] = config.get("Item", "Void Sword", 3506).getInt() - 256;
	    weaponIDs[7] = config.get("Item", "Gilded Codhopian Sword", 3507).getInt() - 256;
	    weaponIDs[8] = config.get("Item", "Gilded Flare Sword", 3508).getInt() - 256;
	    weaponIDs[9] = config.get("Item", "Gilded Gust Sword", 3509).getInt() - 256;
	    weaponIDs[10] = config.get("Item", "Gilded Spark Sword", 3510).getInt() - 256;
	    weaponIDs[11] = config.get("Item", "Gilded Freeze Sword", 3511).getInt() - 256;
	    weaponIDs[12] = config.get("Item", "Gilded Gaia Sword", 3512).getInt() - 256;
	    weaponIDs[13] = config.get("Item", "Gilded Void Sword", 3513).getInt() - 256;
	    weaponIDs[14] = config.get("Item", "Gilded Wooden Sword", 3514).getInt() - 256;
	    weaponIDs[15] = config.get("Item", "Gilded Stone Sword", 3515).getInt() - 256;
	    weaponIDs[16] = config.get("Item", "Gilded Iron Sword", 3516).getInt() - 256;
	    weaponIDs[17] = config.get("Item", "Gilded Golden Sword", 3517).getInt() - 256;
	    weaponIDs[18] = config.get("Item", "Gilded Diamond Sword", 3518).getInt() - 256;
	    
	    config.save();
	    
	    codhopianSword = (new ItemCodhopianSword(weaponIDs[0], codhopia).setUnlocalizedName("codhopianSword").setTextureName("valiant:codhopianSword").setCreativeTab(CreativeTabs.tabCombat));
	    flareSword = (new ItemFlareSword(weaponIDs[1], flare).setUnlocalizedName("flareSword").setTextureName("valiant:flareSword").setCreativeTab(CreativeTabs.tabCombat));
	    gustSword = (new ItemGustSword(weaponIDs[2], gust).setUnlocalizedName("gustSword").setTextureName("valiant:gustSword").setCreativeTab(CreativeTabs.tabCombat));
	    sparkSword = (new ItemSparkSword(weaponIDs[3], spark).setUnlocalizedName("sparkSword").setTextureName("valiant:sparkSword").setCreativeTab(CreativeTabs.tabCombat));
	    freezeSword = (new ItemIceSword(weaponIDs[4], freeze).setUnlocalizedName("freezeSword").setTextureName("valiant:freezeSword").setCreativeTab(CreativeTabs.tabCombat));
	    quakeSword = (new ItemQuakeSword(weaponIDs[5], quake).setUnlocalizedName("earthSword").setTextureName("valiant:quakeSword").setCreativeTab(CreativeTabs.tabCombat));
	    voidSword = (new ItemVoidSword(weaponIDs[6], voids).setUnlocalizedName("voidSword").setTextureName("valiant:voidSword").setCreativeTab(CreativeTabs.tabCombat));
	    gildedCodhopianSword = (new ItemCodhopianSword(weaponIDs[7], gildedCodhopia).setUnlocalizedName("gildedCodhopianSword").setTextureName("valiant:gildedCodhopianSword").setCreativeTab(CreativeTabs.tabCombat));
	    gildedFlareSword = (new ItemFlareSword(weaponIDs[8], gildedFlare).setUnlocalizedName("gildedFlareSword").setTextureName("valiant:gildedFlareSword").setCreativeTab(CreativeTabs.tabCombat));
	    gildedGustSword = (new ItemGustSword(weaponIDs[9], gildedGust).setUnlocalizedName("gildedGustSword").setTextureName("valiant:gildedGustSword").setCreativeTab(CreativeTabs.tabCombat));
	    gildedSparkSword = (new ItemSparkSword(weaponIDs[10], gildedSpark).setUnlocalizedName("gildedSparkSword").setTextureName("valiant:gildedSparkSword").setCreativeTab(CreativeTabs.tabCombat));
	    gildedFreezeSword = (new ItemIceSword(weaponIDs[11], gildedFreeze).setUnlocalizedName("gildedFreezeSword").setTextureName("valiant:gildedFreezeSword").setCreativeTab(CreativeTabs.tabCombat));
	    gildedGaiaSword = (new ItemQuakeSword(weaponIDs[12], gildedQuake).setUnlocalizedName("gildedGaiaSword").setTextureName("valiant:gildedGaiaSword").setCreativeTab(CreativeTabs.tabCombat));
	    gildedVoidSword = (new ItemVoidSword(weaponIDs[13], gildedVoids).setUnlocalizedName("gildedVoidSword").setTextureName("valiant:gildedVoidSword").setCreativeTab(CreativeTabs.tabCombat));
	    gildedWoodenSword = (new ItemSword(weaponIDs[14], gildedWood).setUnlocalizedName("gildedWoodenSword").setTextureName("valiant:gildedWoodenSword").setCreativeTab(CreativeTabs.tabCombat));
	    gildedStoneSword = (new ItemSword(weaponIDs[15], gildedStone).setUnlocalizedName("gildedStoneSword").setTextureName("valiant:gildedStoneSword").setCreativeTab(CreativeTabs.tabCombat));
	    gildedIronSword = (new ItemSword(weaponIDs[16], gildedIron).setUnlocalizedName("gildedIronSword").setTextureName("valiant:gildedIronSword").setCreativeTab(CreativeTabs.tabCombat));
	    gildedGoldenSword = (new ItemSword(weaponIDs[17], gildedGold).setUnlocalizedName("gildedGoldenSword").setTextureName("valiant:gildedGoldenSword").setCreativeTab(CreativeTabs.tabCombat));
	    gildedDiamondSword = (new ItemSword(weaponIDs[18], gildedDiamond).setUnlocalizedName("gildedDiamondSword").setTextureName("valiant:gildedDiamondSword").setCreativeTab(CreativeTabs.tabCombat));
	    
	    
	    LanguageRegistry.addName(codhopianSword, "Codhopian Sword");
	    LanguageRegistry.addName(flareSword, "Flare Sword");
	    LanguageRegistry.addName(gustSword, "Gust Sword");
	    LanguageRegistry.addName(sparkSword, "Spark Sword");
	    LanguageRegistry.addName(freezeSword, "Freeze Sword");
	    LanguageRegistry.addName(quakeSword, "Gaia Sword");
	    LanguageRegistry.addName(voidSword, "Void Sword");
	    LanguageRegistry.addName(gildedCodhopianSword, "Gilded Codhopian Sword");
	    LanguageRegistry.addName(gildedFlareSword, "Gilded Flare Sword");
	    LanguageRegistry.addName(gildedGustSword, "Gilded Gust Sword");
	    LanguageRegistry.addName(gildedSparkSword, "Gilded Spark Sword");
	    LanguageRegistry.addName(gildedFreezeSword, "Gilded Freeze Sword");
	    LanguageRegistry.addName(gildedGaiaSword, "Gilded Gaia Sword");
	    LanguageRegistry.addName(gildedVoidSword, "Gilded Void Sword");
	    LanguageRegistry.addName(gildedWoodenSword, "Gilded Wooden Sword");
	    LanguageRegistry.addName(gildedStoneSword, "Gilded Stone Sword");
	    LanguageRegistry.addName(gildedIronSword, "Gilded Iron Sword");
	    LanguageRegistry.addName(gildedGoldenSword, "Gilded Golden Sword");
	    LanguageRegistry.addName(gildedDiamondSword, "Gilded Diamond Sword");
	    
	    
	}

}
