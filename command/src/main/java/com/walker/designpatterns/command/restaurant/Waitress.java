package com.walker.designpatterns.command.restaurant;

/**
 * Created by walker on 2016/11/13.
 * this is invoker!
 */
public class Waitress {
    private Order order;

    public Waitress() {
    }

    public Waitress(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void placeOrder(){
        order.makeUp();
    }
}
