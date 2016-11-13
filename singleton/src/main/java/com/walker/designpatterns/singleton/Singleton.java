package com.walker.designpatterns.singleton;

/**
 * @author walkerwei
 * @version 2016/11/2
 */
public final class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
