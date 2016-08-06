package com.walker.designpatterns.iterator.jdk.menu;

import com.walker.designpatterns.iterator.jdk.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by walker on 2016/8/6.
 */
public class CafeMenu implements Menu {
    Hashtable menuItems;

    public CafeMenu() {
        menuItems = new Hashtable();
        addItem("cat cafe","hot and sweet",true,1.0);
        addItem("dog cafe", "brillant", true, 1.5);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }

    public void addItem(String name, String desc, boolean vege, double price) {
        MenuItem item = new MenuItem(name, desc, vege, price);
        menuItems.put(item.getName(),item);
    }


}
