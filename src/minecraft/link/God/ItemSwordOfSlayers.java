package link.God;

import java.util.List;
import java.util.Random;

import link.Items.ItemInitialize;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemSwordOfSlayers extends ItemSword
{

	public ItemSwordOfSlayers(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		
	}
	
	
	
	@Override
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
            ItemStack is = new ItemStack(par1, 1, 0);
            is.addEnchantment(Enchantment.baneOfArthropods, 3);
            is.addEnchantment(Enchantment.smite, 3);
            is.addEnchantment(Enchantment.looting, 3);
            par3List.add(is);
    }
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	{
	par2EntityLivingBase.dropItem(ItemInitialize.monsterBadge.itemID, this.getDamage(par1ItemStack));		
	par1ItemStack.damageItem(1, par3EntityLivingBase);
	return true;
	}

}
