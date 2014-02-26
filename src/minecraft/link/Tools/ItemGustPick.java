package link.Tools;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemGustPick extends ItemPickaxe
{

	public ItemGustPick(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		
	}
	
	

	@Override
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
            ItemStack is = new ItemStack(par1, 1, 0);
            is.addEnchantment(Enchantment.knockback, 3);
            par3List.add(is);
    }

}