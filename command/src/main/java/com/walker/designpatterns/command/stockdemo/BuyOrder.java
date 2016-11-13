package com.walker.designpatterns.command.stockdemo;

/**
 * Created by walker on 2016/11/13.
 */
public class BuyOrder implements Order {
    private Stock stock;

    public BuyOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
