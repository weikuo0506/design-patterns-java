package com.walker.designpatterns.decorator.coffee.coffee;

import com.walker.designpatterns.decorator.coffee.beverage.Beverage;

/**
 * Created by walker on 2016/8/2.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "this is espresso!";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
