package net.nunogomes.medievalorigins.mixin;

import net.minecraft.client.gui.screens.TitleScreen;
import net.nunogomes.medievalorigins.MedievalOrigins;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MedievalOriginsMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		MedievalOrigins.LOGGER.info("Loading Medieval Origins");
	}
}
