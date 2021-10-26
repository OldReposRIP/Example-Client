package com.example.examplemod.features.modules.Movement;

import com.example.examplemod.features.modules.Category;
import com.example.examplemod.features.modules.Module;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class Step extends Module {

    public Step(){
        super("Step",Keyboard.KEY_C, com.example.examplemod.features.modules.Category.Movement);
    }

    public void update(){
        Minecraft.getMinecraft().player.stepHeight = 2.5f;
    }
    public void onDisable(){
        Minecraft.getMinecraft().player.stepHeight = 0.5f;
    }
}
