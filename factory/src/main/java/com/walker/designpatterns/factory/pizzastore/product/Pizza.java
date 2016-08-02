package com.walker.designpatterns.factory.pizzastore.product;

/**
 * Created by walker on 2016/8/2.
 */
public abstract class Pizza {
    protected String name;
    public void prepare() {
        System.out.println("prepare ..." + name);
    }

    public void bake() {
        System.out.println("bake ...");
    }

    public void cut() {
        System.out.println("cut ...");
    }

    public void box() {
        System.out.println("box ...");
    }

    public String getName() {
        return name;
    }
}
