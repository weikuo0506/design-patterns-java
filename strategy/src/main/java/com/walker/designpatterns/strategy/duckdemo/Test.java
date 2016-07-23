package com.walker.designpatterns.strategy.duckdemo;

import com.walker.designpatterns.strategy.duckdemo.behaviour.FlyFast;
import com.walker.designpatterns.strategy.duckdemo.behaviour.FlySlow;
import com.walker.designpatterns.strategy.duckdemo.behaviour.QuackLouldly;
import com.walker.designpatterns.strategy.duckdemo.behaviour.QuackMute;
import com.walker.designpatterns.strategy.duckdemo.duck.Duck;
import com.walker.designpatterns.strategy.duckdemo.duck.FastLouldDuck;
import com.walker.designpatterns.strategy.duckdemo.duck.SlowMuteDuck;

/**
 * Created by walker on 2016/7/23.
 */
public class Test {
    public static void main(String[] args) {
        Duck fastlouldDuck = new FastLouldDuck();
        fastlouldDuck.performQuack();
        fastlouldDuck.performFly();
        fastlouldDuck.setFlyBehaviour(new FlySlow());
        fastlouldDuck.performFly();

        Duck slowMuteDuck = new SlowMuteDuck();
        slowMuteDuck.setFlyBehaviour(new FlySlow());
        slowMuteDuck.setQuackBehaviour(new QuackMute());
    }
}
