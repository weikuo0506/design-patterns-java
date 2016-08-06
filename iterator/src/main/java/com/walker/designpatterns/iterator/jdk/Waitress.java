package com.walker.designpatterns.iterator.jdk;

import com.walker.designpatterns.iterator.jdk.menu.Menu;

import java.util.Iterator;
import java.util.List;

/**
 * Created by walker on 2016/8/6.
 */
public class Waitress {
    private List<Menu> menuList;

    public Waitress(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void printMenu() {
        for (Menu menu : menuList) {
            printMenu(menu.createIterator());
        }

    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName() + "|" + item.getDescription() + "|" + item.getPrice());
        }
    }
}
