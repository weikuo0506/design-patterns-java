package com.walker.designpatterns.observer.numberdemo;

/**
 * Created by walker on 2016/11/2.
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        String result = Integer.toOctalString(subject.getState());
        System.out.println("octal:"+result);
    }
}
