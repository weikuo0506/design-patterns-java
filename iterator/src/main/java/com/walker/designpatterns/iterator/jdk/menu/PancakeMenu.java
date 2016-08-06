package com.walker.designpatterns.iterator.jdk.menu;

import com.walker.designpatterns.iterator.jdk.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by walker on 2016/8/6.
 */
public class PancakeMenu implements Menu{
    ArrayList menuItems;

    public PancakeMenu() {
        menuItems = new ArrayList();
        addItem("red cake","delicious",true,3.00);
        addItem("black cake","happy and smell",false,5.00);
    }

    public void addItem(String name, String desc, boolean vege, double price) {
        MenuItem item = new MenuItem(name,desc,vege,price);
        menuItems.add(item);
    }

//    public ArrayList getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
