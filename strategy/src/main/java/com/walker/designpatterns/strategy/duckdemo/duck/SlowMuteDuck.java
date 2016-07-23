package com.walker.designpatterns.strategy.duckdemo.duck;

import com.walker.designpatterns.strategy.duckdemo.behaviour.FlySlow;
import com.walker.designpatterns.strategy.duckdemo.behaviour.QuackMute;

/**
 * Created by walker on 2016/7/23.
 */
public class SlowMuteDuck extends Duck{
    public SlowMuteDuck() {
        flyBehaviour = new FlySlow();
        quackBehaviour = new QuackMute();
    }

    @Override
    public void display() {
        System.out.println("I am a slow mute duck, I am yellow!");
    }
}
