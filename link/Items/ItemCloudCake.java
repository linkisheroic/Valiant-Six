package link.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemCloudCake extends ItemFood
{

	public ItemCloudCake(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
		
		this.setPotionEffect(Potion.jump.id, 120, 10, 10.0F);
	}

	
}
