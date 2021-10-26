package com.example.examplemod.features.modules.Movement;

import com.example.examplemod.features.modules.Module;
import com.example.examplemod.features.setting.settings.SettingDouble;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class Step extends Module {

    SettingDouble height;

    public Step(){
        super("Step",Keyboard.KEY_C, com.example.examplemod.features.modules.Category.Movement);
        height = this.register("Height",2.5,0.5,2.5);
    }

    public void update(){
        Minecraft.getMinecraft().player.stepHeight = (float) height.getValue();
    }
    public void onDisable(){
        Minecraft.getMinecraft().player.stepHeight = 0.5f;
    }
}
