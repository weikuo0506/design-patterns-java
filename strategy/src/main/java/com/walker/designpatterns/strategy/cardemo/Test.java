package com.walker.designpatterns.strategy.cardemo;

/**
 * Created by walker on 2016/10/31.
 */
public class Test {
    public static void main(String[] args) {
        Car car1 = new Sedan();
        car1.brake();

        car1.setBrakeBehaviour(new BrakeWithABS());
        car1.brake();
    }
}
