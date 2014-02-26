package link.God;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemDivineBolt extends ItemSword
{

	public ItemDivineBolt(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		
	}
	
	

	
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	{
	par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20 * 100, 10));
	return true;
	}
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        return true;
    }

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		
		
			float f = 1.0F;
			float f1 = par3EntityPlayer.prevRotationPitch + (par3EntityPlayer.rotationPitch - par3EntityPlayer.prevRotationPitch) * f;
			float f2 = par3EntityPlayer.prevRotationYaw + (par3EntityPlayer.rotationYaw - par3EntityPlayer.prevRotationYaw) * f;
			double d = par3EntityPlayer.prevPosX + (par3EntityPlayer.posX - par3EntityPlayer.prevPosX) * (double)f;
			double d1 = (par3EntityPlayer.prevPosY + (par3EntityPlayer.posY - par3EntityPlayer.prevPosY) * (double)f + 1.6200000000000001D) - (double)par3EntityPlayer.yOffset;
			double d2 = par3EntityPlayer.prevPosZ + (par3EntityPlayer.posZ - par3EntityPlayer.prevPosZ) * (double)f;
			Vec3 vec3d = Vec3.createVectorHelper(d, d1, d2);
			float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
			float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
			float f5 = -MathHelper.cos(-f1 * 0.01745329F);
			float f6 = MathHelper.sin(-f1 * 0.01745329F);
			float f7 = f4 * f5;
			float f8 = f6;
			float f9 = f3 * f5;
			double d3 = 5000D;
			Vec3 vec3d1 = vec3d.addVector((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
			MovingObjectPosition movingobjectposition = par2World.rayTraceBlocks_do_do(vec3d, vec3d1, false, true);
			if (movingobjectposition == null)
			{
			return par1ItemStack;
			}
			if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
			{
			int i = movingobjectposition.blockX;
				int j = movingobjectposition.blockY;
				int k = movingobjectposition.blockZ;
				par2World.spawnEntityInWorld(new EntityLightningBolt(par2World, i, j, k));
			}
			par1ItemStack.damageItem(1, par3EntityPlayer);;
        
    
		return par1ItemStack;
}
}
