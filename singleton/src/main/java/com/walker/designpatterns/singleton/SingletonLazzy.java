package com.walker.designpatterns.singleton;

/**
 * @author walkerwei
 * @version 2016/11/2
 */
public final class SingletonLazzy {
    private static  SingletonLazzy instance = null;

    private SingletonLazzy() {
    }

    public static synchronized SingletonLazzy getInstance() {
        if (instance == null) {
            instance = new SingletonLazzy();
        }
        return instance;
    }
}
