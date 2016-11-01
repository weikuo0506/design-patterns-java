package com.walker.designpatterns.strategy.cardemo;

/**
 * Created by walker on 2016/10/31.
 */
public class Sedan extends Car {
    public Sedan() {
        this.brakeBehaviour = new Brake();
    }
}
