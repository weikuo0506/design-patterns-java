package com.walker.designpatterns.composite;

import com.walker.designpatterns.iterator.jdk.menu.Menu;

import java.util.Iterator;

/**
 * Created by walker on 2016/8/6.
 */
public class Waitress {
    private MenuComponent rootComponent;

    public Waitress(MenuComponent rootComponent) {
        this.rootComponent = rootComponent;
    }

    public void printMenu() {
        rootComponent.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = rootComponent.createIterator();
        System.out.println("vegetarian menu: ");
        while (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            try {
                if (component instanceof MenuItem) {
                    if (component.isVegetarian()) {
                        component.print();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
