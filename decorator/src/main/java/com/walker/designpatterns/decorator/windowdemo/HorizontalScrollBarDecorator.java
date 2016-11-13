package com.walker.designpatterns.decorator.windowdemo;

/**
 * @author walkerwei
 * @version 2016/11/2
 */
public class HorizontalScrollBarDecorator extends WindowDecorator {
    public HorizontalScrollBarDecorator(Window window) {
        super(window);
    }

    public void draw() {
        super.draw();
        drawHorizontalScrollBar();
    }

    public String getDescription() {
        return super.getDescription()+" , add horizontal scroll bar";
    }

    private void drawHorizontalScrollBar(){

    }
}
