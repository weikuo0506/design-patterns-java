package com.walker.designpatterns.singleton;

/**
 * Created by walker on 2016/8/4.
 * 双重检查加锁double-checked locking;只有第一次创建时候才需要同步，提高效率；
 * volatile保证instance变量在线程内存和主内存中是同一个，某一个线程创建后能立即刷新到主内存和所有其他线程内存；
 */
public class SingletonD {
    private volatile static SingletonD instance = null;
    private SingletonD(){}
    public static SingletonD getInstance() {
        if (instance == null) {
            synchronized (SingletonD.class) {
                if (instance == null) {
                    instance = new SingletonD();

                }
            }
        }
        return instance;
    }
}
