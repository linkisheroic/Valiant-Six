package link.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

class BlockEssenceTorch extends BlockTorch
{

	public BlockEssenceTorch(int par1) 
	{
		super(par1);
		this.setLightValue(1F);
	}

}
