package com.walker.designpatterns.command.invoker;

import com.walker.designpatterns.command.command.Command;

/**
 * Created by walker on 2016/8/4.
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressDown() {
        command.execute();
    }
}
