package link.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockWindOre extends Block
{

	public BlockWindOre(int par1, Material par2Material) {
		super(par1, par2Material);
		
		this.setLightValue(0.8F);
	}
	
	
}
