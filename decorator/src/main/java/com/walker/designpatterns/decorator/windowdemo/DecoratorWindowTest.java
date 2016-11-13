package com.walker.designpatterns.decorator.windowdemo;

/**
 * @author walkerwei
 * @version 2016/11/2
 */
public class DecoratorWindowTest {
    public static void main(String[] args) {
        Window window = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));
        System.out.println(window.getDescription());
    }
}
