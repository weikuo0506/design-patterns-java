package com.walker.designpatterns.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by walker on 2016/8/6.
 */
public class CompositeIterator implements Iterator {
    private Stack<Iterator> stack = new Stack<Iterator>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = stack.peek();
            if (iterator.hasNext()) {
                return true;
            } else {
                stack.pop();
                return hasNext();
            }
        }
    }

    public Object next() {
        if (hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
                return next();
            }
            return component;
        } else {
            return null;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
