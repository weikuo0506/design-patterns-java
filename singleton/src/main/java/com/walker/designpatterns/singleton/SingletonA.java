package com.walker.designpatterns.singleton;

/**
 * Created by walker on 2016/8/4.
 * 非线程安全；多线程时候可能会创建多个实例；
 */
public class SingletonA {
    private static SingletonA instance = null;
    private SingletonA(){}
    public static SingletonA getInstance() {
        if (instance == null) {
            instance = new SingletonA();
        }
        return instance;
    }
}
