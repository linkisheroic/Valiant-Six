package net.minecraft.enchantment;

import net.minecraft.entity.EntityLivingBase;

final class EnchantmentModifierLiving implements IEnchantmentModifier
{
    /**
     * Used to calculate the (magic) extra damage based on enchantments of current equipped player item.
     */
    public float livingModifier;

    /**
     * Used as parameter to calculate the (magic) extra damage based on enchantments of current equipped player item.
     */
    public EntityLivingBase entityLiving;

    private EnchantmentModifierLiving() {}

    /**
     * Generic method use to calculate modifiers of offensive or defensive enchantment values.
     */
    public void calculateModifier(Enchantment par1Enchantment, int par2)
    {
        this.livingModifier += par1Enchantment.calcModifierLiving(par2, this.entityLiving);
    }

    EnchantmentModifierLiving(Empty3 par1Empty3)
    {
        this();
    }
}
