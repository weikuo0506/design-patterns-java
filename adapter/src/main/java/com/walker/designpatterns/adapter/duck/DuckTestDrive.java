package com.walker.designpatterns.adapter.duck;

/**
 * Created by walker on 2016/8/4.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();

        Duck wildTurkeyLikeDuck = new TurkeyAdaptor(new WildTurkey());
        wildTurkeyLikeDuck.quack();
    }
}
