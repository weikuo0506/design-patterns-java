package com.walker.designpatterns.iterator.jdk.iterator;

import com.walker.designpatterns.iterator.jdk.MenuItem;

import java.util.Iterator;

/**
 * Created by walker on 2016/8/6.
 */
public class DinerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int offset = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        return offset < menuItems.length && menuItems[offset] != null;
    }

    public Object next() {
        return menuItems[offset++];
    }
}
