package com.walker.designpatterns.decorator.shapedemo;

/**
 * @author walkerwei
 * @version 2016/11/2
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape shape = new BoldBorderDecorator(new RedBorderDecorator(new Circle()));
        shape.draw();
    }
}
