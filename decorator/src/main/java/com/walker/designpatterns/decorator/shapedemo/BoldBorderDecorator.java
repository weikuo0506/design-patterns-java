package com.walker.designpatterns.decorator.shapedemo;

/**
 * @author walkerwei
 * @version 2016/11/2
 */
public class BoldBorderDecorator extends ShapeDecorator {
    public BoldBorderDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setBoldBorder();
    }

    private void setBoldBorder(){
        System.out.println("set bold border");
    }
}
