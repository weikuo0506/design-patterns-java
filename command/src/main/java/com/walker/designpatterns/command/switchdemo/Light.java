package com.walker.designpatterns.command.switchdemo;

/**
 * Created by walker on 2016/11/13.
 * the Receiver
 */
public class Light {
    public void turnOn(){
        System.out.println("the light is on");
    }

    public void turnOff(){
        System.out.println("the light is off");
    }
}
