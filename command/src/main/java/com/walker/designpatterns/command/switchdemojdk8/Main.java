package com.walker.designpatterns.command.switchdemojdk8;

/**
 * Created by walker on 2016/11/13.
 */
public class Main {
    public static void main(String[] args) {
        CommandFactory commandFactory = CommandFactory.init();
        commandFactory.listCommands();
        commandFactory.executeCommand("light on");
        commandFactory.executeCommand("light off");
    }
}
