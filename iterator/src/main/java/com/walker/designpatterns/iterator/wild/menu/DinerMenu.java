package com.walker.designpatterns.iterator.wild.menu;

import com.walker.designpatterns.iterator.wild.MenuItem;
import com.walker.designpatterns.iterator.wild.iterator.DinerMenuIterator;
import com.walker.designpatterns.iterator.wild.iterator.Iterator;

/**
 * Created by walker on 2016/8/6.
 */
public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    MenuItem[] menuItems;
    private int offset = 0;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("hot dog", "taiwan delicious", false, 4.00);
        addItem("soup", "from china, very good", true, 5.00);
    }

    public void addItem(String name, String desc, boolean vege, double price) {
        MenuItem item = new MenuItem(name,desc,vege,price);
        if (offset >= MAX_ITEMS) {
            System.err.println("menu is full, cannot add ...");
        } else {
            menuItems[offset++] = item;
        }
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
