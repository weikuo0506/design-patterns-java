package com.walker.designpatterns.observer.numberdemo;

/**
 * Created by walker on 2016/11/2.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
//        subject.attach(new BinaryObserver(subject));
//        subject.attach(new OctalObserver(subject));
        new BinaryObserver(subject);
        new OctalObserver(subject);
        subject.setState(10);

    }
}
