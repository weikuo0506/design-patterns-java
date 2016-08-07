package com.walker.designpatterns.state.optimized;

/**
 * Created by walker on 2016/8/7.
 */
public class SoldState implements State {
    private GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    private State currentState;

    public SoldState(State currentState) {
        this.currentState = currentState;
    }

    public void insertQuarter() {
        System.out.println("plase wait, we're already giving you a gumball!");

    }

    public void ejectQuarter() {
        System.out.println("Sorry, you alredy turned the crank!");
    }

    public void turnCrank() {
        System.out.println("turning twice doesn't give you another gumball!");
    }

    public void dispense() {
        System.out.println("a gumball comes rolling out of the slot");
        machine.releaseBall();
        int gumballCount = machine.getGumballCount();
        if (gumballCount == 0) {
            System.out.println("Oops, out of gumballs!");
            machine.setCurrentState(machine.getSoldOutState());
        } else {
            machine.setCurrentState(machine.getNoQuarterState());
        }
    }
}
