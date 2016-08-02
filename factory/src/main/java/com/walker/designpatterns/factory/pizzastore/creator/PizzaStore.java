package com.walker.designpatterns.factory.pizzastore.creator;

import com.walker.designpatterns.factory.pizzastore.product.Pizza;

/**
 * Created by walker on 2016/8/2.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
