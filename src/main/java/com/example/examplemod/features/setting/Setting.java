package com.example.examplemod.features.setting;

import com.example.examplemod.features.modules.Module;

public class Setting {
    public String name;
    public Module mod;
    public Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Module getMod() {
        return mod;
    }

    public void setMod(Module mod) {
        this.mod = mod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public enum Type {
        BOOLEAN,
        BOUBLE,
        INTEGER,
        MODE;
    }
}
