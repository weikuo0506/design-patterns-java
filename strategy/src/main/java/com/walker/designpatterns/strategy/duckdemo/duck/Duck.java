package com.walker.designpatterns.strategy.duckdemo.duck;

import com.walker.designpatterns.strategy.duckdemo.behaviour.FlyBehaviour;
import com.walker.designpatterns.strategy.duckdemo.behaviour.QuackBehaviour;

/**
 * all duck can swim;display varies; and fly and quack behaviours varies but limited!
 * Created by walker on 2016/7/23.
 */
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(){

    }
    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public abstract void display();

    public void swim() {
        System.out.println("I am a duck, I am swiming...");
    }

}
