package com.walker.designpatterns.strategy.cardemo;

/**
 * Created by walker on 2016/10/31.
 */
public abstract class Car {
    protected IBrakeBehaviour brakeBehaviour;

    public void brake(){
        brakeBehaviour.performBrake();
    }

    public IBrakeBehaviour getBrakeBehaviour() {
        return brakeBehaviour;
    }

    public void setBrakeBehaviour(IBrakeBehaviour brakeBehaviour) {
        this.brakeBehaviour = brakeBehaviour;
    }
}
