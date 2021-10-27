package com.example.examplemod.features.modules.Client;

import com.example.examplemod.Example;
import com.example.examplemod.features.modules.Category;
import com.example.examplemod.features.modules.Module;
import com.example.examplemod.gui.clickgui.ClickGUI;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class ClickGuiModule extends Module {

    public ClickGuiModule() {
        super("ClickGui", Keyboard.KEY_RSHIFT, com.example.examplemod.features.modules.Category.Client);
    }

    public void onEnable() {
        Minecraft.getMinecraft().displayGuiScreen(Example.instance.clickGui);
        toggled();
    }
}
