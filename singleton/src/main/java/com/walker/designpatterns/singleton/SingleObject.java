package com.walker.designpatterns.singleton;

/**
 * @author walkerwei
 * @version 2016/11/2
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return instance;
    }

    protected void showMsg(){
        System.out.println("showing memory address: "+instance);
    }
}
