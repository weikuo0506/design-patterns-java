package com.walker.designpatterns.command.command;

import com.walker.designpatterns.command.receiver.Light;

/**
 * Created by walker on 2016/8/4.
 */
public class LightCommand implements Command {
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
