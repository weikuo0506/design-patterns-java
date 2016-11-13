package com.walker.designpatterns.factory.guidemo;

/**
 * @author walkerwei
 * @version 2016/11/10
 */
public class OSXFactory implements IGUIFactory {
    public IButton createButton() {
        return new OSXButton();
    }
}
