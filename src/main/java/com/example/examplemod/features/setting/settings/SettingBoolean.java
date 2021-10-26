package com.example.examplemod.features.setting.settings;

import com.example.examplemod.features.modules.Module;
import com.example.examplemod.features.setting.Setting;

public class SettingBoolean extends Setting {
    public boolean value;

    public void SettingBoolean(String name, Module mod, boolean value) {
        this.name = name;
        this.mod = mod;
        this.value = value;
        this.type = Setting.Type.BOOLEAN;
    }

    public boolean get() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}
