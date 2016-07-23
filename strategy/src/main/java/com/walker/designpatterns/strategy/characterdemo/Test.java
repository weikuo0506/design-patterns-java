package com.walker.designpatterns.strategy.characterdemo;

import com.walker.designpatterns.strategy.characterdemo.behaviour.AxeBehaviour;
import com.walker.designpatterns.strategy.characterdemo.character.Character;
import com.walker.designpatterns.strategy.characterdemo.character.King;

/**
 * Created by walker on 2016/7/23.
 */
public class Test {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.setWeaponBehaviour(new AxeBehaviour());
        king.fight();
    }
}
