package com.walker.designpatterns.strategy.other;

/**
 * Created by walker on 2016/10/31.
 */
public class Dog extends Animal {
    @Override
    public void makeSound() {
        bark();
    }
    public void bark(){
        System.out.println("汪汪");
    }
}
