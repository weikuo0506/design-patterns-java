package com.walker.designpatterns.decorator.coffee.beverage;

/**
 * Created by walker on 2016/8/2.
 */
public abstract class Beverage {
    protected String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
