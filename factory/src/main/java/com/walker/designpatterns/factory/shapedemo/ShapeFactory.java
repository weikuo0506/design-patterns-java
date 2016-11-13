package com.walker.designpatterns.factory.shapedemo;

/**
 * @author walkerwei
 * @version 2016/11/10
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
