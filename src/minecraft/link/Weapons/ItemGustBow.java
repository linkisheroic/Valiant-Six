package link.Weapons;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class ItemGustBow extends ItemBow
{

	public ItemGustBow(int par1) {
		super(par1);
	
	}
	
	

	@Override
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
            ItemStack is = new ItemStack(par1, 1, 0);
            is.addEnchantment(Enchantment.punch, 3);
            par3List.add(is);
    }

}
