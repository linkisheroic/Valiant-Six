package link.Blocks;

import link.Main.ValiantSix;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;

public class BlockInitialize 
{

	public static Block codhopianBlock;
	public static Block codhopianOre;
	public static Block flareBlock;
	public static Block flareOre;
	public static Block windOre;
	public static Block windBlock;
	public static Block skyStone;
	public static Block skyBricks;
	public static Block essenceTorch;
	public static Block iceOre;
	public static Block iceBlock;
	public static Block electricOre;
	public static Block electricBlock;
	public static Block earthOre;
	public static Block earthBlock;
	public static Block voidOre;
	public static Block voidBlock;
	public static Block strengthOre;
	public static Block speedOre;
	public static Block fireOre;
	public static Block waterOre;
	public static Block hasteOre;
	public static Block barrel;
	
	public static int blockIDs[] = new int[22];

public void init(FMLPreInitializationEvent event)
{
	
	
	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    config.load();
    
    blockIDs[0] = config.get("Block", "Codhopian Ore", 500).getInt();
    blockIDs[1] = config.get("Block", "Codhopian Block", 501).getInt();
    blockIDs[2] = config.get("Block", "Flare Ore", 502).getInt();
    blockIDs[3] = config.get("Block", "Flare Block", 503).getInt();
    blockIDs[4] = config.get("Block", "Gust Ore", 504).getInt();
    blockIDs[5] = config.get("Block", "Gust Block", 505).getInt();
    blockIDs[6] = config.get("Block", "Freeze Ore", 506).getInt();
    blockIDs[7] = config.get("Block", "Freeze Block", 508).getInt();
    blockIDs[8] = config.get("Block", "Spark Ore", 509).getInt();
    blockIDs[9] = config.get("Block", "Spark Block", 510).getInt();
    blockIDs[10] = config.get("Block", "Gaia Ore", 511).getInt();
    blockIDs[11] = config.get("Block", "Gaia Block", 512).getInt();
    blockIDs[12] = config.get("Block", "Void Ore", 513).getInt();
    blockIDs[13] = config.get("Block", "Void Block", 514).getInt();
    blockIDs[14] = config.get("Block", "Sky Stone", 515).getInt();
    blockIDs[15] = config.get("Block", "Sky Bricks", 516).getInt();
    blockIDs[16] = config.get("Block", "Fire Stone Ore", 517).getInt();
    blockIDs[17] = config.get("Block", "Haste Stone Ore", 518).getInt();
    blockIDs[18] = config.get("Block", "Strength Stone Ore", 519).getInt();
    blockIDs[19] = config.get("Block", "Speed Stone Ore", 520).getInt();
    blockIDs[20] = config.get("Block", "Essence Torch", 521).getInt();
    blockIDs[21] = config.get("Block", "Barrel", 522).getInt();
    
    
    config.save();
    
    codhopianOre = (new BlockCodhopianOre(blockIDs[0], Material.rock).setUnlocalizedName("codhopianOre").setTextureName("valiant:codhopianOre").setCreativeTab(CreativeTabs.tabBlock));
    codhopianBlock = (new BlockCodhopianBlock(blockIDs[1], Material.rock).setUnlocalizedName("codhopianBlock").setTextureName("valiant:codhopianBlock").setCreativeTab(CreativeTabs.tabBlock));
	flareOre = (new BlockFlareOre(blockIDs[2], Material.rock).setUnlocalizedName("flareOre").setTextureName("valiant:flareOre").setCreativeTab(CreativeTabs.tabBlock));
	flareBlock = (new BlockFlareBlock(blockIDs[3], Material.rock).setUnlocalizedName("flareBlock").setTextureName("valiant:flareBlock").setCreativeTab(CreativeTabs.tabBlock));
	windOre = (new BlockWindOre(blockIDs[4], Material.rock).setUnlocalizedName("gustOre").setTextureName("valiant:windOre").setCreativeTab(CreativeTabs.tabBlock));
	windBlock = (new Block(blockIDs[5], Material.rock).setUnlocalizedName("gustBlock").setTextureName("valiant:gustBlock").setCreativeTab(CreativeTabs.tabBlock));
	iceOre = (new BlockIceOre(blockIDs[6], Material.rock).setUnlocalizedName("freezeOre").setTextureName("valiant:iceOre").setCreativeTab(CreativeTabs.tabBlock));
	iceBlock = (new Block(blockIDs[7], Material.rock).setUnlocalizedName("freezeBlock").setTextureName("valiant:freezeBlock").setCreativeTab(CreativeTabs.tabBlock));
	electricOre = (new BlockElectricOre(blockIDs[8], Material.rock).setUnlocalizedName("sparkOre").setTextureName("valiant:electricOre").setCreativeTab(CreativeTabs.tabBlock));
	electricBlock = (new Block(blockIDs[9], Material.rock).setUnlocalizedName("sparkBlock").setTextureName("valiant:sparkBlock").setCreativeTab(CreativeTabs.tabBlock));
	earthOre = (new BlockEarthOre(blockIDs[10], Material.rock).setUnlocalizedName("gaiaOre").setTextureName("valiant:earthOre").setCreativeTab(CreativeTabs.tabBlock));
	earthBlock = (new Block(blockIDs[11], Material.rock).setUnlocalizedName("gaiaBlock").setTextureName("valiant:gaiaBlock").setCreativeTab(CreativeTabs.tabBlock));
	voidOre = (new BlockVoidOre(blockIDs[12], Material.rock).setUnlocalizedName("voidOre").setTextureName("valiant:voidOre").setCreativeTab(CreativeTabs.tabBlock));
	voidBlock = (new Block(blockIDs[13], Material.rock).setUnlocalizedName("voidBlock").setTextureName("valiant:voidBlock").setCreativeTab(CreativeTabs.tabBlock));
	skyStone = (new Block(blockIDs[14], Material.rock).setUnlocalizedName("skyStone").setTextureName("valiant:skyStone").setCreativeTab(CreativeTabs.tabBlock));
	skyBricks = (new Block(blockIDs[15], Material.rock).setUnlocalizedName("skyBricks").setTextureName("valiant:skyBricks").setCreativeTab(CreativeTabs.tabBlock));
	fireOre = (new BlockFireOre(blockIDs[16], Material.rock).setUnlocalizedName("fireOre").setTextureName("valiant:fireOre").setCreativeTab(CreativeTabs.tabBlock));
	hasteOre = (new BlockHasteOre(blockIDs[17], Material.rock).setUnlocalizedName("hasteOre").setTextureName("valiant:hasteOre").setCreativeTab(CreativeTabs.tabBlock));
	strengthOre = (new BlockStrengthOre(blockIDs[18], Material.rock).setUnlocalizedName("strengthOre").setTextureName("valiant:strengthOre").setCreativeTab(CreativeTabs.tabBlock));
	speedOre = (new BlockSpeedOre(blockIDs[19], Material.rock).setUnlocalizedName("speedOre").setTextureName("valiant:speedOre").setCreativeTab(CreativeTabs.tabBlock));
	essenceTorch = (new BlockEssenceTorch(blockIDs[20]).setUnlocalizedName("essenceTorch").setTextureName("valiant:essenceTorch").setCreativeTab(CreativeTabs.tabDecorations));
	barrel = (new BlockBarrel(blockIDs[21], Material.wood).setUnlocalizedName("barrel").setTextureName("valiant:barrel").setCreativeTab(CreativeTabs.tabDecorations));
	
	
	
	
	GameRegistry.registerBlock(codhopianOre, ValiantSix.modid + codhopianOre.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(codhopianBlock, ValiantSix.modid + codhopianBlock.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(flareOre, ValiantSix.modid + flareOre.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(flareBlock, ValiantSix.modid + flareBlock.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(windOre, ValiantSix.modid + windOre.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(windBlock, ValiantSix.modid + windBlock.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(iceOre, ValiantSix.modid + iceOre.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(iceBlock, ValiantSix.modid + iceBlock.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(electricOre, ValiantSix.modid + electricOre.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(electricBlock, ValiantSix.modid + electricBlock.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(earthOre, ValiantSix.modid + earthOre.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(earthBlock, ValiantSix.modid + earthBlock.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(voidOre, ValiantSix.modid + voidOre.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(voidBlock, ValiantSix.modid + voidBlock.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(skyStone, ValiantSix.modid + skyStone.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(skyBricks, ValiantSix.modid + skyBricks.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(fireOre, ValiantSix.modid + fireOre.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(hasteOre, ValiantSix.modid + hasteOre.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(strengthOre, ValiantSix.modid + strengthOre.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(speedOre, ValiantSix.modid + speedOre.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(essenceTorch, ValiantSix.modid + essenceTorch.getUnlocalizedName().substring(5));
	GameRegistry.registerBlock(barrel, ValiantSix.modid + barrel.getUnlocalizedName().substring(5));
	
	LanguageRegistry.addName(codhopianOre, "Codhopian Ore");
	LanguageRegistry.addName(codhopianBlock, "Codhopian Block");
	LanguageRegistry.addName(flareOre, "Flare Ore");
	LanguageRegistry.addName(flareBlock, "Flare Block");
	LanguageRegistry.addName(windOre, "Gust Ore");
	LanguageRegistry.addName(windBlock, "Gust Block");
	LanguageRegistry.addName(iceOre, "Freeze Ore");
	LanguageRegistry.addName(iceBlock, "Freeze Block");
	LanguageRegistry.addName(earthOre, "Gaia Ore");
	LanguageRegistry.addName(earthBlock, "Gaia Block");
	LanguageRegistry.addName(electricOre, "Spark Ore");
	LanguageRegistry.addName(electricBlock, "Spark Block");
	LanguageRegistry.addName(voidOre, "Void Ore");
	LanguageRegistry.addName(voidBlock, "Void Block");
	LanguageRegistry.addName(skyStone, "Sky Stone");
	LanguageRegistry.addName(skyBricks, "Sky Bricks");
	LanguageRegistry.addName(fireOre, "Fire Ore");
	LanguageRegistry.addName(hasteOre, "Haste Ore");
	LanguageRegistry.addName(strengthOre, "Strength Ore");
	LanguageRegistry.addName(speedOre, "Speed Ore");
	LanguageRegistry.addName(essenceTorch, "Essence Torch");
	LanguageRegistry.addName(barrel, "Barrel");

		MinecraftForge.setBlockHarvestLevel(codhopianBlock, "pick", 2);
		MinecraftForge.setBlockHarvestLevel(codhopianOre, "pick", 2);
		MinecraftForge.setBlockHarvestLevel(flareOre, "pick", 3);
		MinecraftForge.setBlockHarvestLevel(flareBlock, "pick", 3);
		MinecraftForge.setBlockHarvestLevel(windOre, "pick", 3);
		MinecraftForge.setBlockHarvestLevel(voidOre, "pick", 3);
		MinecraftForge.setBlockHarvestLevel(electricOre, "pick", 3);
		MinecraftForge.setBlockHarvestLevel(iceOre, "shovel", 3);
		MinecraftForge.setBlockHarvestLevel(earthOre, "pick", 3);
	
			
		codhopianBlock.setHardness(1.5F);
		codhopianOre.setHardness(1.5F);
		flareOre.setHardness(3F);
		flareBlock.setHardness(3F);
		windOre.setHardness(1.5F);
		windBlock.setHardness(1.5F);
		voidOre.setHardness(3F);
		voidBlock.setHardness(3F);
		electricOre.setHardness(1.5F);
		electricBlock.setHardness(1.5F);
		iceOre.setHardness(2F);
		iceBlock.setHardness(2F);
		earthOre.setHardness(5F);
		earthBlock.setHardness(5F);
	
			
		iceOre.setStepSound(Block.soundSandFootstep);
}
}
