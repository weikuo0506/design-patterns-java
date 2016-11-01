package com.walker.designpatterns.strategy.other;

/**
 * Created by walker on 2016/10/31.
 */
public class Test {
    public static void main(String[] args) {
        //bad!
        Dog dog = new Dog();
        dog.bark();

        //good!
        Animal animal = new Cat();
        animal.makeSound();
    }
}
