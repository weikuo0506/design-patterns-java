package com.walker.designpatterns.decorator.coffee.coffee;

import com.walker.designpatterns.decorator.coffee.beverage.Beverage;

/**
 * Created by walker on 2016/8/2.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "this is house blend";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
