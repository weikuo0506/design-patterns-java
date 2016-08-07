package com.walker.designpatterns.state.optimized;

/**
 * Created by walker on 2016/8/7.
 */
public class WinnerState implements State {
    private GumballMachine machine;

    public WinnerState(GumballMachine machine) {
        this.machine = machine;
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
        System.out.println("you're a winner! congratulaitons ! you can get two balls!");
        machine.releaseBall();
        if (machine.getGumballCount() == 0) {
            System.out.println("Oops, out of gumballs!");
            machine.setCurrentState(machine.getSoldOutState());
        } else {
            machine.releaseBall();
            if (machine.getGumballCount() == 0) {
                System.out.println("Oops, out of gumballs!");
                machine.setCurrentState(machine.getSoldOutState());
            } else {
                machine.setCurrentState(machine.getNoQuarterState());
            }
        }
    }
}
