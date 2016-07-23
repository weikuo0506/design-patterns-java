package com.walker.designpatterns.strategy.characterdemo.character;

import com.walker.designpatterns.strategy.characterdemo.behaviour.SwordBehaviour;

/**
 * Created by walker on 2016/7/23.
 */
public class Queen extends Character {
    public Queen(){
        weaponBehaviour = new SwordBehaviour();
    }
}
