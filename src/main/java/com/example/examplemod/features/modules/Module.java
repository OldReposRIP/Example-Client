package com.example.examplemod.features.modules;

import com.example.examplemod.Example;
import com.example.examplemod.features.setting.settings.SettingBoolean;
import com.example.examplemod.features.setting.settings.SettingDouble;
import com.example.examplemod.features.setting.settings.SettingInteger;
import com.example.examplemod.features.setting.settings.SettingMode;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

import java.util.ArrayList;


public class Module {

    public String name;
    public int key;
    public Category Category;
    public boolean toggled;

    public Module(String name, int key,Category category) {
        this.name = name;
        this.key = key;
        this.Category = category;
    }
    public void toggled() {
        toggled =!toggled;

        if(toggled)
            enable();
        else
            disable();
    }

    public void update() {}
    public void render() {}

    public void enable() {
        Example.EVENT_BUS.subscribe(this);
        MinecraftForge.EVENT_BUS.register(this);
        onEnable();
    }
    public void disable() {
        Example.EVENT_BUS.unsubscribe(this);
        MinecraftForge.EVENT_BUS.unregister(this);
        onDisable();
    }
    public void onEnable() {}
    public void onDisable() {}

    public boolean isToggled() {
        return toggled;
    }

    public void setToggled(boolean toggled) {
        this.toggled = toggled;
    }

    public Category getCategory() {
        return Category;
    }

    public void setCategory(Category category) {
        Category = category;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void SettingBoolean(String name, boolean value) {
        SettingBoolean set = new SettingBoolean(name,this,value);
        Example.instance.settingManager.settings.add(set);
    }

    public SettingMode register(String name, ArrayList<String> value) {
        SettingMode set = new SettingMode(name,this,values,value);
        Example.instance.settingManager.settings.add(set);
        return set;
    }

    public SettingInteger register(String name, int value,int min, int max) {
        SettingInteger set = new SettingInteger(name,this,value,min,max);
        Example.instance.settingManager.settings.add(set);
        return set;
    }

    public SettingDouble register(String name, double value,double min, double max) {
        SettingDouble set = new SettingDouble(name,this,value);
        Example.instance.settingManager.settings.add(set);
        return set;
    }
}
