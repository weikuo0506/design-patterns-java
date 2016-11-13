package com.walker.designpatterns.decorator.windowdemo;

/**
 * @author walkerwei
 * @version 2016/11/2
 */
public class VerticalScrollBarDecorator extends WindowDecorator {
    public VerticalScrollBarDecorator(Window window) {
        super(window);
    }

    public void draw() {
        super.draw();
        drawVerticalScrollBar();
    }

    public String getDescription() {
        return super.getDescription()+" , add vertical scroll bar";
    }

    private void drawVerticalScrollBar(){

    }
}
