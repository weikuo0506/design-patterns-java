package com.walker.designpatterns.factory.room;

/**
 * Created by walker on 2016/11/10.
 */
public class OrdinaryMazeGame extends MazeGame{
    @Override
    protected Room makeRoom() {
        return new OrdinaryRoom();
    }
}
