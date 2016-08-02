package com.walker.designpatterns.factory.pizzastore.product;

/**
 * Created by walker on 2016/8/2.
 */
public class NYVeggiePizza extends Pizza {
    public NYVeggiePizza() {
        name = "NewYork veggie pizza";
    }

    @Override
    public void box() {
        System.out.println("plase box pretty");
    }
}
