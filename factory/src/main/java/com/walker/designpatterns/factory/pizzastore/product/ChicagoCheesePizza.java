package com.walker.designpatterns.factory.pizzastore.product;


/**
 * Created by walker on 2016/8/2.
 */
public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        this.name = "chicago cheese pizza";
    }

    @Override
    public void cut() {
        System.out.println("please cut into square!");
    }
}
