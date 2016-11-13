package com.walker.designpatterns.command.stockdemo;

/**
 * Created by walker on 2016/11/13.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stockA = new Stock("aaa", 100);
        Order buyOrder = new BuyOrder(stockA);

        Stock stockB = new Stock("bbb", 200);
        Order sellOrder = new SellOrder(stockB);

        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);

        broker.placeOrders();

    }
}
