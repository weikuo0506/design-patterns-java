package com.walker.designpatterns.composite;

import java.util.Iterator;

/**
 * Created by walker on 2016/8/6.
 */
public class MenuItem extends MenuComponent{
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println("menu item: " + name + "|" + description + "|" + price);
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
