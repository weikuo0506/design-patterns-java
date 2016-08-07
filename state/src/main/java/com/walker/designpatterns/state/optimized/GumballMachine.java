package com.walker.designpatterns.state.optimized;

/**
 * Created by walker on 2016/8/7.
 */
public class GumballMachine {
    private final State soldOutState = new SoldOutState(this);
    private final State noQuarterState = new NoQuarterState(this);
    private final State hasQuarterState = new HasQuarterState(this);
    private final State soldState = new SoldState(this);
    private final State winnerState = new WinnerState(this);

    private int gumballCount = 0;

    private State currentState = soldOutState;

    public GumballMachine(int gumballCount) {
        this.gumballCount = gumballCount;
        if (gumballCount > 0) {
            currentState = noQuarterState;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public void releaseBall() {
        gumballCount--;
    }
}
