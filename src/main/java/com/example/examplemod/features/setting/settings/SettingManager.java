package com.example.examplemod.features.setting.settings;

import com.example.examplemod.features.modules.Module;
import com.example.examplemod.features.setting.Setting;

import java.util.ArrayList;

public class SettingManager {

    public ArrayList<Setting> settings;

    public SettingManager() {
        settings = new ArrayList<>();
    }

    public ArrayList<Setting> getSettingsInMod(Module mod) {
        ArrayList<Setting> sets = new ArrayList<>();
        for(Setting s : settings) {
            if(s.getMod() == mod) {
                sets.add(s);
            }
        }
        return sets;
    }

    public ArrayList<Setting> getSettings() {
        return settings;
    }
}
