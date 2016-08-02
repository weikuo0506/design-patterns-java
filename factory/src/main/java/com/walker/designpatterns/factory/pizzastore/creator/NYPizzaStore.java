package com.walker.designpatterns.factory.pizzastore.creator;

import com.walker.designpatterns.factory.pizzastore.product.NYCheesePizza;
import com.walker.designpatterns.factory.pizzastore.product.NYVeggiePizza;
import com.walker.designpatterns.factory.pizzastore.product.Pizza;

/**
 * Created by walker on 2016/8/2.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYVeggiePizza();
        } else {
            return null;
        }
    }
}
