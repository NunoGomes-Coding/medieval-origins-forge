package net.nunogomes.medievalorigins.enchantments;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nunogomes.medievalorigins.MedievalOrigins;

public class EnchantmentInit {
  public static final DeferredRegister<Enchantment> ENCHANTMENTS =
      DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MedievalOrigins.MOD_ID);

  public static final RegistryObject<Enchantment> FEATHERWEIGHT =
      ENCHANTMENTS.register("featherweight", FeatherweightEnchantment::new);
}
