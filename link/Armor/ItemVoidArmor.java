package link.Armor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemVoidArmor extends ItemArmor
{

	public ItemVoidArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		
	}
	
	public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack) {

		 if (player.getCurrentItemOrArmor(4) != null && player.getCurrentItemOrArmor(3) != null && player.getCurrentItemOrArmor(2) != null && player.getCurrentItemOrArmor(1) != null) {
			 ItemStack helmet = player.getCurrentItemOrArmor(4);
			 ItemStack plate = player.getCurrentItemOrArmor(3);
			 ItemStack legs = player.getCurrentItemOrArmor(2);
			 ItemStack boots = player.getCurrentItemOrArmor(1); 

			 if (helmet.getItem() == ArmorInitialize.voidHelm && plate.getItem() == ArmorInitialize.voidChest && legs.getItem() == ArmorInitialize.voidLeggings && boots.getItem() == ArmorInitialize.voidBoots) 
			 {
				
				player.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 25, 10));
			 }
		 }
	 }

}
