package link.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemSpicyCookie extends ItemFood
{

	public ItemSpicyCookie(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
		
		this.setPotionEffect(Potion.damageBoost.id, 120, 0, 1.0F);
	}
	
	

}
