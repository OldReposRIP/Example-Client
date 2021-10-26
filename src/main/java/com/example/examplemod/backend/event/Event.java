package com.example.examplemod.backend.event;

import me.zero.alpine.type.Cancellable;
import net.minecraft.client.Minecraft;

public class Event extends Cancellable {

    private Era era;
    private float partialTicks;

    public Era getEra() {
        return era;
    }

    public void setEra(Era era) {
        this.era = era;
    }

    public Event() {
        this.partialTicks = Minecraft.getMinecraft().getMinecraft().getRenderPartialTicks();
    }

    public Event(Era era) {
        this.era = era;
        this.partialTicks = Minecraft.getMinecraft().getMinecraft().getRenderPartialTicks();
    }

    public enum Era {
        PRE,
        POST,
        PERI
    }
 }
