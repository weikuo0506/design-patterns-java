package com.walker.designpatterns.state.optimized;

/**
 * Created by walker on 2016/8/7.
 */
public class SoldOutState implements State{
    private GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    public void insertQuarter() {
        System.out.println("you cnanot insert, cause the machine is sold out!");
    }

    public void ejectQuarter() {
        System.out.println("you can't eject, cause you havn't inserted a quarter yet!");
    }

    public void turnCrank() {
        System.out.println("you turned but there's no gumballs!");
    }

    public void dispense() {
        System.out.println("no gumball dispense!");
    }
}
