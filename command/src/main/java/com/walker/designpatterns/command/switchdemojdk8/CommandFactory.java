package com.walker.designpatterns.command.switchdemojdk8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by walker on 2016/11/13.
 */
public final class CommandFactory {
    private final Map<String,Command> commands;

    public CommandFactory() {
        this.commands = new HashMap<String, Command>();
    }

    public void addCommand(String name, Command cmd) {
        commands.put(name, cmd);
    }

    public void executeCommand(String name) {
        if (commands.containsKey(name)) {
            commands.get(name).execute();
        }
    }

    public void listCommands(){
        System.out.println(commands.keySet().stream().collect(Collectors.joining("|")));
    }

    public static CommandFactory init(){
        CommandFactory commandFactory = new CommandFactory();
        commandFactory.addCommand("light on", ()  -> System.out.println("light turned on"));
        commandFactory.addCommand("light off", new Command() {
            @Override
            public void execute() {
                System.out.println("light turned off");
            }
        });
        return commandFactory;
    }
}
