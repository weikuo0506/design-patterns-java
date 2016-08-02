package com.walker.designpatterns.decorator.coffee.coffee;

import com.walker.designpatterns.decorator.coffee.beverage.Beverage;

/**
 * Created by walker on 2016/8/2.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "this is dark roast!";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
