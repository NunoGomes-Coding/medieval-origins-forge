package net.nunogomes.medievalorigins.enchantments;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.entity.EquipmentSlot;

public class FeatherweightEnchantment extends Enchantment {
    public FeatherweightEnchantment() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.ARMOR, new EquipmentSlot[] {
                EquipmentSlot.CHEST, EquipmentSlot.FEET, EquipmentSlot.HEAD, EquipmentSlot.LEGS});
    }


    @Override
    public int getMinLevel() {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }
}
