package com.walker.designpatterns.command.switchdemo;

/**
 * Created by walker on 2016/11/13.
 */
public class FlipDownCommand implements Command {
    private Light light;

    public FlipDownCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}
