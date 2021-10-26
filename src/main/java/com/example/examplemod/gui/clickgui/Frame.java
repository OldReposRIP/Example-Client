package com.example.examplemod.gui.clickgui;

import com.example.examplemod.features.modules.Category;

import java.io.IOException;

public class Frame {

    public String name;
    public int x;
    public int y;
    public int width;
    public int height;
    public int dragx;
    public int dragy;
    public boolean hovered;
    public boolean open;

    public Frame(String name, int x, int y, int width Category) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    }

    protected void keyTyped(char typedChar, int keyCode) throws IOException {
    }

    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
    }

    protected void mouseReleased(int mouseX, int mouseY, int state) {
    }
}
