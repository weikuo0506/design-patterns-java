package com.walker.designpatterns.factory.pizzastore.product;

/**
 * Created by walker on 2016/8/2.
 */
public class ChicagoVeggiePizza extends Pizza {
    public ChicagoVeggiePizza() {
        name = "chicago veggie pizza";
    }

    @Override
    public void bake() {
        System.out.println("please bake 5 more minutes ...");
    }
}
