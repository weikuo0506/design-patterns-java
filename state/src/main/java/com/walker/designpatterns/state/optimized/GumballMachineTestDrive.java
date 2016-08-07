package com.walker.designpatterns.state.optimized;


/**
 * Created by walker on 2016/8/7.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(3);

        machine.insertQuarter();
        machine.turnCrank();


    }
}
