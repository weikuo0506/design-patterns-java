package com.walker.designpatterns.factory.guidemo;

/**
 * @author walkerwei
 * @version 2016/11/10
 */
public class Main {
    public static void main(String[] args) {
        IGUIFactory factory = new OSXFactory();
        factory.createButton().paint();
    }
}
