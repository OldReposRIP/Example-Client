package com.example.examplemod.backend.mixin;

import java.util.Map;

import javax.annotation.Nullable;

import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

public class ExampleMixinLoader implements IFMLLoadingPlugin {

    public ExampleMixinLoader(){
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.example.json");
    }

    @Override
    public String[] getASMTransformerClass(){
        return new String[0];
    }

    @Override
    public String getModContainerClass(){
        return null;
    }

    @Nullable
    @Override
    public String getSetupClass(){
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data){
    }

    @Override
    public String getAccessTransformerClass(){
        return null;
    }
}