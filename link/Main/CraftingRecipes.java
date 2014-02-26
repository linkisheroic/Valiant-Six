package link.Main;

import link.Blocks.BlockInitialize;
import link.Items.ItemInitialize;
import link.Tools.ToolsInitialize;
import link.Weapons.WeaponsInitialize;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipes 
{



public void init(FMLPreInitializationEvent event)
{
		GameRegistry.addShapelessRecipe(new ItemStack(ItemInitialize.codhopianIngot, 9), new Object[]{
			new ItemStack(BlockInitialize.codhopianBlock)
		});
	
		GameRegistry.addShapelessRecipe(new ItemStack(ItemInitialize.flareEssence, 9), new Object[]{
			new ItemStack(BlockInitialize.flareBlock)
		});
	
		GameRegistry.addShapelessRecipe(new ItemStack(ItemInitialize.windEssence, 9), new Object[]{
			new ItemStack(BlockInitialize.windBlock)
		});
	
		GameRegistry.addShapelessRecipe(new ItemStack(ItemInitialize.electricEssence, 9), new Object[]{
			new ItemStack(BlockInitialize.electricBlock)
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemInitialize.earthEssence, 9), new Object[]{
			new ItemStack(BlockInitialize.earthBlock)
		});
	
		GameRegistry.addShapelessRecipe(new ItemStack(ItemInitialize.voidEssence, 9), new Object[]{
			new ItemStack(BlockInitialize.voidBlock)
		});
		
		
		
		//Mead Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(ItemInitialize.mead, 1), new Object[]{
			new ItemStack(Item.wheat), new ItemStack(Item.wheat), new ItemStack(Item.wheat), new ItemStack(Item.bucketWater, 1)
		});	
			
			//Cloud Cake Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(ItemInitialize.cloudCake, 6), new Object[]{
			new ItemStack(Item.wheat), new ItemStack(Item.wheat), new ItemStack(Item.wheat), new ItemStack(ItemInitialize.windEssence), new ItemStack(ItemInitialize.windEssence), new ItemStack(ItemInitialize.windEssence)
		});
			
			//Jolt Candy Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(ItemInitialize.joltCandy, 6), new Object[]{
			new ItemStack(Item.sugar), new ItemStack(ItemInitialize.electricEssence), new ItemStack(ItemInitialize.electricEssence), new ItemStack(ItemInitialize.electricEssence), new ItemStack(Item.sugar)
		});
			
			//Super Chilled Ice Cream Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(ItemInitialize.superChilledCream, 6), new Object[]{
			new ItemStack(Item.sugar), new ItemStack(Item.bucketWater), new ItemStack(ItemInitialize.iceEssence), new ItemStack(ItemInitialize.iceEssence), new ItemStack(ItemInitialize.iceEssence)
		});
			
			//Mud Pie Recipe
		GameRegistry.addShapelessRecipe(new ItemStack(ItemInitialize.mudPie, 6), new Object[]{
			new ItemStack(Item.sugar), new ItemStack(Item.sugar), new ItemStack(Item.sugar), new ItemStack(ItemInitialize.earthEssence), new ItemStack(ItemInitialize.earthEssence), new ItemStack(ItemInitialize.earthEssence)
		});
	
		
			//Essence Torch
				GameRegistry.addRecipe(new ItemStack(BlockInitialize.essenceTorch, 6), new Object[]{
		            "C",
		            "X",
		            'C', ItemInitialize.windEssence, 'X', Item.stick
				});
				
				GameRegistry.addRecipe(new ItemStack(BlockInitialize.essenceTorch, 6), new Object[]{
		            "C",
		            "X",
		            'C', ItemInitialize.flareEssence, 'X', Item.stick
				});
				
				GameRegistry.addRecipe(new ItemStack(BlockInitialize.essenceTorch, 6), new Object[]{
		            "C",
		            "X",
		            'C', ItemInitialize.iceEssence, 'X', Item.stick
				});
				
				GameRegistry.addRecipe(new ItemStack(BlockInitialize.essenceTorch, 6), new Object[]{
		            "C",
		            "X",
		            'C', ItemInitialize.earthEssence, 'X', Item.stick
				});
				
				GameRegistry.addRecipe(new ItemStack(BlockInitialize.essenceTorch, 6), new Object[]{
		            "C",
		            "X",
		            'C', ItemInitialize.electricEssence, 'X', Item.stick
				});
				
				GameRegistry.addRecipe(new ItemStack(BlockInitialize.essenceTorch, 6), new Object[]{
		            "C",
		            "X",
		            'C', ItemInitialize.voidEssence, 'X', Item.stick
				});
				
				//Codhopian Block from Ingots
				GameRegistry.addRecipe(new ItemStack(BlockInitialize.codhopianBlock), new Object[]{
		            "CCC",
		            "CCC",
		            "CCC",
		            'C', ItemInitialize.codhopianIngot
				});
				
				//Flare Block from Essences
				GameRegistry.addRecipe(new ItemStack(BlockInitialize.flareBlock), new Object[]{
		            "CCC",
		            "CCC",
		            "CCC",
		            'C', ItemInitialize.flareEssence
				});
				
				//Gust Block from Essences
				GameRegistry.addRecipe(new ItemStack(BlockInitialize.windBlock), new Object[]{
		            "CCC",
		            "CCC",
		            "CCC",
		            'C', ItemInitialize.windEssence
				});
				
				//Ice Block from Essences
				GameRegistry.addRecipe(new ItemStack(BlockInitialize.iceBlock), new Object[]{
		            "CCC",
		            "CCC",
		            "CCC",
		            'C', ItemInitialize.iceEssence
				});
				
				//Electric Block from Essences
				GameRegistry.addRecipe(new ItemStack(BlockInitialize.electricBlock), new Object[]{
		            "CCC",
		            "CCC",
		            "CCC",
		            'C', ItemInitialize.electricEssence
				});
				
				//Earth Block from Essences
				GameRegistry.addRecipe(new ItemStack(BlockInitialize.earthBlock), new Object[]{
		            "CCC",
		            "CCC",
		            "CCC",
		            'C', ItemInitialize.earthEssence
				});
				
				//Void Block from Essences
				GameRegistry.addRecipe(new ItemStack(BlockInitialize.voidBlock), new Object[]{
		            "CCC",
		            "CCC",
		            "CCC",
		            'C', ItemInitialize.voidEssence
				});
				
				//Barrel
				GameRegistry.addRecipe(new ItemStack(BlockInitialize.barrel), new Object[]{
		            "C C",
		            "C C",
		            "CCC",
		            'C', Block.planks
				});
				
				
				//Codhopian Sword Recipe
				GameRegistry.addRecipe(new ItemStack(WeaponsInitialize.codhopianSword), new Object[]{
		            "C",
		            "C",
		            "X",
		            'C', ItemInitialize.codhopianIngot, 'X', Item.stick
				});
				
				//Gilded Codhopian Sword Recipe
				GameRegistry.addRecipe(new ItemStack(WeaponsInitialize.gildedCodhopianSword), new Object[]{
		            "C",
		            "C",
		            "X",
		            'C', ItemInitialize.codhopianIngot, 'X', Item.blazeRod
				});
				
				//Flare Sword Recipe
				ItemStack gildedFlareSword2 = new ItemStack(WeaponsInitialize.gildedFlareSword);
				gildedFlareSword2.addEnchantment(Enchantment.fireAspect, 3);
						GameRegistry.addRecipe(gildedFlareSword2, new Object[]{
				            "C",
				            "C",
				            "X",
				            'C', ItemInitialize.flareEssence, 'X', Item.blazeRod
						});
				
				//Gilded Flare Sword		
				ItemStack flareSword2 = new ItemStack(WeaponsInitialize.flareSword);
				flareSword2.addEnchantment(Enchantment.fireAspect, 3);
				GameRegistry.addRecipe(flareSword2, new Object[]{
		            "C",
		            "C",
		            "X",
		            'C', ItemInitialize.flareEssence, 'X', Item.stick
				});
				
				//Spark Sword
				ItemStack sparkSword = new ItemStack(WeaponsInitialize.sparkSword);
				sparkSword.addEnchantment(Enchantment.efficiency, 3);
				GameRegistry.addRecipe(sparkSword, new Object[]{
						"C",
						"C",
						"X",
						'C', ItemInitialize.electricEssence, 'X', Item.stick
				});
				
				//Gilded Spark Sword
				ItemStack sparkSword2 = new ItemStack(WeaponsInitialize.gildedSparkSword);
				sparkSword2.addEnchantment(Enchantment.efficiency, 3);
				GameRegistry.addRecipe(sparkSword2, new Object[]{
						"C",
						"C",
						"X",
						'C', ItemInitialize.electricEssence, 'X', Item.blazeRod
				});
				
				//Gust Sword Recipe
				ItemStack gustSword = new ItemStack(WeaponsInitialize.gustSword);
				gustSword.addEnchantment(Enchantment.knockback, 3);
				GameRegistry.addRecipe(gustSword, new Object[]{
						"C",
						"C",
						"X",
						'C', ItemInitialize.windEssence, 'X', Item.stick
				});
				
				//Gilded Gust Sword
				ItemStack gustSword2 = new ItemStack(WeaponsInitialize.gildedGustSword);
				gustSword2.addEnchantment(Enchantment.knockback, 3);
				GameRegistry.addRecipe(gustSword2, new Object[]{
						"C",
						"C",
						"X",
						'C', ItemInitialize.windEssence, 'X', Item.blazeRod
				});
				
				//Freeze Sword 
				ItemStack freezeSword = new ItemStack(WeaponsInitialize.freezeSword);
				freezeSword.addEnchantment(Enchantment.aquaAffinity, 3);
				GameRegistry.addRecipe(freezeSword, new Object[]{
						"C",
						"C",
						"X",
						'C', ItemInitialize.iceEssence, 'X', Item.stick
				});
				
				//Gilded Freeze Sword
				ItemStack freezeSword2 = new ItemStack(WeaponsInitialize.gildedFreezeSword);
				freezeSword2.addEnchantment(Enchantment.aquaAffinity, 3);
				GameRegistry.addRecipe(freezeSword2, new Object[]{
						"C",
						"C",
						"X",
						'C', ItemInitialize.iceEssence, 'X', Item.blazeRod
				});
				
				//Gaia Sword
				ItemStack gaiaSword = new ItemStack(WeaponsInitialize.quakeSword);
				gaiaSword.addEnchantment(Enchantment.unbreaking, 3);
				GameRegistry.addRecipe(gaiaSword, new Object[]{
						"C",
						"C",
						"X",
						'C', ItemInitialize.earthEssence, 'X', Item.stick
				});
				
				//Gilded Gaia Sword
				ItemStack gaiaSword2 = new ItemStack(WeaponsInitialize.gildedGaiaSword);
				gaiaSword.addEnchantment(Enchantment.unbreaking, 3);
				GameRegistry.addRecipe(gaiaSword2, new Object[]{
						"C",
						"C",
						"X",
						'C', ItemInitialize.earthEssence, 'X', Item.blazeRod
				});
				
				//Void Sword
				ItemStack voidSword = new ItemStack(WeaponsInitialize.voidSword);
				voidSword.addEnchantment(Enchantment.smite, 3);
				GameRegistry.addRecipe(voidSword, new Object[]{
						"C",
						"C",
						"X",
						'C', ItemInitialize.voidEssence, 'X', Item.stick
				});
				
				//Gilded Void Sword
				ItemStack voidSword2 = new ItemStack(WeaponsInitialize.voidSword);
				voidSword2.addEnchantment(Enchantment.smite, 3);
				GameRegistry.addRecipe(voidSword2, new Object[]{
						"C",
						"C",
						"X",
						'C', ItemInitialize.voidEssence, 'X', Item.blazeRod
				});
				
				//Flare Pick Recipe
				GameRegistry.addShapedRecipe(new ItemStack(ToolsInitialize.flarePick), new Object[]{
		            "CCC",
		            " X ",
		            " X ",
		            'C', ItemInitialize.flareEssence, 'X', Item.stick
				});
				
				//Codhopian Pick Recipe
				GameRegistry.addShapedRecipe(new ItemStack(ToolsInitialize.codhopianPick), new Object[]{
		            "CCC",
		            " X ",
		            " X ",
		            'C', ItemInitialize.codhopianIngot, 'X', Item.stick
				});
				
				//Gust Pick Recipe
				GameRegistry.addShapedRecipe(new ItemStack(ToolsInitialize.gustPick), new Object[]{
		            "CCC",
		            " X ",
		            " X ",
		            'C', ItemInitialize.windEssence, 'X', Item.stick
				});
				
				//Spark Pick Recipe
				GameRegistry.addShapedRecipe(new ItemStack(ToolsInitialize.sparkPick), new Object[]{
		            "CCC",
		            " X ",
		            " X ",
		            'C', ItemInitialize.electricEssence, 'X', Item.stick
				});
				
				//Freeze Pick Recipe
				GameRegistry.addShapedRecipe(new ItemStack(ToolsInitialize.freezePick), new Object[]{
		            "CCC",
		            " X ",
		            " X ",
		            'C', ItemInitialize.iceEssence, 'X', Item.stick
				});
				
				//Gaia Pick Recipe
				GameRegistry.addShapedRecipe(new ItemStack(ToolsInitialize.earthPick), new Object[]{
		            "CCC",
		            " X ",
		            " X ",
		            'C', ItemInitialize.earthEssence, 'X', Item.stick
				});
				
				//Void Pick Recipe
				GameRegistry.addShapedRecipe(new ItemStack(ToolsInitialize.voidPick), new Object[]{
		            "CCC",
		            " X ",
		            " X ",
		            'C', ItemInitialize.voidEssence, 'X', Item.stick
				});
	
				//Codhopian Axe Recipe
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.codhopianAxe), new Object[]{
				            " CC",
				            " XC",
				            " X ",
				            'C', ItemInitialize.codhopianIngot, 'X', Item.stick
			    });
				
				//Flare Axe Recipe
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.flareAxe), new Object[]{
				            " CC",
				            " XC",
				            " X ",
				            'C', ItemInitialize.flareEssence, 'X', Item.stick
			    });
				
				//Gust Axe Recipe
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.gustAxe), new Object[]{
				            " CC",
				            " XC",
				            " X ",
				            'C', ItemInitialize.windEssence, 'X', Item.stick
			    });
	
				//Spark Axe Recipe
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.sparkAxe), new Object[]{
				            " CC",
				            " XC",
				            " X ",
				            'C', ItemInitialize.electricEssence, 'X', Item.stick
			    });
				
				//Freeze Axe Recipe
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.freezeAxe), new Object[]{
				            " CC",
				            " XC",
				            " X ",
				            'C', ItemInitialize.iceEssence, 'X', Item.stick
			    });
				
				//Gaia Axe Recipe
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.earthAxe), new Object[]{
				            " CC",
				            " XC",
				            " X ",
				            'C', ItemInitialize.earthEssence, 'X', Item.stick
			    });
				
				//Void Axe Recipe
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.voidAxe), new Object[]{
				            " CC",
				            " XC",
				            " X ",
				            'C', ItemInitialize.voidEssence, 'X', Item.stick
			    });
				
				//Codhopian Shovel Recipes
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.codhopianShovel), new Object[]{
		            "C",
		            "X",
		            "X",
		            'C', ItemInitialize.codhopianIngot, 'X', Item.stick
				});
				
				//Flare Shovel Recipes
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.flareShovel), new Object[]{
		            "C",
		            "X",
		            "X",
		            'C', ItemInitialize.flareEssence, 'X', Item.stick
				});
				
				//Gust Shovel Recipes
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.gustShovel), new Object[]{
		            "C",
		            "X",
		            "X",
		            'C', ItemInitialize.windEssence, 'X', Item.stick
				});
				
				//Spark Shovel Recipes
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.sparkShovel), new Object[]{
		            "C",
		            "X",
		            "X",
		            'C', ItemInitialize.electricEssence, 'X', Item.stick
				});
				
				//Freeze Shovel Recipes
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.freezeShovel), new Object[]{
		            "C",
		            "X",
		            "X",
		            'C', ItemInitialize.iceEssence, 'X', Item.stick
				});
				
				//Gaia Shovel Recipes
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.earthShovel), new Object[]{
		            "C",
		            "X",
		            "X",
		            'C', ItemInitialize.earthEssence, 'X', Item.stick
				});
				
				//Void Shovel Recipes
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.voidShovel), new Object[]{
		            "C",
		            "X",
		            "X",
		            'C', ItemInitialize.voidEssence, 'X', Item.stick
				});
				
				//Codhopian Hoe Recipe
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.codhopianHoe), new Object[]{
		            " CC",
		            " X ",
		            " X ",
		            'C', ItemInitialize.codhopianIngot, 'X', Item.stick
				});
				
				//Flare Hoe Recipe
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.flareHoe), new Object[]{
		            " CC",
		            " X ",
		            " X ",
		            'C', ItemInitialize.flareEssence, 'X', Item.stick
				});
				
				//Gust Hoe Recipe
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.gustHoe), new Object[]{
		            " CC",
		            " X ",
		            " X ",
		            'C', ItemInitialize.windEssence, 'X', Item.stick
				});
				
				//Spark Hoe Recipe
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.sparkHoe), new Object[]{
		            " CC",
		            " X ",
		            " X ",
		            'C', ItemInitialize.electricEssence, 'X', Item.stick
				});
				
				//Freeze Hoe Recipe
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.freezeHoe), new Object[]{
		            " CC",
		            " X ",
		            " X ",
		            'C', ItemInitialize.iceEssence, 'X', Item.stick
				});
				
				//Gaia Hoe Recipe
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.earthHoe), new Object[]{
		            " CC",
		            " X ",
		            " X ",
		            'C', ItemInitialize.earthEssence, 'X', Item.stick
				});
				
				//Void Hoe Recipe
				GameRegistry.addRecipe(new ItemStack(ToolsInitialize.voidHoe), new Object[]{
		            " CC",
		            " X ",
		            " X ",
		            'C', ItemInitialize.voidEssence, 'X', Item.stick
				});
	
		FurnaceRecipes.smelting().addSmelting(BlockInitialize.codhopianOre.blockID, new ItemStack(ItemInitialize.codhopianIngot), 0.1F);
		FurnaceRecipes.smelting().addSmelting(BlockInitialize.flareOre.blockID, new ItemStack(ItemInitialize.flareEssence), 0.1F);
		FurnaceRecipes.smelting().addSmelting(BlockInitialize.windOre.blockID, new ItemStack(ItemInitialize.windEssence), 0.1F);
		FurnaceRecipes.smelting().addSmelting(BlockInitialize.voidOre.blockID, new ItemStack(ItemInitialize.voidEssence), 0.5F);
		FurnaceRecipes.smelting().addSmelting(BlockInitialize.electricOre.blockID, new ItemStack(ItemInitialize.electricEssence), 0.1F);
		FurnaceRecipes.smelting().addSmelting(BlockInitialize.iceOre.blockID, new ItemStack(ItemInitialize.iceEssence), 0.1F);
		FurnaceRecipes.smelting().addSmelting(BlockInitialize.earthOre.blockID, new ItemStack(ItemInitialize.earthEssence), 0.1F);
}

}