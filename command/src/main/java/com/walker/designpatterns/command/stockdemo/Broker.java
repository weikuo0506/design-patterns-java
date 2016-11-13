package com.walker.designpatterns.command.stockdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by walker on 2016/11/13.
 */
public class Broker {
    List<Order> orders = new ArrayList<>();
    public void takeOrder(Order order){
        orders.add(order);
    }

    public void placeOrders(){
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
