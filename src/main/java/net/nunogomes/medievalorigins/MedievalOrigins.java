package net.nunogomes.medievalorigins;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.nunogomes.medievalorigins.enchantments.EnchantmentInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MedievalOrigins.MOD_ID)
public class MedievalOrigins {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("medievalorigins");
	public static final String MOD_ID = "medievalorigins";

	public MedievalOrigins() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		EnchantmentInit.ENCHANTMENTS.register(modEventBus);

		modEventBus.addListener(this::setup);

		MinecraftForge.EVENT_BUS.register(EnchantmentInit.ENCHANTMENTS);
		


		LOGGER.info("Hello Forge world!");
	}
	
	private void setup(final FMLCommonSetupEvent event) {
  }
}
