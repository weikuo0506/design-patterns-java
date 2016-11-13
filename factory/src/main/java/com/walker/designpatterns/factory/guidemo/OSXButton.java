package com.walker.designpatterns.factory.guidemo;

/**
 * @author walkerwei
 * @version 2016/11/10
 */
public class OSXButton implements IButton {
    public void paint() {
        System.out.println("osx button");
    }
}
