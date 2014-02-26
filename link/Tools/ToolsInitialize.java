package link.Tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ToolsInitialize 
{
	int toolIDs[] = new int[28];
	
	//Codhopian Tools
		public static Item codhopianPick;
		public static Item codhopianAxe;
		public static Item codhopianShovel;
		public static Item codhopianHoe;
		
		//Flare Tools
		public static Item flarePick;	
		public static Item flareAxe;
		public static Item flareShovel;
		public static Item flareHoe;
		
		//Void Tools
		public static Item voidPick;
		public static Item voidHoe;
		public static Item voidAxe;
		public static Item voidShovel;
		
		//Gust Tools
		public static Item gustPick;
		public static Item gustShovel;
		public static Item gustAxe;
		public static Item gustHoe;
		public static Item gustBow;
		
		//Spark Tools
		public static Item sparkPick;
		public static Item sparkAxe;
		public static Item sparkHoe;
		public static Item sparkShovel;
		
		//Quake Tools
		public static Item earthPick;
		public static Item earthAxe;
		public static Item earthShovel;
		public static Item earthHoe;
		
		//Freeze Tools
		public static Item freezePick;
		public static Item freezeAxe;
		public static Item freezeHoe;
		public static Item freezeShovel;	
	
	//Tool Materials
		static EnumToolMaterial codhopia = EnumHelper.addToolMaterial("Codhopia", 2, 1000, 7F, 5, 14);
		static EnumToolMaterial flare = EnumHelper.addToolMaterial("Flare", 3, 3000, 7F, 6, 14);
		static EnumToolMaterial voids = EnumHelper.addToolMaterial("Void", 3, 3500, 7F, 7, 14);
		static EnumToolMaterial gust = EnumHelper.addToolMaterial("Gust", 3, 3400, 9F, 5, 14);
		static EnumToolMaterial spark = EnumHelper.addToolMaterial("Spark", 3, 3800, 12F, 8, 14);
		static EnumToolMaterial quake = EnumHelper.addToolMaterial("Quake", 3, 2800, 6F, 10, 14);
		static EnumToolMaterial freeze = EnumHelper.addToolMaterial("Freeze", 3, 3500, 7F, 6, 14);
			
		
		
		
	public void init(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	    config.load();
	    
	    toolIDs[0] = config.get("Item", "Codhopian Axe", 5000).getInt() - 256;
	    toolIDs[1] = config.get("Item", "Codhopian Pick", 5001).getInt() - 256;
	    toolIDs[2] = config.get("Item", "Codhopian Shovel", 5002).getInt() - 256;
	    toolIDs[3] = config.get("Item", "Codhopian Hoe", 5003).getInt() - 256;
	    toolIDs[4] = config.get("Item", "Flare Axe", 5004).getInt() - 256;
	    toolIDs[5] = config.get("Item", "Flare Pick", 5005).getInt() - 256;
	    toolIDs[6] = config.get("Item", "Flare Shovel", 5006).getInt() - 256;
	    toolIDs[7] = config.get("Item", "Flare Hoe", 5007).getInt() - 256;
	    toolIDs[8] = config.get("Item", "Gust Axe", 5008).getInt() -256;
	    toolIDs[9] = config.get("Item", "Gust Pick", 5009).getInt() - 256;
	    toolIDs[10] = config.get("Item", "Gust Shovel", 5010).getInt() - 256;
	    toolIDs[11] = config.get("Item", "Gust Hoe", 5011).getInt() - 256;
	    toolIDs[12] = config.get("Item", "Spark Axe", 5012).getInt() - 256;
	    toolIDs[13] = config.get("Item", "Spark Pick", 5013).getInt() - 256;
	    toolIDs[14] = config.get("Item", "Spark Shovel", 5014).getInt() - 256;
	    toolIDs[15] = config.get("Item", "Spark Hoe", 5015).getInt() - 256;
	    toolIDs[16] = config.get("Item", "Freeze Axe", 5016).getInt() - 256;
	    toolIDs[17] = config.get("Item", "Freeze Pick", 5017).getInt() - 256;
	    toolIDs[18] = config.get("Item", "Freeze Shovel", 5018).getInt() - 256;
	    toolIDs[19] = config.get("Item", "Freeze Hoe", 5019).getInt() - 256;
	    toolIDs[20] = config.get("Item", "Gaia Axe", 5020).getInt() - 256;
	    toolIDs[21] = config.get("Item", "Gaia Pick", 5021).getInt() - 256;
	    toolIDs[22] = config.get("Item", "Gaia Shovel", 5022).getInt() - 256;
	    toolIDs[23] = config.get("Item", "Gaia Hoe", 5023).getInt() - 256;
	    toolIDs[24] = config.get("Item", "Void Axe", 5024).getInt() - 256;
	    toolIDs[25] = config.get("Item", "Void Pick", 5025).getInt() - 256;
	    toolIDs[26] = config.get("Item", "Void Shovel", 5026).getInt() - 256;
	    toolIDs[27] = config.get("Item", "Void Hoe", 5027).getInt() - 256;
	    
	    config.save();
		
	    codhopianAxe = (new ItemCodhopianAxe(toolIDs[0], codhopia).setUnlocalizedName("codhopianAxe").setTextureName("valiant:codhopianAxe").setCreativeTab(CreativeTabs.tabTools));
	    codhopianPick = (new ItemCodhopianPick(toolIDs[1], codhopia).setUnlocalizedName("codhopianPick").setTextureName("valiant:codhopianPick").setCreativeTab(CreativeTabs.tabTools));
	    codhopianShovel = (new ItemCodhopianShovel(toolIDs[2], codhopia).setUnlocalizedName("codhopianShovel").setTextureName("valiant:codhopianShovel").setCreativeTab(CreativeTabs.tabTools));
	    codhopianHoe = (new ItemCodhopianHoe(toolIDs[3], codhopia).setUnlocalizedName("codhopianHoe").setTextureName("valiant:codhopianHoe").setCreativeTab(CreativeTabs.tabTools));
	    flareAxe = (new ItemFlareAxe(toolIDs[4], flare).setUnlocalizedName("flareAxe").setTextureName("valiant:flareAxe").setCreativeTab(CreativeTabs.tabTools));
	    flarePick = (new ItemFlarePick(toolIDs[5], flare).setUnlocalizedName("flarePick").setTextureName("valiant:flarePick").setCreativeTab(CreativeTabs.tabTools));
	    flareShovel = (new ItemFlareShovel(toolIDs[6], flare).setUnlocalizedName("flareShovel").setTextureName("valiant:flareShovel").setCreativeTab(CreativeTabs.tabTools));
	    flareHoe = (new ItemFlareHoe(toolIDs[7], flare).setUnlocalizedName("flareHoe").setTextureName("valiant:flareHoe").setCreativeTab(CreativeTabs.tabTools));
	    gustAxe = (new ItemGustAxe(toolIDs[8], gust).setUnlocalizedName("gustAxe").setTextureName("valiant:gustAxe").setCreativeTab(CreativeTabs.tabTools));
	    gustPick = (new ItemGustPick(toolIDs[9], gust).setUnlocalizedName("gustPick").setTextureName("valiant:gustPick").setCreativeTab(CreativeTabs.tabTools));
	    gustShovel = (new ItemGustShovel(toolIDs[10], gust).setUnlocalizedName("gustShovel").setTextureName("valiant:gustShovel").setCreativeTab(CreativeTabs.tabTools));
	    gustHoe = (new ItemGustHoe(toolIDs[11], gust).setUnlocalizedName("gustHoe").setTextureName("valiant:gustHoe").setCreativeTab(CreativeTabs.tabTools));
	    sparkAxe = (new ItemSparkAxe(toolIDs[12], spark).setUnlocalizedName("sparkAxe").setTextureName("valiant:sparkAxe").setCreativeTab(CreativeTabs.tabTools));
	    sparkPick = (new ItemSparkPick(toolIDs[13], spark).setUnlocalizedName("sparkPick").setTextureName("valiant:sparkPick").setCreativeTab(CreativeTabs.tabTools));
	    sparkShovel = (new ItemSparkShovel(toolIDs[14], spark).setUnlocalizedName("sparkShovel").setTextureName("valiant:sparkShovel").setCreativeTab(CreativeTabs.tabTools));
	    sparkHoe = (new ItemSparkHoe(toolIDs[15], spark).setUnlocalizedName("sparkHoe").setTextureName("valiant:sparkHoe").setCreativeTab(CreativeTabs.tabTools));
	    freezeAxe = (new ItemFreezeAxe(toolIDs[16], spark).setUnlocalizedName("freezeAxe").setTextureName("valiant:freezeAxe").setCreativeTab(CreativeTabs.tabTools));
	    freezePick = (new ItemFreezePick(toolIDs[17], spark).setUnlocalizedName("freezePick").setTextureName("valiant:freezePick").setCreativeTab(CreativeTabs.tabTools));
	    freezeShovel = (new ItemFreezeShovel(toolIDs[18], spark).setUnlocalizedName("freezeShovel").setTextureName("valiant:freezeShovel").setCreativeTab(CreativeTabs.tabTools));
	    freezeHoe = (new ItemFreezeHoe(toolIDs[19], spark).setUnlocalizedName("freezeHoe").setTextureName("valiant:freezeHoe").setCreativeTab(CreativeTabs.tabTools));
	    earthAxe = (new ItemEarthAxe(toolIDs[20], spark).setUnlocalizedName("earthAxe").setTextureName("valiant:quakeAxe").setCreativeTab(CreativeTabs.tabTools));
	    earthPick = (new ItemEarthPick(toolIDs[21], quake).setUnlocalizedName("earthPick").setTextureName("valiant:quakePick").setCreativeTab(CreativeTabs.tabTools));
	    earthShovel = (new ItemEarthShovel(toolIDs[22], quake).setUnlocalizedName("earthShovel").setTextureName("valiant:quakeShovel").setCreativeTab(CreativeTabs.tabTools));
	    earthHoe = (new ItemEarthHoe(toolIDs[23], quake).setUnlocalizedName("earthHoe").setTextureName("valiant:quakeHoe").setCreativeTab(CreativeTabs.tabTools));
	    voidAxe = (new ItemVoidAxe(toolIDs[24], voids).setUnlocalizedName("voidAxe").setTextureName("valiant:voidAxe").setCreativeTab(CreativeTabs.tabTools));
	    voidPick = (new ItemVoidPick(toolIDs[25], voids).setUnlocalizedName("voidPick").setTextureName("valiant:voidPick").setCreativeTab(CreativeTabs.tabTools));
	    voidShovel = (new ItemVoidShovel(toolIDs[26], voids).setUnlocalizedName("voidShovel").setTextureName("valiant:voidShovel").setCreativeTab(CreativeTabs.tabTools));
	    voidHoe = (new ItemVoidHoe(toolIDs[27], voids).setUnlocalizedName("voidHoe").setTextureName("valiant:voidHoe").setCreativeTab(CreativeTabs.tabTools));
	  
	    //Names
	    LanguageRegistry.addName(codhopianAxe, "Codhopian Axe");
	    LanguageRegistry.addName(codhopianPick, "Codhopian Pickaxe");
	    LanguageRegistry.addName(codhopianShovel, "Codhopian Shovel");
	    LanguageRegistry.addName(codhopianHoe, "Codhopian Hoe");
	    LanguageRegistry.addName(codhopianShovel, "Codhopian Shovel");
	    LanguageRegistry.addName(flareAxe, "Flare Axe");
	    LanguageRegistry.addName(flarePick, "Flare Pickaxe");
	    LanguageRegistry.addName(flareShovel, "Flare Shovel");
	    LanguageRegistry.addName(flareHoe, "Flare Hoe");
	    LanguageRegistry.addName(gustAxe, "Gust Axe");
	    LanguageRegistry.addName(gustPick, "Gust Pickaxe");
	    LanguageRegistry.addName(gustShovel, "Gust Shovel");
	    LanguageRegistry.addName(gustHoe, "Gust Hoe");
	    LanguageRegistry.addName(sparkAxe, "Spark Axe");
	    LanguageRegistry.addName(sparkPick, "Spark Pickaxe");
	    LanguageRegistry.addName(sparkShovel, "Spark Shovel");
	    LanguageRegistry.addName(sparkHoe, "Spark Hoe");
	    LanguageRegistry.addName(freezeAxe, "Freeze Axe");
	    LanguageRegistry.addName(freezePick, "Freeze Pickaxe");
	    LanguageRegistry.addName(freezeShovel, "Freeze Shovel");
	    LanguageRegistry.addName(freezeHoe, "Freeze Hoe");
	    LanguageRegistry.addName(earthAxe, "Gaia Axe");
	    LanguageRegistry.addName(earthPick, "Gaia Pickaxe");
	    LanguageRegistry.addName(earthShovel, "Gaia Shovel");
	    LanguageRegistry.addName(earthHoe, "Gaia Hoe");
	    LanguageRegistry.addName(voidAxe, "Void Axe");
	    LanguageRegistry.addName(voidPick, "Void Pickaxe");
	    LanguageRegistry.addName(voidShovel, "Void Shovel");
	    LanguageRegistry.addName(voidHoe, "Void Hoe");
	    
	}

}
