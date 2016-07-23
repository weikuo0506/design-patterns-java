package com.walker.designpatterns.strategy.duckdemo.behaviour;

/**
 * Created by walker on 2016/7/23.
 */
public class FlySlow implements FlyBehaviour {
    public void fly() {
        System.out.println("flying slowly ...");
    }
}
