package com.walker.designpatterns.strategy.cardemo;

/**
 * Created by walker on 2016/10/31.
 */
public class BrakeWithABS implements IBrakeBehaviour {

    public void performBrake() {
        System.out.println("brake with ABS...");
    }
}
