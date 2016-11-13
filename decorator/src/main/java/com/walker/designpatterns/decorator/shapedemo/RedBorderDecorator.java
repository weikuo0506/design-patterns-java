package com.walker.designpatterns.decorator.shapedemo;

/**
 * @author walkerwei
 * @version 2016/11/2
 */
public class RedBorderDecorator extends ShapeDecorator{
    public RedBorderDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println("add red border");
    }
}
