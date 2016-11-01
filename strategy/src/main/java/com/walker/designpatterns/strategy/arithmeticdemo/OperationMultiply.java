package com.walker.designpatterns.strategy.arithmeticdemo;

/**
 * Created by walker on 2016/11/1.
 */
public class OperationMultiply implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
