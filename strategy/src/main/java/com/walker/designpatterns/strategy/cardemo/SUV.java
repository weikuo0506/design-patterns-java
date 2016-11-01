package com.walker.designpatterns.strategy.cardemo;

/**
 * Created by walker on 2016/10/31.
 */
public class SUV extends Car {
    public SUV() {
        this.brakeBehaviour = new BrakeWithABS();
    }
}
