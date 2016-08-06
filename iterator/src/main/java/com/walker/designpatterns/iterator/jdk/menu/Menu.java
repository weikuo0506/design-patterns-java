package com.walker.designpatterns.iterator.jdk.menu;


import java.util.Iterator;

/**
 * Created by walker on 2016/8/6.
 */
public interface Menu {
    Iterator createIterator();
    void addItem(String name, String desc, boolean vege, double price);
}
