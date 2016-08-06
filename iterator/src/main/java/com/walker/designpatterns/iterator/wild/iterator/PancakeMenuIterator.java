package com.walker.designpatterns.iterator.wild.iterator;

import java.util.List;

/**
 * Created by walker on 2016/8/6.
 */
public class PancakeMenuIterator implements Iterator {
    private List menuItems;
    private int offset;
    public PancakeMenuIterator(List menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        return offset < menuItems.size() && menuItems.get(offset) != null;
    }

    public Object next() {
        return menuItems.get(offset++);
    }
}
