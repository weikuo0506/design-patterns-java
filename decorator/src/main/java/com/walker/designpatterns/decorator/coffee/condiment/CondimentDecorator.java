package com.walker.designpatterns.decorator.coffee.condiment;

import com.walker.designpatterns.decorator.coffee.beverage.Beverage;

/**
 * Created by walker on 2016/8/2.
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public String getDescription() {
        return beverage.getDescription() + " ,and add condiment: "+ description;
    }


}
