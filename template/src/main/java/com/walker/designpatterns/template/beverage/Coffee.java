package com.walker.designpatterns.template.beverage;

/**
 * Created by walker on 2016/8/6.
 */
public class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("brewing coffee ...");
    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk to coffee ...");
    }

    @Override
    public boolean needCondiments() {
        return true;
    }
}
