package com.example.examplemod.features.setting.settings;

import com.example.examplemod.features.modules.Module;
import com.example.examplemod.features.setting.Setting;

public class SettingInteger extends Setting {

    public int value;
    public int min;
    public int max;

    public SettingInteger(String name, Module mod, int value, int min, int max) {
        this.name = name;
        this.mod = mod;
        this.value = value;
        this.min = min;
        this.max = max;
        this.type = Setting.Type.INTEGER;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
