package com.walker.designpatterns.command.stockdemo;

/**
 * Created by walker on 2016/11/13.
 */
public class Stock {
    private String name;
    private int quant;

    public Stock(String name, int quant) {
        this.name = name;
        this.quant = quant;
    }

    public void buy(){
        System.out.println("buy "+ quant + " "+ name);
    }

    public void sell(){
        System.out.println("sell " + quant + " " + name);
    }
}
