package com.walker.designpatterns.state.optimized;

/**
 * Created by walker on 2016/8/7.
 */
public class NoQuarterState implements State {
    private GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    public void insertQuarter() {
        machine.setCurrentState(machine.getHasQuarterState());
        System.out.println("you just inserted one quarter!");
    }

    public void ejectQuarter() {
        System.out.println("you haven't inserted a quarter!");
    }

    public void turnCrank() {
        System.out.println("you turned but there's no quarter!");
    }

    public void dispense() {
        System.out.println("you need to pay first!");
    }
}
