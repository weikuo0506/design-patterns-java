package com.walker.designpatterns.command.receiver;

/**
 * Created by walker on 2016/8/4.
 */
public class Light {
    public void on() {
        System.out.println("light is turned on!");
    }
    public void off() {
        System.out.println("light is turned off!");
    }
}
