package com.example.examplemod.features.modules.Movement;

import com.example.examplemod.features.modules.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

public class Sprint extends Module {

    public Sprint(){
        super("Sprint",0, com.example.examplemod.features.modules.Category.Movement);
    }

    public void update(){
        KeyBinding.setKeyBindState(Minecraft.getMinecraft().gameSettings.keyBindSprint.getKeyCode(), true);
    }

    public void onDisable(){
        KeyBinding.setKeyBindState(Minecraft.getMinecraft().gameSettings.keyBindSprint.getKeyCode(), false);
    }
}
