package com.walker.designpatterns.adapter.duck;

/**
 * Created by walker on 2016/8/4.
 */
public class TurkeyAdaptor implements Duck {
    private Turkey turkey;

    public TurkeyAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }
}
