package com.walker.designpatterns.strategy.arithmeticdemo;

/**
 * Created by walker on 2016/11/1.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        int result = context.executeStrategy(6, 2);
        System.out.println(result);

        context.setStrategy(new OperationMultiply());
        result = context.executeStrategy(6, 2);
        System.out.println(result);

    }
}
