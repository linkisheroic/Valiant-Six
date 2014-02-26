package link.God;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemStaffOfControlling extends Item
{

	public ItemStaffOfControlling(int par1) {
		super(par1);
		
	}
	
	
	
	public boolean itemInteractionForEntity(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, EntityLivingBase par3EntityLivingBase)
    {
		par2EntityPlayer.mountEntity(par3EntityLivingBase);
        return true;
    }

}
