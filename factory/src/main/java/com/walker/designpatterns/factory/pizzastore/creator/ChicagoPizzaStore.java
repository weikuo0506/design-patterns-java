package com.walker.designpatterns.factory.pizzastore.creator;

import com.walker.designpatterns.factory.pizzastore.product.ChicagoCheesePizza;
import com.walker.designpatterns.factory.pizzastore.product.ChicagoVeggiePizza;
import com.walker.designpatterns.factory.pizzastore.product.Pizza;

/**
 * Created by walker on 2016/8/2.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoVeggiePizza();
        } else {
            return null;
        }
    }
}
