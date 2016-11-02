package com.walker.designpatterns.observer.numberdemo;


/**
 * Created by walker on 2016/11/2.
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
//        Byte result = new Integer(state).byteValue();
        String result = Integer.toBinaryString(subject.getState());
        System.out.println("binary:" + result);
    }
}
