package com.walker.designpatterns.command.stockdemo;

/**
 * Created by walker on 2016/11/13.
 */
public class SellOrder implements Order {
    private Stock stock;

    public SellOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
