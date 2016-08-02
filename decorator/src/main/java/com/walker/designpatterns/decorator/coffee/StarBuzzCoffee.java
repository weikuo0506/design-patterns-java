package com.walker.designpatterns.decorator.coffee;

import com.walker.designpatterns.decorator.coffee.beverage.Beverage;
import com.walker.designpatterns.decorator.coffee.coffee.DarkRoast;
import com.walker.designpatterns.decorator.coffee.coffee.Espresso;
import com.walker.designpatterns.decorator.coffee.condiment.Milk;
import com.walker.designpatterns.decorator.coffee.condiment.Moca;

/**
 * Created by walker on 2016/8/2.
 */
public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        beverage1 = new Milk(beverage1);
        beverage1 = new Moca(beverage1);

        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.cost());

        Beverage beverage2 = new Milk(new Milk(new Moca(new DarkRoast())));
        System.out.println(beverage2.getDescription());
        System.out.println(beverage2.cost());
    }
}
