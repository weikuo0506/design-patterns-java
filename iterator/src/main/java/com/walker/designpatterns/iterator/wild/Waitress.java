package com.walker.designpatterns.iterator.wild;

import com.walker.designpatterns.iterator.wild.iterator.Iterator;
import com.walker.designpatterns.iterator.wild.menu.Menu;

/**
 * Created by walker on 2016/8/6.
 */
public class Waitress {
    private Menu pancakeMenu;
    private Menu dinerMenu;

    public Waitress(Menu pancakeMenu, Menu dinerMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeMenu.createIterator();
        printMenu(pancakeIterator);

        Iterator dinnerIterator = dinerMenu.createIterator();
        printMenu(dinnerIterator);

    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName() + "|" + item.getDescription() + "|" + item.getPrice());
        }
    }
}
