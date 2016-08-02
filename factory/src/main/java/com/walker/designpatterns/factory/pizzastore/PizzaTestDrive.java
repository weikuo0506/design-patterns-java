package com.walker.designpatterns.factory.pizzastore;

import com.walker.designpatterns.factory.pizzastore.creator.ChicagoPizzaStore;
import com.walker.designpatterns.factory.pizzastore.creator.NYPizzaStore;
import com.walker.designpatterns.factory.pizzastore.creator.PizzaStore;

/**
 * Created by walker on 2016/8/2.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("cheese");
        nyStore.orderPizza("veggie");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("cheese");
        chicagoStore.orderPizza("veggie");

    }
}
