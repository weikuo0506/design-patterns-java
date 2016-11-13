package com.walker.designpatterns.factory.room;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by walker on 2016/11/10.
 */
public abstract class MazeGame {
    abstract protected Room makeRoom();

    private static final List<Room> rooms = new ArrayList<Room>();
    public MazeGame() {
        Room room1 = makeRoom();
        Room room2 = makeRoom();
        rooms.add(room1);
        rooms.add(room2);
        System.out.println(rooms);
    }
}
