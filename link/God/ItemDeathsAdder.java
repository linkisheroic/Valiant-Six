package link.God;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDeathsAdder extends Item
{

	public ItemDeathsAdder(int par1) {
		super(par1);
		
	}
	
	
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
        	if(par3EntityPlayer.inventory.hasItem(Item.arrow.itemID))
        	{
        	while(par3EntityPlayer.inventory.hasItem(Item.arrow.itemID))
        	{
        		par3EntityPlayer.inventory.consumeInventoryItem(Item.arrow.itemID);
        	}
        	}
            par2World.spawnEntityInWorld(new EntityArrow(par2World, par3EntityPlayer, par1ItemStack.itemID));
        	
        	}
        return par1ItemStack;
    }

}
