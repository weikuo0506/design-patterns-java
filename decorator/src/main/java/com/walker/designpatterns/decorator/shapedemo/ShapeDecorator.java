package com.walker.designpatterns.decorator.shapedemo;

/**
 * @author walkerwei
 * @version 2016/11/2
 */
public abstract class ShapeDecorator implements Shape{
     protected Shape decoratedShape;

    public ShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
