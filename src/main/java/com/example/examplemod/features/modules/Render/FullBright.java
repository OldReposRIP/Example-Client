package com.example.examplemod.features.modules.Render;

import com.example.examplemod.features.modules.Category;
import com.example.examplemod.features.modules.Module;
import net.minecraft.client.Minecraft;

public class FullBright extends Module {

    public FullBright(){
        super("FullBright",0, com.example.examplemod.features.modules.Category.Render);
    }

    public void update() {
        Minecraft.getMinecraft().gameSettings.gammaSetting = 1;
    }
}
