package com.walker.designpatterns.strategy.characterdemo.character;

import com.walker.designpatterns.strategy.characterdemo.behaviour.WeaponBehaviour;

/**
 * Created by walker on 2016/7/23.
 */
public class Character {
    WeaponBehaviour weaponBehaviour;

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public void fight(){
        weaponBehaviour.useWeapon();
    }

}
