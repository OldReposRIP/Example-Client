package com.example.examplemod.backend.event;

import com.example.examplemod.Example;
import com.google.common.eventbus.Subscribe;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class EventProcessor {

    public EventProcessor() {
        MinecraftForge.EVENT_BUS.register(this);
    }


    @SubscribeEvent
    public void onKey(InputEvent.KeyInputEvent event) {
        Example.EVENT_BUS.post(event);
    }

    @SubscribeEvent
    public void OnTick(TickEvent.ClientTickEvent event) {
        Example.EVENT_BUS.post(event);
    }

    @SubscribeEvent
    public void OnRender(RenderGameOverlayEvent event) {
        Example.EVENT_BUS.post(event);
    }

    @SubscribeEvent
    public void OnRenderWorld(RenderWorldLastEvent event) {
        Example.EVENT_BUS.post(event);
    }
}
