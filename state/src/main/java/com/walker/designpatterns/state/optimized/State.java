package com.walker.designpatterns.state.optimized;

/**
 * Created by walker on 2016/8/7.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
