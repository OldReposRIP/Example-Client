/*
 * Credits to Forge for the example mod
 */


package com.example.examplemod;

import com.example.examplemod.features.modules.ModuleManager;
import com.example.examplemod.features.setting.settings.SettingManager;
import com.example.examplemod.gui.clickgui.ClickGUI;
import me.zero.alpine.EventManager;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "example", name = "ExampleClient", version = "v1.0")
public class Example {

    @Mod.Instance
    public static Example instance = new Example();
    public static final EventManager EVENT_BUS = new EventManager();

    public ModuleManager moduleManager;
    public SettingManager settingManager;

    public ClickGUI clickGui;

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(instance);

        settingManager = new SettingManager();
        moduleManager = new ModuleManager();

        clickGui = new ClickGUI();
    }
}
