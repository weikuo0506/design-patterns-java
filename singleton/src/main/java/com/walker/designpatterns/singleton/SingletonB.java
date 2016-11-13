package com.walker.designpatterns.singleton;

/**
 * Created by walker on 2016/8/4.
 * 通过synchronized实现同步;缺点是每次getInstance都要同步，代价高昂；
 */
public class SingletonB {
    private static SingletonB instance = null;
    private SingletonB(){}

    public static synchronized SingletonB getInstance() {
        if (instance == null) {
            instance = new SingletonB();
        }
        return instance;
    }
}

