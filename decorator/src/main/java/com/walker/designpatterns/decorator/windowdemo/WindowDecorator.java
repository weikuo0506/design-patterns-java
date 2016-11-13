package com.walker.designpatterns.decorator.windowdemo;

/**
 * @author walkerwei
 * @version 2016/11/2
 */
public abstract class WindowDecorator implements Window {
    protected Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }

    public void draw() {
        window.draw();
    }

    public String getDescription() {
        return window.getDescription();
    }
}
