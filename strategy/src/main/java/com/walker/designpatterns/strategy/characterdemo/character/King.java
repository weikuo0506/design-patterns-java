package com.walker.designpatterns.strategy.characterdemo.character;

import com.walker.designpatterns.strategy.characterdemo.behaviour.KnifeBehaviour;

/**
 * Created by walker on 2016/7/23.
 */
public class King extends Character {
    public King() {
        weaponBehaviour = new KnifeBehaviour();
    }
}
