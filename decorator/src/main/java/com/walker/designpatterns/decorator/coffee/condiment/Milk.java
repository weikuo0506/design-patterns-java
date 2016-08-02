package com.walker.designpatterns.decorator.coffee.condiment;


import com.walker.designpatterns.decorator.coffee.beverage.Beverage;
import com.walker.designpatterns.decorator.coffee.condiment.CondimentDecorator;

/**
 * Created by walker on 2016/8/2.
 */
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
        this.description = "milk";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
