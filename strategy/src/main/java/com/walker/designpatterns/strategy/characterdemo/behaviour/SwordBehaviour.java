package com.walker.designpatterns.strategy.characterdemo.behaviour;

/**
 * Created by walker on 2016/7/23.
 */
public class SwordBehaviour implements WeaponBehaviour {
    public void useWeapon() {
        System.out.println("using sword");
    }
}
