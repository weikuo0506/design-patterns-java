package com.walker.designpatterns.singleton;

/**
 * Created by walker on 2016/8/4.
 * 在静态初始化器中创建单例；JVM在加载这个类时就eagerly创建单例，并且JVM保证任何线程访问unique instance静态变量之前，一定先创建此实例；
 * 使用场景是：该实例一定会被用到；且初始化时创建负担不大；
 */
public class SingletonC {
    private static final SingletonC INSTANCE = new SingletonC();
    private SingletonC(){}
    public static SingletonC getInstance() {
        return INSTANCE;
    }
}
