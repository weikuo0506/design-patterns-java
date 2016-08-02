package com.walker.designpatterns.decorator.coffee.coffee;

import com.walker.designpatterns.decorator.coffee.beverage.Beverage;

/**
 * Created by walker on 2016/8/2.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "this is decaf coffee!";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}
