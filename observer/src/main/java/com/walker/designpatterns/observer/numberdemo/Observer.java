package com.walker.designpatterns.observer.numberdemo;

/**
 * Created by walker on 2016/11/2.
 */
public abstract class Observer {
//    abstract void update(int state);
    abstract void update();

    protected Subject subject;
}
