package com.walker.designpatterns.composite;

import java.util.Iterator;

/**
 * Created by walker on 2016/8/6.
 */
public class NullIterator implements Iterator {
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
