package com.walker.designpatterns.factory.shapedemo;

/**
 * @author walkerwei
 * @version 2016/11/10
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("circle").draw();
    }
}
