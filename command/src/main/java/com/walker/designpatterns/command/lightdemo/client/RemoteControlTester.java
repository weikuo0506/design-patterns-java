package com.walker.designpatterns.command.lightdemo.client;

import com.walker.designpatterns.command.lightdemo.command.Command;
import com.walker.designpatterns.command.lightdemo.command.LightCommand;
import com.walker.designpatterns.command.lightdemo.invoker.RemoteControl;
import com.walker.designpatterns.command.lightdemo.receiver.Light;

/**
 * Created by walker on 2016/8/4.
 * 核心：创建command，指明receiver；把command交给invoker
 */
public class RemoteControlTester {
    public static void main(String[] args) {
        //创建真正的执行者receiver
        Light light = new Light();
        //创建命令，并指明receiver
        Command command = new LightCommand(light);
        //创建invoker
        RemoteControl control = new RemoteControl();
        //把命令交给invoker
        control.setCommand(command);
        //invoker发起执行命令，但是真正执行的人是receiver
        control.pressDown();
    }
}
