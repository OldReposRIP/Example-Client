package com.example.examplemod.backend.mixin.mixins;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.TextFormatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MixinGuiMainMenu.class)
public class MixinGuiMainMenu extends GuiScreen {

    @Inject(method = {"drawScreen"}, at = {@At("TAIL")}, cancellable = true)
    public void drawMainMenuInfo(CallbackInfo ci) {
        mc.fontRenderer.drawStringWithShadow(TextFormatting.BLACK + "Example Client" +TextFormatting.GRAY + "v1.0", 1,1,-1);
    }

}
