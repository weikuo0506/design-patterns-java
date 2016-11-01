package com.walker.designpatterns.strategy.other;

/**
 * Created by walker on 2016/10/31.
 */
public class Cat extends Animal {
    @Override
    public void makeSound() {
        meow();
    }

    public void meow(){
        System.out.println("喵喵");
    }
}
