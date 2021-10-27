package com.example.examplemod.gui.clickgui;

import com.example.examplemod.features.modules.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;

import java.io.IOException;

public class Botton {

    public Frame parent;
    public Module module;
    public int offset;

    public Botton(Frame parent, Module module) {
        this.parent = parent;
        this.module = module;
    }

    public void update(int mouseX, int mouseY) {

    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks, int offset) {
        this.offset = offset;
        Gui.drawRect(parent.x, parent.y + offset, parent.x + parent.width, parent.y,+offset + parent.barheight, module.isToggled() ? 0x70010101 : 0x90020202);
        Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(module.getName(), parent.x + 2, parent.y + offset + 2, -1);
    }

    protected void keyTyped(char typedChar, int keyCode) throws IOException {

    }

    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        if(mouseButton == 0) {
            if(bounding(mouseX,mouseY)) {
                module.toggled();
            }
        }
    }

    protected void mouseReleased(int mouseX, int mouseY, int state) {
    }

    public boolean bounding(int mouseX, int mouseY) {
        if(mouseX >= this.parent.x && mouseX <= this.parent.x + this.parent.width && mouseY >= this.parent.y + this.offset && mouseY <= this.parent.y + offset + parent.barheight) {
            return true;
        }
        else {
            return false;
        }
    }

}