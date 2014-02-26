package link.Blocks;

import java.util.Random;

import link.Main.ValiantSix;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockBarrel extends Block
{

	public BlockBarrel(int par1, Material par2Material) {
		super(par1, par2Material);
		
	}
	
	@SideOnly(Side.CLIENT)
    private Icon[] icons;
   
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
          icons = new Icon[4];
         
          for(int i = 0; i < icons.length; i++)
          {
                 icons[i] = par1IconRegister.registerIcon(ValiantSix.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
          }
    }
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2)
	{
	       switch(par1)
	       {
	             case 0:
	                    return icons[0];
	             case 1:
	             {
	                    switch(par2)
	                    {
	                           case 0:
	                                 return icons[1];
	                           case 1:
	                                 return icons[2];
	                           case 2:
	                        	     return icons[3];
	                           default:
	                                 return icons[3];
	                    }
	             }
	             default:
	             {
	                    return icons[0];
	             }
	       }
	}
	
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return BlockInitialize.barrel.blockID;
    }


}
