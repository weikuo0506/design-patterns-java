package com.walker.designpatterns.command.restaurant;

/**
 * Created by walker on 2016/11/13.
 * this is an command!
 */
public class Order {
    private Cook cook;

    public Order(Cook cook) {
        this.cook = cook;
    }

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public void makeUp(){
        cook.makeDinner();
    }
}
