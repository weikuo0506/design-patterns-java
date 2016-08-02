package com.walker.designpatterns.decorator.coffee.condiment;

import com.walker.designpatterns.decorator.coffee.beverage.Beverage;

/**
 * Created by walker on 2016/8/2.
 */
public class Moca extends CondimentDecorator {
    public Moca(Beverage beverage) {
        this.beverage = beverage;
        this.description = "moca";
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
}
