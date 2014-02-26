package link.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemWaterStone extends Item
{

	public ItemWaterStone(int par1) {
		super(par1);
		
	}
	
	
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
		par2EntityPlayer.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5 * 100, 30));
		par2EntityPlayer.inventory.consumeInventoryItem(ItemInitialize.waterStone.itemID);
		return true;
    }

}
