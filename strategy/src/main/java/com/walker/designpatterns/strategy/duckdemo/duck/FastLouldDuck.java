package com.walker.designpatterns.strategy.duckdemo.duck;

import com.walker.designpatterns.strategy.duckdemo.behaviour.FlyFast;
import com.walker.designpatterns.strategy.duckdemo.behaviour.QuackLouldly;

/**
 * Created by walker on 2016/7/23.
 */
public class FastLouldDuck extends Duck {

    public FastLouldDuck() {
        flyBehaviour = new FlyFast();
        quackBehaviour = new QuackLouldly();
    }

    @Override
    public void display() {
        System.out.println("I am a fastlouly duck and I am red!");
    }
}
