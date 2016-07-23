package com.walker.designpatterns.strategy.duckdemo.behaviour;

/**
 * Created by walker on 2016/7/23.
 */
public class QuackMute implements QuackBehaviour {
    public void quack() {
        System.out.println("Cannot quack... it is a mute!");
    }
}
