package com.walker.designpatterns.state.optimized;

import java.util.Random;

/**
 * Created by walker on 2016/8/7.
 */
public class HasQuarterState implements State {
    private Random randomWinner = new Random(System.currentTimeMillis());
    private GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    public void insertQuarter() {
        System.out.println("you cannot insert another quarter!");
    }

    public void ejectQuarter() {
        System.out.println("quarter returned!");
        machine.setCurrentState(machine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("you turned ...");
        int winner = randomWinner.nextInt(9); //0-9 uniformly distributed!
        if (winner == 0 && machine.getGumballCount() >= 2) {
            machine.setCurrentState(machine.getWinnerState());
        } else {
            machine.setCurrentState(machine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("no gumball dispense!");
    }
}
