package com.walker.designpatterns.state.origin;

/**
 * Created by walker on 2016/8/7.
 */
public class GumballMachine {
    private static final int SOLD_OUT = 0;
    private static final int NO_QUARTER = 1;
    private static final int HAS_QUARTER = 2;
    private static final int SOLD = 3;

    private int machineState = SOLD_OUT;
    private int gumballCount = 0;

    public GumballMachine(int gumballCount) {
        this.gumballCount = gumballCount;
        if (gumballCount > 0) {
            machineState = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (machineState == HAS_QUARTER) {
            System.out.println("you cannot insert another quarter!");
        } else if (machineState == NO_QUARTER) {
            machineState = HAS_QUARTER;
            System.out.println("you just inserted one quarter!");
        } else if (machineState == SOLD_OUT) {
            System.out.println("you cnanot insert, cause the machine is sold out!");
        } else if (machineState == SOLD) {
            System.out.println("plase wait, we're already giving you a gumball!");
        }
    }

    public void ejectQuarter() {
        if (machineState == HAS_QUARTER) {
            System.out.println("quarter returned!");
            machineState = NO_QUARTER;
        } else if (machineState == NO_QUARTER) {
            System.out.println("you haven't inserted a quarter!");
        } else if (machineState == SOLD_OUT) {
            System.out.println("you can't eject, cause you havn't inserted a quarter yet!");
        } else if (machineState == SOLD) {
            System.out.println("Sorry, you alredy turned the crank!");
        }
    }

    public void turnCrank() {
        if (machineState == HAS_QUARTER) {
            System.out.println("you turned ...");
            machineState = SOLD;
            dispense();
        } else if (machineState == NO_QUARTER) {
            System.out.println("you turned but there's no quarter!");
        } else if (machineState == SOLD_OUT) {
            System.out.println("you turned but there's no gumballs!");
        } else if (machineState == SOLD) {
            System.out.println("turning twice doesn't give you another gumball!");
        }
    }

    private void dispense() {
        if (machineState == HAS_QUARTER) {
            System.out.println("no gumball dispense!");
        } else if (machineState == NO_QUARTER) {
            System.out.println("you need to pay first!");
        } else if (machineState == SOLD_OUT) {
            System.out.println("no gumball dispense!");
        } else if (machineState == SOLD) {
            System.out.println("a gumball comes rolling out of the slot");
            gumballCount--;
            if (gumballCount == 0) {
                System.out.println("Oops, out of gumballs!");
                machineState = SOLD_OUT;
            } else {
                machineState = NO_QUARTER;
            }
        }
    }
}
