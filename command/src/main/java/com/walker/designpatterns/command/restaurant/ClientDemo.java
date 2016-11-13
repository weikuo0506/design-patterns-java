package com.walker.designpatterns.command.restaurant;

/**
 * Created by walker on 2016/11/13.
 */
public class ClientDemo {
    public static void main(String[] args) {
        Order order = new Order(new Cook());
        Waitress waitress = new Waitress();
        waitress.setOrder(order);
        waitress.placeOrder();
    }
}
