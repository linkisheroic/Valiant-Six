package link.Armor;

import link.Items.ItemInitialize;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFlareArmor extends ItemArmor
{

	public ItemFlareArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
	
		
		
	}
	
	

	public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack) {

		 if (player.getCurrentItemOrArmor(4) != null && player.getCurrentItemOrArmor(3) != null && player.getCurrentItemOrArmor(2) != null && player.getCurrentItemOrArmor(1) != null) {
			 ItemStack helmet = player.getCurrentItemOrArmor(4);
			 ItemStack plate = player.getCurrentItemOrArmor(3);
			 ItemStack legs = player.getCurrentItemOrArmor(2);
			 ItemStack boots = player.getCurrentItemOrArmor(1); 

			 if (helmet.getItem() == ArmorInitialize.flareHelm && plate.getItem() == ArmorInitialize.flareChest && legs.getItem() == ArmorInitialize.flareLeggings && boots.getItem() == ArmorInitialize.flareBoots) 
			 {
				
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 25, 10));
			 }
		 }
	 }
	
}


