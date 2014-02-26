package link.Blocks;

import java.util.Random;

import link.Items.ItemInitialize;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockFireOre extends Block
{

	public BlockFireOre(int par1, Material par2Material) {
		super(par1, par2Material);
		
		this.setHardness(3F);
	}
	
	
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return ItemInitialize.fireStone.itemID;
    }

}
