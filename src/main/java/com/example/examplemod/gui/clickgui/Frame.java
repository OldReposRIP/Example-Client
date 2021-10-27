package com.example.examplemod.gui.clickgui;


import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;

import java.io.IOException;
import java.util.ArrayList;

public class Frame {

    public String name;
    public int x;
    public int y;
    public int width;
    public int height;
    public int barheight;
    public int dragx;
    public int dragy;
    public boolean hovered;
    public boolean dragging;
    public boolean open;
    public int offset;
    public ArrayList<Botton> bottons;

    public Frame(String name, int x, int y, int width,int barheight) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.barheight = barheight;
        this.height = 200;
        this.width = width;
        bottons = new ArrayList<Botton>();
    }

    public void update(int mouseX, int mouseY) {
        if(dragging) {
            x = mouseX - dragx;
            y = mouseY - dragy;
        }
        for(Botton b : bottons) {
            b.update(mouseX, mouseY);
        }
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        Gui.drawRect(x, y, x + width, y + barheight, 0x70010101);
        Minecraft.getMinecraft().fontRenderer.drawStringWithShadow(name, x + 2, y + 2, -1);
        offset = barheight;
        for(Botton b : bottons) {
            b.drawScreen(mouseX, mouseY, partialTicks,offset);
            offset += barheight;
        }
    }

    protected void keyTyped(char typedChar, int keyCode) throws IOException {
        for(Botton b : bottons) {
            b.keyTyped(typedChar, keyCode);
        }
    }

    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        if(mouseButton == 0) {
            if(bounding(mouseX,mouseY)) {
                dragging = true;
                this.dragx = mouseX = -x;
                this.dragy = mouseY = -y;
            }
        }
        for(Botton b : bottons) {
            b.mouseClicked(mouseX, mouseY, mouseButton);
        }
    }

    protected void mouseReleased(int mouseX, int mouseY, int state) {
        dragging = false;
        for(Botton b : bottons) {
            b.mouseReleased(mouseX, mouseY, state);
        }
    }

    public boolean bounding(int mouseX, int mouseY) {
        if(mouseX >= this.x && mouseX <= this.x + this.width && mouseY >= this.y && mouseY <= this.y +barheight) {
            return true;
        }
        else {
            return false;
        }
    }
}
