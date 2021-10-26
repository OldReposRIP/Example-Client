package com.example.examplemod.features.setting.settings;

import com.example.examplemod.features.modules.Module;
import com.example.examplemod.features.setting.Setting;

public class SettingDouble extends Setting {

    public double value;
    public double min;
    public double max;

    public SettingDouble(String name, Module mod, double value) {
        this.name = name;
        this.mod = mod;
        this.value = value;
        this.min = min;
        this.max = max;
        this.type = Setting.Type.BOUBLE;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
