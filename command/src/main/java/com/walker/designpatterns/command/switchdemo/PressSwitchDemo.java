package com.walker.designpatterns.command.switchdemo;

/**
 * Created by walker on 2016/11/13.
 */
public class PressSwitchDemo {
    public static void main(String[] args) {
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);
        Switch mySwitch = new Switch();
        mySwitch.storeAndExecute(switchUp);
        mySwitch.storeAndExecute(switchDown);
    }
}
