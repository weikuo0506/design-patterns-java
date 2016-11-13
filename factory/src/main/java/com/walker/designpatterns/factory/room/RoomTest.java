package com.walker.designpatterns.factory.room;

/**
 * Created by walker on 2016/11/10.
 */
public class RoomTest {
    public static void main(String[] args) {
        MazeGame ordinaryGame = new OrdinaryMazeGame();
        MazeGame magicGame = new MagicMazeGame();
    }
}
