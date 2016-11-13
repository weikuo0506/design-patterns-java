package com.walker.designpatterns.command.switchdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by walker on 2016/11/13.
 * the Invoker
 */
public class Switch {
    private List<Command> history = new ArrayList<Command>();

    public void storeAndExecute(Command cmd) {
        history.add(cmd);
        cmd.execute();
    }
}
