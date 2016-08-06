package com.walker.designpatterns.template.beverage;

/**
 * Created by walker on 2016/8/6.
 */
public abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (needCondiments()) {
            addCondiments();
        }
    }

    protected void boilWater() {
        System.out.println("boil water ...");
    }
    abstract void brew();
    protected void pourInCup() {
        System.out.println("pour into cup ...");
    }
    abstract void addCondiments();

    protected boolean needCondiments() {
        return false;
    }
}
